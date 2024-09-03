import os
import re
import shutil

# 定义输入和输出目录路径
input_directory = r'D:\Users\User\Desktop\1'
output_directory = r'D:\Users\User\Desktop\2'

# 如果输出目录不存在，则创建
os.makedirs(output_directory, exist_ok=True)

# 帮助函数：从文件内容中提取类名
def extract_class_name(content):
    # 使用正则表达式匹配类名
    class_match = re.search(r'\bclass\s+(\w+)', content)
    return class_match.group(1) if class_match else None

# 帮助函数：从文件内容中提取包名
def extract_package_name(content):
    # 使用正则表达式匹配包名
    package_match = re.search(r'\bpackage\s+([\w\.]+);', content)
    return package_match.group(1) + '.' if package_match else ''

# 帮助函数：提取方法名和返回类型
def extract_methods(content):
    # 使用正则表达式匹配特定格式的方法
    method_pattern = re.compile(r'public\s+(\w+)\s+get(\w+Ref|Iref|Tref)\(\)')
    return method_pattern.findall(content)

# 帮助函数：检查是否存在getDest方法
def has_get_dest_method(content):
    # 使用正则表达式检查getDest方法的存在性
    return bool(re.search(r'public\s+\w+\s+getDest\(\)', content))

# 帮助函数：将方法插入到类内部
def insert_methods_into_class(content, methods):
    """
    在Java类的结尾之前插入生成的方法。

    :param content: Java文件的内容
    :param methods: 要插入的方法字符串列表
    :return: 修改后的Java文件内容
    """
    # 使用正则表达式找到类的结束位置
    class_end_pattern = re.compile(r'(?P<indent>\s*)\}')

    # 找到最后一个右花括号的位置，假设这个花括号是类的结束符
    matches = list(class_end_pattern.finditer(content))
    if not matches:
        raise ValueError("未找到类结束符，可能内容不完整或不是有效的Java类定义。")

    last_match = matches[-1]  # 假设最后一个匹配是类的结束
    insert_position = last_match.start()  # 获取插入位置
    indent = last_match.group('indent')  # 获取缩进

    # 格式化并准备插入的方法
    formatted_methods = "\n".join([indent + method.strip() for method in methods])

    # 插入生成的方法到类的结束位置之前
    modified_content = content[:insert_position] + formatted_methods + '\n' + content[insert_position:]
    return modified_content

# 遍历输入目录中的每个Java文件
for root, _, files in os.walk(input_directory):
    for file_name in files:
        if file_name.endswith('.java'):
            file_path = os.path.join(root, file_name)

            # 打开并读取文件内容
            with open(file_path, 'r', encoding='utf-8') as file:
                content = file.read()

            class_name = extract_class_name(content)  # 提取类名
            package_name = extract_package_name(content)  # 提取包名
            methods = extract_methods(content)  # 提取方法

            new_methods = []

            if class_name:
                # 确保去掉 "Wrapper" 后的名称不为空
                objName = class_name[:-len('Wrapper')]
                if objName:  # 确保 objName 不为空字符串
                    obj_name_instance = objName[0].lower() + objName[1:]

                    # 第一种情况：类名不以指定后缀结尾且包含ref方法
                    if not class_name.endswith(('RefWrapper', 'TrefWrapper', 'IrefWrapper')):
                        for return_type, method_suffix in methods:
                            # 检查是否存在对应文件且其中包含getDest方法
                            corresponding_file = os.path.join(input_directory, return_type + '.java')
                            if os.path.exists(corresponding_file):
                                with open(corresponding_file, 'r', encoding='utf-8') as ref_file:
                                    ref_content = ref_file.read()
                                    if has_get_dest_method(ref_content):
                                        # 生成所需的方法
                                        cleaned_suffix = method_suffix.replace('Ref', '').replace('Iref', '').replace(
                                            'Tref', '')
                                        cleaned_suffix2 = cleaned_suffix[0].upper() + cleaned_suffix[1:]

                                        # 检查是否存在相应的 Wrapper 文件
                                        wrapper_class_name = f"{cleaned_suffix2}Wrapper"
                                        if os.path.exists(os.path.join(input_directory, wrapper_class_name + ".java")):
                                            return_type = wrapper_class_name  # 修改返回类型
                                        else:
                                            return_type="Object"


                                        method_name = f"get{cleaned_suffix2}"
                                        new_method = f"""
                                        public {return_type} {method_name}()  throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,BaseXException,JAXBException {{
                                            java.lang.String path = {obj_name_instance}.get{method_suffix}().getValue();
                                            java.lang.String type = {obj_name_instance}.get{method_suffix}().getDest().toString().replace("_", "-");
                                            SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
                                            java.lang.String className = schemaController.convertClassName(type);
                                            Object queryObject = schemaController.queryObject(path, type);
                                            java.lang.String wrapperClassName = "{package_name}" + className + "Wrapper";
                                            Class<?> wrapperClass = Class.forName(wrapperClassName);
                                            Constructor<?> wrapperConstructor = wrapperClass.getConstructor(queryObject.getClass());
                                            Object wrapperInstance = wrapperConstructor.newInstance(queryObject);
                                            return ({return_type}) wrapperInstance;
                                        }}
                                        """
                                        new_methods.append(new_method)
                                        print(f"生成方法: {method_name} 所属类: {class_name}")

                    # 第二种情况：类名以指定后缀结尾或包含下划线且包含getDest方法
                    if (class_name.endswith(('RefWrapper', 'TrefWrapper', 'IrefWrapper')) or
                        ('_' in class_name and class_name.split('_')[0].endswith(('Ref', 'Tref', 'Iref')))) and has_get_dest_method(content):
                        ref_obj = class_name.rsplit('Wrapper', 1)[0]  # 获取类名前缀
                        cleaned_suffix = ref_obj.replace('Ref', '').replace('Iref', '').replace('Tref', '')

                        # 检查是否存在相应的 Wrapper 文件
                        wrapper_class_name = f"{cleaned_suffix}Wrapper"
                        return_type = "Object"
                        if os.path.exists(os.path.join(input_directory, wrapper_class_name + ".java")):
                            return_type = wrapper_class_name  # 修改返回类型

                        method_name = f"get{cleaned_suffix}"
                        new_method = f"""
                        public {return_type} {method_name}() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,BaseXException,JAXBException {{
                            java.lang.String path = {obj_name_instance}.getValue();
                            java.lang.String type = {obj_name_instance}.getDest().toString().replace("_", "-");
                            SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
                            java.lang.String className = schemaController.convertClassName(type);
                            Object queryObject = schemaController.queryObject(path, type);
                            java.lang.String wrapperClassName = "{package_name}" + className + "Wrapper";
                            Class<?> wrapperClass = Class.forName(wrapperClassName);
                            Constructor<?> wrapperConstructor = wrapperClass.getConstructor(queryObject.getClass());
                            Object wrapperInstance = wrapperConstructor.newInstance(queryObject);
                            return ({return_type}) wrapperInstance;
                        }}
                        """
                        new_methods.append(new_method)
                        print(f"生成方法: {method_name} 所属类: {class_name}")

            # 将修改后的文件写入输出目录
            if new_methods:
                modified_content = insert_methods_into_class(content, new_methods)  # 插入方法
                output_file_path = os.path.join(output_directory, file_name)
                with open(output_file_path, 'w', encoding='utf-8') as output_file:
                    output_file.write(modified_content)
            else:
                # 如果不需要修改，则直接复制文件
                shutil.copy(file_path, os.path.join(output_directory, file_name))

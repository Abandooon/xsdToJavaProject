import os
import shutil
import re


def copy_files(src_directory, dst_directory):
    """复制源目录中的所有文件到目标目录。"""
    if not os.path.exists(dst_directory):
        os.makedirs(dst_directory)
    for item in os.listdir(src_directory):
        src_path = os.path.join(src_directory, item)
        dst_path = os.path.join(dst_directory, item)
        if os.path.isdir(src_path):
            shutil.copytree(src_path, dst_path, dirs_exist_ok=True)
        else:
            shutil.copy2(src_path, dst_path)


def update_class_name(file_path, class_name, new_class_name):
    """更新Java文件中的类名。"""
    with open(file_path, 'r', encoding='utf-8') as file:
        content = file.read()

    # 使用正则表达式替换类声明中的类名
    class_declaration_pattern = re.compile(r'\bclass\s+' + re.escape(class_name) + r'\b')
    updated_content = class_declaration_pattern.sub(f'class {new_class_name}', content)

    # 将修改后的内容写回文件
    with open(file_path, 'w', encoding='utf-8') as file:
        file.write(updated_content)


def update_references_in_source(file_path, class_name, new_class_name):
    """更新源文件中对类的引用，包括List类型。"""
    with open(file_path, 'r', encoding='utf-8') as file:
        content = file.read()

    # 替换属性声明
    field_pattern = re.compile(rf'\b{class_name}\b\s+(\w+);')
    content = field_pattern.sub(f'{new_class_name} \\1;', content)

    # 替换List<>类型
    list_pattern = re.compile(rf'List<{class_name}>')
    content = list_pattern.sub(f'List<{new_class_name}>', content)

    # 替换getter方法
    getter_pattern = re.compile(rf'public\s+{class_name}\b\s+get(\w+)\(\)')
    content = getter_pattern.sub(f'public {new_class_name} get\\1()', content)

    # 替换setter方法
    setter_pattern = re.compile(rf'public\s+void\s+set(\w+)\(\s*{class_name}\b\s+(\w+)\)')
    content = setter_pattern.sub(f'public void set\\1({new_class_name} \\2)', content)

    # 将修改后的内容写回文件
    with open(file_path, 'w', encoding='utf-8') as file:
        file.write(content)


def process_java_files(input_directory, output_directory):
    """处理Java文件，根据文件名修改类名和源文件中的引用。"""
    copy_files(input_directory, output_directory)

    for root, _, files in os.walk(output_directory):
        for file in files:
            if file.endswith('.java') and '_' in file:
                file_path = os.path.join(root, file)

                # 从文件名中提取类名和可能的多个源文件名
                parts = file[:-5].split('_')

                # 确保至少两个部分：ClassName 和至少一个 OriClassName
                if len(parts) >= 2:
                    class_name = parts[0]
                    ori_class_names = parts[1:]
                    new_class_name = f'{class_name}_{"_".join(ori_class_names)}'

                    # 修改当前类文件中的类名
                    update_class_name(file_path, class_name, new_class_name)

                    # 修改所有源文件中的引用
                    for ori_class_name in ori_class_names:
                        source_file_path = os.path.join(root, f'{ori_class_name}.java')
                        if os.path.exists(source_file_path):
                            update_references_in_source(source_file_path, class_name, new_class_name)

                    # 如果存在中间部分，则修改中间部分文件
                    if len(ori_class_names) > 1:
                        intermediate_file_name = f"{ori_class_names[0]}_{ori_class_names[1]}.java"
                        intermediate_file_path = os.path.join(root, intermediate_file_name)
                        if os.path.exists(intermediate_file_path):
                            update_references_in_source(intermediate_file_path, class_name, new_class_name)
                else:
                    # 打印不符合条件的文件名
                    print(f"Skipping file '{file}': does not contain valid parts when split by '_'.")


# 定义输入和输出目录
input_directory = r'D:\Users\User\Desktop\1'
output_directory = r'D:\Users\User\Desktop\0'

# 处理Java文件
process_java_files(input_directory, output_directory)
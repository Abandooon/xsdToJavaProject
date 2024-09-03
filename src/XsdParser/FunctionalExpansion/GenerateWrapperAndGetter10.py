#这里要运行两次，搭配第一次生成的wrapper文件修改返回值类型为wrapper
import os
import re
import logging

# 配置日志记录
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')


def extract_outer_class_getters(content):
    """
    提取外部类的 getter 方法信息。

    参数:
    - content: Java 文件的内容

    返回:
    - List[Tuple[str, str]]: 每个元素包含返回类型和 getter 方法名称。
    """
    # 匹配外部类中的 getter 方法
    getter_pattern = re.compile(r'public\s+([\w\.\[\]<>]+)\s+get(\w+)\s*\(\s*\)\s*{')
    getters = getter_pattern.findall(content)
    return getters


def create_wrapper_file(java_file_path, output_dir, class_names, getter_collection_file):
    with open(java_file_path, 'r', encoding='utf-8') as file:
        content = file.read()

    # 提取包名
    package_match = re.search(r'package\s+([\w\.]+);', content)
    package_name = package_match.group(1) + ".wrapper" if package_match else ""

    # 提取类名并检查是否以 public class 开头
    class_match = re.search(r'\b(public\s+class\s+\w+)', content)
    if not class_match:
        return  # 跳过不符合条件的类
    class_name = class_match.group(1).split()[-1]  # 获取类名

    # 提取外部类的getter方法
    outer_getter_methods = extract_outer_class_getters(content)

    # 构建Wrapper类名
    wrapper_class_name = f"{class_name}Wrapper"

    # 构造Wrapper类内容
    wrapper_content = f"""package {package_name};

import java.util.List;
import stdgui.data.entity.schema.Annotation;
import stdgui.data.entity.schema.String;
import stdgui.data.entity.schema.Float;
import stdgui.data.entity.schema.Boolean;
import stdgui.data.entity.schema.Integer;

public class {wrapper_class_name} {{
    private {class_name} {class_name[0].lower() + class_name[1:]};

    public {wrapper_class_name}({class_name} {class_name[0].lower() + class_name[1:]}) {{
        this.{class_name[0].lower() + class_name[1:]} = {class_name[0].lower() + class_name[1:]};
    }}

    public {class_name} get{class_name}() {{
        return {class_name[0].lower() + class_name[1:]};
    }}

    public void set{class_name}({class_name} {class_name[0].lower() + class_name[1:]}) {{
        this.{class_name[0].lower() + class_name[1:]} = {class_name[0].lower() + class_name[1:]};
    }}
"""

    # 添加外部类的getter方法
    for return_type, field_name in outer_getter_methods:
        # 检查 return_type 是否是 List<...> 形式
        list_match = re.match(r'List<(\w+)>', return_type)
        if list_match:
            # 提取 List 内部的类型
            inner_type = list_match.group(1)
            # 检查内部类型是否在 class_names 中
            if inner_type in class_names:
                # 修改 return_type 和方法体为 List 类型
                modified_return_type = f"List<{inner_type}Wrapper>"
                wrapper_content += f"""
        public {modified_return_type} get{field_name}() {{
            List<{inner_type}> {inner_type[0].lower() + inner_type[1:]} = {class_name[0].lower() + class_name[1:]}.get{field_name}();
            List<{inner_type}Wrapper> {inner_type[0].lower() + inner_type[1:]}Wrappers = {inner_type[0].lower() + inner_type[1:]}
            .stream().map(a -> new {inner_type}Wrapper(a))
            .collect(Collectors.toList());
            return {inner_type[0].lower() + inner_type[1:]}Wrappers;
        }}
    """
                # 记录方法信息
                with open(getter_collection_file, 'a', encoding='utf-8') as gc_file:
                    gc_file.write(f"{modified_return_type} get{field_name}() in {wrapper_class_name}\n")
            else:
                # 未匹配到的 List 类型返回原始方法体
                wrapper_content += f"""
        public {return_type} get{field_name}() {{
            return {class_name[0].lower() + class_name[1:]}.get{field_name}();
        }}
    """
                # 记录方法信息
                with open(getter_collection_file, 'a', encoding='utf-8') as gc_file:
                    gc_file.write(f"{return_type} get{field_name}() in {wrapper_class_name}\n")
        else:
            # 检查非 List 类型是否在 class_names 中
            if return_type in class_names:
                # 修改返回类型和方法体为普通类型
                modified_return_type = f"{return_type}Wrapper"
                wrapper_content += f"""
        public {modified_return_type} get{field_name}() {{
            return new {modified_return_type}({class_name[0].lower() + class_name[1:]}.get{field_name}());
        }}
    """
                # 记录方法信息
                with open(getter_collection_file, 'a', encoding='utf-8') as gc_file:
                    gc_file.write(f"{modified_return_type} get{field_name}() in {wrapper_class_name}\n")
            else:
                # 未匹配到的普通类型返回原始方法体
                wrapper_content += f"""
        public {return_type} get{field_name}() {{
            return {class_name[0].lower() + class_name[1:]}.get{field_name}();
        }}
    """
                # 记录方法信息
                with open(getter_collection_file, 'a', encoding='utf-8') as gc_file:
                    gc_file.write(f"{return_type} get{field_name}() in {wrapper_class_name}\n")

    wrapper_content += "\n}"

    # 确定输出路径
    output_file_path = os.path.join(output_dir, os.path.relpath(java_file_path, input_directory)).replace(".java",
                                                                                                          "Wrapper.java")

    # 确保输出目录存在
    os.makedirs(os.path.dirname(output_file_path), exist_ok=True)

    # 写入新文件
    with open(output_file_path, 'w', encoding='utf-8') as wrapper_file:
        wrapper_file.write(wrapper_content)

    # 打印生成的类名
    print(f"Generated wrapper for class: {class_name}")


def process_directory(input_directory, output_directory):
    class_names_file = os.path.join(input_directory, "GenerateWrapperClass.java")
    getter_collection_file = os.path.join(output_directory, "GetterCollection.java")

    # 清空 GetterCollection 文件的内容
    with open(getter_collection_file, 'w', encoding='utf-8') as gc_file:
        gc_file.write("")

    # 读取已生成类名列表
    if os.path.exists(class_names_file):
        with open(class_names_file, 'r', encoding='utf-8') as cn_file:
            class_names = {line.strip() for line in cn_file}
    else:
        class_names = set()

    for root, _, files in os.walk(input_directory):
        for file in files:
            if file.endswith('.java'):
                file_path = os.path.join(root, file)
                create_wrapper_file(file_path, output_directory, class_names, getter_collection_file)


# 指定输入和输出目录路径
input_directory = r'D:\Users\User\Desktop\0'
output_directory = r'D:\Users\User\Desktop\1'
process_directory(input_directory, output_directory)

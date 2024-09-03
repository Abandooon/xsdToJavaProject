import os
import re

# 定义输入和输出目录
input_directory = r'D:\Users\User\Desktop\0'
output_directory = r'D:\Users\User\Desktop\1'


def remove_class_prefixes(file_content):
    # 定义临时标记用于保护 import, this. 和 @ 注解中的内容
    temp_import_marker = "<TEMP_IMPORT>"
    temp_this_marker = "<TEMP_THIS>"
    temp_annotation_marker = "<TEMP_ANNOTATION>"

    # 替换 import, this. 和 @ 注解内容为临时标记
    temp_content = re.sub(r'\bimport\s+([\w.]+)', lambda m: m.group(0).replace('.', temp_import_marker), file_content)
    temp_content = re.sub(r'\bthis\.', lambda m: m.group(0).replace('.', temp_this_marker), temp_content)

    # 使用正则表达式匹配注解，保护注解中的内容
    annotation_pattern = re.compile(r'(@\w+\()([^\)]+)(\))')
    temp_content = annotation_pattern.sub(
        lambda m: m.group(1) + m.group(2).replace('.', temp_annotation_marker) + m.group(3), temp_content)

    # 定义匹配并删除类名前缀的正则表达式
    prefix_pattern = re.compile(r'(?<!\bpackage\s)(\b(?:\w+\.)+)(\w+\b)')

    # 用于记录被删除的类名前缀
    removed_prefixes = []

    def replacement(match):
        full_match = match.group(0)
        prefix = match.group(1)
        class_name = match.group(2)

        # 仅当前缀以 'stdgui.' 开头时删除
        if prefix.startswith("stdgui."):
            removed_prefixes.append(prefix)
            return class_name  # 返回删除前缀后的类名

        # 如果类名前缀是以大写字母开头
        elif prefix[0].isupper():
            # 检查类名是否以 .class 结尾并处理
            if class_name.endswith('class'):
                parts = full_match.split('.')
                # 返回最后两个部分，即 Name.class
                return '.'.join(parts[-2:])

            # 如果不是以 .class 结尾，删除前缀
            removed_prefixes.append(prefix)
            return class_name  # 返回删除前缀后的类名

        else:
            return full_match  # 保留原始内容

    # 进行替换并记录被删除的前缀
    modified_content = prefix_pattern.sub(replacement, temp_content)

    # 恢复 import, this. 和 @ 注解的原始点号
    modified_content = modified_content.replace(temp_import_marker, '.').replace(temp_this_marker, '.').replace(
        temp_annotation_marker, '.')

    # 处理@xmlelement注解内容
    xml_element_pattern = re.compile(r'(@XmlElement\(([^)]+)\))')

    def xml_element_replacement(match):
        before = match.group(1)
        content = match.group(2)

        # 使用正则表达式匹配type属性及其值
        type_pattern = re.compile(r'\btype\s*=\s*([\w.]+)\b')

        def type_replacement(type_match):
            full_type = type_match.group(1)
            parts = full_type.split('.')
            # 检查是否符合条件，保留最后两个部分
            if len(parts) > 2 and parts[-2][0].isupper() and parts[-1] == 'class':
                return 'type = ' + '.'.join(parts[-2:])
            return type_match.group(0)  # 不符合条件，保留原样

        # 替换type部分
        modified_content = type_pattern.sub(type_replacement, content)

        return before.replace(content, modified_content)

    modified_content = xml_element_pattern.sub(xml_element_replacement, modified_content)

    # 检查并设置包名（仅在没有包声明时添加）
    package_declaration_pattern = re.compile(r'^\s*package\s+[\w.]+;\s*', re.MULTILINE)
    desired_package_name = 'package stdgui.data.entity.schema;'

    # 如果匹配不到包声明，则在文件开头添加指定的包名
    if not package_declaration_pattern.search(modified_content):
        modified_content = desired_package_name + '\n' + modified_content

    # 添加导入语句
    import_statements = [
        'import java.util.ArrayList;' + "\n",
        'import java.util.List;' + "\n",
        'import java.lang.String;' + "\n"
    ]

    # 检查并添加导入语句（避免重复添加）
    for import_statement in import_statements:
        if import_statement not in modified_content:
            # 插入到第一个导入语句之后或包声明之后
            insert_position = package_declaration_pattern.search(modified_content)
            if insert_position:
                # 找到包声明后的位置
                insert_position_end = insert_position.end()
                modified_content = (
                        modified_content[:insert_position_end] +
                        '\n' + import_statement +
                        modified_content[insert_position_end:]
                )
            else:
                # 如果没有包声明，则直接在文件开头插入
                modified_content = import_statement + '\n' + modified_content

    # 打印删除的类名前缀
    if removed_prefixes:
        print("Removed prefixes:")
        for prefix in removed_prefixes:
            print(prefix)
        print("\n")

    return modified_content


def process_directory(input_dir, output_dir):
    for root, dirs, files in os.walk(input_dir):
        # 计算相应的输出目录
        relative_path = os.path.relpath(root, input_dir)
        output_root = os.path.join(output_dir, relative_path)

        # 确保输出目录存在
        os.makedirs(output_root, exist_ok=True)

        for file_name in files:
            input_file_path = os.path.join(root, file_name)
            output_file_path = os.path.join(output_root, file_name)

            # 读取文件内容
            with open(input_file_path, 'r', encoding='utf-8') as input_file:
                file_content = input_file.read()

            # 打印当前处理的文件名
            print(f"Processing file: {input_file_path}")

            # 处理内容以删除类名前缀
            modified_content = remove_class_prefixes(file_content)

            # 将修改后的内容写入输出文件
            with open(output_file_path, 'w', encoding='utf-8') as output_file:
                output_file.write(modified_content)


# 处理输入目录中的所有文件
process_directory(input_directory, output_directory)

#删除文件最下方的注解内容
import os
import re

# 输入和输出目录
input_directory = r'D:\Users\User\Desktop\0'
output_directory = r'D:\Users\User\Desktop\1'

# 匹配类定义的正则表达式
class_regex = re.compile(r'public\s+class\s+(?P<classname>\w+)(?:\s+extends\s+\w+)?\s*\{')

# 匹配public方法的正则表达式
method_regex = re.compile(r'public\s+.*?\{')

def find_matching_brace(text, start_pos):
    """Find the position of the matching closing brace for the opening brace at start_pos."""
    open_braces = 0
    for pos in range(start_pos, len(text)):
        if text[pos] == '{':
            open_braces += 1
        elif text[pos] == '}':
            open_braces -= 1
            if open_braces == 0:
                return pos
    return -1

def process_file(file_path, output_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        content = file.read()

    # 找到类定义的位置
    class_match = class_regex.search(content)
    if not class_match:
        return  # 没有找到类定义

    # 找到类定义的起始位置和匹配的结束大括号
    class_start = class_match.start()
    class_end = find_matching_brace(content, class_start)

    if class_end == -1:
        return  # 没有找到匹配的类结束大括号

    # 在类范围内寻找最后一个public方法
    last_public_method_match = None
    for match in method_regex.finditer(content, class_start, class_end):
        last_public_method_match = match

    if not last_public_method_match:
        return  # 没有找到public方法

    # 找到最后一个public方法的起始位置和匹配的结束大括号
    method_start = last_public_method_match.start()
    method_end = find_matching_brace(content, method_start)

    if method_end == -1:
        return  # 没有找到匹配的方法结束大括号

    # 确定需要删除的范围（不包括大括号本身）
    delete_start = method_end + 1
    delete_end = class_end

    # 打印要删除的内容
    deleted_content = content[delete_start:delete_end].strip()
    if deleted_content:
        print(f"Deleted content from {file_path}:\n{deleted_content}\n")

    # 构造新的文件内容
    new_content = content[:delete_start] + content[delete_end:]

    # 将修改后的内容写入输出文件
    with open(output_path, 'w', encoding='utf-8') as file:
        file.write(new_content)

def process_directory(input_directory, output_directory):
    if not os.path.exists(output_directory):
        os.makedirs(output_directory)

    for root, _, files in os.walk(input_directory):
        for file in files:
            if file.endswith('.java'):
                input_file_path = os.path.join(root, file)
                output_file_path = os.path.join(output_directory, os.path.relpath(input_file_path, input_directory))

                output_file_dir = os.path.dirname(output_file_path)
                if not os.path.exists(output_file_dir):
                    os.makedirs(output_file_dir)

                process_file(input_file_path, output_file_path)

process_directory(input_directory, output_directory)

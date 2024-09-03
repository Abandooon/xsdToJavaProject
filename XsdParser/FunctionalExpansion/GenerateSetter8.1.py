import os
import re

# 输入和输出目录
input_directory = r'D:\Users\User\Desktop\0'
output_directory = r'D:\Users\User\Desktop\1'

# 匹配public List<类名> get方法的正则表达式
getter_regex = re.compile(r'public\s+List<(?P<type>\w+)>\s+get(?P<name>\w+)\s*\(\)\s*\{\s*return\s+(?P<var_name>\w+);')

# 匹配public void set方法的正则表达式
setter_regex = re.compile(r'public\s+void\s+set(?P<name>\w+)\s*\(\s*List<(?P<type>\w+)>\s+(?P<var_name>\w+)\)\s*\{')

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

    # 查找所有的getter方法
    getter_methods = []
    for getter_match in getter_regex.finditer(content):
        getter_methods.append(getter_match)

    new_methods = []  # 用于存放生成的setter方法

    for getter_match in getter_methods:
        getter_start = getter_match.start()
        getter_end = find_matching_brace(content, getter_start)
        if getter_end == -1:
            continue  # 跳过没有匹配的大括号

        # 获取getter的名称、类型和返回变量名
        type_name = getter_match.group('type')
        field_name = getter_match.group('name')
        return_var_name = getter_match.group('var_name')

        # 检查是否存在对应的setter方法
        setter_match = setter_regex.search(content, getter_end)
        if setter_match and setter_match.start() < len(content) and setter_match.group('type') == type_name and setter_match.group('name') == field_name:
            # 如果找到了对应的setter方法，且方法名和类型匹配，则跳过生成
            continue

        # 如果没有找到对应的setter方法，则创建一个新的setter方法
        setter_method = f"""
    public void set{field_name}(List<{type_name}> {return_var_name}) {{
        this.{return_var_name} = {return_var_name};
    }}
"""
        new_methods.append((getter_end + 1, setter_method))

    # 在内容中插入新的setter方法
    new_content = content
    offset = 0
    for insert_pos, method in new_methods:
        new_content = new_content[:insert_pos + offset] + method + new_content[insert_pos + offset:]
        offset += len(method)

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

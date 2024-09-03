import os
import shutil
import re

# 定义输入和输出目录路径
input_directory = r'D:\Users\User\Desktop\0'
output_directory = r'D:\Users\User\Desktop\1'

# 如果输出目录不存在，则创建
os.makedirs(output_directory, exist_ok=True)


def copy_files_to_output_directory(src_directory, dst_directory):
    """复制源目录中的所有文件到目标目录。"""
    for root, _, files in os.walk(src_directory):
        for file in files:
            src_file_path = os.path.join(root, file)
            relative_path = os.path.relpath(root, src_directory)
            dst_file_dir = os.path.join(dst_directory, relative_path)
            dst_file_path = os.path.join(dst_file_dir, file)

            if not os.path.exists(dst_file_dir):
                os.makedirs(dst_file_dir)

            shutil.copy2(src_file_path, dst_file_path)


# 转换类名为全大写并用 "-" 分隔
def convert_class_name_to_tagname(class_name):
    # 仅使用第一个下划线前的部分
    base_name = class_name.split('_')[0]
    # 将类名中的每个大写字母替换为 "-" 并转换为大写
    tagname = re.sub(r'(?<!^)(?=[A-Z])', '-', base_name).upper()
    return tagname


# 帮助函数：从文件内容中提取类名
def extract_class_name(content):
    # 使用正则表达式匹配类名
    class_match = re.search(r'\bclass\s+(\w+)', content)
    return class_match.group(1) if class_match else None


# 帮助函数：在类定义之前插入注解
def insert_xml_root_element(content, tagname):
    # 找到类定义的位置
    class_definition_pattern = re.compile(r'(public\s+class\s+\w+)')
    match = class_definition_pattern.search(content)

    if not match:
        return content

    # 找到类定义行的开始位置
    class_definition_start = match.start()

    # 找到插入位置，即类定义行的上一行
    insert_position = content.rfind('\n', 0, class_definition_start) + 1

    # 准备插入的内容
    xml_root_element = f'@XmlRootElement(name="{tagname}")\n'

    # 插入到类定义行的上一行
    modified_content = content[:insert_position] + xml_root_element + content[insert_position:]

    return modified_content


# 复制文件到输出目录
copy_files_to_output_directory(input_directory, output_directory)

# 遍历输出目录中的每个Java文件
for root, _, files in os.walk(output_directory):
    for file_name in files:
        if file_name.endswith('.java'):
            # 检查文件名是否带下划线
            if '_' in file_name:
                # 带下划线的文件名只检查第一个下划线之前的部分
                base_name = file_name.split('_')[0]
            else:
                # 没有下划线的文件名检查整个文件名（去掉后缀）
                base_name = file_name[:-5]  # 去掉 .java 后缀

            # 检查文件名是否以指定后缀结尾
            if not re.search(r'(Ref|Tref|Iref|s|Enum|Simple|Type)$', base_name):
                file_path = os.path.join(root, file_name)

                with open(file_path, 'r', encoding='utf-8') as file:
                    content = file.read()

                class_name = extract_class_name(content)

                if class_name:
                    tagname = convert_class_name_to_tagname(class_name)
                    print(f'处理文件: {file_name}, 类名: {class_name}, Tagname: {tagname}')

                    # 在类定义行上方插入注解
                    modified_content = insert_xml_root_element(content, tagname)

                    # 将修改后的文件写回输出目录
                    with open(file_path, 'w', encoding='utf-8') as output_file:
                        output_file.write(modified_content)
            else:
                # 打印跳过的文件名
                print(f'跳过文件: {file_name}')

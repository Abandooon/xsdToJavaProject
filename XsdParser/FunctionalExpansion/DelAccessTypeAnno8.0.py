#删除类名上方的注解
import os
import shutil
import re

# 定义输入和输出目录路径
input_directory = r'D:\Users\User\Desktop\1'
output_directory = r'D:\Users\User\Desktop\0'

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

# 复制文件到输出目录
copy_files_to_output_directory(input_directory, output_directory)

def remove_xml_accessor_type_annotation(content):
    """从Java文件内容中删除@XmlAccessorType(XmlAccessType.FIELD)注解。"""
    # 正则表达式匹配注解
    pattern = re.compile(r'@XmlAccessorType\s*\(\s*XmlAccessType\.FIELD\s*\)\s*', re.MULTILINE)
    modified_content = pattern.sub('', content)
    return modified_content

# 遍历输出目录中的每个Java文件
for root, _, files in os.walk(output_directory):
    for file_name in files:
        if file_name.endswith('.java'):
            file_path = os.path.join(root, file_name)

            with open(file_path, 'r', encoding='utf-8') as file:
                content = file.read()

            # 删除@XmlAccessorType(XmlAccessType.FIELD)注解
            modified_content = remove_xml_accessor_type_annotation(content)

            # 将修改后的文件写回输出目录
            with open(file_path, 'w', encoding='utf-8') as output_file:
                output_file.write(modified_content)

            print(f'处理文件: {file_name}')

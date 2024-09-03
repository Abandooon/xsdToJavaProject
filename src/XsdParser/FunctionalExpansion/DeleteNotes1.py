#删除注释
import os
import re


def remove_comments(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        content = file.read()

    # 正确删除块注释，但不删除注解中的内容
    content = re.sub(r'/\*[^*]*\*+(?:[^/*][^*]*\*+)*/', '', content, flags=re.DOTALL)

    # 正确删除单行注释，但不删除注解中的内容
    content = re.sub(r'(?<!:)//.*(?=\n)', '', content)

    # 删除多余的空行
    content = re.sub(r'\n\s*\n', '\n', content)
    # 去掉文件开头和结尾的空行
    content = content.strip()

    with open(file_path, 'w', encoding='utf-8') as file:
        file.write(content)


def process_directory(directory_path):
    for root, _, files in os.walk(directory_path):
        for file in files:
            if file.endswith('.java'):
                file_path = os.path.join(root, file)
                remove_comments(file_path)
                print(f'Processed {file_path}')


# 指定包含Java类文件的目录路径
directory_path = 'D:/Users/User/Desktop/stdgui/data/entity/schema'
process_directory(directory_path)

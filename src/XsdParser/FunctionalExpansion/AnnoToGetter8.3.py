import os
import shutil
import re

# 定义目录路径
input_directory = r'D:\Users\User\Desktop\0'
output_directory = r'D:\Users\User\Desktop\1'
target_directory = r'D:\Users\User\Desktop\target'

# 复制输入目录内容到目标目录
if not os.path.exists(target_directory):
    os.makedirs(target_directory)

for root, dirs, files in os.walk(input_directory):
    for file in files:
        src_file = os.path.join(root, file)
        relative_path = os.path.relpath(root, input_directory)
        dest_dir = os.path.join(target_directory, relative_path)
        if not os.path.exists(dest_dir):
            os.makedirs(dest_dir)
        shutil.copy(src_file, os.path.join(dest_dir, file))

# 遍历输出目录中的 _Anno.txt 文件
for anno_filename in os.listdir(output_directory):
    if anno_filename.endswith('_Anno.txt'):
        # 获取对应的Java文件名
        java_filename = anno_filename.replace('_Anno.txt', '.java')
        java_file_path = None

        # 在目标目录中找到对应的Java文件路径
        for root, dirs, files in os.walk(target_directory):
            if java_filename in files:
                java_file_path = os.path.join(root, java_filename)
                break

        if java_file_path:
            # 读取Anno.txt文件内容
            anno_file_path = os.path.join(output_directory, anno_filename)
            with open(anno_file_path, 'r', encoding='utf-8') as anno_file:
                anno_content = anno_file.read()

            # 分割Anno.txt文件内容
            anno_blocks = re.split(r'(\*\*\*get[A-Za-z0-9]+\*\*\*)', anno_content)

            if len(anno_blocks) > 1:
                # 读取目标Java文件内容
                with open(java_file_path, 'r', encoding='utf-8') as java_file:
                    java_content = java_file.readlines()

                # 插入注解到目标Java文件中
                new_java_content = []
                for line in java_content:
                    # 去除行首的空格和制表符
                    stripped_line = line.lstrip()

                    # 调整后的正则表达式，考虑带点号和泛型的返回类型
                    getter_match = re.match(
                        r'public\s+([\w<>,.\s]+)\s+(get[A-Za-z0-9_]+)\s*\(',
                        stripped_line
                    )
                    if getter_match:
                        getter_name = getter_match.group(2)
                        matched = False
                        # 查找是否有对应的注解块
                        for i in range(1, len(anno_blocks), 2):
                            if f"***{getter_name}***" in anno_blocks[i]:
                                new_java_content.append(anno_blocks[i + 1].strip() + "\n")
                                matched = True
                                break
                        if not matched:
                            print(f"No matching annotation found for getter {getter_name} in file {java_filename}")
                    new_java_content.append(line)

                # 将修改后的内容写回到目标Java文件中
                with open(java_file_path, 'w', encoding='utf-8') as java_file:
                    java_file.writelines(new_java_content)

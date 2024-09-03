#第二遍匹配不应该只删除@xmlElementWrapper，其他种类注解都删除
import os
import re
import shutil

# 定义目录路径
input_directory = r'D:\Users\User\Desktop\ori'
output_directory = r'D:\Users\User\Desktop\target'
target_directory = r'D:\Users\User\Desktop\1'

# 复制 input_directory 到 output_directory
shutil.copytree(input_directory, output_directory, dirs_exist_ok=True)

# 定义匹配 getter 方法的正则表达式
getter_pattern = re.compile(r'\bpublic\s+[\w\<\>\.\[\]]+\s+get[A-Z]\w*\s*\(')

# 定义匹配 "***getAnno***" 的正则表达式（灵活匹配不同的 Anno）
anno_split_pattern = re.compile(r'\*\*\*get[A-Za-z]+\*\*\*')

# 定义匹配 "@XmlElementWrapper" 注解的正则表达式
xml_element_wrapper_pattern = re.compile(r'@XmlElementWrapper\s*\(.*?\)', re.DOTALL)

# 遍历 output_directory 中的所有 Java 文件
for root, dirs, files in os.walk(output_directory):
    for file in files:
        if file.endswith(".java"):
            java_file_path = os.path.join(root, file)

            # 读取 Java 文件内容
            with open(java_file_path, 'r', encoding='utf-8') as java_file:
                java_content = java_file.readlines()

            # 定位第一个 getter 方法的位置
            getter_line_index = None
            for i, line in enumerate(java_content):
                if getter_pattern.search(line):
                    getter_line_index = i
                    break

            # 如果找到 getter 方法
            if getter_line_index is not None:
                # 获取对应的 _Anno.txt 文件路径
                anno_file_name = os.path.splitext(file)[0] + "_Anno.txt"
                anno_file_path = os.path.join(target_directory, anno_file_name)

                # 检查 _Anno.txt 文件是否存在
                if os.path.exists(anno_file_path):
                    # 读取 _Anno.txt 文件内容
                    with open(anno_file_path, 'r', encoding='utf-8') as anno_file:
                        anno_content = anno_file.read()

                    # 提取所有注解信息，使用灵活的正则表达式匹配 "***getAnno***"
                    annotations = anno_split_pattern.split(anno_content)
                    annotations = [anno.strip() for anno in annotations if anno.strip()]

                    # 第一次匹配：替换 Java 文件中的整体注解
                    for anno in annotations:
                        # 构建整体匹配正则表达式，确保与Java文件中的格式匹配
                        anno_pattern = re.escape(anno).replace(r'\ ', r'\s*')
                        anno_pattern = anno_pattern.replace(r'\n', r'\s*')
                        pattern = re.compile(anno_pattern, re.MULTILINE)

                        # 查找并替换注解为空字符串
                        for j in range(getter_line_index):
                            match = pattern.search(''.join(java_content[j:j + len(anno.splitlines())]))
                            if match:
                                # 将匹配的注解替换为空字符串
                                for k in range(j, j + len(anno.splitlines())):
                                    java_content[k] = '\n'  # 替换为对应行数的空行
                                break

                # 第二遍匹配：直接从Java文件中查找 @XmlElementWrapper 注解
                # 并且只在getter方法之前的部分进行查找
                upper_content = ''.join(java_content[:getter_line_index])
                match = xml_element_wrapper_pattern.search(upper_content)
                while match:
                    start_line = upper_content[:match.start()].count('\n')
                    end_line = start_line + match.group().count('\n') + 1

                    # 替换匹配的注解部分为空行
                    for line_index in range(start_line, end_line):
                        java_content[line_index] = '\n'

                    # 重新搜索下一个匹配项
                    upper_content = ''.join(java_content[:getter_line_index])
                    match = xml_element_wrapper_pattern.search(upper_content)

                # 将修改后的 Java 文件内容保存回去
                with open(java_file_path, 'w', encoding='utf-8') as java_file:
                    java_file.writelines(java_content)

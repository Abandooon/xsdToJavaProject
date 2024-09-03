#提取内部类
import re
import os
import shutil
import logging

# 设置日志配置
logging.basicConfig(level=logging.INFO, format='%(message)s')

def extract_inner_classes(input_dir, output_dir):
    # 确保输出目录存在，如果不存在则创建
    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    # 将输入目录中的所有文件复制到输出目录
    for filename in os.listdir(input_dir):
        src_file = os.path.join(input_dir, filename)
        dst_file = os.path.join(output_dir, filename)
        shutil.copy(src_file, dst_file)

    # 遍历输出目录中的所有 Java 文件
    for filename in os.listdir(output_dir):
        if filename.endswith(".java"):
            file_path = os.path.join(output_dir, filename)
            process_java_file(file_path, output_dir)

def process_java_file(file_path, output_dir):
    with open(file_path, 'r', encoding='utf-8') as file:
        content = file.read()

    # 定义用于识别内部类的正则表达式模式
    inner_class_pattern = re.compile(
        r'(public\s+static\s+class\s+(?P<classname>\w+)(?:\s+extends\s+\w+)?\s*\{)',
        re.MULTILINE
    )

    # 初始化变量存储提取出的类
    extracted_classes = []
    position = 0  # 当前解析位置

    # 获取原始类名
    ori_class_name = os.path.splitext(os.path.basename(file_path))[0]

    while True:
        # 查找下一个符合条件的内部类
        match = inner_class_pattern.search(content, position)

        if not match:
            break

        # 提取类名及其开始位置
        start = match.start()
        class_start = match.end() - 1  # 获取第一个 '{' 的位置
        classname = match.group('classname')

        # 检查类前面的注释和注解
        lines = content[:start].splitlines()
        notes = ""
        annotation = 0

        for i in range(1, 30):
            if lines[-i].strip() == "@XmlAccessorType(XmlAccessType.FIELD)":
                annotation = i
                break

        while annotation > 1:
            notes += lines[-annotation].strip() + "\n"
            annotation -= 1

        # 找到整个内部类，通过匹配括号
        class_end = find_matching_brace(content, class_start)

        if class_end == -1:
            logging.error(f"未能找到类 {classname} 的结束位置，可能存在语法错误或不完整的类定义。")
            position = start + 1
            continue

        # 提取内部类内容
        inner_class_content = content[start:class_end + 1]
        # 删除内部类名中的 static
        inner_class_content = re.sub(
            r'\bstatic\b\s+', '', inner_class_content, count=1
        )

        # 检查输出目录中是否已存在同名文件
        new_class_name = classname
        new_file_path = os.path.join(output_dir, f"{new_class_name}.java")

        # 初始化计数器变量
        count = 1

        # 如果文件存在，只比较文件名
        while os.path.exists(new_file_path):
            # 生成新的类名，格式为 类名_原始类名
            new_class_name = f"{classname}_{ori_class_name}"
            new_file_path = os.path.join(output_dir, f"{new_class_name}.java")
            count += 1

        # 写入新的 Java 文件
        with open(new_file_path, 'w', encoding='utf-8') as new_file:
            new_file.write("package stdgui.data.entity.schema;\n\n")  # 请根据实际需要修改包名
            new_file.write(notes + "\n")
            new_file.write(inner_class_content)

        # 如果类名被更改，打印更改信息
        if new_class_name != classname:
            logging.info(f"类名冲突，已更改类名: {classname} -> {new_class_name}")

        # 从复制的文件中删除内部类
        content = content[:start] + content[class_end + 1:]

        # 添加到已提取的类名列表
        extracted_classes.append((new_class_name, ori_class_name))

        # 更新位置以继续查找下一个匹配
        position = start

        # 递归处理新生成的类文件
        process_java_file(new_file_path, output_dir)

    # 将修改后的文件写回输出路径
    with open(file_path, 'w', encoding='utf-8') as file:
        file.write(content)

    # 打印提取的类名和来源
    for classname, ori_class_name in extracted_classes:
        logging.info(f"提取的类: {classname} (来源: {ori_class_name})")

def find_matching_brace(content, start_index):
    """找到从start_index开始的第一个大括号的匹配结束位置"""
    brace_count = 0
    for i in range(start_index, len(content)):
        if content[i] == '{':
            brace_count += 1
        elif content[i] == '}':
            brace_count -= 1
            if brace_count == 0:
                return i
    return -1

# 示例使用
input_directory = r'C:\Users\54239\Desktop\ori'   # 输入路径
output_directory = r'C:\Users\54239\Desktop\target'  # 输出路径
extract_inner_classes(input_directory, output_directory)

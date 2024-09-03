#删除list（wrapper）对应的内部类，不包括调用其他类的
import os
import re
import logging

# 配置日志记录
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')

def has_dot_in_protected_list(content, wrapper_line):
    """
    检查在 `@XmlElementWrapper` 行之后的两行中是否存在 `protected List<...>`，并判断是否包含 '.'。
    """
    protected_list_line = wrapper_line + 2
    if protected_list_line < len(content):
        # 匹配 protected List<...> 的结构
        list_pattern = re.compile(r'protected\s+List<([^>]+)>')
        list_match = list_pattern.search(content[protected_list_line])
        if list_match:
            # 检查泛型类型中是否包含 '.'
            class_name_within_list = list_match.group(1)
            if '.' in class_name_within_list:
                return True
    return False

def delete_inner_class(file_path, output_dir):
    try:
        with open(file_path, 'r', encoding='utf-8') as file:
            content = file.readlines()
    except Exception as e:
        logging.error(f"Error reading file {file_path}: {e}")
        return

    # 查找所有 @XmlElementWrapper 注解的字段
    wrapper_pattern = re.compile(r'@XmlElementWrapper\s*\(name\s*=\s*"(\w+(-\w+)*)"\)')
    wrapper_fields = [(i, wrapper_pattern.search(line)) for i, line in enumerate(content)]
    class_names = [(''.join(part.title() for part in match.group(1).split('-')), i)
                   for i, match in wrapper_fields if match]

    for class_name, wrapper_line in class_names:
        logging.info(f"Processing class: {class_name}")

        # 检查 protected List<类名> 是否存在，并且不包含 '.'
        if has_dot_in_protected_list(content, wrapper_line):
            logging.info(f"Skipped deletion of class {class_name} due to '.' in List<...>")
            continue

        # 定位 public static class <class_name> 的位置
        start_pattern = re.compile(rf'public\s+static\s+class\s+{class_name}\s*{{')
        start_match = None
        start_line = -1
        for i, line in enumerate(content):
            if start_pattern.search(line):
                start_match = start_pattern.search(line)
                start_line = i
                break

        if start_match is None:
            continue

        logging.info(f"Found start of class {class_name} at line {start_line}")

        # 从类定义开始查找匹配的大括号位置
        bracket_level = 0
        end_line = start_line
        for i in range(start_line, len(content)):
            bracket_level += content[i].count('{')
            bracket_level -= content[i].count('}')
            if bracket_level == 0:
                end_line = i
                break

        if bracket_level != 0:
            logging.warning(f"Could not find matching closing bracket for class {class_name}")
            continue

        # 检查并删除 @XmlAccessorType 注解
        if start_line >= 4 and '@XmlAccessorType(XmlAccessType.FIELD)' in content[start_line - 4]:
            annotations_start_line = start_line - 4
        elif start_line >= 2 and '@XmlAccessorType(XmlAccessType.FIELD)' in content[start_line - 2]:
            annotations_start_line = start_line - 2
        else:
            annotations_start_line = start_line

        # 删除注解和类定义
        deleted_content = content[annotations_start_line:end_line + 1]
        for line in range(annotations_start_line, end_line + 1):
            del content[annotations_start_line]  # consistently delete the line from annotations_start_line

        logging.info(f"Deleted inner class and annotations in {file_path}: \n{''.join(deleted_content)}\n")

    # 确定输出路径
    relative_path = os.path.relpath(file_path, input_directory)
    output_file_path = os.path.join(output_dir, relative_path)

    # 确保输出目录存在
    os.makedirs(os.path.dirname(output_file_path), exist_ok=True)

    # 写入新文件
    try:
        with open(output_file_path, 'w', encoding='utf-8') as file:
            file.writelines(content)
        logging.info(f'Processed {output_file_path}')
    except Exception as e:
        logging.error(f"Error writing file {output_file_path}: {e}")

def process_directory(input_directory, output_directory):
    for root, _, files in os.walk(input_directory):
        for file in files:
            if file.endswith('.java'):
                file_path = os.path.join(root, file)
                delete_inner_class(file_path, output_directory)

# 指定输入和输出目录路径
input_directory = 'D:/Users/User/Desktop/stdgui/data/entity/schema'
output_directory = 'D:/Users/User/Desktop/target'
process_directory(input_directory, output_directory)

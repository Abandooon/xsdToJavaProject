#还有@xmlElementRefs（{}），与@xmlMixed一起的、xmljavatypeadapter与xmlattribute一起的
import os
import re
from collections import deque

# 定义输入和输出目录
input_directory = r'D:\Users\User\Desktop\0'
output_directory = r'D:\Users\User\Desktop\1'

# 正则表达式模式定义
patterns = {
    'XmlElements': re.compile(r'@XmlElements\('),
    'XmlElement': re.compile(r'@XmlElement\('),
    'XmlAttribute': re.compile(r'@XmlAttribute\('),
    'XmlElementWrapper': re.compile(r'@XmlElementWrapper\('),
    'XmlValue': re.compile(r'@XmlValue\b'),
    'XmlMixed': re.compile(r'@XmlMixed\b')
}

xml_element_name_pattern = re.compile(r'name\s*=\s*"([^"]+)"')

def to_camel_case(snake_str):
    """将name值转换为驼峰命名法并首字母大写"""
    components = snake_str.split('-')
    return ''.join(x.title() for x in components)

def extract_annotation(content, start_pos, end_char):
    """通用方法来提取完整注解"""
    stack = deque()
    i = start_pos
    while i < len(content):
        if content[i] == '(':
            stack.append('(')
        elif content[i] == ')':
            stack.pop()
            if not stack:
                end_pos = i + 1
                return content[start_pos:end_pos], end_pos
        i += 1
    return None, start_pos

# 遍历输入目录中的文件
for filename in os.listdir(input_directory):
    if filename.endswith(".java"):
        input_path = os.path.join(input_directory, filename)
        output_path = os.path.join(output_directory, f"{os.path.splitext(filename)[0]}_Anno.txt")

        with open(input_path, 'r', encoding='utf-8') as file:
            content = file.read()

        extracted_annotations = []

        for pattern_name, pattern in patterns.items():
            matches = pattern.finditer(content)

            for match in matches:
                start_pos = match.start()

                # 检查是否在@XmlElements内部，如果是则跳过
                if pattern_name == 'XmlElement' and '@XmlElements(' in content[:start_pos]:
                    continue

                if pattern_name == 'XmlValue':
                    # XmlValue注解直接提取，不需要括号匹配
                    extracted_annotations.append(f"***getValue***\n")
                    extracted_annotations.append(content[start_pos:start_pos + len(pattern_name) + 1] + "\n\n")

                elif pattern_name == 'XmlMixed':
                    # XmlMixed注解直接提取，不需要括号匹配
                    extracted_annotations.append(f"***getContent***\n")
                    extracted_annotations.append(content[start_pos:start_pos + len(pattern_name) + 1] + "\n\n")

                else:
                    annotation, end_pos = extract_annotation(content, start_pos, ')')

                    if annotation:
                        name_matches = xml_element_name_pattern.findall(annotation)
                        processed_names = [to_camel_case(name) for name in name_matches[:3]]

                        if processed_names:
                            anno = "***" +"get"+ "Or".join(processed_names) + "***\n"
                        else:
                            anno = f"***{pattern_name}Anno***\n"

                        # 特殊处理 @XmlElementWrapper
                        if pattern_name == 'XmlElementWrapper':
                            next_match = patterns['XmlElement'].search(content[end_pos:])
                            if next_match:
                                element_annotation, _ = extract_annotation(content, next_match.start() + end_pos, ')')
                                if element_annotation:
                                    annotation += "\n" + element_annotation

                        extracted_annotations.append(anno)
                        extracted_annotations.append(annotation + "\n\n")

        with open(output_path, 'w', encoding='utf-8') as output_file:
            for annotation in extracted_annotations:
                output_file.write(annotation)
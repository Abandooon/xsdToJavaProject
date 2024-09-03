import os
import xml.etree.ElementTree as ET

# 定义输入和输出目录
input_directory = r'D:\Users\User\Desktop\ori'  # 输入路径
output_file = os.path.join(r'D:\Users\User\Desktop\target', 'supperClass.xml')  # 输出文件路径

# 确保输出目录存在
os.makedirs(os.path.dirname(output_file), exist_ok=True)


# 驼峰命名转换函数
def to_camel_case(snake_str):
    components = snake_str.split('-')
    return ''.join(x.title() for x in components[:-2])


# 创建根元素
root = ET.Element('root')

# 遍历输入目录中的所有文件
for filename in os.listdir(input_directory):
    if filename.endswith('.xsd'):
        input_path = os.path.join(input_directory, filename)

        # 解析XSD文件
        tree = ET.parse(input_path)
        xsd_root = tree.getroot()

        # 查找并提取<xsd:simpleType name="***--SUBTYPES-ENUM">元素
        for simple_type in xsd_root.findall(".//{http://www.w3.org/2001/XMLSchema}simpleType"):
            name = simple_type.get('name', '')
            if name.endswith('--SUBTYPES-ENUM') and name.isupper():
                # 添加注释行
                camel_case_name = to_camel_case(name)
                comment = f"<!-- {camel_case_name} -->\n"
                root.append(ET.Comment(camel_case_name))

                # 添加simpleType元素
                root.append(simple_type)

# 将生成的XML写入到单个文件中
with open(output_file, 'w', encoding='utf-8') as f:
    # 使用 ElementTree 的 tostring 方法生成字符串
    f.write('<?xml version="1.0" encoding="UTF-8"?>\n<root>\n')
    for element in root:
        if element.tag is ET.Comment:
            f.write(f"\n<!-- {element.text} -->\n")
        else:
            f.write(ET.tostring(element, encoding='unicode'))
    f.write('\n</root>')

print(f"All extracted simpleTypes have been written to {output_file}")

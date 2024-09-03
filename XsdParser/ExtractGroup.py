from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.GroupInnerComplexType import process_group_inner_complex_type, to_camel_case, to_pascal_case


def extractGroup(root):
    groups = {}  # 初始化一个字典，用于存储群组信息

    # 查找所有群组元素
    for group in root.findall(".//{http://www.w3.org/2001/XMLSchema}group"):
        group_name = group.get('name')  # 获取群组名称
        elements = []  # 初始化列表，用于存储群组的元素
        inner_classes = []

        # 处理 sequence 标签中的元素
        sequence = group.find("./{http://www.w3.org/2001/XMLSchema}sequence")
        if sequence is not None:
            elements, inner_classes = process_elements(root, sequence)
            groups[group_name] = {
                'elements': elements,  # 存储群组中的字段信息
                'innerClasses': inner_classes  # 存储群组中的内部类信息
            }

    return groups  # 返回群组信息字典


def process_elements(root, sequence):
    # 这里把内部类里面的element也提取出来了
    elements = []
    inner_classes = []
    for element in sequence.findall("./{http://www.w3.org/2001/XMLSchema}element"):
        element_name = element.get('name')  # 获取元素名称
        element_type = element.get('type')  # 获取元素类型

        if element_type:
            element_type = mapXsdTypeToJava(element_type.split(':')[-1], context='group')  # 将类型映射为Java类型
            elements.append({
                'name': to_camel_case(element_name),
                'type': element_type,
                'annotation': '@XmlElement(name="{}")'.format(element_name)
            })
        else:
            # 这里就是生成内部类对应的字段
            elements.append({
                'name': to_camel_case(element_name),
                'type': to_pascal_case(element_name),
                'annotation': '@XmlElement(name="{}")'.format(element_name)
            })
            # 处理内部的 complexType 并生成内部类--------->这里的参数层级是不是有问题，直接传当前的element呢，进去改方法
            inner_complex_types = process_group_inner_complex_type(root, element)  # 处理群组中的复杂类型，生成内部类
            for inner_type in inner_complex_types:
                inner_classes.append(inner_type)  # 将内部类信息单独存储

    return elements, inner_classes  # 返回元素列表

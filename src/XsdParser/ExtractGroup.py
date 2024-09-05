from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.GroupInnerComplexType import process_group_inner_complex_type, to_camel_case, to_pascal_case
from src.XsdParser.GroupInnerComplexType import process_choiceRef


def extractGroup(root, element_wrapper):
    groups = {}  # 初始化一个字典，用于存储群组信息

    # 查找所有群组元素
    for group in root.findall(".//{http://www.w3.org/2001/XMLSchema}group"):
        group_name = group.get('name')  # 获取群组名称
        elements = []  # 初始化列表，用于存储群组的元素
        inner_classes = []

        accumulated_elements = []
        accumulated_inner_classes = []
        for child in group:
            if child.tag.endswith('sequence'):
                # 处理 sequence 标签中的元素
                sequence = group.find("./{http://www.w3.org/2001/XMLSchema}sequence")
                if sequence is not None:
                    elements, inner_classes = process_elements(root, sequence, '1', None,
                                                               element_wrapper)
                    accumulated_elements.extend(elements)
                    accumulated_inner_classes.extend(inner_classes)
                    # groups[group_name] = {
                    #     'elements': elements,  # 存储群组中的字段信息
                    #     'innerClasses': inner_classes  # 存储群组中的内部类信息
                    # }
            elif child.tag.endswith('choice'):
                choice = group.find("./{http://www.w3.org/2001/XMLSchema}choice")
                innerChoice = choice.find("./{http://www.w3.org/2001/XMLSchema}choice")
                maxOccurs = innerChoice.get('maxOccurs')
                elements, inner_classes = process_elements(root, innerChoice, maxOccurs, None, element_wrapper)
                accumulated_elements.extend(elements)
                accumulated_inner_classes.extend(inner_classes)

                innerInnerChoices = innerChoice.findall("./{http://www.w3.org/2001/XMLSchema}choice")
                for innerInnerChoice in innerInnerChoices:
                    innerMaxOccurs = innerInnerChoice.get('maxOccurs')
                    group = innerInnerChoice.find("./{http://www.w3.org/2001/XMLSchema}group")
                    refName = group.get('ref').split(':')[-1]
                    elements, inner_classes = process_choiceRef(root, refName, innerMaxOccurs, element_wrapper, 'None')
                    accumulated_elements.extend(elements)
                    accumulated_inner_classes.extend(inner_classes)
        groups[group_name] = {
            'elements': accumulated_elements,  # 累积的 elements
            'innerClasses': accumulated_inner_classes  # 累积的 inner classes
        }

    return groups  # 返回群组信息字典


def process_elements(root, sequenceOrChoice, maxOccurs, fatherElementName, element_wrapper):
    elements = []
    inner_classes = []
    for element in sequenceOrChoice.findall("./{http://www.w3.org/2001/XMLSchema}element"):
        element_name = element.get('name')  # 获取元素名称
        element_type = element.get('type')  # 获取元素类型-----》没有就是内部类

        if element_wrapper == 'false':
            if element_type:
                if maxOccurs == '1':
                    element_type = mapXsdTypeToJava(element_type.split(':')[-1], context='group')  # 将类型映射为Java类型
                    elements.append({
                        'name': to_camel_case(element_name),
                        'type': element_type,
                        'annotation': '@XmlElement(name="{}")'.format(element_name)
                    })
                else:
                    element_type = mapXsdTypeToJava(element_type.split(':')[-1], context='group')  # 将类型映射为Java类型
                    elements.append({
                        'name': to_camel_case(element_name),
                        'type': 'ArrayList<{}>'.format(element_type),
                        'annotation': '@XmlElement(name="{}")'.format(element_name)
                        # 'annotation': '@XmlElementWrapper(name="{}")\n@XmlElement(name="{}")'.format(fatherElementName, element_name)
                    })
            else:
                # 这里就是生成内部类对应的字段------》嵌套内部类也要考虑list
                if maxOccurs == '1':
                    elements.append({
                        'name': to_camel_case(element_name),
                        'type': to_pascal_case(element_name),
                        'annotation': '@XmlElement(name="{}")'.format(element_name)
                    })
                else:
                    elements.append({
                        'name': to_camel_case(element_name),
                        'type': 'ArrayList<{}>'.format(to_pascal_case(element_name)),
                        'annotation': '@XmlElement(name="{}")'.format(element_name)
                        # 'annotation': '@XmlElementWrapper(name="{}")\n@XmlElement(name="{}")'.format(fatherElementName, element_name)
                    })
                # 处理内部的 complexType 并生成内部类
                inner_complex_types = process_group_inner_complex_type(root, element, element_wrapper)  # 处理群组中的复杂类型，生成内部类
                for inner_type in inner_complex_types:
                    inner_classes.append(inner_type)  # 将内部类信息单独存储

    return elements, inner_classes  # 返回元素列表
def get_max_occurs(choice):
    max_occurs = choice.get('maxOccurs')
    if max_occurs is None:
        return '1'  # 默认值为 1
    return max_occurs


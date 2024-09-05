import re
from src.XsdParser.ExtractExtensionBaseType import extractBaseType
from src.XsdParser.TypeMapping import mapXsdTypeToJava


def process_group_inner_complex_type(root, element, element_wrapper):
    inner_complex_types = []  # 初始化列表，用于存储内部复杂类型信息

    # 查找 group 中的所有 element 标签
    complex_type = element.find("./{http://www.w3.org/2001/XMLSchema}complexType")
    # 可能有内部类的内部类，最多嵌套两层
    if complex_type is not None:
        element_name = element.get('name')  # 获取元素名称----->父element
        inner_class_name = to_pascal_case(element_name)  # 将元素名称转换为PascalCase，用作内部类的名称

        attributes = []  # 初始化列表，用于存储属性信息
        innerInnerClass = []
        extendsClass = None

        # 处理 complexType 中的 choice 标签------->嵌套内部类要继续返回出去，要根据maxoccurs处理element
        for choice in complex_type.findall("./{http://www.w3.org/2001/XMLSchema}choice"):
            choice_elements, innerInnerClass, maxOccurs = process_choice(root, choice, element_name, element_wrapper)
            # if maxOccurs == '1':
            attributes.extend(choice_elements)
            # elif:  ------->可以不在这里处理，在element那里处理注解，把max参数传到模板处理list

        # 处理simpleContent
        simple_content = complex_type.find("./{http://www.w3.org/2001/XMLSchema}simpleContent")
        if simple_content is not None:
            extension = simple_content.find("./{http://www.w3.org/2001/XMLSchema}extension")
            if extension is not None:
                baseName = extension.get('base').split(':')[-1]
                baseTypeInfo = extractBaseType(root, baseName)
                if baseTypeInfo is not None:
                    if baseTypeInfo['extendsClass'] is not None:
                        extendsClass = baseTypeInfo['extendsClass']
                    else:
                        # 如果继承的是simpleType就要加属性字段，如果是继承枚举类，需要@xmlElement；否则@XmlValue
                        attributes.append({
                            'type': baseTypeInfo['type'],
                            'annotation': baseTypeInfo['annotation'],
                            # 'annotationName': baseTypeInfo['annotationName']
                        })
            for attr in extension.findall("./{http://www.w3.org/2001/XMLSchema}attribute"):
                attr_name = attr.get('name')  # 获取属性名称
                attr_type = mapXsdTypeToJava(attr.get('type').split(':')[-1], context='attribute_group')  # 将属性类型映射为Java类型
                attributes.append({
                    'name': to_camel_case(attr_name),
                    'type': attr_type,
                    'annotation': '@XmlAttribute(name="{}")'.format(attr_name)  # 为属性生成@XmlAttribute注解
                })

        inner_complex_types.append({
            'InnerClassName': inner_class_name,
            # 'annotation' : element_name,
            'InnerClassAttributes': attributes,
            'extendsClass': extendsClass,
            'innerInnerClass': innerInnerClass
        })

    return inner_complex_types  # 返回内部复杂类型信息列表

def process_choice(root, choice, element_name, element_wrapper):
    from src.XsdParser.ExtractGroup import process_elements, extractGroup  # 在函数内部导入，避免循环依赖

    elements = []  # 初始化列表，用于存储choice中的元素
    innerClass = []
    groups = {}
    maxOccurs = choice.get('maxOccurs')   # --------->当前choice对应的maxoccurs，在这里获取的不是传进来的

    for child in choice:
        if child.tag.endswith('element'):
            elements, innerClass = (process_elements(root, choice, maxOccurs, element_name, element_wrapper))  # 处理choice中的元素，传入当前choice的maxoccurs和父element的name（wrapper注解名）
        elif child.tag.endswith('group'):  # 这要再过一遍逻辑
            refName = child.get('ref').split(':')[-1]
            elements, innerClass = process_choiceRef(root, refName, maxOccurs, element_wrapper, element_name)

    return elements, innerClass, maxOccurs  # 返回元素列表

#处理choice下的group ref，不能直接调用extract_group，否则会无限递归
def process_choiceRef(root, refName, maxOccurs, element_wrapper, element_name):
    for group in root.findall(".//{http://www.w3.org/2001/XMLSchema}group"):
        if group.get('name') == refName:
            elements = []
            inner_classes = []
            sequence = group.find("./{http://www.w3.org/2001/XMLSchema}sequence")
            elements = []
            inner_classes = []
            for element in sequence.findall("./{http://www.w3.org/2001/XMLSchema}element"):
                element_name = element.get('name')  # 获取元素名称
                element_type = element.get('type')  # 获取元素类型-----》没有就是内部类

                if element_wrapper == 'false':
                    if element_type:
                        if maxOccurs == '1':
                            element_type = mapXsdTypeToJava(element_type.split(':')[-1],
                                                            context='group')  # 将类型映射为Java类型
                            elements.append({
                                'name': to_camel_case(element_name),
                                'type': element_type,
                                'annotation': '@XmlElement(name="{}")'.format(element_name)
                            })
                        else:
                            element_type = mapXsdTypeToJava(element_type.split(':')[-1],
                                                            context='group')  # 将类型映射为Java类型
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
                        inner_complex_types = process_group_inner_complex_type(root, element,
                                                                               element_wrapper)  # 处理群组中的复杂类型，生成内部类
                        for inner_type in inner_complex_types:
                            inner_classes.append(inner_type)  # 将内部类信息单独存储
    return elements, inner_classes

def to_pascal_case(snake_str):
    components = snake_str.split('-')
    return ''.join(x.capitalize() for x in components)  # 将每个部分首字母大写并拼接


def to_camel_case(snake_str):
    components = re.split('[-]', snake_str)
    return components[0].lower() + ''.join(x.title() for x in components[1:])  # 将第一个单词小写，后续单词首字母大写并拼接

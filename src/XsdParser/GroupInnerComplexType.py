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
            # groups = extractGroup(root, element_wrapper)  # 获取引用的群组-------》这里不能这么处理，会导致无线地递归，直接把处理group的element逻辑复制到这里

    return elements, innerClass, maxOccurs  # 返回元素列表


def to_pascal_case(snake_str):
    components = snake_str.split('-')
    return ''.join(x.capitalize() for x in components)  # 将每个部分首字母大写并拼接


def to_camel_case(snake_str):
    components = re.split('[-]', snake_str)
    return components[0].lower() + ''.join(x.title() for x in components[1:])  # 将第一个单词小写，后续单词首字母大写并拼接

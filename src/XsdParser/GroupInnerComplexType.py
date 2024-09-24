import re

from src.XsdParser.ExtractChoiceElement import process_choice_elements
from src.XsdParser.ExtractExtensionBaseType import extractBaseType
from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.ExtractChoiceGroup import process_choiceRef
from src.XsdParser.Utils import to_camel_case,to_pascal_case


def process_group_inner_complex_type(root, element, element_wrapper, group_name):
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

        for child in complex_type:
            if child.tag.endswith('choice'):
                # print(f"process_group_inner_complex_type group:{group_name}")
                # 处理 complexType 中的 choice 标签------->嵌套内部类要继续返回出去，要根据maxoccurs处理element
                choice = child
                choice_elements, innerInnerClass, maxOccurs = process_choice(root, choice, element_name, element_wrapper, group_name)
                attributes.extend(choice_elements)
            elif child.tag.endswith('simpleContent'):
                # 处理simpleContent
                simple_content = child
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

def process_choice(root, choice, element_name, element_wrapper, group_name):
    # print(f"process_choice called with element_name: {element_name}")
    elements = []  # 初始化列表，用于存储choice中的元素
    innerClass = []
    groups = {}
    maxOccurs = choice.get('maxOccurs')   # --------->当前choice对应的maxoccurs，在这里获取的不是传进来的

    for child in choice:
        if child.tag.endswith('element'):
            elements, innerClass = (process_choice_elements(root, choice, maxOccurs, element_name, element_wrapper, group_name))  # 处理choice中的元素，传入当前choice的maxoccurs和父element的name（wrapper注解名）
            print(elements)
            #或者直接改这里？从处理好的里面提取，然后把内部类置空-------不行，这里的elements已经是内部类名了，应该从里面改
        elif child.tag.endswith('group'):  # element和group没有同时存在，choice下为group的只有两个
            refName = child.get('ref').split(':')[-1]
            #判断条件？参数有问题？怎么一直传element-----process_choiceRef SW-COMPARISON-VARIABLES
            # print(f"element-----process_choiceRef {element_name}")
            elements, innerClass = process_choiceRef(root, refName, maxOccurs, element_wrapper, element_name)

    return elements, innerClass, maxOccurs  # 返回元素列表





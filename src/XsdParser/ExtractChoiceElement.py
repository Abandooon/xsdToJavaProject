from src.XsdParser.ExtractExtensionBaseType import extractBaseType
from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.Utils import to_camel_case, to_pascal_case

def process_choice_elements(root, choice, maxOccurs, fatherElementName, element_wrapper, group_name):
    elements = []
    inner_classes = []

    for element in choice.findall("./{http://www.w3.org/2001/XMLSchema}element"):
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
                        'name': to_camel_case(element_name)+'s',
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
                        'name': to_camel_case(element_name)+'s',
                        'type': 'ArrayList<{}>'.format(to_pascal_case(element_name)),
                        'annotation': '@XmlElement(name="{}")'.format(element_name)
                        # 'annotation': '@XmlElementWrapper(name="{}")\n@XmlElement(name="{}")'.format(fatherElementName, element_name)
                    })
                # 处理内部的 complexType 并生成内部类

                complex_type = element.find("./{http://www.w3.org/2001/XMLSchema}complexType")
                element_name = element.get('name')  # 获取元素名称----->父element
                inner_class_name = to_pascal_case(element_name)  # 将元素名称转换为PascalCase，用作内部类的名称
                inner_complex_types = []  # 初始化列表，用于存储内部复杂类型信息
                attributes = []  # 初始化列表，用于存储属性信息
                innerInnerClass = []
                extendsClass = None
                # 处理simpleContent
                simple_content = complex_type.find("./{http://www.w3.org/2001/XMLSchema}simpleContent")
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
                    attr_type = mapXsdTypeToJava(attr.get('type').split(':')[-1],
                                                 context='attribute_group')  # 将属性类型映射为Java类型
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

                for inner_type in inner_complex_types:
                    inner_classes.append(inner_type)  # 将内部类信息单独存储

    return elements, inner_classes  # 返回元素列表
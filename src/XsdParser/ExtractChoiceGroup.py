from src.XsdParser.ExtractExtensionBaseType import extractBaseType
from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.Utils import to_camel_case, to_pascal_case


def process_choiceRef(root, refName, maxOccurs, element_wrapper, element_name, depth=0):
    if depth > 10:  # 递归深度限制，防止无限递归
        print(f"Error: Recursion depth limit reached when processing group {refName}")
        return [], []

    for group in root.findall(".//{http://www.w3.org/2001/XMLSchema}group"):
        if group.get('name') == refName:
            print(f"Processing choiceGroupRef: {refName}, Depth: {depth}")  # 打印处理的群组名称和深度
            sequence = group.find("./{http://www.w3.org/2001/XMLSchema}sequence")

            if sequence is None:
                print(f"Warning: No sequence found in choiceGroupRef: {refName}")
                continue

            elements = []
            inner_classes = []

            for element in sequence.findall("./{http://www.w3.org/2001/XMLSchema}element"):
                element_name = element.get('name')  # 获取元素名称
                element_type = element.get('type')  # 获取元素类型

                if element_wrapper == 'false':
                    if element_type:
                        if maxOccurs == '1':
                            element_type = mapXsdTypeToJava(element_type.split(':')[-1], context='group')
                            elements.append({
                                'name': to_camel_case(element_name),
                                'type': element_type,
                                'annotation': '@XmlElement(name="{}")'.format(element_name)
                            })
                        else:
                            element_type = mapXsdTypeToJava(element_type.split(':')[-1], context='group')
                            elements.append({
                                'name': to_camel_case(element_name),
                                'type': 'ArrayList<{}>'.format(element_type),
                                'annotation': '@XmlElement(name="{}")'.format(element_name)
                            })
                    else:
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
                            })
                        # inner_complex_types = process_group_inner_complex_type(root, element, element_wrapper)
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
                            # for choice in complex_type.findall("./{http://www.w3.org/2001/XMLSchema}choice"):
                            #     choice_elements, innerInnerClass, maxOccurs = process_choice(root, choice, element_name,
                            #                                                                  element_wrapper)
                            #     # if maxOccurs == '1':
                            #     attributes.extend(choice_elements)
                            #     # elif:  ------->可以不在这里处理，在element那里处理注解，把max参数传到模板处理list

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
                                    attr_type = mapXsdTypeToJava(attr.get('type').split(':')[-1],
                                                                 context='attribute_group')  # 将属性类型映射为Java类型
                                    attributes.append({
                                        'name': to_camel_case(attr_name),
                                        'type': attr_type,
                                        'annotation': '@XmlAttribute(name="{}")'.format(attr_name)
                                        # 为属性生成@XmlAttribute注解
                                    })

                            inner_complex_types.append({
                                'InnerClassName': inner_class_name,
                                # 'annotation' : element_name,
                                'InnerClassAttributes': attributes,
                                'extendsClass': extendsClass,
                                'innerInnerClass': innerInnerClass
                            })
                        for inner_type in inner_complex_types:
                            inner_classes.append(inner_type)

            return elements, inner_classes
    print(f"Error: choiceGroupRef '{refName}' not found in the XML schema at depth {depth}.")
    return [], []
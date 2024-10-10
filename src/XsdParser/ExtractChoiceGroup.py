from src.XsdParser.ExtractExtensionBaseType import extractBaseType
from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.Utils import to_camel_case, to_pascal_case
def process_choiceRef(root, refName, maxOccurs,element_wrapper):
    #----------------传进来的是外层choice的maxoccurs，如果他是list，即使里面引的group的element是单个，也要返回list----------------
    accumulated_elements = []
    accumulated_inner_classes = []
    for group in root.findall(".//{http://www.w3.org/2001/XMLSchema}group"):
        if group.get('name') == refName:
            for child in group:
                # 1.这里是group下的sequence中内部类的group ref对应逻辑（group 下choice没有sequence直接element）
                if child.tag.endswith('sequence'):
                    sequence = child
                    element = sequence.findall("./{http://www.w3.org/2001/XMLSchema}element")
                    if element is not None:
                        elements, inner_classes = extract_element(root, sequence, maxOccurs, element_wrapper)
                        accumulated_elements.extend(elements)
                        accumulated_inner_classes.extend(inner_classes)
                    choice = sequence.find("./{http://www.w3.org/2001/XMLSchema}choice")

                    # 2. sequence下choice，递归调用
                    if choice is not None:
                        innerMaxOccurs = choice.get('maxOccurs') or '1'
                        group = choice.find("./{http://www.w3.org/2001/XMLSchema}group")
                        refName = group.get('ref').split(':')[-1]
                        elements, inner_classes = process_choiceRef(root, refName, innerMaxOccurs, element_wrapper)
                        accumulated_elements.extend(elements)
                        accumulated_inner_classes.extend(inner_classes)

                # 3.嵌套choice下的，递归调用
                elif child.tag.endswith("choice"):
                    choice = child
                    innerChoice = choice.find("./{http://www.w3.org/2001/XMLSchema}choice")
                    #---------------这里也是，如果外层choice是list，里面引的group的element是单个，也要返回list----------------
                    maxOccurs = innerChoice.get('maxOccurs')
                    elements, inner_classes = extract_element(root, innerChoice,maxOccurs, element_wrapper)
                    accumulated_elements.extend(elements)
                    accumulated_inner_classes.extend(inner_classes)
                    innerInnerChoices = innerChoice.findall("./{http://www.w3.org/2001/XMLSchema}choice")
                    if innerInnerChoices is not None:
                        for innerInnerChoice in innerInnerChoices:
                            innerMaxOccurs = innerInnerChoice.get('maxOccurs')
                            group = innerInnerChoice.find("./{http://www.w3.org/2001/XMLSchema}group")
                            refName = group.get('ref').split(':')[-1]
                            elements, inner_classes = process_choiceRef(root, refName, innerMaxOccurs,element_wrapper)
                            elements.extend(elements)
                            inner_classes.extend(inner_classes)
    return accumulated_elements, accumulated_inner_classes

#group ref的目的是提取引到的group中的element放到elements列表中，不需要做额外的事，对于group ref本身的操作已经在三个地方都写好了，只需提取element返回出去即可
def extract_element(root, sequenceOrChoice, maxOccurs, element_wrapper):
    elements = []
    inner_classes = []
    wrapperElement = False
    for element in sequenceOrChoice.findall("./{http://www.w3.org/2001/XMLSchema}element"):
        #--------element可能没有maxOccurs，这时候就要看外面的choice-------
        inner_complex_types = []  # 初始化列表，用于存储内部复杂类型信息
        if maxOccurs == '1':
            maxOccurs = element.get('maxOccurs') or maxOccurs
        element_name = element.get('name')  # 获取元素名称
        element_type = element.get('type')  # 获取元素类型
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
            from src.XsdParser.GroupInnerComplexType import process_group_inner_complex_type
            inner_complex_types, wrapperElement = process_group_inner_complex_type(root, element, element_wrapper)


            # 查找 group 中的所有 element 标签
            complex_type = element.find("./{http://www.w3.org/2001/XMLSchema}complexType")
            # 可能有内部类的内部类，最多嵌套两层
            if complex_type is not None:
                element_name = element.get('name')  # 获取元素名称----->父element
                inner_class_name = to_pascal_case(element_name)  # 将元素名称转换为PascalCase，用作内部类的名称

                attributes = []  # 初始化列表，用于存储属性信息
                innerInnerClass = []
                extendsClass = None
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
                    'InnerClassAttributes': attributes,
                    'extendsClass': extendsClass,
                    'innerInnerClass': innerInnerClass
                })
            for inner_type in inner_complex_types:
                inner_classes.append(inner_type)
    return elements, inner_classes
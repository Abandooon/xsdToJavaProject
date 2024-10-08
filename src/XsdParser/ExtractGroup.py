from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.GroupInnerComplexType import process_group_inner_complex_type
from src.XsdParser.ExtractChoiceGroup import process_choiceRef
from src.XsdParser.Utils import to_camel_case,to_pascal_case


def extractGroup(root, element_wrapper):
    groups = {}

    # 查找所有群组元素
    for group in root.findall(".//{http://www.w3.org/2001/XMLSchema}group"):
        group_name = group.get('name')
        accumulated_elements = []
        accumulated_inner_classes = []

        for child in group:
            if child.tag.endswith('sequence'):
                sequence = child
                #在这里处理elements和choice group ref
                if sequence is not None:
                    elements, inner_classes = process_elements(root, sequence, '1', element_wrapper)
                    accumulated_elements.extend(elements)
                    accumulated_inner_classes.extend(inner_classes)
            elif child.tag.endswith('choice'):
                choice = child
                innerChoice = choice.find("./{http://www.w3.org/2001/XMLSchema}choice")
                maxOccurs = innerChoice.get('maxOccurs')

                elementsObj = innerChoice.findall("./{http://www.w3.org/2001/XMLSchema}element")
                if elementsObj is not None:
                    elements, inner_classes = process_elements(root, innerChoice, maxOccurs, element_wrapper)
                    accumulated_elements.extend(elements)
                    accumulated_inner_classes.extend(inner_classes)

                innerInnerChoices = innerChoice.findall("./{http://www.w3.org/2001/XMLSchema}choice")
                if innerInnerChoices is not None:
                    for innerInnerChoice in innerInnerChoices:
                        innerMaxOccurs = innerInnerChoice.get('maxOccurs')
                        group = innerInnerChoice.find("./{http://www.w3.org/2001/XMLSchema}group")
                        refName = group.get('ref').split(':')[-1]
                        #传入引用的group名，返回该group中的elements
                        elements, inner_classes = process_choiceRef(root, refName, innerMaxOccurs, element_wrapper)
                        accumulated_elements.extend(elements)
                        accumulated_inner_classes.extend(inner_classes)

        groups[group_name] = {
            'elements': accumulated_elements,
            'innerClasses': accumulated_inner_classes
        }

    return groups

#处理group里面的element
#如果开启了wrapper，应该从内部类中提取出内部类的element放到这里，相当于直接type=
def process_elements(root, sequenceOrChoice, maxOccurs, element_wrapper):
    elements = []
    inner_classes = []
    for element in sequenceOrChoice.findall("./{http://www.w3.org/2001/XMLSchema}element"):
        if element.get('maxOccurs') !='1':
            maxOccurs = element.get('maxOccurs')
            # print(maxOccurs)
        element_name = element.get('name')  # 获取元素名称
        element_type = element.get('type')  # 获取元素类型-----》没有就是内部类，走到else里面
        wrapperElement = False
        if element_type:
            if maxOccurs == "1":
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
                })
        else:
            #加了wrapperelement参数没有走到里面，重新设计参数调用逻辑
            # 这里就是生成内部类对应的字段------》嵌套内部类也要考虑list
            inner_complex_types, wrapperElement = process_group_inner_complex_type(root, element,
                                                                                   element_wrapper)  # 处理群组中的复杂类型，生成内部类
            #这里是内部类上层的element，为1才生成wrapper，不然他本身就是list
            if maxOccurs == '1':
                if wrapperElement:
                    for inner_type in inner_complex_types:
                        for attr in inner_type.get('InnerClassAttributes'):
                            elements.append({
                                'name': attr.get('name'),
                                'type': attr.get('type'),
                                'annotation': attr.get('annotation')
                            })
                        for innerInnerClass in inner_type.get('innerInnerClass'):
                            inner_classes.append(innerInnerClass)
                    # print(inner_complex_types)
                else:
                    elements.append({
                        'name': to_camel_case(element_name),
                        'type': to_pascal_case(element_name),
                        'annotation': '@XmlElement(name="{}")'.format(element_name)
                    })
                    # 处理内部的complexType并生成内部类
                    for inner_type in inner_complex_types:
                        inner_classes.append(inner_type)  # 将内部类信息单独存储
            else:
                elements.append({
                    'name': to_camel_case(element_name) + 's',
                    'type': 'ArrayList<{}>'.format(to_pascal_case(element_name)),
                    'annotation': '@XmlElement(name="{}")'.format(element_name)
                })
                # 处理内部的complexType并生成内部类
                for inner_type in inner_complex_types:
                    inner_classes.append(inner_type)  # 将内部类信息单独存储

    return elements, inner_classes  # 返回元素列表


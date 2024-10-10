from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.GroupInnerComplexType import process_group_inner_complex_type
from src.XsdParser.ExtractChoiceGroup import process_choiceRef
from src.XsdParser.Utils import to_camel_case,to_pascal_case


def extractGroup(root, element_wrapper):
    groups = {}

    # ��������Ⱥ��Ԫ��
    for group in root.findall(".//{http://www.w3.org/2001/XMLSchema}group"):
        group_name = group.get('name')
        accumulated_elements = []
        accumulated_inner_classes = []

        for child in group:
            if child.tag.endswith('sequence'):
                sequence = child
                element = sequence.findall("./{http://www.w3.org/2001/XMLSchema}element")
                if element is not None:
                    elements, inner_classes = process_elements(root, sequence, element_wrapper)
                    accumulated_elements.extend(elements)
                    accumulated_inner_classes.extend(inner_classes)

                choices = sequence.findall("./{http://www.w3.org/2001/XMLSchema}choice")
                if choices is not None:
                    for choice in choices:
                        innerMaxOccurs = choice.get('maxOccurs') or '1'
                        group = choice.find("./{http://www.w3.org/2001/XMLSchema}group")
                        if group is not None:
                            refName = group.get('ref').split(':')[-1]
                            elements, inner_classes = process_choiceRef(root, refName, innerMaxOccurs, element_wrapper)
                            accumulated_elements.extend(elements)
                            accumulated_inner_classes.extend(inner_classes)


            #1.ֱ����ȡelement������2.�ҵ����õ�group��ȡelement�ŵ�����
            elif child.tag.endswith('choice'):
                choice = child
                innerChoice = choice.find("./{http://www.w3.org/2001/XMLSchema}choice")
                element = innerChoice.findall("./{http://www.w3.org/2001/XMLSchema}element")
                #element�������ж���û�У�process_elements�������ϼ�innerChoice����������element���س���
                if element is not None:
                    elements, inner_classes = process_elements(root, innerChoice,element_wrapper)
                    accumulated_elements.extend(elements)
                    accumulated_inner_classes.extend(inner_classes)

                innerInnerChoices = innerChoice.findall("./{http://www.w3.org/2001/XMLSchema}choice")
                if innerInnerChoices is not None:
                    for innerInnerChoice in innerInnerChoices:
                        innerMaxOccurs = innerInnerChoice.get('maxOccurs')
                        group = innerInnerChoice.find("./{http://www.w3.org/2001/XMLSchema}group")
                        if group is not None:
                            refName = group.get('ref').split(':')[-1]
                            # �������õ�group�������ظ�group�е�elements
                            elements, inner_classes = process_choiceRef(root, refName, innerMaxOccurs, element_wrapper)
                            accumulated_elements.extend(elements)
                            accumulated_inner_classes.extend(inner_classes)

        groups[group_name] = {
            'elements': accumulated_elements,
            'innerClasses': accumulated_inner_classes
        }

    return groups

#����group�����element
#���������wrapper��Ӧ�ô��ڲ�������ȡ���ڲ����element�ŵ�����൱��ֱ��type=
def process_elements(root, sequenceOrChoice, element_wrapper):
    elements = []
    inner_classes = []
    for element in sequenceOrChoice.findall("./{http://www.w3.org/2001/XMLSchema}element"):
        # --------element����û��maxOccurs����ʱ���Ҫ�������choice-------
        maxOccurs = element.get('maxOccurs') or '1'
        element_name = element.get('name')
        element_type = element.get('type')  # ��ȡԪ������-----û�о����ڲ��࣬�ߵ�else����
        wrapperElement = False
        if element_type:
            if maxOccurs == '1':
                element_type = mapXsdTypeToJava(element_type.split(':')[-1], context='group')  # ������ӳ��ΪJava����
                elements.append({
                    'name': to_camel_case(element_name),
                    'type': element_type,
                    'annotation': '@XmlElement(name="{}")'.format(element_name)
                })
            else:
                element_type = mapXsdTypeToJava(element_type.split(':')[-1], context='group')  # ������ӳ��ΪJava����
                elements.append({
                    'name': to_camel_case(element_name)+'s',
                    'type': 'ArrayList<{}>'.format(element_type),
                    'annotation': '@XmlElement(name="{}")'.format(element_name)
                })
        else:
            # ������������ڲ����Ӧ���ֶ�------Ƕ���ڲ���ҲҪ����list
            # ����������choice�����õ�group�е�element�����Բ���Ҫwrapper
            inner_complex_types, wrapperElement = process_group_inner_complex_type(root, element,
                                                                                   element_wrapper)  # ����Ⱥ���еĸ������ͣ������ڲ���
            #�������ڲ����ϲ��element��Ϊ1������wrapper����Ȼ���������list
            if maxOccurs == '1':
                #���wrapperElementΪTrue��˵��������wrapper�����ڲ������Էŵ��ϲ�element�У���Ƕ���ڲ����ᵽ�ϲ��ڲ���
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
                    # �����ڲ���complexType�������ڲ���
                    for inner_type in inner_complex_types:
                        inner_classes.append(inner_type)  # ���ڲ�����Ϣ�����洢
            else:
                elements.append({
                    'name': to_camel_case(element_name) + 's',
                    'type': 'ArrayList<{}>'.format(to_pascal_case(element_name)),
                    'annotation': '@XmlElement(name="{}")'.format(element_name)
                })
                # �����ڲ���complexType�������ڲ���
                for inner_type in inner_complex_types:
                    inner_classes.append(inner_type)  # ���ڲ�����Ϣ�����洢

    return elements, inner_classes  # ����Ԫ���б�


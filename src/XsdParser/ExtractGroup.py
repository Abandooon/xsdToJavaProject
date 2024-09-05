from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.GroupInnerComplexType import process_group_inner_complex_type, to_camel_case, to_pascal_case
from src.XsdParser.GroupInnerComplexType import process_choiceRef


def extractGroup(root, element_wrapper):
    groups = {}  # ��ʼ��һ���ֵ䣬���ڴ洢Ⱥ����Ϣ

    # ��������Ⱥ��Ԫ��
    for group in root.findall(".//{http://www.w3.org/2001/XMLSchema}group"):
        group_name = group.get('name')  # ��ȡȺ������
        elements = []  # ��ʼ���б����ڴ洢Ⱥ���Ԫ��
        inner_classes = []

        accumulated_elements = []
        accumulated_inner_classes = []
        for child in group:
            if child.tag.endswith('sequence'):
                # ���� sequence ��ǩ�е�Ԫ��
                sequence = group.find("./{http://www.w3.org/2001/XMLSchema}sequence")
                if sequence is not None:
                    elements, inner_classes = process_elements(root, sequence, '1', None,
                                                               element_wrapper)
                    accumulated_elements.extend(elements)
                    accumulated_inner_classes.extend(inner_classes)
                    # groups[group_name] = {
                    #     'elements': elements,  # �洢Ⱥ���е��ֶ���Ϣ
                    #     'innerClasses': inner_classes  # �洢Ⱥ���е��ڲ�����Ϣ
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
            'elements': accumulated_elements,  # �ۻ��� elements
            'innerClasses': accumulated_inner_classes  # �ۻ��� inner classes
        }

    return groups  # ����Ⱥ����Ϣ�ֵ�


def process_elements(root, sequenceOrChoice, maxOccurs, fatherElementName, element_wrapper):
    elements = []
    inner_classes = []
    for element in sequenceOrChoice.findall("./{http://www.w3.org/2001/XMLSchema}element"):
        element_name = element.get('name')  # ��ȡԪ������
        element_type = element.get('type')  # ��ȡԪ������-----��û�о����ڲ���

        if element_wrapper == 'false':
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
                        'name': to_camel_case(element_name),
                        'type': 'ArrayList<{}>'.format(element_type),
                        'annotation': '@XmlElement(name="{}")'.format(element_name)
                        # 'annotation': '@XmlElementWrapper(name="{}")\n@XmlElement(name="{}")'.format(fatherElementName, element_name)
                    })
            else:
                # ������������ڲ����Ӧ���ֶ�------��Ƕ���ڲ���ҲҪ����list
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
                # �����ڲ��� complexType �������ڲ���
                inner_complex_types = process_group_inner_complex_type(root, element, element_wrapper)  # ����Ⱥ���еĸ������ͣ������ڲ���
                for inner_type in inner_complex_types:
                    inner_classes.append(inner_type)  # ���ڲ�����Ϣ�����洢

    return elements, inner_classes  # ����Ԫ���б�
def get_max_occurs(choice):
    max_occurs = choice.get('maxOccurs')
    if max_occurs is None:
        return '1'  # Ĭ��ֵΪ 1
    return max_occurs


from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.GroupInnerComplexType import process_group_inner_complex_type, to_camel_case, to_pascal_case


def extractGroup(root):
    groups = {}  # ��ʼ��һ���ֵ䣬���ڴ洢Ⱥ����Ϣ

    # ��������Ⱥ��Ԫ��
    for group in root.findall(".//{http://www.w3.org/2001/XMLSchema}group"):
        group_name = group.get('name')  # ��ȡȺ������
        elements = []  # ��ʼ���б����ڴ洢Ⱥ���Ԫ��
        inner_classes = []

        # ���� sequence ��ǩ�е�Ԫ��
        sequence = group.find("./{http://www.w3.org/2001/XMLSchema}sequence")
        if sequence is not None:
            elements, inner_classes = process_elements(root, sequence)
            groups[group_name] = {
                'elements': elements,  # �洢Ⱥ���е��ֶ���Ϣ
                'innerClasses': inner_classes  # �洢Ⱥ���е��ڲ�����Ϣ
            }

    return groups  # ����Ⱥ����Ϣ�ֵ�


def process_elements(root, sequence):
    # ������ڲ��������elementҲ��ȡ������
    elements = []
    inner_classes = []
    for element in sequence.findall("./{http://www.w3.org/2001/XMLSchema}element"):
        element_name = element.get('name')  # ��ȡԪ������
        element_type = element.get('type')  # ��ȡԪ������

        if element_type:
            element_type = mapXsdTypeToJava(element_type.split(':')[-1], context='group')  # ������ӳ��ΪJava����
            elements.append({
                'name': to_camel_case(element_name),
                'type': element_type,
                'annotation': '@XmlElement(name="{}")'.format(element_name)
            })
        else:
            # ������������ڲ����Ӧ���ֶ�
            elements.append({
                'name': to_camel_case(element_name),
                'type': to_pascal_case(element_name),
                'annotation': '@XmlElement(name="{}")'.format(element_name)
            })
            # �����ڲ��� complexType �������ڲ���--------->����Ĳ����㼶�ǲ��������⣬ֱ�Ӵ���ǰ��element�أ���ȥ�ķ���
            inner_complex_types = process_group_inner_complex_type(root, element)  # ����Ⱥ���еĸ������ͣ������ڲ���
            for inner_type in inner_complex_types:
                inner_classes.append(inner_type)  # ���ڲ�����Ϣ�����洢

    return elements, inner_classes  # ����Ԫ���б�

import re
from src.XsdParser.ExtractExtensionBaseType import extractBaseType
from src.XsdParser.TypeMapping import mapXsdTypeToJava


def process_group_inner_complex_type(root, element):
    inner_complex_types = []  # ��ʼ���б������ڴ洢�ڲ�����������Ϣ

    # ���� group �е����� element ��ǩ
    complex_type = element.find("./{http://www.w3.org/2001/XMLSchema}complexType")
    # �������ڲ�����ڲ��࣬���Ƕ������
    if complex_type is not None:
        element_name = element.get('name')  # ��ȡԪ������
        inner_class_name = to_pascal_case(element_name)  # ��Ԫ������ת��ΪPascalCase�������ڲ��������

        attributes = []  # ��ʼ���б������ڴ洢������Ϣ
        innerInnerClass = []
        extendsClass = None

        # ���� complexType �е� choice ��ǩ------->Ƕ���ڲ���Ҫ�������س�ȥ��Ҫ����maxoccurs����element
        for choice in complex_type.findall("./{http://www.w3.org/2001/XMLSchema}choice"):
            choice_elements, innerInnerClass, maxOccurs = process_choice(root, choice)
            attributes.extend(choice_elements)
            # if maxOccurs != '1':



        # ����simpleContent
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
                        # ����̳е���simpleType��Ҫ�������ֶΣ�����Ǽ̳�ö���࣬��Ҫ@xmlElement������@XmlValue
                        attributes.append({
                            'type': baseTypeInfo['type'],
                            'annotation': baseTypeInfo['annotation'],
                            # 'annotationName': baseTypeInfo['annotationName']
                        })
            for attr in extension.findall("./{http://www.w3.org/2001/XMLSchema}attribute"):
                attr_name = attr.get('name')  # ��ȡ��������
                attr_type = mapXsdTypeToJava(attr.get('type').split(':')[-1], context='group')  # ����������ӳ��ΪJava����
                attributes.append({
                    'name': to_camel_case(attr_name),
                    'type': attr_type,
                    'annotation': '@XmlAttribute(name="{}")'.format(attr_name)  # Ϊ��������@XmlAttributeע��
                })

        inner_complex_types.append({
            'InnerClassName': inner_class_name,
            # 'annotation' : element_name,
            'InnerClassAttributes': attributes,
            'extendsClass': extendsClass,
            'innerInnerClass': innerInnerClass
        })

    return inner_complex_types  # �����ڲ�����������Ϣ�б�


def process_choice(root, choice):
    from src.XsdParser.ExtractGroup import process_elements, extractGroup  # �ں����ڲ����룬����ѭ������

    elements = []  # ��ʼ���б������ڴ洢choice�е�Ԫ��
    innerClass = []
    maxOccurs = choice.get('maxOccurs')

    for child in choice:
        if child.tag.endswith('element'):
            elements, innerClass = (process_elements(root, choice))  # ����choice�е�Ԫ��
        elif child.tag.endswith('group'):  # ��Ҫ�ٹ�һ���߼�
            group_name = child.get('name')
            elements.append({
                'name': group_name,
                'type': 'GroupType',
                'annotation': 'XmlElement'  # ΪȺ������@XmlElementע��------->����Ҫ�ɣ�ֻҪ�����element����
            })
            nested_group = extractGroup(child)  # �ݹ鴦��Ƕ�׵�Ⱥ��
            if nested_group:
                elements.extend(nested_group.get(group_name, []))
        # elif child.tag.endswith('choice'):
        #     elements.extend(process_choice(child))  # �ݹ鴦��Ƕ�׵�choice
    return elements, innerClass, maxOccurs  # ����Ԫ���б�


def to_pascal_case(snake_str):
    components = snake_str.split('-')
    return ''.join(x.capitalize() for x in components)  # ��ÿ����������ĸ��д��ƴ��


def to_camel_case(snake_str):
    components = re.split('[-]', snake_str)
    return components[0].lower() + ''.join(x.title() for x in components[1:])  # ����һ������Сд��������������ĸ��д��ƴ��
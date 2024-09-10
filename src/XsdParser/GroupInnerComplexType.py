import re
from src.XsdParser.ExtractExtensionBaseType import extractBaseType
from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.ExtractChoiceGroup import process_choiceRef
from src.XsdParser.Utils import to_camel_case,to_pascal_case


def process_group_inner_complex_type(root, element, element_wrapper):
    inner_complex_types = []  # ��ʼ���б����ڴ洢�ڲ�����������Ϣ

    # ���� group �е����� element ��ǩ
    complex_type = element.find("./{http://www.w3.org/2001/XMLSchema}complexType")
    # �������ڲ�����ڲ��࣬���Ƕ������
    if complex_type is not None:
        element_name = element.get('name')  # ��ȡԪ������----->��element
        inner_class_name = to_pascal_case(element_name)  # ��Ԫ������ת��ΪPascalCase�������ڲ��������

        attributes = []  # ��ʼ���б����ڴ洢������Ϣ
        innerInnerClass = []
        extendsClass = None

        # ���� complexType �е� choice ��ǩ------->Ƕ���ڲ���Ҫ�������س�ȥ��Ҫ����maxoccurs����element
        choices = complex_type.findall("./{http://www.w3.org/2001/XMLSchema}choice")
        if choices is not None:
            for choice in choices:
                choice_elements, innerInnerClass, maxOccurs = process_choice(root, choice, element_name, element_wrapper)
                # if maxOccurs == '1':
                attributes.extend(choice_elements)
                # elif:  ------->���Բ������ﴦ����element���ﴦ��ע�⣬��max��������ģ�崦��list

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
                attr_type = mapXsdTypeToJava(attr.get('type').split(':')[-1], context='attribute_group')  # ����������ӳ��ΪJava����
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

def process_choice(root, choice, element_name, element_wrapper):
    from src.XsdParser.ExtractGroup import process_elements, extractGroup  # �ں����ڲ����룬����ѭ������
    print(f"process_choice called with element_name: {element_name}")
    elements = []  # ��ʼ���б����ڴ洢choice�е�Ԫ��
    innerClass = []
    groups = {}
    maxOccurs = choice.get('maxOccurs')   # --------->��ǰchoice��Ӧ��maxoccurs���������ȡ�Ĳ��Ǵ�������

    for child in choice:
        if child.tag.endswith('element'):
            elements, innerClass = (process_elements(root, choice, maxOccurs, element_name, element_wrapper))  # ����choice�е�Ԫ�أ����뵱ǰchoice��maxoccurs�͸�element��name��wrapperע������
        elif child.tag.endswith('group'):  # element��groupû��ͬʱ���ڣ�choice��Ϊgroup��ֻ������
            refName = child.get('ref').split(':')[-1]
            #�ж����������������⣿��ôһֱ��element-----process_choiceRef SW-COMPARISON-VARIABLES
            print(f"element-----process_choiceRef {element_name}")
            elements, innerClass = process_choiceRef(root, refName, maxOccurs, element_wrapper, element_name)

    return elements, innerClass, maxOccurs  # ����Ԫ���б�





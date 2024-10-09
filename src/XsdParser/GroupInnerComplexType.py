import re

from src.XsdParser.ExtractChoiceElement import process_choice_elements
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
        wrapperElement = False

        for child in complex_type:
            if child.tag.endswith('choice'):
                # print(f"process_group_inner_complex_type group:{group_name}")
                # ���� complexType �е� choice ��ǩ------->Ƕ���ڲ���Ҫ�������س�ȥ��Ҫ����maxoccurs����element
                choice = child
                #����element_name����������wrapperע��
                #���ص��ǵ�ǰ�ڲ���ĳ�Ա���ڲ��࣬Ӧ�ý�һ����ȡ���ȵ���һ���������ᣬ��û����Ƕ���ڲ���
                choice_elements, innerInnerClass, wrapperElement = process_choice(root, choice, element_name, element_wrapper)
                attributes.extend(choice_elements)
            elif child.tag.endswith('simpleContent'):
                # ����simpleContent
                simple_content = child
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

    return inner_complex_types, wrapperElement  # �����ڲ�����������Ϣ�б�

#����group���ڲ����choice��������һ����element_name��������wrapperע��
def process_choice(root, choice, element_name, element_wrapper):
    elements = []  # ��ʼ���б����ڴ洢choice�е�Ԫ��
    innerClass = []
    maxOccurs = choice.get('maxOccurs')
    wrapperElement = False

    for child in choice:
        if child.tag.endswith('element'):
            # ����choice�е�Ԫ�أ����뵱ǰchoice��maxoccurs�͸�element��name��wrapperע������
            elements, innerClass, wrapperElement = (process_choice_elements(root, choice, maxOccurs, element_name, element_wrapper))

            #����ֱ�Ӹ�����Ӵ���õ�������ȡ��Ȼ����ڲ����ÿ�-------���У������elements�Ѿ����ڲ������ˣ�Ӧ�ô������
        elif child.tag.endswith('group'):  # element��groupû��ͬʱ���ڣ�choice��Ϊgroup��ֻ������
            refName = child.get('ref').split(':')[-1]
            elements, innerClass = process_choiceRef(root, refName, maxOccurs,element_wrapper)

    return elements, innerClass, wrapperElement  # ����Ԫ���б�





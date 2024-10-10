from src.XsdParser.ExtractExtensionBaseType import extractBaseType
from src.XsdParser.Utils import to_camel_case,to_pascal_case
from concurrent.futures import ThreadPoolExecutor, as_completed

def process_complex_type(complexType, root, element_wrapper, groups, attributeGroups):
    name = complexType.get('name')  # 获取复杂类型的名称
    mixed = complexType.get('mixed')  # 获取mixed属性
    if not name:
        return None  # 跳过没有名称的复杂类型-----内部类名定义在element
    attributes = []  # 初始化列表，用于存储复杂类型的属性
    extends = None
    inner_classes = []

    # 处理扩展simpleContent
    simpleContent = complexType.find("./{http://www.w3.org/2001/XMLSchema}simpleContent")
    if simpleContent is not None:
        base = simpleContent.find("./{http://www.w3.org/2001/XMLSchema}extension")
        if base is not None:
            baseTypeName = base.get('base').split(':')[-1]  # 提取基类名称
            baseTypeInfo = extractBaseType(root, baseTypeName)  # 获取基类信息
            if baseTypeInfo['extendsClass'] is not None:
                extends = baseTypeInfo['extendsClass']
            else:
                attributes.append({
                    'name': 'value',
                    'type': baseTypeInfo['type'],
                    'annotation': '@XmlValue'
                })
        # 处理extension下的attributegroup
        for attributeGroupRef in base.findall("./{http://www.w3.org/2001/XMLSchema}attributeGroup"):
            refName = attributeGroupRef.get('ref').split(':')[-1]
            # attributeGroups = extractAttributeGroup(root)  # 获取引用的属性组
            if refName in attributeGroups:
                for attr in attributeGroups[refName]:
                    attributes.append({
                        'name': to_camel_case(attr['name']),
                        'type': attr['type'],
                        'annotation': '@XmlAttribute(name="{}")'.format(attr['name'])
                        # 属性组中的属性生成@XmlAttribute注解
                    })

    # 处理complex下第一级attributeGroup
    for attributeGroupRef in complexType.findall("./{http://www.w3.org/2001/XMLSchema}attributeGroup"):
        refName = attributeGroupRef.get('ref').split(':')[-1]
        # attributeGroups = extractAttributeGroup(root)  # 获取引用的属性组
        if refName in attributeGroups:
            for attr in attributeGroups[refName]:
                attributes.append({
                    'name': to_camel_case(attr['name']),
                    'type': attr['type'],
                    'annotation': '@XmlAttribute(name="{}")'.format(attr['name'])  # 属性组中的属性生成@XmlAttribute注解
                })

    # 处理群组sequence下group
    sequence = complexType.find("./{http://www.w3.org/2001/XMLSchema}sequence")
    if sequence is not None:
        for groupRef in sequence.findall("./{http://www.w3.org/2001/XMLSchema}group"):
            refName = groupRef.get('ref').split(':')[-1]
            if refName in groups:
                for element in groups[refName]['elements']:
                    attributes.append({
                        'name': element['name'],
                        'type': element['type'],
                        'annotation': element['annotation'],
                    })
                # 将群组中的内部类添加到 inner_classes 列表中
                inner_classes.extend(groups[refName]['innerClasses'])

    # 处理choice下的group
    choice = complexType.find("./{http://www.w3.org/2001/XMLSchema}choice")
    if choice is not None:
        maxOccurs = choice.get('maxOccurs')
        for groupRef in choice.findall("./{http://www.w3.org/2001/XMLSchema}group"):
            refName = groupRef.get('ref').split(':')[-1]
            # groups = extractGroup(root, element_wrapper)  # 获取引用的群组
            if refName in groups:
                if maxOccurs == '1':
                    for element in groups[refName]['elements']:
                        attributes.append({
                            'name': element['name'],
                            'type': element['type'],
                            'annotation': element['annotation'],
                        })
                    inner_classes.extend(groups[refName]['innerClasses'])
                else:
                    for element in groups[refName]['elements']:
                        attributes.append({
                            'name': element['name'],
                            'type': element['type'] if element['type'].startswith('ArrayList') else 'ArrayList<{}>'.format(element['type']),
                            'annotation': element['annotation'],
                        })
                    inner_classes.extend(groups[refName]['innerClasses'])

    return {
        'name': name,
        'attributes': attributes,
        'innerClasses': inner_classes,  # 存储所有内部类信息
        'extends': extends
    }

def extractComplexType(root, element_wrapper, groups, attributeGroups):
    complexTypes = []  # 初始化一个列表，用于存储复杂类型的信息

    # 使用 ThreadPoolExecutor 并行处理 complexType
    with ThreadPoolExecutor(max_workers=8) as executor:
        futures = [executor.submit(process_complex_type, complexType, root, element_wrapper, groups, attributeGroups)
                   for complexType in root.findall(".//{http://www.w3.org/2001/XMLSchema}complexType")]

        for future in as_completed(futures):
            result = future.result()
            if result:  # 仅当返回结果非空时添加
                complexTypes.append(result)

    return complexTypes  # 返回解析后的复杂类型列表


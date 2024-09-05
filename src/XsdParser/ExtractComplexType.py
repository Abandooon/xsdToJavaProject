from src.XsdParser.ExtractExtensionBaseType import extractBaseType
from src.XsdParser.ExtractAttributeGroup import extractAttributeGroup
from src.XsdParser.ExtractGroup import extractGroup
from src.XsdParser.GroupInnerComplexType import to_camel_case, to_pascal_case


def extractComplexType(root, element_wrapper):
    complexTypes = []  # 初始化一个列表，用于存储复杂类型的信息
    # 查找所有的复杂类型元素-------》可以改并行吗
    for complexType in root.findall(".//{http://www.w3.org/2001/XMLSchema}complexType"):
        name = complexType.get('name')  # 获取复杂类型的名称
        if not name:
            continue  # 跳过没有名称的复杂类型-----内部类名定义在element
        attributes = []  # 初始化列表，用于存储复杂类型的属性
        extends = None

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
                for attributeGroupRef in simpleContent.findall("./{http://www.w3.org/2001/XMLSchema}attributeGroup"):
                    refName = attributeGroupRef.get('ref').split(':')[-1]
                    attributeGroups = extractAttributeGroup(root)  # 获取引用的属性组
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
            attributeGroups = extractAttributeGroup(root)  # 获取引用的属性组
            if refName in attributeGroups:
                for attr in attributeGroups[refName]:
                    attributes.append({
                        'name': to_camel_case(attr['name']),
                        'type': attr['type'],
                        'annotation': '@XmlAttribute(name="{}")'.format(attr['name'])  # 属性组中的属性生成@XmlAttribute注解
                    })

        # 处理群组sequence下group
        inner_classes = []
        sequence = complexType.find("./{http://www.w3.org/2001/XMLSchema}sequence")
        if sequence is not None:
            for groupRef in sequence.findall("./{http://www.w3.org/2001/XMLSchema}group"):
                refName = groupRef.get('ref').split(':')[-1]
                groups = extractGroup(root, element_wrapper)  # 获取引用的群组
                if refName in groups:
                    for element in groups[refName]['elements']:
                        attributes.append({
                            'name': element['name'],
                            'type': element['type'],
                            'annotation': element['annotation'],
                        })
                    # 将群组中的内部类添加到 inner_classes 列表中
                    inner_classes.extend(groups[refName]['innerClasses'])

        # 处理choice下的group------------------------》这里逻辑要重写！！！！！！
        #mixed标签需要特殊处理，jaxb解析的不对----》参考artop模型用的是FeatureMap------》是否用list、是否用@elementRef注解
        #用list、xmlelements试试---》测试用例xml
        choice = complexType.find("./{http://www.w3.org/2001/XMLSchema}choice")
        if choice is not None:
            maxOccurs = choice.get('maxOccurs')
            #complex里面的choice全是"unbounded"，即要把引到的group里面的element提取出来再list<>
            # if maxOccurs != '1':
            for groupRef in choice.findall("./{http://www.w3.org/2001/XMLSchema}group"):
                refName = groupRef.get('ref').split(':')[-1]
                groups = extractGroup(root, element_wrapper)  # 获取引用的群组
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
                                'type': 'ArrayList<{}>'.format(to_pascal_case(element['name'])),
                                'annotation': element['annotation'],
                            })
                        inner_classes.extend(groups[refName]['innerClasses'])


        # 将复杂类型的信息存储到字典中，并添加到 complexTypes 列表中
        complexTypes.append({
            'name': name,
            'attributes': attributes,
            'innerClasses': inner_classes,  # 存储所有内部类信息
            'extends': extends
        })

    return complexTypes  # 返回解析后的复杂类型列表

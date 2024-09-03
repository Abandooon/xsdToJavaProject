from src.XsdParser.TypeMapping import mapXsdTypeToJava  # 导入函数，将XSD类型映射为Java类型


# 获取所有的attributeGroup和每个attributeGroup中的attribute（name和type），返回出去再遍历匹配引用的
def extractAttributeGroup(root):
    attributeGroups = {}  # 初始化一个字典，用于存储根节点下所有的attributeGroup

    # 查找所有的attributeGroup元素
    for attributeGroup in root.findall(".//{http://www.w3.org/2001/XMLSchema}attributeGroup"):
        name = attributeGroup.get('name')  # 获取attributeGroup的名称
        attributes = []

        # 查找attributeGroup中的所有attribute元素
        for attribute in attributeGroup.findall(".//{http://www.w3.org/2001/XMLSchema}attribute"):
            attrName = attribute.get('name')  # 获取属性的名称
            attrType = attribute.get('type')  # 获取属性的类型
            if attrType:
                attrType = attrType.split(':')[-1]  # 如果属性类型存在，去除命名空间，保留实际类型名
            # else:
            #     attrType = 'string'  # 如果类型不存在，默认类型为string------------>不需要，全是有type的
            attributes.append({
                'name': attrName,  # 属性名称
                'type': mapXsdTypeToJava(attrType, context='attribute_group')  # 将XSD类型映射为Java类型
            })

        attributeGroups[name] = attributes  # 将属性组的名称和属性列表存储到字典中

    return attributeGroups  # 返回包含所有属性组的字典

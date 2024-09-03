from src.XsdParser.TypeMapping import mapXsdTypeToJava
from src.XsdParser.ExtractSimpleType import extractSimpleType


# 只处理扩展本身，不处理下面的标签
def extractBaseType(root, baseName):
    baseTypeInfo = {
        'type': None,  # 初始化字典，存储基类型信息
        'extendsClass': None,
        'annotation': None
    }

    # 提取XSD中的简单类型
    simpleTypes = extractSimpleType(root)
    for simpleType in simpleTypes:
        if baseName == simpleType['name']:  # 匹配基类型名称
            if simpleType['enumerations']:  # 检查是否存在枚举值
                baseTypeInfo['type'] = to_pascal_case(simpleType['name'])  # 如果有枚举值，使用simpleType的name作为Java类名
                baseTypeInfo['annotation'] = '@XmlElement(name="{}")'.format(baseName)
            else:
                baseTypeInfo['type'] = mapXsdTypeToJava(simpleType['base'], context='base_type')  # 否则使用类型映射
                baseTypeInfo['annotation'] = '@XmlValue'
            return baseTypeInfo  # 返回基类型信息

        # 查找所有复杂类型，并匹配基类型名称
        for complexType in root.findall(".//{http://www.w3.org/2001/XMLSchema}complexType"):
            if complexType.get('name') == baseName:
                baseTypeInfo['extendsClass'] = to_pascal_case(baseName)
                return baseTypeInfo  # 返回基类型信息

    return baseTypeInfo  # 返回基类型信息


def to_pascal_case(snake_str):
    components = snake_str.split('-')  # 将字符串按'-'分隔
    return ''.join(x.capitalize() for x in components)  # 将每个部分首字母大写并拼接

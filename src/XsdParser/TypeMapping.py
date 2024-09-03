# -*- coding: utf-8 -*-
import re


def mapXsdTypeToJava(xsdType, context='default'):
    xsdToJavaTypeMap = {
        'base_type': {
            # 'CSE-CODE-TYPE-STRING--SIMPLE': 'java.lang.Integer',
            # 'FLOAT--SIMPLE': 'java.lang.Double',
            # 'TIME-VALUE--SIMPLE': 'java.lang.Double',
            # 这里传的就是base="*",小写的，如果是enum应该是引到这个枚举类------->逻辑错误，应该是找到继承的这个simpleType，看里面有没有enumeration标签，有的话就是个类
            'string': 'java.lang.String',
            'unsignedInt': 'java.lang.Integer',
            'double': 'java.lang.Double',
            'NMTOKEN': 'java.lang.String',
            'NMTOKENS': 'java.lang.String',
        },
        'attribute_group': {
            # 只有不含enum的Simple没解析为类，所以要映射为基本类型，别的都解析为类了，默认驼峰类名即可引到
            'string': 'java.lang.String',
            "STRING--SIMPLE": "java.lang.String",
            "DATE--SIMPLE": "java.lang.String",
            "TABLE-SEPARATOR-STRING--SIMPLE": "java.lang.String",
            "PRIMITIVE-IDENTIFIER--SIMPLE": "java.lang.String",
            "NMTOKENS-STRING--SIMPLE": "java.lang.String",
            "VIEW-TOKENS--SIMPLE": "java.lang.String",
            "NMTOKEN-STRING--SIMPLE": "java.lang.String",
            "IDENTIFIER--SIMPLE": "java.lang.String",
            "POSITIVE-INTEGER--SIMPLE": "java.lang.String",
            "INTEGER--SIMPLE": "java.lang.String",
            "MIME-TYPE-STRING--SIMPLE": "java.lang.String",
        },
        'group': {
            # Group里面是element中的type=“”，应该都是解析为类的，再检查一遍有没有只含simple的----》没有只含simple的，注掉试试
            # "DATE--SIMPLE": "java.lang.String",
            # "TABLE-SEPARATOR-STRING--SIMPLE": "java.lang.String",
            # "PRIMITIVE-IDENTIFIER--SIMPLE": "java.lang.String",
            # "NMTOKENS-STRING--SIMPLE": "java.lang.String",
            # "VIEW-TOKENS--SIMPLE": "java.lang.String",
            # "NMTOKEN-STRING--SIMPLE": "java.lang.String",
            # "IDENTIFIER--SIMPLE": "java.lang.String",
            # "POSITIVE-INTEGER--SIMPLE": "java.lang.String",
            # "INTEGER--SIMPLE": "java.lang.String",
            # "MIME-TYPE-STRING--SIMPLE": "java.lang.String",
        }
    }

    mapping = xsdToJavaTypeMap.get(context, {})

    if not isinstance(xsdType, str):
        xsdType = str(xsdType)

    # if context == 'base_type':
    #     if 'ENUM' in xsdType:
    #         # 如果 xsdType 包含 'Enum'，则使用 PascalCase 转换
    #         return to_pascal_case(xsdType)
    #     elif 'SIMPLE' in xsdType:
    #         # 如果 xsdType 仅包含 'Simple'，则映射为 'java.lang.String'
    #         return 'java.lang.String'
    #     else:
    #         # 如果没有匹配，仍然使用 PascalCase 转换
    #         return to_pascal_case(xsdType)
    # else:
    #     # 其他上下文下，默认返回 PascalCase 类型
    return mapping.get(xsdType, to_pascal_case(xsdType))


def to_pascal_case(snake_str):
    """
    将字符串转换为PascalCase格式
    """
    if not isinstance(snake_str, str):
        snake_str = str(snake_str)  # 将非字符串类型转换为字符串

    components = re.split('[-_]', snake_str)
    return ''.join(x.capitalize() for x in components)

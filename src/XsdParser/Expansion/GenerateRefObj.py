# -*- coding: utf-8 -*-
import os
from lxml import etree
from src.XsdParser.Utils import to_pascal_case

def get_subtypes(input_dir, enumType):
    # XsdIndex.arxml 文件路径
    arxml_file_path = os.path.join(input_dir, 'XsdIndex.arxml')

    # 解析 XsdIndex.arxml 文件
    tree = etree.parse(arxml_file_path)
    root = tree.getroot()

    # # 定义 XML 命名空间
    # ns = {'': 'http://autosar.org/schema/r4.0'}  # 默认命名空间

    # 查找 <group> 元素，其中 @name 等于 enumType
    xpath_query = f'//group[@name="{enumType}"]/@complexTypes'
    complex_types_str = root.xpath(xpath_query)

    # 如果找不到，返回空列表
    if not complex_types_str:
        return []

    # 获取 complexTypes 字符串，并按 '//' 分割
    complex_types_str = complex_types_str[0]
    ref_objs = [to_pascal_case(ref_obj.strip()) for ref_obj in complex_types_str.split('//') if ref_obj.strip()]

    # 返回 RefObjs[]
    return [ref_obj.strip() for ref_obj in ref_objs if ref_obj.strip()]


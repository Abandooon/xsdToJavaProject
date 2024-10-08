# -*- coding: utf-8 -*-

import os
import time

from lxml import etree
from jinja2 import Environment, FileSystemLoader
from src.DslParser import parse_dsl
from src.XsdParser.ExtractAttributeGroup import extractAttributeGroup
from src.XsdParser.ExtractComplexType import extractComplexType
from src.XsdParser.ExtractGroup import extractGroup
from src.XsdParser.ExtractSimpleType import extractSimpleType
from src.XsdParser.Utils import to_pascal_case
from src.XsdParser.Expansion.InnerInnerExtractor import extract_internals_classes


def generateJavaClass(input_dir, output_dir, package_name, element_wrapper, extract_inner_class):
    start_time = time.time()  # 记录开始时间
    # 配置模板环境
    env = Environment(loader=FileSystemLoader('templates'))  # 加载模板文件夹

    # 根据 extract_inner_class 参数选择模板
    if extract_inner_class:
        complexTypeClassTemplate = env.get_template('ComplexTypeClassTemplateExtractInnerClass.j2')  # 模板带有内部类
    else:
        complexTypeClassTemplate = env.get_template('ComplexTypeClassTemplate.j2')  # 模板不带有内部类

    simpleTypeClassTemplate = env.get_template('SimpleTypeClassTemplate.j2')

    # 解析XSD文件
    xsdFile = os.path.join(input_dir, 'AUTOSAR_4-2-2_result.xsd')  # 指定XSD文件路径
    tree = etree.parse(xsdFile)  # 解析XSD文件为树结构
    root = tree.getroot()  # 获取XML的根节点

    # 提取信息
    groups = extractGroup(root, element_wrapper)
    attributeGroups = extractAttributeGroup(root)
    complexTypes = extractComplexType(root, element_wrapper, groups, attributeGroups)  # 提取复杂类型信息
    simpleTypes = extractSimpleType(root)  # 提取简单类型信息
    print(f"提取了 {len(complexTypes)} 个复杂类型")

    # 处理简单类型
    for simpleType in simpleTypes:
        # 含enumeration标签的需解析为类，应用simpleType模版
        if simpleType['enumerations']:
            javaCode = simpleTypeClassTemplate.render(
                packageName=package_name,
                className=to_pascal_case(simpleType['name']),
                xmlTypeName=simpleType['name'],
                enumerations=simpleType['enumerations']
            )
            # 设输出目录，并确保目录存在
            outputDir = output_dir  # 指定输出目录
            os.makedirs(outputDir, exist_ok=True)  # 创建输出目录（如果不存在）

            # 设置Java文件的输出路径，文件名与类名一致
            outputPath = os.path.join(outputDir, f"{to_pascal_case(simpleType['name'])}.java")
            with open(outputPath, 'w') as file:
                file.write(javaCode)  # 将生成的Java代码写入文件

    # 生成Java代码
    if extract_inner_class:
        for complexType in complexTypes:
            # extract_internal_classes(complexType, output_dir, package_name, complexTypeClassTemplate)
            extract_internals_classes(complexType, output_dir, package_name, complexTypeClassTemplate)

    else:
        for complexType in complexTypes:
            javaCode = complexTypeClassTemplate.render(
                packageName=package_name,
                className=to_pascal_case(complexType['name']),
                extends=complexType['extends'],
                attributes=complexType['attributes'],  # 传递属性列表
                innerClasses=complexType.get('innerClasses', [])  # 直接传递内部类列表
                # rootElement=rootElement   #由dsl传递参数开启
                # xmlType
            )
            outputDir = output_dir  # 指定输出目录
            os.makedirs(outputDir, exist_ok=True)  # 创建输出目录（如果不存在）

            # 设置Java文件的输出路径，文件名与类名一致
            outputPath = os.path.join(outputDir, f"{to_pascal_case(complexType['name'])}.java")
            with open(outputPath, 'w') as file:
                file.write(javaCode)  # 将生成的Java代码写入文件

    end_time = time.time()  # 记录结束时间
    print(f"Java类生成总耗时: {end_time - start_time:.2f}秒")  # 打印耗时

if __name__ == "__main__":
    dsl_file = 'config.dsl'
    config = parse_dsl(dsl_file)

    input_dir = config.get('input_dir')
    output_dir = config.get('output_dir')
    package_name = config.get('package_name')
    #默认为false
    element_wrapper = config.get('element_wrapper', False)
    extract_inner_class = config.get('ExtractInnerClass', False)

    # 调用生成Java类的函数
    generateJavaClass(input_dir=input_dir, output_dir=output_dir, package_name=package_name,
                      element_wrapper=element_wrapper, extract_inner_class=extract_inner_class)

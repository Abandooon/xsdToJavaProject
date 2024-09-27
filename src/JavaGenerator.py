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
from src.XsdParser.Utils import to_camel_case, to_pascal_case
from src.XsdParser.Expansion.InternalClassExtractor import extract_internal_classes


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
    xsdFile = os.path.join(input_dir, 'simpleTest.xsd')  # 指定XSD文件路径
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
            main_class_name = to_pascal_case(complexType['name'])  # 定义主类名
            inner_class_mapping = extract_internal_classes(complexType, output_dir, package_name,
                                                           complexTypeClassTemplate)

            # 更新主类的属性类型
            for attribute in complexType['attributes']:
                if attribute['type'] in inner_class_mapping:
                    attribute['type'] = inner_class_mapping[attribute['type']]

            # 生成主类的Java代码，使用更新后的成员类型
            javaCode = complexTypeClassTemplate.render(
                packageName=package_name,
                className=main_class_name,
                extends=complexType['extends'],
                attributes=complexType['attributes']
            )

            # 创建输出目录
            os.makedirs(output_dir, exist_ok=True)

            # 将主类生成到单独的Java文件中
            outputPath = os.path.join(output_dir, f"{main_class_name}.java")
            with open(outputPath, 'w') as file:
                file.write(javaCode)
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
    element_wrapper = config.get('element_wrapper')

    # 从DSL配置中读取 ExtractInnerClass 参数，默认值为 False
    extract_inner_class = config.get('ExtractInnerClass', False)

    # 调用生成Java类的函数
    generateJavaClass(input_dir=input_dir, output_dir=output_dir, package_name=package_name,
                      element_wrapper=element_wrapper, extract_inner_class=extract_inner_class)

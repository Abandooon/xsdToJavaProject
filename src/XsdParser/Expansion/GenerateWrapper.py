# -*- coding: utf-8 -*-

import os
from jinja2 import Environment, FileSystemLoader
from src.XsdParser.Utils import to_pascal_case, to_camel_case

def collect_wrapper_class_names(complexTypeClassesInfo):
    wrapper_class_names = set()
    for class_info in complexTypeClassesInfo:
        class_name = to_pascal_case(class_info['name'])
        wrapper_class_name = class_name + 'Wrapper'
        wrapper_class_names.add(wrapper_class_name)
    return wrapper_class_names

def generate_wrapper_classes(complexTypeClassesInfo, output_dir, package_name, wrapper_class_names):
    # 配置模板环境
    env = Environment(loader=FileSystemLoader('templates'))
    wrapperClassTemplate = env.get_template('WrapperClassTemplate.j2')

    for class_info in complexTypeClassesInfo:
        original_class_name = class_info['name']
        original_variable_name = to_camel_case(class_info['name'])
        wrapper_class_name = original_class_name + 'Wrapper'
        attributes = class_info['attributes']

        # 渲染模板
        javaCode = wrapperClassTemplate.render(
            packageName=package_name,
            wrapperClassName=wrapper_class_name,
            originalClassName=original_class_name,
            originalVariableName=original_variable_name,
            attributes=attributes,
            wrapperClassNames=wrapper_class_names
        )

        # 确保输出目录存在
        output_subdir = os.path.join(output_dir, 'modelwrapper')
        os.makedirs(output_subdir, exist_ok=True)
        # 写入 Java 文件
        outputPath = os.path.join(output_subdir, f"{wrapper_class_name}.java")
        with open(outputPath, 'w') as file:
            file.write(javaCode)

    print("Wrapper 类生成完成。")

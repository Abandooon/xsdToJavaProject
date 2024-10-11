# -*- coding: utf-8 -*-

import os
import re
from jinja2 import Environment, FileSystemLoader
from src.XsdParser.Utils import to_pascal_case, to_camel_case

def collect_wrapper_class_names(complexTypeClassesInfo):
    wrapper_class_names = set()
    for class_info in complexTypeClassesInfo:
        class_name = class_info['name']
        wrapper_class_name = class_name + 'Wrapper'
        wrapper_class_names.add(wrapper_class_name)
    return wrapper_class_names


def generate_wrapper_classes(complexTypeClassesInfo, output_dir, package_name, wrapper_class_names):
    # 配置模板环境
    env = Environment(loader=FileSystemLoader('templates'))
    wrapperClassTemplate = env.get_template('WrapperClassTemplate.j2')

    # 正则表达式匹配 ArrayList<SomeType> 的类型
    list_type_pattern = re.compile(r'ArrayList<(.+)>')
    arraylist_serializable_pattern = re.compile(r'ArrayList<Serializable>')

    for class_info in complexTypeClassesInfo:
        original_class_name = to_pascal_case(class_info['name'])
        original_variable_name = to_camel_case(class_info['name'])
        wrapper_class_name = original_class_name + 'Wrapper'
        attributes = []
        has_arraylist_serializable = False  # 用来标识是否存在 ArrayList<Serializable> 类型

        # 确定每个属性的返回值类型
        for attribute in class_info['attributes']:
            attr_type = attribute.get('type')  # 使用 get 方法避免属性不存在的问题
            name = attribute.get('name')  # 获取属性的 name

            # 跳过没有 name 或 type 的属性
            if not name or not attr_type:
                continue

            # 检查是否为 ArrayList<SomeType> 类型
            list_match = list_type_pattern.match(attr_type)
            if list_match:
                inner_type = list_match.group(1)

                # 处理 ArrayList<Serializable> 类型
                if inner_type == 'Serializable':
                    return_type = attr_type
                    has_arraylist_serializable = True  # 标记存在 ArrayList<Serializable>

                # 如果是其他 ArrayList<SomeType>
                elif inner_type + 'Wrapper' in wrapper_class_names:
                    # 如果 List 中的类型有对应的 Wrapper，则返回 ArrayList<SomeTypeWrapper>
                    return_type = f'ArrayList<{inner_type}Wrapper>'
                else:
                    return_type = attr_type

            # 如果是普通类型并且有 Wrapper
            elif attr_type + 'Wrapper' in wrapper_class_names:
                return_type = attr_type + 'Wrapper'

            # 普通类型，无需包装
            else:
                return_type = attr_type

            # 将确定好的属性信息添加到 attributes 列表
            attributes.append({
                'name': name,
                'type': return_type
            })

        # 渲染模板，直接传入确定好的返回值类型
        javaCode = wrapperClassTemplate.render(
            packageName=package_name,
            wrapperClassName=wrapper_class_name,
            originalClassName=original_class_name,
            originalVariableName=original_variable_name,
            attributes=attributes,
            hasArrayListSerializable=has_arraylist_serializable  # 传递标记到模板
        )

        # 确保输出目录存在
        output_subdir = os.path.join(output_dir, 'modelwrapper')
        os.makedirs(output_subdir, exist_ok=True)

        # 写入 Java 文件
        outputPath = os.path.join(output_subdir, f"{wrapper_class_name}.java")
        with open(outputPath, 'w') as file:
            file.write(javaCode)

    print("Wrapper 类生成完成。")




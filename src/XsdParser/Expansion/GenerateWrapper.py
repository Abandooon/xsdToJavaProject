# -*- coding: utf-8 -*-
import os
import re
from jinja2 import Environment, FileSystemLoader

from src.XsdParser.Expansion.GenerateRefObj import get_subtypes
from src.XsdParser.Utils import to_pascal_case, to_camel_case

def collect_wrapper_class_names(complexTypeClassesInfo):
    wrapper_class_names = set()
    for class_info in complexTypeClassesInfo:
        class_name = class_info['name']
        wrapper_class_name = class_name + 'Wrapper'
        wrapper_class_names.add(wrapper_class_name)
    return wrapper_class_names

def generate_wrapper_classes(input_dir, complexTypeClassesInfo, output_dir, package_name, wrapper_class_names):
    # 配置模板环境
    env = Environment(loader=FileSystemLoader('templates'))
    wrapperClassTemplate = env.get_template('WrapperClassTemplate.j2')

    # 正则表达式匹配 ArrayList<SomeType> 的类型
    list_type_pattern = re.compile(r'ArrayList<(.+)>')


    for class_info in complexTypeClassesInfo:
        original_class_name = class_info['name']
        original_variable_name = to_camel_case(class_info['name'])
        wrapper_class_name = original_class_name + 'Wrapper'
        attributes = []
        additional_api_methods = []  # 保存需要生成的 API 方法信息
        has_arraylist_serializable = False  # 标记是否存在 ArrayList<Serializable> 类型
        has_ref_object = False  # 标记是否存在 refObject 类型

        # 确定每个属性的返回值类型
        for attribute in class_info['attributes']:
            attr_type = attribute.get('type')  # 获取属性的类型
            anno = attribute.get('annotation')  # 获取注解信息
            name = attribute.get('name')  # 获取属性的 name

            if original_class_name.endswith(('Ref', 'Iref', 'Tref')) and name == 'dest':
                # 标记为有引用对象
                has_ref_object = True

                # 提取 enumType 并转换为大写字母，以便在 get_subtypes 中查找
                enumType = '-'.join(re.findall(r'[A-Z][^A-Z]*', attr_type.replace('SubtypesEnum', ''))).upper()

                # 调用 get_subtypes 函数，获取 RefObjs[]（即 complexTypes 列表）
                refObjNames = get_subtypes(input_dir, enumType)

                # 遍历每个 refObjName，生成 getter 方法
                for refObjName in refObjNames:
                    # 预先检查是否有 Wrapper 类
                    has_wrapper = refObjName + 'Wrapper' in wrapper_class_names
                    return_type = refObjName + 'Wrapper' if has_wrapper else refObjName

                    # 构建 method_info，减少重复代码
                    method_info = {
                        'annotation_pascal_case': return_type,  # PascalCase 类名或 Wrapper 类名
                        'original_variable_name': return_type.lower(),  # 小写形式的变量名
                        'has_wrapper': has_wrapper  # 是否有 Wrapper 类
                    }

                    # 将 method_info 添加到 additional_api_methods 列表
                    additional_api_methods.append(method_info)

            # 跳过没有 name 或 type 的属性
            if not name or not attr_type:
                continue

            # 检查是否为 ArrayList<SomeType> 类型
            list_match = list_type_pattern.match(attr_type)
            has_wrapper = False  # 标记是否有 Wrapper

            if list_match:
                inner_type = list_match.group(1)

                # 处理 ArrayList<Serializable> 类型
                if inner_type == 'Serializable':
                    return_type = attr_type
                    has_arraylist_serializable = True  # 标记存在 ArrayList<Serializable>

                    # 从注解中获取所有 'name' 并转换为 PascalCase
                    # if anno and 'name=' in anno:
                    #     names = re.findall(r'name="([^"]+)"', anno)  # 匹配所有 'name' 值
                    #     for annotation_name in names:
                    #         #todo-------这里不对，应该是根据name在xsd中找Type，然后作为返回值类型annotation_pascal_case
                    #         annotation_pascal_case = to_pascal_case(annotation_name)
                    #
                    #         # 将生成 getter 方法所需的信息传递给模板
                    #         method_info = {
                    #             'annotation_pascal_case': annotation_pascal_case,
                    #             'original_variable_name': original_variable_name,
                    #             'has_wrapper': annotation_pascal_case + 'Wrapper' in wrapper_class_names
                    #         }
                    #         additional_api_methods.append(method_info)

                # 如果是其他 ArrayList<SomeType>
                elif inner_type + 'Wrapper' in wrapper_class_names:
                    # 如果 List 中的类型有对应的 Wrapper，则返回 ArrayList<SomeTypeWrapper>
                    return_type = f'ArrayList<{inner_type}Wrapper>'
                    has_wrapper = True
                else:
                    return_type = attr_type

            # 如果是普通类型并且有 Wrapper
            elif attr_type + 'Wrapper' in wrapper_class_names:
                return_type = attr_type + 'Wrapper'
                has_wrapper = True

            # 普通类型，无需包装
            else:
                return_type = attr_type

            # 将确定好的属性信息添加到 attributes 列表
            attribute['type'] = return_type
            attribute['hasWrapper'] = has_wrapper
            attributes.append(attribute)

        # 渲染模板，将必要的信息传递给模板
        javaCode = wrapperClassTemplate.render(
            packageName=package_name,
            wrapperClassName=wrapper_class_name,
            originalClassName=original_class_name,
            originalVariableName=original_variable_name,
            attributes=attributes,
            additionalApiMethods=additional_api_methods,
            hasArrayListSerializable=has_arraylist_serializable,
            hasRefObject = has_ref_object
        )

        # 确保输出目录存在
        output_subdir = os.path.join(output_dir, 'modelwrapper')
        os.makedirs(output_subdir, exist_ok=True)

        # 写入 Java 文件
        outputPath = os.path.join(output_subdir, f"{wrapper_class_name}.java")
        with open(outputPath, 'w') as file:
            file.write(javaCode)

    print("Wrapper 类生成完成。")

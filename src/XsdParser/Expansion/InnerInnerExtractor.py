import os
import hashlib
from src.XsdParser.Utils import to_pascal_case

# 维护一个全局的内部类信息列表
inner_class_info_list = []
def extract_internals_classes(complexType, output_dir, package_name, class_template, parent_class_name=None):
    output_subdir = os.path.join(output_dir, 'orimodel')
    os.makedirs(output_subdir, exist_ok=True)  # 创建输出目录（如果不存在）

    if not complexType.get('innerClasses'):
        javaCode = class_template.render(
            packageName=package_name,
            className=to_pascal_case(complexType['name']),
            extends=complexType['extends'],
            attributes=complexType['attributes']
        )

        outputPath = os.path.join(output_subdir, f"{to_pascal_case(complexType['name'])}.java")
        with open(outputPath, 'w') as file:
            file.write(javaCode)
        return

    main_class_name = to_pascal_case(complexType['name']) if parent_class_name is None else parent_class_name

    for inner_class in complexType['innerClasses']:
        inner_class_name = inner_class['InnerClassName']
        inner_class_attributes = inner_class['InnerClassAttributes']

        # 初始化标记变量
        is_duplicate = False
        rename_flag = False
        other_main_name = None

        # 收集所有匹配的内部类信息
        matching_infos = [info for info in inner_class_info_list if info['inner_class_name'] == inner_class_name]

        # 处理匹配的内部类信息
        for info in matching_infos:
            if info['inner_class_attributes'] == inner_class_attributes:
                # 属性相等，存在重复，不生成文件
                is_duplicate = True
                rename_flag = info['rename_flag']
                if rename_flag:
                    other_main_name = info['main_class_name']
                # 已经找到属性相等的情况，可以退出循环
                break
            else:
                # 属性不等，需要重命名
                rename_flag = True
                # 不要break，继续检查是否有属性相等的情况

        if not is_duplicate:
            if rename_flag:
                # 名字相同但属性不匹配，需要重命名并生成类文件
                new_inner_class_name = f"{inner_class_name}_{main_class_name}"
                inner_class_info_list.append({
                    'inner_class_name': inner_class_name,
                    'main_class_name': main_class_name,
                    'rename_flag': True,
                    'inner_class_attributes': inner_class_attributes
                })
                inner_output_path = os.path.join(output_subdir, f"{new_inner_class_name}.java")

                # 渲染并写入内部类代码
                new_inner_class_code = class_template.render(
                    packageName=package_name,
                    className=new_inner_class_name,
                    extends=inner_class.get('extendsClass'),
                    attributes=inner_class_attributes
                )
                with open(inner_output_path, 'w') as file:
                    file.write(new_inner_class_code)

                # 更新父级类中的成员类型
                update_parent_attributes(complexType, inner_class_name, new_inner_class_name)
            else:
                # 首次出现，生成类文件
                inner_class_info_list.append({
                    'inner_class_name': inner_class_name,
                    'main_class_name': main_class_name,
                    'rename_flag': False,
                    'inner_class_attributes': inner_class_attributes
                })
                inner_output_path = os.path.join(output_subdir, f"{inner_class_name}.java")

                # 渲染并写入内部类代码
                new_inner_class_code = class_template.render(
                    packageName=package_name,
                    className=inner_class_name,
                    extends=inner_class.get('extendsClass'),
                    attributes=inner_class_attributes
                )
                with open(inner_output_path, 'w') as file:
                    file.write(new_inner_class_code)
        else:
            if rename_flag:
                # 不生成内部类文件，需要修改父级类的成员类型
                new_inner_class_name = f"{inner_class_name}_{other_main_name}"
                update_parent_attributes(complexType, inner_class_name, new_inner_class_name)
                # 不需要break，继续处理
            else:
                # 不生成内部类文件，父级类成员类型不变
                pass

        # **递归处理嵌套的内部类**
        if inner_class.get('innerInnerClass'):
            inner_inner_classes = inner_class.get('innerInnerClass')
            for inner_inner_class in inner_inner_classes:
                javaCode = class_template.render(
                    packageName=package_name,
                    className=inner_inner_class['InnerClassName'],
                    extends=inner_inner_class['extendsClass'],
                    attributes=inner_inner_class['InnerClassAttributes']
                )

                outputPath = os.path.join(output_subdir, f"{inner_inner_class['InnerClassName']}.java")
                with open(outputPath, 'w') as file:
                    file.write(javaCode)

    # 如果当前处理的是主类，生成主类的Java代码
    if parent_class_name is None:
        javaCode = class_template.render(
            packageName=package_name,
            className=main_class_name,
            extends=complexType.get('extends'),
            attributes=complexType['attributes']
        )
        # 创建输出目录
        os.makedirs(output_dir, exist_ok=True)
        # 将主类生成到单独的Java文件中
        outputPath = os.path.join(output_subdir, f"{main_class_name}.java")
        with open(outputPath, 'w') as file:
            file.write(javaCode)

def update_parent_attributes(parent_class, old_inner_class_name, new_inner_class_name):
    for attribute in parent_class['attributes']:
        attr_type = attribute['type']
        if attr_type.startswith('List<') or attr_type.startswith('ArrayList<'):
            inner_type = attr_type[attr_type.find('<') + 1:attr_type.rfind('>')]
            if inner_type == old_inner_class_name:
                attribute['type'] = f"{attr_type[:attr_type.find('<') + 1]}{new_inner_class_name}{attr_type[attr_type.rfind('>'):]}"
        elif attr_type == old_inner_class_name:
            attribute['type'] = new_inner_class_name

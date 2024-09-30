import os
import hashlib
from src.XsdParser.Utils import to_pascal_case

# 维护一个全局的内部类信息列表
inner_class_info_list = []
#第四种情况没走进去
def extract_internal_classes(complexType, output_dir, package_name, class_template):
    if not complexType.get('innerClasses'):
        javaCode = class_template.render(
            packageName=package_name,
            className=to_pascal_case(complexType['name']),
            extends=complexType['extends'],
            attributes=complexType['attributes']
        )
        os.makedirs(output_dir, exist_ok=True)
        outputPath = os.path.join(output_dir, f"{to_pascal_case(complexType['name'])}.java")
        with open(outputPath, 'w') as file:
            file.write(javaCode)
        return

    for inner_class in complexType['innerClasses']:
        inner_class_name =inner_class['InnerClassName']
        main_class_name = to_pascal_case(complexType['name'])
        inner_class_attributes = inner_class['InnerClassAttributes']

        # 检查全局列表中的内部类名
        is_duplicate = False
        rename_flag = False
        other_main_name = None
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
            if not rename_flag:
                # （1）第一次没有匹配到，将信息存储到列表并生成类文件
                inner_class_info_list.append({
                    'inner_class_name': inner_class_name,
                    'main_class_name': main_class_name,
                    'rename_flag': False,
                    'inner_class_attributes': inner_class_attributes
                })
                inner_output_path = os.path.join(output_dir, f"{inner_class_name}.java")

                # 渲染并写入内部类代码
                new_inner_class_code = class_template.render(
                    packageName=package_name,
                    className=inner_class_name,
                    extends=inner_class['extendsClass'],
                    attributes=inner_class_attributes
                )
                with open(inner_output_path, 'w') as file:
                    file.write(new_inner_class_code)
            else:
                # （3）名字一样属性不匹配，设置重命名标记位为true并生成类文件
                new_inner_class_name = f"{inner_class_name}_{main_class_name}"
                inner_class_info_list.append({
                    'inner_class_name': inner_class_name,
                    'main_class_name': main_class_name,
                    'rename_flag': True,
                    'inner_class_attributes': inner_class_attributes
                })
                inner_output_path = os.path.join(output_dir, f"{new_inner_class_name}.java")

                # 渲染并写入内部类代码
                new_inner_class_code = class_template.render(
                    packageName=package_name,
                    className=new_inner_class_name,
                    extends=inner_class['extendsClass'],
                    attributes=inner_class_attributes
                )
                with open(inner_output_path, 'w') as file:
                    file.write(new_inner_class_code)
                # 更新主类中的成员类型
                # 如果是list类型就匹配不上了-----inner_class_name没有驼峰化
                for attribute in complexType['attributes']:
                    attr_type = attribute['type']
                    if attr_type.startswith('List<') or attr_type.startswith('ArrayList<'):
                        inner_type = attr_type[attr_type.find('<') + 1:attr_type.rfind('>')]
                        if inner_type == inner_class_name:
                            attribute[
                                'type'] = f"{attr_type[:attr_type.find('<') + 1]}{new_inner_class_name}{attr_type[attr_type.rfind('>'):]}"
                    elif attr_type == inner_class_name:
                        attribute['type'] = new_inner_class_name
        else:
            #（4）不生成内部类文件，如果重命名标记位为true修改主类，修改为匹配到的内部类主类名
            if rename_flag:
                new_inner_class_name = f"{inner_class_name}_{other_main_name}"
                for attribute in complexType['attributes']:
                    attr_type = attribute['type']
                    if attr_type.startswith('List<') or attr_type.startswith('ArrayList<'):
                        inner_type = attr_type[attr_type.find('<') + 1:attr_type.rfind('>')]
                        if inner_type == inner_class_name:
                            attribute[
                                'type'] = f"{attr_type[:attr_type.find('<') + 1]}{new_inner_class_name}{attr_type[attr_type.rfind('>'):]}"
                    elif attr_type == inner_class_name:
                        attribute['type'] = new_inner_class_name
            #（2）不生成内部类文件，如果重命名标记位为false不修改主类
            else:
                pass

    # 生成主类的Java代码，使用更新后的成员类型
    javaCode = class_template.render(
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
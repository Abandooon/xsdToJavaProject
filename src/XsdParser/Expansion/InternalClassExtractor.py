import os
import hashlib
from src.XsdParser.Utils import to_pascal_case

# 维护一个全局的内部类信息列表
inner_class_info_list = []

def extract_internal_classes(complexType, output_dir, package_name, class_template):
    if not complexType.get('innerClasses'):
        return {}
    inner_class_mapping = {}  # 存储内部类名称与新名称的映射

    for inner_class in complexType['innerClasses']:
        inner_class_name =to_pascal_case(inner_class['InnerClassName'])
        main_class_name = to_pascal_case(complexType['name'])
        inner_class_attributes = inner_class['InnerClassAttributes']

        # 检查全局列表中的内部类名
        is_duplicate = False
        rename_flag = False
        other_main_name = None
        for info in inner_class_info_list:
            if info['inner_class_name'] == inner_class_name:
                if info['inner_class_attributes'] == inner_class_attributes:
                    #有重复，不生成文件
                    is_duplicate = True
                    #获取重命名标记位，为false则不修改主类；为true则修改主类
                    rename_flag = info['rename_flag']
                    #如果重命名标记位为true，记录下该条匹配到的内部类主类名，用于修改当前主类成员
                    if rename_flag:
                        other_main_name = info['main_class_name']
                    break
                else:
                    rename_flag = True
                    break

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
                print(f"inner_class_mapping: {inner_class_mapping}")
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
                inner_class_mapping[inner_class_name] = new_inner_class_name
                # for attribute in complexType['attributes']:
                #     if attribute['type'] == inner_class_name:
                #         attribute['type'] = new_inner_class_name
        else:
            #（4）不生成内部类文件，如果重命名标记位为true修改主类，修改为匹配到的内部类主类名
            if rename_flag:
                new_inner_class_name = f"{inner_class_name}_{other_main_name}"
                inner_class_mapping[inner_class_name] = new_inner_class_name
                # for attribute in complexType['attributes']:
                #     if attribute['type'] == inner_class_name:
                #         attribute['type'] = new_inner_class_name
            #（2）不生成内部类文件，如果重命名标记位为false不修改主类
            else:
                break
        # 保存映射
    return inner_class_mapping
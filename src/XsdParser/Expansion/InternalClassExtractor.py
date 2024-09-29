import os
import hashlib
from src.XsdParser.Utils import to_pascal_case
# 维护一个内部类信息的列表；每次处理提取内部类的时候先与列表中的信息对比，
# 如果匹配到与当前内部类相同的内部类名、内部类的attributes类型，则说明已生成相同内容的内部类，就不用提取内部类生成文件了，只需根据重命名标记位修改主类中的成员类型。
# 如果列表中没有匹配到，则说明没有生成内部类文件，则将当前内部类的类名、主类的类名、重命名标记位、内部类的attributes类型存储在内部类信息的列表，然后生成当前内部类文件。

#内部类文件名应该在对比列表之后生成，如果有多个重名的内部类，则提取的第一个内部类不需要改为{inner_class_name}_{main_class_name}。
# 列表中不需要'new_inner_class_name': new_inner_class_name，只要有个布尔类型的重命名标记位即可。
# 如果当前内部类在列表中没有匹配到相同的内部类，则将当前内部类的类名、主类的类名、重命名标记位置为false、内部类的attributes类型存储在内部类信息的列表，然后生成当前内部类文件，不修改主类；
# 如果当前内部类在列表中匹配到相同的内部类，则判断匹配到的内部类的重命名标记位，如果为true，则修改当前内部类主类的成员类型为列表中匹配到的内部类的{inner_class_name}_{main_class_name}，且不生成当前内部类的文件，如果匹配到的内部类的重命名标记位为false，则不修改主类也不生成当前内部类文件；

# 维护一个全局的内部类信息列表
inner_class_info_list = []

def extract_internal_classes(complexType, output_dir, package_name, class_template):
    if not complexType.get('innerClasses'):
        return {}
    inner_class_mapping = {}  # 存储内部类名称与新名称的映射

    for inner_class in complexType['innerClasses']:
        inner_class_name = to_pascal_case(inner_class['InnerClassName'])
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
                new_inner_class_name = inner_class_name
                inner_output_path = os.path.join(output_dir, f"{new_inner_class_name}.java")

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
                    className=inner_class_name,
                    extends=inner_class['extendsClass'],
                    attributes=inner_class_attributes
                )
                with open(inner_output_path, 'w') as file:
                    file.write(new_inner_class_code)
                # 更新主类中的成员类型
                for attribute in complexType['attributes']:
                    if attribute['type'] == inner_class_name:
                        attribute['type'] = new_inner_class_name
        else:
            #（4）不生成内部类文件，如果重命名标记位为true修改主类，修改为匹配到的内部类主类名
            if rename_flag:
                new_inner_class_name = f"{inner_class_name}_{other_main_name}"
                for attribute in complexType['attributes']:
                    if attribute['type'] == inner_class_name:
                        attribute['type'] = new_inner_class_name
            #（2）不生成内部类文件，如果重命名标记位为false不修改主类
            else:
                break
        # 保存映射
        inner_class_mapping[inner_class_name] = new_inner_class_name

    return inner_class_mapping
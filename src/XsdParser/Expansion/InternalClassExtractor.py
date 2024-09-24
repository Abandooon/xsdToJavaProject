#每提取一个内部类，维护一个包含内部类名、主类名、属性的列表，如果类名相同对比属性，相同则不生成类，不同则加入列表生成类
import os
import hashlib
from src.XsdParser.Utils import to_pascal_case


def extract_internal_classes(complexType, output_dir, package_name, class_template):
    if not complexType.get('innerClasses'):
        return
    inner_class_mapping = {}  # 存储内部类名称与新名称的映射
    innerClassAttribute = {}
    # 先处理所有内部类
    for inner_class in complexType['innerClasses']:
        inner_class_name = to_pascal_case(inner_class['InnerClassName'])
        main_class_name = to_pascal_case(complexType['name'])

        # 生成内部类文件名
        new_inner_class_name = f"{inner_class_name}_{main_class_name}"
        inner_output_path = os.path.join(output_dir, f"{new_inner_class_name}.java")

        # 渲染内部类代码
        new_inner_class_code = class_template.render(
            packageName=package_name,
            className=inner_class_name,
            extends=inner_class['extendsClass'],
            attributes=inner_class['InnerClassAttributes']
        )



        # 获取文件名的前缀（即“_”之前的部分）
        prefix = inner_class_name  # 使用内部类名作为前缀
        existing_files = []

        # 检查与当前文件前缀相同的所有文件
        for file_name in os.listdir(output_dir):
            if file_name.startswith(prefix) and file_name.endswith('.java'):
                existing_files.append(os.path.join(output_dir, file_name))

        # 进行哈希比较
        is_duplicate = False
        # for existing_file in existing_files:
        #     existing_hash = hash_file(existing_file)
        #     new_inner_class_hash = hashlib.sha256(new_inner_class_code.encode('utf-8')).hexdigest()
        #
        #     if existing_hash == new_inner_class_hash:
        #         print(f"已存在相同的文件: {existing_file}")
        #         is_duplicate = True
        #         break

        if is_duplicate:
            continue  # 内容相同，不生成新文件

        # 写入新的内部类文件
        with open(inner_output_path, 'w') as file:
            file.write(new_inner_class_code)

        # 更新主类中对应成员的类型
        for attribute in complexType['attributes']:
            if attribute['type'] == inner_class_name:
                attribute['type'] = new_inner_class_name

        # 保存映射
        inner_class_mapping[inner_class_name] = new_inner_class_name

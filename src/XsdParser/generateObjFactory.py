import os
def generate_object_factory(output_dir, package_name, mappings,objectFactoryTemplate):

    javaCode = objectFactoryTemplate.render(
        packageName=package_name,
        mappings=mappings
    )

    # 设定输出目录，并确保存在
    output_subdir = os.path.join(output_dir, 'orimodel')
    os.makedirs(output_subdir, exist_ok=True)

    # 写入 Java 文件
    outputPath = os.path.join(output_subdir, "ObjectFactory.java")
    with open(outputPath, 'w', encoding='utf-8') as file:
        file.write(javaCode)

    print(f"ObjectFactory.java 已生成在 {outputPath}")

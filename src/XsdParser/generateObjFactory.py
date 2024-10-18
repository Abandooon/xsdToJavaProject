import os
def generate_object_factory(output_dir, package_name, mappings,objectFactoryTemplate):

    javaCode = objectFactoryTemplate.render(
        packageName=package_name,
        mappings=mappings
    )

    # �趨���Ŀ¼����ȷ������
    output_subdir = os.path.join(output_dir, 'orimodel')
    os.makedirs(output_subdir, exist_ok=True)

    # д�� Java �ļ�
    outputPath = os.path.join(output_subdir, "ObjectFactory.java")
    with open(outputPath, 'w', encoding='utf-8') as file:
        file.write(javaCode)

    print(f"ObjectFactory.java �������� {outputPath}")

import os

from src.XsdParser.TypeMapping import mapXsdTypeToJava


def generate_object_factory(output_dir, package_name, mappings,objectFactoryTemplate):
    for map in mappings:
        map['element_type']=mapXsdTypeToJava(map['element_name'], context='mixed')
        if map['complex_type'] == 'LParagraph' and map['element_name'] == 'FT':
            map['element_type'] = map['element_type'].replace("Overview", "")

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



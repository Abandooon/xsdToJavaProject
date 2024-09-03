import os
import re

# 定义输入目录路径
input_directory = r'D:\Users\User\Desktop\wrapper'
output_file = os.path.join(input_directory, 'GetterCollection.java')

# 正则表达式用于匹配 getter 方法
getter_pattern = re.compile(r'public\s+(\w[\w\<\>\[\]]*)\s+get(\w+)\(\)')

# 打开输出文件准备写入
with open(output_file, 'w', encoding='utf-8') as output:
    # 遍历输入目录中的每个Java文件
    for root, _, files in os.walk(input_directory):
        for file_name in files:
            if file_name.endswith('.java'):
                file_path = os.path.join(root, file_name)

                # 打开并读取文件内容
                with open(file_path, 'r', encoding='utf-8') as file:
                    content = file.read()

                # 查找所有getter方法
                getters = getter_pattern.findall(content)

                # 如果找到了getter方法，则写入文件
                if getters:
                    output.write(f"// {file_name}\n")
                    for return_type, method_name in getters:
                        output.write(f"public {return_type} get{method_name}();\n")
                    output.write("\n")

print(f"Getter methods have been extracted and written to {output_file}")

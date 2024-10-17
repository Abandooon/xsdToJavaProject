import os
import re

# 指定输入目录路径为 'output'
input_directory = os.path.join(os.path.dirname(__file__), 'output\modelwrapper')
output_file = os.path.join(input_directory, 'GetterCollection.md')

# 正则表达式用于匹配 getter 方法
getter_pattern = re.compile(r'public\s+(\w[\w\<\>\[\]]*)\s+get(\w+)\(\)')

# 如果输入目录不存在，则创建
os.makedirs(input_directory, exist_ok=True)

try:
    # 打开输出文件，准备写入
    with open(output_file, 'w', encoding='utf-8') as output:
        output.write("# Getter Methods Collection\n\n")  # Markdown 标题

        # 遍历输入目录中的每个Java文件
        for root, _, files in os.walk(input_directory):
            for file_name in files:
                if file_name.endswith('.java'):
                    file_path = os.path.join(root, file_name)

                    # 尝试打开并读取文件内容
                    try:
                        with open(file_path, 'r', encoding='utf-8') as file:
                            content = file.read()

                        # 查找所有 getter 方法
                        getters = getter_pattern.findall(content)

                        # 如果找到了 getter 方法，则写入到输出文件中
                        if getters:
                            output.write(f"## {file_name}\n\n")
                            for return_type, method_name in getters:
                                output.write(f"- `public {return_type} get{method_name}();`\n")
                            output.write("\n")
                    except Exception as e:
                        print(f"读取文件 {file_name} 时出错: {e}")

    print(f"Getter methods have been extracted and written to {output_file}")
except Exception as e:
    print(f"无法写入输出文件: {e}")

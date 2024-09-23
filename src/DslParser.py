import re

def parse_dsl(file_path):
    config = {}
    # 打开文件时显式指定编码为 UTF-8
    with open(file_path, 'r', encoding='utf-8') as file:
        for line in file:
            # 处理字符串类型的DSL项：例如 input_dir = 'input'
            match_str = re.match(r'(\w+)\s*=\s*\'([^\']+)\'', line.strip())
            if match_str:
                key, value = match_str.groups()
                config[key] = value
            else:
                # 处理布尔值和其他非字符串类型：例如 ExtractInnerClass = true
                match_bool = re.match(r'(\w+)\s*=\s*(true|false)', line.strip(), re.IGNORECASE)
                if match_bool:
                    key, value = match_bool.groups()
                    config[key] = value.lower() == 'true'
                # 处理没有单引号的字符串：例如 input_dir = input
                match_no_quotes = re.match(r'(\w+)\s*=\s*([^\s]+)', line.strip())
                if match_no_quotes:
                    key, value = match_no_quotes.groups()
                    config[key] = value
    return config

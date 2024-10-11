import re

def parse_dsl(file_path):
    config = {}
    with open(file_path, 'r', encoding='utf-8') as file:
        for line in file:
            match_str = re.match(r'(\w+)\s*=\s*\'([^\']+)\'', line.strip())
            if match_str:
                key, value = match_str.groups()
                config[key] = value
            else:
                match_bool = re.match(r'(\w+)\s*=\s*(true|false|True|False)', line.strip())
                if match_bool:
                    key, value = match_bool.groups()
                    config[key] = value.lower() == 'true'
                match_no_quotes = re.match(r'(\w+)\s*=\s*([^\s]+)', line.strip())
                if match_no_quotes:
                    key, value = match_no_quotes.groups()
                    config[key] = value

    # 转换ExtractInnerClass和element_wrapper为布尔值
    for key in ['ExtractInnerClass', 'element_wrapper','generate_wrapper']:
        if key in config:
            config[key] = config[key] == 'true'

    return config

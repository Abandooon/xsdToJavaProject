import re

def parse_dsl(file_path):
    config = {}
    with open(file_path, 'r') as file:
        for line in file:
            match = re.match(r'(\w+)\s+\'([^\']+)\'', line.strip())
            if match:
                key, value = match.groups()
                config[key] = value
    return config

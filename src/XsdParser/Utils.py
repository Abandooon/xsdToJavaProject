import re
#处理choice下的group ref，不能直接调用extract_group，否则会无限递归
def to_pascal_case(snake_str):
    if not isinstance(snake_str, str):
        snake_str = str(snake_str)  # 将非字符串类型转换为字符串

    components = re.split('[-_]', snake_str)
    return ''.join(x.capitalize() for x in components)

def to_camel_case(snake_str):
    if not isinstance(snake_str, str):
        print(f"Error: Expected string, got {type(snake_str)} with value {snake_str}")
        return snake_str  # 如果输入不是字符串，直接返回原值或处理为默认值

    components = re.split('[-_]', snake_str)
    return components[0].lower() + ''.join(x.title() for x in components[1:])
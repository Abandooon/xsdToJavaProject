#删除内容相同的文件
import os
import shutil
import hashlib
from itertools import combinations


def get_class_name(file_name):
    """从文件名中提取类名（去掉扩展名后的第一个下划线之前的部分）。"""
    base_name = os.path.splitext(file_name)[0]
    return base_name.split('_')[0]


def hash_file(file_path):
    """计算文件的SHA256哈希值。"""
    hash_sha256 = hashlib.sha256()
    with open(file_path, 'rb') as f:
        for chunk in iter(lambda: f.read(4096), b""):
            hash_sha256.update(chunk)
    return hash_sha256.hexdigest()


def compare_and_remove_duplicates(input_directory, output_directory):
    # 确保输出目录存在
    if not os.path.exists(output_directory):
        os.makedirs(output_directory)

    # 字典，用于按类名前缀存储文件
    files_by_class = {}

    # 复制文件到输出目录并按类名前缀分组
    for file_name in os.listdir(input_directory):
        class_name = get_class_name(file_name)
        src_path = os.path.join(input_directory, file_name)
        dest_path = os.path.join(output_directory, file_name)
        shutil.copy2(src_path, dest_path)

        if class_name not in files_by_class:
            files_by_class[class_name] = []
        files_by_class[class_name].append(dest_path)

    # 在每个类名组内比较文件
    for class_name, file_paths in files_by_class.items():
        print(f"正在比较类名 '{class_name}' 的文件：")
        retained_files = set(file_paths)

        # 生成文件路径的两两组合进行比较
        for file1, file2 in combinations(file_paths, 2):
            if file1 in retained_files and file2 in retained_files:
                hash1 = hash_file(file1)
                hash2 = hash_file(file2)

                if hash1 == hash2:
                    # 文件内容相同，优先删除带下划线的文件
                    base1 = os.path.basename(file1)
                    base2 = os.path.basename(file2)

                    if '_' in base1 and '_' not in base2:
                        print(f"删除文件: {file1}")
                        os.remove(file1)
                        retained_files.remove(file1)
                    elif '_' in base2 and '_' not in base1:
                        print(f"删除文件: {file2}")
                        os.remove(file2)
                        retained_files.remove(file2)
                    else:
                        # 如果两者都或都不带下划线，删除任何一个
                        print(f"删除文件: {file2}")
                        os.remove(file2)
                        retained_files.remove(file2)

        # 打印保留的文件
        for retained_file in retained_files:
            print(f"保留文件: {retained_file}")


# 指定输入输出目录
input_directory = r'C:\Users\54239\Desktop\ori'
output_directory = r'C:\Users\54239\Desktop\target'

# 调用函数进行比较和删除重复文件
compare_and_remove_duplicates(input_directory, output_directory)

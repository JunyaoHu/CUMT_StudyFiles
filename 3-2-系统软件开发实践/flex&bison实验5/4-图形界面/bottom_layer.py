from ctypes import *
import os

OUTPUT_FILE = './output_file'


def python_string_to_c_string(python_string):
    str_tmp = python_string.encode('utf-8')  # 使用utf-8对字符串重新编码
    return c_char_p(str_tmp)  # 转化为标准C的字符串格式


def del_file(path):
    ls = os.listdir(path)
    for i in ls:
        c_path = os.path.join(path, i)
        if os.path.isdir(c_path):
            del_file(c_path)
        else:
            os.remove(c_path)


def file_read(file_name):
    file = open(file=file_name, mode='r')
    s = file.read()
    file.close()
    return s


def cifa_handler(fname):
    del_file(OUTPUT_FILE)
    s = python_string_to_c_string(fname)
    dll = CDLL("./dll/libscanner.dll")
    dll.__cifa(s)
    ret = file_read('./output_file/scanner_output.txt')
    ret_error = file_read('./output_file/scanner_error_output.txt')
    if ret_error == '':
        ret_error = '无词法错误'
    return ret, ret_error66


def yufa_handler(fname):
    del_file(OUTPUT_FILE)
    print(fname)
    s = python_string_to_c_string(fname)
    dll = CDLL("./dll/libparser.dll")
    dll.__yufa(s)

    # 判断yufa_err文件是否存在
    if os.path.exists('./output_file/parser_error_output.txt'):
        ret_err = file_read('./output_file/parser_error_output.txt')
        ret = '出现了语法错误'
    else:
        ret_err = '无语法错误'
        ret = file_read('./output_file/parser_output.txt')
    return ret, ret_err


def middle_handler(fname):
    del_file(OUTPUT_FILE)
    s = python_string_to_c_string(fname)
    dll = CDLL("./dll/libgenerator.dll")
    dll.__asm_x86(s)
    ret = file_read('./output_file/tac.txt')
    print(ret)
    return ret


def asm_handler(fname):
    del_file(OUTPUT_FILE)
    s = python_string_to_c_string(fname)
    dll = CDLL("./dll/libgenerator.dll")
    dll.__asm_x86(s)
    ret = file_read('./output_file/x86.asm')
    print(ret)
    return ret


if __name__ == '__main__':
    cifa_handler('./input_file/test1.txt')
    # yufa_handler('./input_file/test2.txt')
    # middle_handler('./input_file/test3.txt')
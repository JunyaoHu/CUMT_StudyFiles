from PyQt5.QtCore import QObject, pyqtSignal
from bottom_layer import *
from global_var import *


class bianyi(QObject):
    show_content = pyqtSignal(str)
    show_content2 = pyqtSignal(str)
    show_content3 = pyqtSignal(str)

    def __init__(self):
        super(bianyi, self).__init__()
        self.key_model = []

    def parse_key_model(self, key_model):
        print(key_model)
        if key_model == '词法分析':
            print("对源程序进行词法分析：")
            fname = get_file_name()
            res, res_err = cifa_handler(fname)
            self.show_content.emit(res)
            self.show_content2.emit(res_err)
            # print(res)
            return

        if key_model == '语法分析':
            print("对源程序进行语法分析：")
            fname = get_file_name()
            res, res_err = yufa_handler(fname)
            self.show_content.emit(res)
            self.show_content2.emit(res_err)
            # print(res)
            return

        if key_model == '中间代码生成':
            print("对源程序生成中间代码：")
            fname = get_file_name()
            print(fname)
            res = middle_handler(fname)
            self.show_content.emit(res)
            # self.show_content2.emit(res_err)
            # print(res)
            return

        if key_model == '目标代码生成':
            print("对源程序生成目标代码：")
            fname = get_file_name()
            res = asm_handler(fname)
            self.show_content.emit(res)
            # self.show_content2.emit(res_err)
            # print(res)
            return


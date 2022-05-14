from PyQt5.QtWidgets import *
from PyQt5 import QtWidgets
from UI import Ui_MainWindow
import sys

from core import bianyi


class MainForm(QMainWindow, Ui_MainWindow):
    def __init__(self, parent=None, *args, **kwargs):
        super(MainForm, self).__init__(parent=None, *args, **kwargs)
        self.setupUi(self)
        self.core = bianyi()
        self.core.show_content.connect(self.show_content)
        self.core.show_content2.connect(self.show_content2)

# 获取按键
    def get_key(self, title):
        self.core.parse_key_model(title)

    # 显示内容到正确结果区
    def show_content(self, content):
        print(content)
        self.textEdit_2.setText(content)

    # 显示内容到错误结果区
    def show_content2(self, content):
        print(content)
        self.textEdit_3.setText(content)


if __name__ == "__main__":
    app = QtWidgets.QApplication(sys.argv)
    win = MainForm()
    win.show()
    sys.exit(app.exec_())
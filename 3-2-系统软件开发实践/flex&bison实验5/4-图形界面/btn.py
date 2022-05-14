from PyQt5.QtCore import pyqtSignal
from PyQt5.QtWidgets import QPushButton


class bianyi_btn(QPushButton):
    # 定义一个按键按下去的信号
    key_pressed = pyqtSignal(str)

    def __init__(self, parent=None, *args, **kwargs):
        super(bianyi_btn, self).__init__(parent, *args, **kwargs)

    # 重写鼠标按下事件
    def mousePressEvent(self, *args, **kwargs):
        super(bianyi_btn, self).mousePressEvent(*args, **kwargs)
        self.key_pressed.emit(self.text())

# -*- coding:cp936 -*-
'''------------------------------------------------------
【程序设计】
---------------------------------------------------------
题目：使用 turtle 库绘制树图形，效果如样张1所示。
      阅读程序框架，补充横线处代码。
提示：①为树的层次
      ②为前进方向画 length距离
---------------------------------------------------------
注意：部分源程序给出如下。请勿改动其它函数中的任何内容，
      仅在函数的注释标志之间填入所编写的若干语句。
      先将程序段中横线部分去掉，然后填写正确的程序内容
------------------------------------------------------'''

import turtle as t
#**********Program**********

def tree(length,____①____):    
    if level <= 0:
        return
    t.forward(____②____)   
    t.left(45)

#**********  End  **********
    tree(0.6*length,level-1)
    t.right(90)
    tree(0.6*length,level-1)
    t.left(45)
    t.backward(length)
    return
t.pensize(3)
t.color('green')
t.left(90)
tree(100,6)




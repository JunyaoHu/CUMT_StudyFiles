# -*- coding:cp936 -*-
'''------------------------------------------------------
【程序设计】
---------------------------------------------------------
题目：使用 turtle 库绘制钢琴键示意图形，效果如样张1所示。
      阅读程序框架，根据注释补充横线处代码。
---------------------------------------------------------
注意：部分源程序给出如下。请勿改动其它函数中的任何内容，
      仅在函数的注释标志之间填入所编写的若干语句。
      先将程序段中横线部分去掉，然后填写正确的程序内容
------------------------------------------------------'''
#**********Program**********

import turtle as t
t.setup(500,300)
t.penup()
#**********Program**********

(____①____)    #将画笔移动到绝对位置(–180,–50)处
(____②____)    #画笔落下

#**********  End  **********
def Drawrect():
    t.fd(40)
    t.left(90)
    t.fd(120)
    t.left(90)
    t.fd(40)
    t.left(90)
    t.fd(120)
    t.penup()
    t.left(90)
    t.fd(42)
    t.pendown()
for i in range(7):
    Drawrect()
t.penup()
t.goto(-150,0)
t.pendown
def DrawRectBlack():
    t.color('black')
    t.begin_fill()
    t.fd(30)
    t.left(90)
    t.fd(70)
    t.left(90)
    t.fd(30)
    t.left(90)
    t.fd(70)
    t.end_fill()
    t.penup()
    t.left(90)
    t.fd(40)
    t.pendown()
DrawRectBlack()
DrawRectBlack()
t.penup()
t.fd(48)
t.pendown()
DrawRectBlack()
DrawRectBlack()
DrawRectBlack()
t.hideturtle()
t.done()



# -*- coding:cp936 -*-
'''------------------------------------------------------
��������ơ�
---------------------------------------------------------
��Ŀ��ʹ�� turtle ����Ƹ��ټ�ʾ��ͼ�Σ�Ч��������1��ʾ��
      �Ķ������ܣ�����ע�Ͳ�����ߴ����롣
---------------------------------------------------------
ע�⣺����Դ����������¡�����Ķ����������е��κ����ݣ�
      ���ں�����ע�ͱ�־֮����������д��������䡣
      �Ƚ�������к��߲���ȥ����Ȼ����д��ȷ�ĳ�������
------------------------------------------------------'''
#**********Program**********

import turtle as t
t.setup(500,300)
t.penup()
#**********Program**********

(____��____)    #�������ƶ�������λ��(�C180,�C50)��
(____��____)    #��������

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



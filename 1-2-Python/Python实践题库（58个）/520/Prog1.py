# -*- coding:cp936 -*-
'''------------------------------------------------------
【程序设计】
---------------------------------------------------------
题目：编写程序从用户处获得一个不带数字的输入，如果用户
      输入中含数字，则需要用户再次输入，直至满足条件。
      打印输出这个输入。 

输出实例：
 454
 asd
asd
---------------------------------------------------------
注意：部分源程序给出如下。请勿改动其它函数中的任何内容，
      仅在函数的注释标志之间填入所编写的若干语句。
------------------------------------------------------'''

#**********Program**********
while True:
    a = input(' ')
    for i in a:
        if i in '0123456789':
            break
    else:
        print(a)
        break





#**********  End  **********


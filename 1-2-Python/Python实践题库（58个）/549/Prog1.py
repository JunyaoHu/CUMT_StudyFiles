# -*- coding:cp936 -*-
'''------------------------------------------------------
【程序设计】
---------------------------------------------------------

题目：请编写函数fun，实现两个整数的交换。

要求：fun函数中包含输出语句，格式为：a=???,b=???

---------------------------------------------------------
注意：部分源程序给出如下。请勿改动主函数main和其它函数中的
      任何内容，仅在函数的注释标志之间填入所编写的若干语句。
------------------------------------------------------'''
def fun(a, b): 
    #**********Program**********



    #**********  End  **********

def main():
    print("【请连续实现四次两个整数的交换：】")
    for n in range(4):
        print("【第%d次：】" %(n+1))
        a = int(input("【请输入变量a的值: 】"))
        b = int(input("【请输入变量b的值: 】"))
        fun(a, b)

if __name__ == '__main__':
    main()        


# -*- coding:cp936 -*-
'''------------------------------------------------------
【程序设计】
---------------------------------------------------------

题目：请编写fun函数，其功能是打印杨辉三角形。杨辉三角形如图所示：
      1
      1  1
      1  2  1
      1  3  3  1
      1  4  6  4  1
要求：采用列表函数完成

---------------------------------------------------------
注意：部分源程序给出如下。请勿改动主函数main和其它函数中的
      任何内容，仅在函数的注释标志之间填入所编写的若干语句。
------------------------------------------------------'''
def fun(n):
    a = []
    #**********Program**********




    #**********  End  **********
    for i in range(n):
        for j in range(i + 1):
            print(str(a[i][j]),end=' ')
        print()            

def main():
    fun(5)
    
if __name__ == '__main__':
    main()  

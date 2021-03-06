# -*- coding:cp936 -*-
'''------------------------------------------------------
【程序设计】
---------------------------------------------------------

题目：计算从公元1年1月1日到 y年m月d日的天数(含两端)

例如: 从公元1年1月1日到1年2月2日的天数是 31+2=33天

---------------------------------------------------------
注意：部分源程序给出如下。请勿改动主函数main和其它函数中的
      任何内容，仅在函数的注释标志之间填入所编写的若干语句。
------------------------------------------------------'''
def calcDays( y,m,d ):
    #**********Program**********



    #**********  End  **********

def  leapYear( y ):
     if y<1:
         y=1
     if (y % 400)== 0:
         lp = 1
     elif (y % 100)== 0:
         lp=0
     elif (y % 4)==0:
          lp =1
     else:
         lp = 0
     return lp

def  getLastDay( y,m):
     if y<1:
         y=1
     if m<1:
         m=1
     if m>12:
         m=12 
     monthDay=[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,  31]
     r = monthDay[ m-1]
     if m==2:
         r = r + leapYear(y)
     return r

def main():
    print("【请分别三次计算从公元1年1月1日到输入的日期共有多少天：】")
    for n in range(3):
        print("【第%d次：】" %(n+1))
        y = int(input("【请输入年份y：】"))
        m = int(input("【请输入月份m：】"))
        d = int(input("【请输入天数d：】"))
        T = calcDays( y,m,d)
        print( "【从公元1年1月1日到",y,"年",m,"月",d,"日 共】", T, "【天】")   
    
if __name__ == '__main__':
    main()

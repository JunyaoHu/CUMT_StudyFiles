# -*- coding:cp936 -*-
'''------------------------------------------------------
【程序设计】
---------------------------------------------------------
题目：jieba 是一个中文分词库，一些句子可能存在多种分词结果，
      请补充横线处代码，产生字符串 s 可能的所有分词结果列表，
      提示代码如下
---------------------------------------------------------
注意：部分源程序给出如下。请勿改动其它函数中的任何内容，
      仅在函数的注释标志之间填入所编写的若干语句。
      先将程序段中横线部分去掉，然后填写正确的程序内容
------------------------------------------------------'''

#**********Program**********

____①____
s = "世界冠军运动员的乒乓球拍卖完了"
l = jieba.lcut(____②____)

#**********  End  **********
print(l)

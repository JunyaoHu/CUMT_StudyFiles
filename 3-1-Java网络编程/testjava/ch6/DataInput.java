import java.io.*; 
public class DataInput
{public static void main(String[]args)throws Exception 
 { int a; double b,c; String str;
  DataInputStream In=new DataInputStream(System.in);
                                           //建立基于标准输入的过滤流
  str=In.readLine();                    //读入一个字符串
  a=Integer.parseInt(str);           //把字符串转化为整数
  str=In.readLine();                    //读入一个字符串
  b=Double.parseDouble(str);    //把字符串转化为实数
  c=a+b;
  System.out.println(c); 
}}

import java.io.*;
public class Sum
{
	//方法sum(int n)用来实现数n的连加，即即∑n
	public static int sum(int n)
	{
		if(n<1) return 0;
		else return sum(n-1)+n;
	}
	
	//主方法
	public static void main(String args[])
	{
		int result=0;//用来存放计算结果
		String str; //用来存放输入的数字字符串 
		int num=0;//用来存放由输入的字符串转换成的整数值
		System.out.println("Please input the number:");
		try
		{
			DataInputStream in=new DataInputStream(System.in);
			str=in.readLine();   //输入的数字字符串
			num=Integer.parseInt(str); //字符串转换成整数值
		}
		catch(Exception e){}
		result=sum(num); //调用sum()，求1+2+3+...+num
		System.out.println(result);
		}
		}	 
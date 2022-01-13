//import java.io.*;
class ReadStringOrInt{               //从键盘读一个数字串或一个整数
	public static void main(String args[]){
		byte buf[]=new byte[20];  //20个字节的数组用于存字符串，buf为局部变量
		String str;         //str为局部变量,类型为String
		int anInt;         // anInt为局部变量
		try{
			System.in.read(buf);  //从键盘读一个数字串保存于buf中
		str=new String(buf);
			//buf 转换成String对象 str（ASCII字符串转换成Unicode码串）
		anInt=Integer.parseInt(str.trim());	 //数字串转换成整数 anInt
			System.out.println(anInt);		
		}catch(Exception e){System.out.println(e.toString());}         //catch 语句，Exception为异常类
	}
}

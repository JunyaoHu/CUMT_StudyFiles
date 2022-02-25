package com.imooc.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IsrAndOswDemo {
	public static void main(String[] args)throws IOException {
		FileInputStream in = new FileInputStream("e:\\javaio\\imoocutf8.txt");
		InputStreamReader isr = new InputStreamReader(in,"utf-8");//默认项目的编码,操作的时候，要写文件本身的编码格式
	
		FileOutputStream out = new FileOutputStream("e:\\javaio\\imoocutf81.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
		/*int c ;
		while((c = isr.read())!=-1){
			System.out.print((char)c);
		}*/
		char[] buffer = new char[8*1024];
		int c;
		/*批量读取，放入buffer这个字符数组，从第0个位置开始放置，最多放buffer.length个
		  返回的是读到的字符的个数
		*/
		while(( c = isr.read(buffer,0,buffer.length))!=-1){
			String s = new String(buffer,0,c);
			System.out.print(s);
			osw.write(buffer,0,c);
			osw.flush();
		}
		isr.close();
		osw.close();
		
	}

}

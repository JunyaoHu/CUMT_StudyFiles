package com.imooc.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BrAndBwOrPwDemo {
	public static void main(String[] args) throws IOException{
		 //���ļ����ж�д���� 
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("e:\\javaio\\imooc.txt")));
		/*BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream("e:\\javaio\\imooc3.txt")));*/
		PrintWriter pw = new PrintWriter("e:\\javaio\\imooc4.txt");
		//PrintWriter pw1 = new PrintWriter(outputStream,boolean autoFlush);
		String line ;
		while((line = br.readLine())!=null){
			System.out.println(line);//һ�ζ�һ�У�������ʶ����
			/*bw.write(line);
			//����д�����в���
			bw.newLine();//���в���
			bw.flush();*/
			pw.println(line);
			pw.flush();
		}
		br.close();
		//bw.close();
		pw.close();
	}

}

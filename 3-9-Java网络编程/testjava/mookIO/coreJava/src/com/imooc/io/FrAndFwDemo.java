package com.imooc.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FrAndFwDemo {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("e:\\javaio\\imooc.txt");
		FileWriter fw = new FileWriter("e:\\javaio\\imooc2.txt");
		//FileWriter fw = new FileWriter("e:\\javaio\\imooc2.txt",true);
		char[] buffer = new char[2056];
		int c ;
		while((c = fr.read(buffer,0,buffer.length))!=-1){
			fw.write(buffer,0,c);
			fw.flush();
		}
		fr.close();
		fw.close();
	}

}

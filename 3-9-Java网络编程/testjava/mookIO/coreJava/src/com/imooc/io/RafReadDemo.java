package com.imooc.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RafReadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf = new RandomAccessFile("demo/raf.dat", "r");
		raf.seek(2);
		int i = 0;
		int b = raf.read();//读取到一个字节
		System.out.println(raf.getFilePointer());
		i = i | (b << 24 );
		b = raf.read();
		i = i | ( b << 16);
		b = raf.read();
		i = i | (b << 8 );
		b = raf.read();
		i = i | b;
		System.out.println(Integer.toHexString(i));
		raf.seek(2);
		i = raf.readInt();
		System.out.println(Integer.toHexString(i));
		raf.close();
		

	}

}

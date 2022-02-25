package com.imooc.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileSeriaDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File demo = new File("demo1");
		if(!demo.exists())demo.mkdir();
		File file = new File(demo,"raf.dat");
		if(!file.exists())
			file.createNewFile();
		//打开文件，进行随机读写
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		/*序列化*/
		int i = 0x7ffffff;
		raf.write(i >>> 24);
		raf.write(i >>> 16);
		raf.write(i >>> 8);
		raf.write(i >>> 8);
		raf.write(i);
		System.out.println(raf.getFilePointer());
		
		
		/*反序列化*/
		raf.seek(0);
		int b = raf.read();
		i = i | (b << 24);
		b = raf.read();
		i = i | (b << 16);
		b = raf.read();
		i = i | (b << 8);
		b = raf.read();
		i = i | b;
		System.out.println(Integer.toHexString(i));
        raf.close();
	}

}

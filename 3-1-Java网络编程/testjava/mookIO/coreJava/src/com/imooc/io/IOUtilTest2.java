package com.imooc.io;

import java.io.IOException;

public class IOUtilTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			long start = System.currentTimeMillis();
			//����һ����ǰ�ĺ���,���������ʵ������1970��1��1��0ʱ��ĺ�����
		   //IOUtil.printHexByByteArray("f:\\testjava\\ch2\\ImageViewer.java");
		  // IOUtil.printHex("e:\\testjava\\ch2\\ImageViewer.java");
		   
		  //IOUtil.printHex("e:\\testjava\\wangfei.mp3");
		IOUtil.printHexByByteArray("e:\\testjava\\wangfei.mp3");
			System.out.println();
			long end = System.currentTimeMillis();
			System.out.println(end - start);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

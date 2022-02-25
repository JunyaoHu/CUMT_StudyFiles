package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class IOUtilTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			long start = System.currentTimeMillis();
			IOUtil.copyFileByByte(new File("f:\\testjava\\wangfei.mp3"), new File(
					"f:\\testjava\\wangfei1.mp3")); //两万多毫秒
		//IOUtil.copyFileByBuffer(new File("f:\\testjava\\wangfei.mp3"), new File(
			//	"f:\\testjava\\wangfei1.mp3"));//一万多毫秒
			//IOUtil.copyFile(new File("f:\\testjava\\wangfei.mp3"), new File(
				//	"f:\\testjava\\wangfei1.mp3"));//7毫秒
			long end = System.currentTimeMillis();
			System.out.println(end - start );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

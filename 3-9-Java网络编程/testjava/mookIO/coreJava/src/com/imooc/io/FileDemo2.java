package com.imooc.io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("e:\\testjava");
		/*String[] filenames = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				System.out.println(dir+"\\"+name);
				return name.endsWith("java");
			}
		});
		for (String string : filenames) {
			System.out.println(string);
		}*/
		/*File[] files = file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				System.out.println(dir+"\\"+name);
			
				return false;
			}
		});*/
		File[] files = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				System.out.println(pathname);
				
				return false;
			}
		});

	}

}

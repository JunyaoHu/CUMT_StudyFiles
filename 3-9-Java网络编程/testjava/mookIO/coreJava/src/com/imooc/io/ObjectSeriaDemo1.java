package com.imooc.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectSeriaDemo1 {
	public static void main(String[] args) throws Exception{
		String file = "demo/obj.dat";
		//1.对象的序列化
		/*ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file));
		Student stu = new Student("10001", "张三", 20);
		oos.writeObject(stu);
		oos.flush();
		oos.close();*/
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file));
		Student stu = (Student)ois.readObject();
		System.out.println(stu);
		ois.close();
		
	}
	

}

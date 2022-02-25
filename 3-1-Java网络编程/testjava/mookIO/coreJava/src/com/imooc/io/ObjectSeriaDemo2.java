package com.imooc.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectSeriaDemo2 {
	public static void main(String[] args) throws Exception{
		/*ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("demo/obj1.dat"));
		Foo2 foo2 = new Foo2();
		oos.writeObject(foo2);
		oos.flush();
		oos.close();*/
		
		//反序列化是否递归调用父类的构造函数
		/*ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("demo/obj1.dat"));
		Foo2 foo2 = (Foo2)ois.readObject();
		System.out.println(foo2);
		ois.close();*/
		
		
		/*ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("demo/obj1.dat"));
		Bar2 bar2 = new Bar2();
		oos.writeObject(bar2);
		oos.flush();
		oos.close();*/
		
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("demo/obj1.dat"));
		Bar2 bar2 = (Bar2)ois.readObject();
		System.out.println(bar2);
		ois.close();
		
		
		/*
		 * 对子类对象进行反序列化操作时，
		 * 如果其父类没有实现序列化接口
		 * 那么其父类的构造函数会被调用
		 */
	}
}
/*
 *   一个类实现了序列化接口，那么其子类都可以进行序列化
 */
class Foo implements Serializable{	
	public Foo(){
		System.out.println("foo...");
	}
}
class Foo1 extends Foo{
	public Foo1(){
		System.out.println("foo1...");
	}
}
class Foo2 extends Foo1{
	public Foo2(){
		System.out.println("foo2...");
	}
}
class Bar{
	public Bar(){
		System.out.println("bar");
	}
}
class Bar1 extends Bar{
	public Bar1(){
		System.out.println("bar1..");
	}
}
class Bar2 extends Bar1 implements Serializable{
	public Bar2(){
		System.out.println("bar2...");
	}
}
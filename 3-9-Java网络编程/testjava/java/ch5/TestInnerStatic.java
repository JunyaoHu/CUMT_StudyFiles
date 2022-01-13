class TestInnerStatic
{
	public static void main(String[] args)	
	{
		//创建非静态内部类B的对象a_b和ab
		A.B a_b=new A().new B();
		A a=new A();
		A.B ab=a.new B();
		
		//创建静态内部类Inner的对象oi，不需要外部类Outer的对象
		Outer.Inner oi=new Outer.Inner();
		//Outer.Inner oi2=Outer.new Inner();//!!error
		//Outer.Inner oi3=new Outer().new Inner();//!!error
	}
}

class A
{
	private int x;
	void m(){
		new B();
	}
	
	static void sm(){
		//在外部类的静态方法中不能直接创建内部类对象
		//new B();//!!error
	}
	class B
	{
		B(){x=5;}
	}
}

class Outer
{
	static class Inner
	{
	}
}
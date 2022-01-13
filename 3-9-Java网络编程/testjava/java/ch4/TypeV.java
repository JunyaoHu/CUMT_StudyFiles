class A
{
	String s="Class:A";
}

class B extends A
{
	String s="Class:B";
}
class C extends A
{
	String s="Class:C";
}

public class TypeV
{
	public static void main(String args[])
	{
		A a1=new B();
		A a2=new C();
		
		B b1=(B)a1;
		System.out.println(b1.s);
		//a2实际指向的是C类对象，所以不能强制转换成B类对象
		//以下语句会出现运行时错误
		//B b2=(B)a2;
		C c1=(C)a2;
		System.out.println(c1.s);
		A a3=new A();
		//以下语句也会出现运行时错误
	   //B b2=(B)a3;
	   B b2=new B();
	   //子类对象转换为父类对象，显式或隐式的都可以
	   A a4=b2;
	   A a5=(A)b2;
	   System.out.println(a4.s);
	   System.out.println(a5.s);
     }
}
		
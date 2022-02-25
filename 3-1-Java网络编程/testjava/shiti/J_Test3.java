class A
{
	void mb_method()
	{
		System.out.println("A::mb_method");
	}
	
	static void mb_methodStatic()
	{
		System.out.println("A::mb_methodStatic");
	}
}

public class J_Test3 extends A
{
	void mb_method()
	{
		System.out.println("J_Test3::mb_method");
	}
	
	static void mb_methodStatic()
	{
		System.out.println("J_Test3::mb_methodStatic");
	}
	
	public static void main(String args[])
	{
		A a=new J_Test3();
		a.mb_method();
		a.mb_methodStatic();
		
	    J_Test3 b=new J_Test3();
		b.mb_method();
		b.mb_methodStatic();
	}
}
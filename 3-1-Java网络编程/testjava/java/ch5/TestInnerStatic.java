class TestInnerStatic
{
	public static void main(String[] args)	
	{
		//�����Ǿ�̬�ڲ���B�Ķ���a_b��ab
		A.B a_b=new A().new B();
		A a=new A();
		A.B ab=a.new B();
		
		//������̬�ڲ���Inner�Ķ���oi������Ҫ�ⲿ��Outer�Ķ���
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
		//���ⲿ��ľ�̬�����в���ֱ�Ӵ����ڲ������
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
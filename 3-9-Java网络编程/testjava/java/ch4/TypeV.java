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
		//a2ʵ��ָ�����C��������Բ���ǿ��ת����B�����
		//���������������ʱ����
		//B b2=(B)a2;
		C c1=(C)a2;
		System.out.println(c1.s);
		A a3=new A();
		//�������Ҳ���������ʱ����
	   //B b2=(B)a3;
	   B b2=new B();
	   //�������ת��Ϊ���������ʽ����ʽ�Ķ�����
	   A a4=b2;
	   A a5=(A)b2;
	   System.out.println(a4.s);
	   System.out.println(a5.s);
     }
}
		
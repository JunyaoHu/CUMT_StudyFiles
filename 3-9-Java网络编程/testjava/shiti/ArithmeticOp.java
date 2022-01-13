public class ArithmeticOp{
	public static void main(String args[])
	{
		int a,b,c;
		a=b=c=4;
		a=++b-++c;
		System.out.println("a="+a+"b="+b+"c="+c);
		a=b+++c++;
		System.out.println("a="+a+"b="+b+"c="+c);
		a=b--+c--;
		System.out.println("a="+a+"b="+b+"c="+c);
	}
}
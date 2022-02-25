class J_SuperClass
{
	 J_SuperClass()
	 {
	 	System.out.print("J_superClass");
	 }
	 
}

class J_SubClass extends J_SuperClass
{
	J_SubClass()
	{
		System.out.print("J_SubClass");
	}
	
}

public class J_Test1
{
	public static void main(String args[]){
		new J_SubClass();
		new J_SuperClass();
	}
}
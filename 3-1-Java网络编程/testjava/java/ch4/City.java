class Country
{
	String name;
	
	void value()
	{ 
	    name="China";
	 }
}

public class City extends Country
{
	String name;
	
	void value()
	{
		name="Hefei";
		//调用同名的方法
		super.value();
		System.out.println(name);
		System.out.println(this.name);
		//调用同名的成员变量
		System.out.println(super.name);
	}
	
	public static void main(String args[])
    {
  	City c=new City();
  	c.value();
    }
}
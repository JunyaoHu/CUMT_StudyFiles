public class Person
{
	private String name;
	private int age;
	
	Person(String n,int a){
		name=n;
		age=a;
		
    }
    
    //����������sayHello()����
	void sayHello(){
		System.out.println("Hello! My name is "+name);
    }
    
    //��������sayHello()����
    void sayHello(Person another){
    	System.out.println("Hello,"+another.name+"! My name is "+name);
    }
    
    public static void main(String args[])
    {
    	Person per1=new Person("wang li",21);
    	Person per2=new Person("li ming",23);
    	//ͬʱ�������ص�����sayHello��������
    	per1.sayHello();
    	per1.sayHello(per2);
    }
}
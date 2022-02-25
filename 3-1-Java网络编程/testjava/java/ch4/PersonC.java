public class PersonC{
	private String name;
    private int age;
    
    PersonC(){
    	System.out.println("The Person's name is unknow,age is unknow.");
    }
    
    PersonC(String n){
    	name=n;
    	System.out.println("The Person's name is "+name+",age is unknow.");
    }
    PersonC(String n ,int a){
    	name=n;
    	age=a;
    	System.out.println("The Person's name is "+name+",age is "+age);
    }
    
    public static void main(String args[]){
    	PersonC per1=new PersonC();
    	PersonC per2=new PersonC("wang li");
    	PersonC per3=new PersonC("li ming",24);
    }
}
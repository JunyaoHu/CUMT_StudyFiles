interface Runner{ public void run();}
interface Swimmer{ public void swim();}
abstract class Animal {abstract public void eat();}

class Person extends Animal implements Runner,Swimmer {
	public void run() {System.out.println("run");}
	public void swim(){System.out.println("swim");}
	public void eat(){System.out.println("eat");}
}

public class TestInterface{
	public static void main(String args[]){
		TestInterface t=new TestInterface();
		Person p=new Person();
		t.m1(p);
		t.m2(p);
		t.m3(p);
		Runner r=new Person();
	}
	
	public void m1(Runner f){f.run();}
	public void m2(Swimmer s){s.swim();}
	public void m3(Animal a){a.eat();}
}
interface canWalk{
	void walk();
}

interface canSwim{
	void swim();
}

interface canFly{
	void fly();
}

abstract class animial{
	abstract void eat();
}

public class Swan extends animial implements canWalk,canSwim,canFly
{
	public void walk(){
		System.out.println("swan walking!");
	}
	
	public void swim(){
	System.out.println("swan swimming!");
	}
	public void fly(){
	System.out.println("swan flying!");
	}
	void eat(){
		System.out.println("swan eating!");
	}
	
	public static void main(String[] args){
		Swan swan=new Swan();
		swan.walk();
		swan.swim();
		swan.fly();
		swan.eat();
		}
} 	
abstract class Machine{
	abstract void work();
	abstract void stop();
}

class WashingMachine extends Machine{
	void work(){
		System.out.println("begin washing!");
	}
	
	void stop(){
		System.out.println("stop washing!");
	}
}

class PrintingMachine extends Machine{
	void work(){
	System.out.println("begin printing!");
	}
	
	void stop(){
		System.out.println("stop printing!");
	}
}

public class TestA{

    static void test(Machine[] m){
    	for(int i=0;i<m.length;i++){
    		m[i].work();
    		m[i].stop();
    	}
    }
	public static void main(String[] args){
	
		Machine[] machines=new Machine[2];
		machines[0]=new WashingMachine();
		machines[1]=new PrintingMachine();
		test(machines);
}
}		
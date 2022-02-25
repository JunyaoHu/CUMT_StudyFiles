interface  Machine{
 void work();
 void stop();
}

class WashingMachine implements Machine{
	public void work(){
		System.out.println("begin washing!");
	}
	
	public void stop(){
		System.out.println("stop washing!");
	}
}

class PrintingMachine implements Machine{
	public void work(){
	System.out.println("begin printing!");
	}
	
	public void stop(){
		System.out.println("stop printing!");
	}
}

public class TestI{

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
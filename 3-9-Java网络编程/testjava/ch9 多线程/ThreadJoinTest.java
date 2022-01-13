
public class ThreadJoinTest {

	public static void main(String args[]){
		int i=0;
		Hello1 t=new Hello1();
		t.start();
		while(true){
			System.out.println("Good Morning"+i++);
			if(i==2&&t.isAlive()){
				System.out.println("Main waiting for Hello!");
				try{
					t.join();//等待t运行结束
					
				}catch(InterruptedException e){}
			}
			if(i==5) break;
		}
		
	}
}

class Hello1 extends Thread{
	int i;
	public void run(){
		while(true){
			System.out.println("Hello"+i++);
			if(i==5) break;
		}
	}
}

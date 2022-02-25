import java.util.*;

class TimePrinter extends Thread{
	int pauseTime;
	String name;
	public TimePrinter(int x,String n){
		pauseTime=x;
		name=n;
	}
	
	public void run(){
		int i=0;
		while(true){
			try{
				System.out.println(name+":"+new Date(System.currentTimeMillis()));
				i++;
				Thread.sleep(pauseTime);
			}catch(Exception e){
				System.out.println(e);
			}
			if (i==10) break;
		}
	}
	
	public static void main(String args[]){
		TimePrinter tp1=new TimePrinter(1000,"Fast Guy");
		TimePrinter tp2=new TimePrinter(3000,"Slow Guy");
		tp1.start();
		tp2.start();
	}
}
public class TestBreak{
	public static void main(String[] args){
    boolean x=false;
	label1:for(int i=1;i<100;i++){
	switch(i%2){
			case 0:x=true;break;
			case 1:x=false;break;
		   }
		   
		   if(i==50){
		   	//System.out.println("x="+x);
		   	System.out.println(i+","+x);
		   	break label1; 
}}}}
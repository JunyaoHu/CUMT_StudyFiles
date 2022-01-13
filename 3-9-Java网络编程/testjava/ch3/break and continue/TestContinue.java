public class TestContinue{
	public static void main(String[] args){
	label1:		for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			  	  if(j<=i) System.out.print("* ");
				  else continue label1;
				
		}
		System.out.println(" ");
	}
}}
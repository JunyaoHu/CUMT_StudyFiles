public class Circle{
	
	public static void main(String args[]){

    int i,j,flag=0; 
    for(i=1;i>0;) 
         {for(j=1;j<=7-i;j++) 
          System.out.print(" "); 
          for(j=1;j<=i;j++) 
          System.out.print("* "); 
          System.out.print("\n\n"); 
          if((i<8)&&(flag==0)) i=i+2; 
          if(i>8) {flag=1;i=i-2;} 
          if(flag==1) i=i-2; 
         } 
} 
}

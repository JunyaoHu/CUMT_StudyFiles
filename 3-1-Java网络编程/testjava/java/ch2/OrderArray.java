public class OrderArray{
	public static void main(String[] args){
		int intArray[]={20,30,12,45,67,1,39,200,56,89};
		int i,j,temp;
		for(i=0;i<=8;i++)
		{
			for(j=i+1;j<=9;j++)
			{if(intArray[j]>intArray[i])
			  { temp=intArray[i];
			    intArray[i]=intArray[j];
			    intArray[j]=temp;
			   }
			 }
         }
         for(i=0;i<=9;i++)
         System.out.print(intArray[i]+",");
         System.out.println();
      }
  }
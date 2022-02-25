class Test
{
   public static void main(String args[]){
        int i,n;
        n=10;
        if (args.length>=1)
        {
          try{
            n=Integer.parseInt(args[0]);}
         catch(Exception e){}
        }
        System.out.println(n+"is converted into: ");
        for(; n!=0; n=((n-(n%10))/10))
        { for(i=0;i<(n%10);i++)
              System.out.print("*");
          System.out.println();
        }
     
     }

}
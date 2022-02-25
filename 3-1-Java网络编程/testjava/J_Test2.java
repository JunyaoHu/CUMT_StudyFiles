
public class J_Test2
{

  public static void main(String args[])
  {
     try{
          System.out.print('h');
          mb_method1(args);
           System.out.print('x');
        }catch(Exception e){  System.out.print('m');}
       System.out.print('n');
  }

  static void mb_method1(String a[])
    {
       try{
          
          mb_method2(a);
           System.out.print('a'); 
       }
      catch(Exception e){  System.out.print('b');}
  
     finally{System.out.print('c');}
        System.out.print('d');
    }  

    static void mb_method2(String a[])
    {
     System.out.print(a[a.length]);
    }
}
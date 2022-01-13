class J_SuperClass
{
   int m_data;
   J_SuperClass(){
     mb_add(1);
   }

   public void mb_add(int i)
   {
       m_data+=i;
   }

   public void mb_print()
   {
    System.out.println(m_data);
   }
}

class J_SubClass extends J_SuperClass
{
   J_SubClass(){
     mb_add(2);
    }

   public void mb_add(int i)
   {
     m_data+=i*2;
   }

  }

public class J_Test{
     public static void mb_method(J_SuperClass a){
         a.mb_add(6);
         a.mb_print();
     }
     public static void main(String args[])
     {
        mb_method(new J_SubClass());
      }
}
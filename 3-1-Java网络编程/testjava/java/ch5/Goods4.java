public class Goods4 {

     public Contents cont(){
          //������������󣬸�������̳���Contents�ӿ�
          return new Contents(){

               private int i = 11;

               public int value() { 

                    return i; 

               }

          };

     }
     
     public static void main(String[] args)
     {
     	Goods4 g=new Goods4();
     	Contents c=g.cont();
     	}
}


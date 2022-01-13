public class Goods4 {

     public Contents cont(){
          //返回匿名类对象，该匿名类继承了Contents接口
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


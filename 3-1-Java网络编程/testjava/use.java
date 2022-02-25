class sup
{ static int i;
 public void show()
 {System.out.println("in sup object"+(++i));}
}
class child1 extends sup
{
 public void show()
 {System.out.println("child1 :"+(++i));}
}

class child2 extends sup
 {
  public void show()
 {System.out.println("in the child2:"+(++i));}
 }
public class use
{
 public static void main(String arg[])
 {
   sup[] supexam=new sup[2];
   supexam[0]=new child1();
   supexam[1]=new child2();
   supexam[0].show();
   supexam[1].show();
 }
}

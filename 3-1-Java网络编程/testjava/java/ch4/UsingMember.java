class Spot
{
final static Spot origin=new Spot(0,0);//定义一个类常量，origin为坐标原点
int x;
int y;
Spot(int x,int y)
{
this.x=x;
this.y=y;
}
}


public class UsingMember
{
public static void main(String args[])
{
Spot s1=new Spot(10,20);   //构造类Spot的对象s1
System.out.println("类 Spot中的类变量：");
System.out.println("("+Spot.origin.x+","+Spot.origin.y+")"); //访问类变量
System.out.println("类Spot中的对象变量：");
System.out.println("("+s1.x+","+s1.y+")"); 
//访问类对象变量x、y, s１是类对象名
}
}

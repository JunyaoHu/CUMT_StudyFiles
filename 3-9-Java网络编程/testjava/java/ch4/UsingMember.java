class Spot
{
final static Spot origin=new Spot(0,0);//����һ���ೣ����originΪ����ԭ��
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
Spot s1=new Spot(10,20);   //������Spot�Ķ���s1
System.out.println("�� Spot�е��������");
System.out.println("("+Spot.origin.x+","+Spot.origin.y+")"); //���������
System.out.println("��Spot�еĶ��������");
System.out.println("("+s1.x+","+s1.y+")"); 
//������������x��y, s�����������
}
}

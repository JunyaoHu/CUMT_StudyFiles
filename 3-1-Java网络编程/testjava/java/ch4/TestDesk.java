class Desk
{
	private String Color;
	private int Length;
	private int Width;
	private int Height;
	
	Desk()
	{
		Color="";
		Length=0;
		Width=0;
		Height=0;
	}
	
	Desk(String C,int L,int W,int H)
	{
		Color=C;
		Length=L;
		Width=W;
		Height=H;
	}
	
	Desk(int L,int W,int H)
	{
		Color="Red";
		Length=L;
		Width=W;
		Height=H;
	}
	
	String getColor(){return Color;}
	int getLength(){return Length;}
	int getWidth(){return Width;}
	int getHeight(){return Height;}
	
	void setColor(String C){Color=C;}
	void setDimension(int L,int W,int H)
	{
		Length=L;
		Width=W;
		Height=H;
	}
	
	//�������ӵ����
	int Volume()
	{
		return Length*Width*Height;
	}
	
}

public class TestDesk
{
	public static void main(String[] args)
	{
		Desk d1=new Desk(5,6,7);
		Desk d2=new Desk("Black",7,8,9);
		//˽�б����ڴ�û��ֱ�ӵķ���Ȩ
		//System.out.println("����1����ɫ��"+d1.Color);
		System.out.println("����1����ɫ��"+d1.getColor());
		System.out.println("����1�ĳ�����͸ߣ�("+d1.getLength()+","+d1.getWidth()+","+d1.getHeight()+")");
		System.out.println("����1�������"+d1.Volume());
		d1.setColor("Blue");
		System.out.println("����1����ɫ��Ϊ��"+d1.getColor());
	    System.out.println("����2����ɫ��"+d2.getColor());
		System.out.println("����2�ĳ�����͸ߣ�("+d2.getLength()+","+d2.getWidth()+","+d2.getHeight()+")");
		System.out.println("����2�������"+d2.Volume());
	
	}
}
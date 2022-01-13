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
	
	//计算桌子的体积
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
		//私有变量在此没有直接的访问权
		//System.out.println("桌子1的颜色："+d1.Color);
		System.out.println("桌子1的颜色："+d1.getColor());
		System.out.println("桌子1的长、宽和高：("+d1.getLength()+","+d1.getWidth()+","+d1.getHeight()+")");
		System.out.println("桌子1的体积："+d1.Volume());
		d1.setColor("Blue");
		System.out.println("桌子1的颜色改为："+d1.getColor());
	    System.out.println("桌子2的颜色："+d2.getColor());
		System.out.println("桌子2的长、宽和高：("+d2.getLength()+","+d2.getWidth()+","+d2.getHeight()+")");
		System.out.println("桌子2的体积："+d2.Volume());
	
	}
}
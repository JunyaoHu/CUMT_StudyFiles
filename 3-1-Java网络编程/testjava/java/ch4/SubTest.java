class Point
{
	static int a=0;
	int x;
	int y;
	Point(){}
	Point(int x,int y)
    {
    	this.x=x;
    	this.y=y;
    }
    
    public static void draw()
    {
    	System.out.println("Point:a Point.");
    }
    
}

class ColorPoint extends Point
{
	String color;
	public static void draw()
	{
		System.out.println("ColorPoint:a color point.");
	}
}

class MapPoint extends ColorPoint
{
	String name;
	public static void draw()
	{
			System.out.println("MapPoint:a map color point.");
	}
}

public class SubTest
{
	public static void main(String args[])
	{
		Point.draw();
		ColorPoint.draw();
		MapPoint.draw();
		System.out.println(ColorPoint.a);
	}
}
class Rectangle
{
	//定义所有矩形的都具有的属性长和宽
	int width,height;
	//存放矩形面积的属性
	int area;
	//类的构造方法，给对象初始化
	public Rectangle(int w,int h)
	{
		width=w;
		height=h;
		area=getArea(w,h);
    }
    //矩形类的求面积的方法
    public int getArea(int w,int h)
    {
    	
    	return width*height;
    }
    //矩形类用*画矩形的方法
    public void drawRect()
    {
    	for(int i=0;i<height;i++)
    	{ for(int j=0;j<width;j++)
    	    System.out.print("*");
    	    System.out.print("\n");
    	 }
    }
    
    public static void main(String[] args){
    	//利用Rectangle类，定义一个对象r1
    	Rectangle r1=new Rectangle(5,6);
    	System.out.println("The area of r1 is "+r1.area);
    	r1.drawRect();
    	
    }
    
} 
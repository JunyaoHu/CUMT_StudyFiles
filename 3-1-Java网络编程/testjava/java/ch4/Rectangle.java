class Rectangle
{
	//�������о��εĶ����е����Գ��Ϳ�
	int width,height;
	//��ž������������
	int area;
	//��Ĺ��췽�����������ʼ��
	public Rectangle(int w,int h)
	{
		width=w;
		height=h;
		area=getArea(w,h);
    }
    //�������������ķ���
    public int getArea(int w,int h)
    {
    	
    	return width*height;
    }
    //��������*�����εķ���
    public void drawRect()
    {
    	for(int i=0;i<height;i++)
    	{ for(int j=0;j<width;j++)
    	    System.out.print("*");
    	    System.out.print("\n");
    	 }
    }
    
    public static void main(String[] args){
    	//����Rectangle�࣬����һ������r1
    	Rectangle r1=new Rectangle(5,6);
    	System.out.println("The area of r1 is "+r1.area);
    	r1.drawRect();
    	
    }
    
} 
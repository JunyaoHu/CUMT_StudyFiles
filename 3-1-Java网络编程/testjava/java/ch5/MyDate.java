public class MyDate{
	private int day=12;
	private int month=6;
	private int year=1900;
	
	public MyDate(int y,int m,int d){
		year=y;
		month=m;
		day=d;
	}
	void addYear()
	{
		year++;
	}
	public void display(){
		System.out.println(year+"-"+month+"-"+day);
	}
	
	public static void main(String[] args){
		MyDate m,n;
		m=new MyDate(22,9,2003);
		n=m;
		n.addYear();
		m.display();
		n.display();
		System.out.println(m.toString());
		System.out.println(n.toString());		
	}
}

class Point{
	int a,b;
	Point(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Point(int,int):"+a+","+b);
	}
}

class MapPoint extends Point{
	String name;
	MapPoint(int a,int b,String name){
		super(a,b);
		this.name=name;
		System.out.println("MapPoint(int,int,String):"+a+","+b+","+name);
	}
	MapPoint(){
		this(0,0,null);
		System.out.println("MapPoint():"+a+","+b+","+name);
	}
	
}
class ColorPoint extends MapPoint{
	ColorPoint(){
		System.out.println("ColorPoint()"+a+","+b+","+name);
	}
}

class SuperTest{
	public static void main(String[] args){
		System.out.println("new ColorPoint():");
		ColorPoint c=new ColorPoint();
		System.out.println("new MapPoint(int,int,String):");
		MapPoint m=new MapPoint(5,5,"BeiJing");
	}
}
		
		
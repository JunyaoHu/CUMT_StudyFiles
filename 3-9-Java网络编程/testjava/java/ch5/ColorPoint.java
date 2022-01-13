class A{
	A() {System.out.println("A()");}
}
class B{
	B(){System.out.println("B()");}
}

class Point{
	//int x=0;
//	Point(int x){
	//	this.x=x;
//	}
    Point(){System.out.println("Point()");}
}

class MapPoint extends Point{
	MapPoint(){System.out.println("MapPoint()");}
}
class ColorPoint extends MapPoint{
	A a=new A();
	B b=new B();
	ColorPoint(){
		System.out.println("ColorPoint()");
		//System.out.println(a==null);
	}
	public static void main(String[] args){
		new ColorPoint();
	}
}
	
	
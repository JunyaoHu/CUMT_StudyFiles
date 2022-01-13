class Point{
	int a=0,b=0;
	Point(int a,int b){
		this.a=a;
		this.b=b;
		draw();
	}
	void draw(){
		System.out.println("画一个点，横坐标是："+a+",纵坐标是："+b);
	}
}

class MapPoint extends Point{
	String name="未定";
	MapPoint(int a,int b,String name){
		super(a,b);
		this.name=name;
	}
	void draw(){
		System.out.println("画一个地图上的点，横坐标是："
		+a+"，纵坐标是："+b+"，表示的城市为："+name);
	}
}
class PolyConstructors{
	public static void main(String[] args){
		new MapPoint(5,5,"BeiJing");
		}
} 

	
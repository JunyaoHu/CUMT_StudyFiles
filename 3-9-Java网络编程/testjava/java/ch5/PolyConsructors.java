class Point{
	int a=0,b=0;
	Point(int a,int b){
		this.a=a;
		this.b=b;
		draw();
	}
	void draw(){
		System.out.println("��һ���㣬�������ǣ�"+a+",�������ǣ�"+b);
	}
}

class MapPoint extends Point{
	String name="δ��";
	MapPoint(int a,int b,String name){
		super(a,b);
		this.name=name;
	}
	void draw(){
		System.out.println("��һ����ͼ�ϵĵ㣬�������ǣ�"
		+a+"���������ǣ�"+b+"����ʾ�ĳ���Ϊ��"+name);
	}
}
class PolyConstructors{
	public static void main(String[] args){
		new MapPoint(5,5,"BeiJing");
		}
} 

	
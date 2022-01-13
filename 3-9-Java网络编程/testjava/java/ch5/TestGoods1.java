class Goods {
    //在[例5-11]的Goods类中增加一个私有变量valueRate作为货物的价值系数
    private int valueRate=2;
    //定义一个与内部类同名的属性
    private String m="goods";

   class Content implements Contents {
    	//内部类访问外部类定义的价值系数
        private int i = 11*valueRate;
        public int value() { 
            return i; 
        }
        //与外部类的同名属性
        private String m="content";
        //对同名属性的访问
        public void access(String m){
        	System.out.println(m);//访问局部变量m
        	System.out.println(this.m);//内部类对象的属性m
        	System.out.println(Goods.this.m);//外部类对象属性m
        }
    }

    protected class GDestination implements Destination {
        private String label;
        private GDestination(String whereTo) {
            label = whereTo;
        }
        public String readLabel() { 
            return label; 
        }
    }

    public Destination dest(String s) {
        return new GDestination(s);
    }
    public Contents cont() {
        return new Content();
    }
}
public class TestGoods1 {
	public static void main(String[] args){
		Goods g=new Goods();
		Contents c=g.cont();
		Destination d=g.dest("Beijing");
		Goods.Content c1=g.new Content();
		c1.access("testGoods1");
	}
}
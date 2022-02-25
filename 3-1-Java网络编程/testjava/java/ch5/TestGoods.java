interface Contents{
	int value();
}

interface Destination {
	String readLabel();
}
class Goods{
 class Content implements Contents{
		private int i=11;
		public int value(){
			return i;
		}
	}
protected class GDestination implements Destination{
	private String label;
	private GDestination(String whereTo){
		label=whereTo;
	}
	public String readLabel(){
		return label;
	}
}
public Contents cont(){
	return new Content();
}
public Destination dest(String s){
	return new GDestination(s);
}
}

public class TestGoods {
	public static void main(String[] args){
		Goods g=new Goods();
		Contents c=g.cont();
		Destination d=g.dest("Beijing");
		Goods.Content c1=g.new Content();
	}

}
	

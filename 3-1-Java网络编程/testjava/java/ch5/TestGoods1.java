class Goods {
    //��[��5-11]��Goods��������һ��˽�б���valueRate��Ϊ����ļ�ֵϵ��
    private int valueRate=2;
    //����һ�����ڲ���ͬ��������
    private String m="goods";

   class Content implements Contents {
    	//�ڲ�������ⲿ�ඨ��ļ�ֵϵ��
        private int i = 11*valueRate;
        public int value() { 
            return i; 
        }
        //���ⲿ���ͬ������
        private String m="content";
        //��ͬ�����Եķ���
        public void access(String m){
        	System.out.println(m);//���ʾֲ�����m
        	System.out.println(this.m);//�ڲ�����������m
        	System.out.println(Goods.this.m);//�ⲿ���������m
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
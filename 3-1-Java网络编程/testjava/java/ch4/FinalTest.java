public final class FinalTest{
	  public static int totalNumber=0; 
	  public static final int id=5;
	  //public static final int id;     //�Ƿ���һ��Ҫ�ڶ���ʱ����ֵ
	  public final int total;
	  
	  public FinalTest(int x){
	  	totalNumber++; 
	    total=x; //ͨ�����캯�������󼶵ĳ�������ֵ
	    //id=2;   //�Ƿ� ���ܵڶ��θ���ֵ
	  }
	  
	  public static void main(String[] args){
	  	FinalTest t1=new FinalTest(5);
	  	System.out.println("t1.id�� "+t1.id);
	  	System.out.println("t1.total�� "+t1.total);
	  	System.out.println("FinalTest.totalNumber�� "+FinalTest.totalNumber);

	  	FinalTest t2=new FinalTest(8);
	  	System.out.println("t2.id�� "+t2.id);
	  	System.out.println("t2total�� "+t2.total);
        System.out.println("FinalTest.totalNumber�� "+t2.totalNumber);
	  	//t2.totalN=5;  //һ�����˳�ֵ�Ͳ��ܸı�
	  	
	  	final int i=10;
	  	final int j;
	  	j=20;
	  	//j=30;   //�Ƿ� 
	  }
}

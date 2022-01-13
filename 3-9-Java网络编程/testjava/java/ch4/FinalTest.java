public final class FinalTest{
	  public static int totalNumber=0; 
	  public static final int id=5;
	  //public static final int id;     //非法，一定要在定义时赋初值
	  public final int total;
	  
	  public FinalTest(int x){
	  	totalNumber++; 
	    total=x; //通过构造函数给对象级的常量赋初值
	    //id=2;   //非法 不能第二次赋初值
	  }
	  
	  public static void main(String[] args){
	  	FinalTest t1=new FinalTest(5);
	  	System.out.println("t1.id： "+t1.id);
	  	System.out.println("t1.total： "+t1.total);
	  	System.out.println("FinalTest.totalNumber： "+FinalTest.totalNumber);

	  	FinalTest t2=new FinalTest(8);
	  	System.out.println("t2.id： "+t2.id);
	  	System.out.println("t2total： "+t2.total);
        System.out.println("FinalTest.totalNumber： "+t2.totalNumber);
	  	//t2.totalN=5;  //一旦赋了初值就不能改变
	  	
	  	final int i=10;
	  	final int j;
	  	j=20;
	  	//j=30;   //非法 
	  }
}

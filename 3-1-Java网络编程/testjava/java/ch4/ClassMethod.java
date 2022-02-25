
public class ClassMethod
{
	public static void main(String args[])
	{
		//调用类方法可以使用带类名的限定名
		System.out.println(FamilyMember.getSurname());
		FamilyMember a=new FamilyMember("老三");
		//调用类方法也可以通过类的实例来调用
		System.out.println(a.getSurname());
		System.out.println(a.whatIsYourName());
		
		//类变量是共有的，即使在创建实例之后改变了类变量，实例也会知道
		FamilyMember.changeSurname("刘");
		System.out.println(a.whatIsYourName());
		
	}
}

class FamilyMember
{
   //类变量surname用来表示家族成员的姓
   static private String surname="李";
   //对象变量givenname用来表示家族成员的名
   private String givenname;
   //类方法getSurname()用来获得变量surname的值
   static String getSurname()
   {
   	return surname;
   }
   //类方法changeSurname用来改变静态变量姓
   static void changeSurname(String surname){
   	//此处不能使用下面的语句
   	//this.surname=surname;
   	//只能使用类名的限定名
   	FamilyMember.surname=surname;
   }
   
   //不带参数的构造方法往往是需要的
     FamilyMember(){
   	
   	//对于对象变量，可以使用this关键字
   	givenname="小刚";
   }
   
   FamilyMember(String givenname){
   	//
   	this.givenname=givenname;
   }
   
   public String whatIsYourName(){
   	//在类中也可以使用简单名称来引用变量
   	return (surname+givenname);
   	
   }
}
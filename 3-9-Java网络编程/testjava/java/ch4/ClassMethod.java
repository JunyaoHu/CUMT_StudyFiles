
public class ClassMethod
{
	public static void main(String args[])
	{
		//�����෽������ʹ�ô��������޶���
		System.out.println(FamilyMember.getSurname());
		FamilyMember a=new FamilyMember("����");
		//�����෽��Ҳ����ͨ�����ʵ��������
		System.out.println(a.getSurname());
		System.out.println(a.whatIsYourName());
		
		//������ǹ��еģ���ʹ�ڴ���ʵ��֮��ı����������ʵ��Ҳ��֪��
		FamilyMember.changeSurname("��");
		System.out.println(a.whatIsYourName());
		
	}
}

class FamilyMember
{
   //�����surname������ʾ�����Ա����
   static private String surname="��";
   //�������givenname������ʾ�����Ա����
   private String givenname;
   //�෽��getSurname()������ñ���surname��ֵ
   static String getSurname()
   {
   	return surname;
   }
   //�෽��changeSurname�����ı侲̬������
   static void changeSurname(String surname){
   	//�˴�����ʹ����������
   	//this.surname=surname;
   	//ֻ��ʹ���������޶���
   	FamilyMember.surname=surname;
   }
   
   //���������Ĺ��췽����������Ҫ��
     FamilyMember(){
   	
   	//���ڶ������������ʹ��this�ؼ���
   	givenname="С��";
   }
   
   FamilyMember(String givenname){
   	//
   	this.givenname=givenname;
   }
   
   public String whatIsYourName(){
   	//������Ҳ����ʹ�ü����������ñ���
   	return (surname+givenname);
   	
   }
}
//import java.io.*;
class ReadStringOrInt{               //�Ӽ��̶�һ�����ִ���һ������
	public static void main(String args[]){
		byte buf[]=new byte[20];  //20���ֽڵ��������ڴ��ַ�����bufΪ�ֲ�����
		String str;         //strΪ�ֲ�����,����ΪString
		int anInt;         // anIntΪ�ֲ�����
		try{
			System.in.read(buf);  //�Ӽ��̶�һ�����ִ�������buf��
		str=new String(buf);
			//buf ת����String���� str��ASCII�ַ���ת����Unicode�봮��
		anInt=Integer.parseInt(str.trim());	 //���ִ�ת�������� anInt
			System.out.println(anInt);		
		}catch(Exception e){System.out.println(e.toString());}         //catch ��䣬ExceptionΪ�쳣��
	}
}

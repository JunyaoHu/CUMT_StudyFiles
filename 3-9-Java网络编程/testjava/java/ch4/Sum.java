import java.io.*;
public class Sum
{
	//����sum(int n)����ʵ����n�����ӣ�������n
	public static int sum(int n)
	{
		if(n<1) return 0;
		else return sum(n-1)+n;
	}
	
	//������
	public static void main(String args[])
	{
		int result=0;//������ż�����
		String str; //�����������������ַ��� 
		int num=0;//���������������ַ���ת���ɵ�����ֵ
		System.out.println("Please input the number:");
		try
		{
			DataInputStream in=new DataInputStream(System.in);
			str=in.readLine();   //����������ַ���
			num=Integer.parseInt(str); //�ַ���ת��������ֵ
		}
		catch(Exception e){}
		result=sum(num); //����sum()����1+2+3+...+num
		System.out.println(result);
		}
		}	 
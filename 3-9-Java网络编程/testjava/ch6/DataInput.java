import java.io.*; 
public class DataInput
{public static void main(String[]args)throws Exception 
 { int a; double b,c; String str;
  DataInputStream In=new DataInputStream(System.in);
                                           //�������ڱ�׼����Ĺ�����
  str=In.readLine();                    //����һ���ַ���
  a=Integer.parseInt(str);           //���ַ���ת��Ϊ����
  str=In.readLine();                    //����һ���ַ���
  b=Double.parseDouble(str);    //���ַ���ת��Ϊʵ��
  c=a+b;
  System.out.println(c); 
}}

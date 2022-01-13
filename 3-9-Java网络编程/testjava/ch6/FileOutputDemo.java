
import java.io.*;

class FileOutputDemo{
  static FileOutputStream fos;
  //���ֺ͵绰���Ϊ81���ֽ�
  public static final int lineLength=81;
  public static void main(String args[])throws IOException{
    byte[] phone=new byte[lineLength];
    byte[] name=new byte[lineLength];
    int i;
	//���е����ֺͺ��붼���뵽phone.txt�ļ���
    fos=new FileOutputStream("phone.txt");
	//ѭ�������û������룬
    while(true){
      System.err.println("Enter a name(enter 'done' to quit)");
	  //��ȡ���������
      readLine(name);
	  //������Ϊ��done������ֹͣѭ��
      if ("done".equalsIgnoreCase(new String(name,0,4))){
        break;
      }
	  //��ʾ����绰����
      System.err.println("Enter the phone number");
	  //��ȡ����
      readLine(phone);
	  //�����������д���ļ���
      for (i=0;phone[i]!=0;i++){
        fos.write(phone[i]);
      }
      fos.write(',');
      for (i=0;name[i]!=0;i++){
        fos.write(name[i]);
      }
      fos.write('\n');
   }
   fos.close();

  }

  private static void readLine(byte line[])throws IOException{
    int i=0,b=0;
    while((i<(lineLength-1))&&((b=System.in.read())!='\n')){
      line[i++]=(byte)b;
    }
    line[i]=(byte)(0);
  }
}

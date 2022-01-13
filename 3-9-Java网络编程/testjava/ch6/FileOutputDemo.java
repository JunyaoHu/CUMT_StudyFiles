
import java.io.*;

class FileOutputDemo{
  static FileOutputStream fos;
  //名字和电话最长都为81个字节
  public static final int lineLength=81;
  public static void main(String args[])throws IOException{
    byte[] phone=new byte[lineLength];
    byte[] name=new byte[lineLength];
    int i;
	//所有的名字和号码都输入到phone.txt文件中
    fos=new FileOutputStream("phone.txt");
	//循环接受用户的输入，
    while(true){
      System.err.println("Enter a name(enter 'done' to quit)");
	  //读取输入的名字
      readLine(name);
	  //若输入为“done”，则停止循环
      if ("done".equalsIgnoreCase(new String(name,0,4))){
        break;
      }
	  //提示输入电话号码
      System.err.println("Enter the phone number");
	  //读取号码
      readLine(phone);
	  //将号码和名字写入文件中
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

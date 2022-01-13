import java.io.*;
import java.util.Hashtable;
public class ObjectIOClass {
 public static void main(String args[]) throws Exception
 {
  Hashtable  ht=new Hashtable(); //����һ��Hashtable����
  DataInputStream dis=new DataInputStream(System.in); 
          //����DataInputStream���󣬲������׼����������� 
  String st_no=dis.readLine();//�ӱ�׼�����һ�д���st_no
  String st_rec=dis.readLine();//�ӱ�׼�����һ�д���st_rec
  ht.put(st_no,st_rec);
            //st_no���ؼ���,st_recΪHashtable����Ķ���,����ht
  System.out.println(ht);
  String st_no1=dis.readLine();//�ӱ�׼�����һ�д���st_no1
  if (ht.containsKey(st_no1))  
                  //��Hashtable�������йؼ���st_no1,�����Ӧ�Ķ���
  System.out.println(ht.get(st_no1));
  else System.out.println("error");
  ObjectReadWrite my_object=new ObjectReadWrite();  
                                          //�����ļ�����
  my_object.write(ht);     //��ht������������Դ
  my_object.read();         //������Դ�������
  }
}

 class  ObjectReadWrite  {
  static File object_file=new File("d:\\","data.txt");
   public static void write(Hashtable ht ) { 
      try{    //��FileOutputStream����,�����ļ�����object_file���� 
        FileOutputStream  fos=new FileOutputStream(object_file);
          //����ObjectOutputStream����,�����ļ�����fos����
 
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(ht);  
          //Hashtable��������д������ļ���
          //o1.flush(); 
        oos.close(); 
        } 
      catch(Exception e){ };  
    }
 public static void read() {     //�Ӷ��������ļ��ж�����
    try 
   {  //��ObjectOutputStream����,�����ļ�����object_file����

    ObjectInputStream ois=new ObjectInputStream ( 
                            new FileInputStream(object_file ));
    Hashtable  ht1=(Hashtable)ois.readObject();   
                                                //������Դ�������
    System.out.println(ht1);    //��׼���ht1
    }
   catch(Exception e){ e.printStackTrace(); }
   }
}


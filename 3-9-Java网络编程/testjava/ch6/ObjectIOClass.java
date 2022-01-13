import java.io.*;
import java.util.Hashtable;
public class ObjectIOClass {
 public static void main(String args[]) throws Exception
 {
  Hashtable  ht=new Hashtable(); //建立一个Hashtable对象
  DataInputStream dis=new DataInputStream(System.in); 
          //建立DataInputStream对象，并且与标准输入对象连接 
  String st_no=dis.readLine();//从标准输入读一行存入st_no
  String st_rec=dis.readLine();//从标准输入读一行存入st_rec
  ht.put(st_no,st_rec);
            //st_no作关键字,st_rec为Hashtable保存的对象,存入ht
  System.out.println(ht);
  String st_no1=dis.readLine();//从标准输入读一行存入st_no1
  if (ht.containsKey(st_no1))  
                  //如Hashtable对象中有关键字st_no1,输出对应的对象
  System.out.println(ht.get(st_no1));
  else System.out.println("error");
  ObjectReadWrite my_object=new ObjectReadWrite();  
                                          //建立文件对象
  my_object.write(ht);     //如ht对象输出到输出源
  my_object.read();         //从输入源读入对象
  }
}

 class  ObjectReadWrite  {
  static File object_file=new File("d:\\","data.txt");
   public static void write(Hashtable ht ) { 
      try{    //建FileOutputStream对象,并与文件对象object_file连接 
        FileOutputStream  fos=new FileOutputStream(object_file);
          //建立ObjectOutputStream对象,并与文件对象fos连接
 
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(ht);  
          //Hashtable对象内容写入输出文件中
          //o1.flush(); 
        oos.close(); 
        } 
      catch(Exception e){ };  
    }
 public static void read() {     //从对象输入文件中读对象
    try 
   {  //建ObjectOutputStream对象,并与文件对象object_file连接

    ObjectInputStream ois=new ObjectInputStream ( 
                            new FileInputStream(object_file ));
    Hashtable  ht1=(Hashtable)ois.readObject();   
                                                //从输入源读入对象
    System.out.println(ht1);    //标准输出ht1
    }
   catch(Exception e){ e.printStackTrace(); }
   }
}


import java.io.*; 
import java.net.*;
public class Filereader
{public static void main(String[]args)throws Exception 
 {
  
  File f = new File("d:\\myfile.txt"));
  FileReader f1 = new FileReader(f);
  char a[]=new char[(int)f.length()];
  f1.read(a);   
  System.out.println(a);
  f1.close();
 }
}

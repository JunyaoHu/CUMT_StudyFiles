import java.io.*; 
public class Filewriter
{public static void main(String[]args)throws Exception 
 {File f = new File("d:\\myfile.txt");
  FileWriter f1 = new FileWriter(f);
  f1.write("abcdefghij");   
  f1.write("xyz");   
  f1.close();
 }
}

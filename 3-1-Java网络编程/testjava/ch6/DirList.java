import java.io.*;


class DirFilter implements FilenameFilter 
{                        //DirFilterʵ�������ӿ������ļ�����
 String extn;         //�ļ�����Ҫ���ļ�������extn
 public DirFilter(String extn) //���췽��
  { this.extn=extn;  }
public boolean accept(File dir,String name)
 {boolean isAccept; 
  String f=(new File(dir,name)).getName();   
  if(f.indexOf(extn)==-1)     //�ļ���������extn
    isAccept=false;
  else                              //�ļ�������extn
    isAccept=true;
  return isAccept;
 }
} 

public class DirList  {
 public static void main(String[] args)  {
  try {
   File file=new File(".");            //��ǰ·���ļ�����
   String[] list1=file.list(new DirFilter(".java"));
   for(int i=0;i<list1.length;i++)
   System.out.println(list1[i]);
  }
  catch(Exception e)  {
  System.out.println(e.toString()); }
 }
}

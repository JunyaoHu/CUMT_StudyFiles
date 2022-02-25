import java.io.*;


class DirFilter implements FilenameFilter 
{                        //DirFilter实现上述接口来对文件过滤
 String extn;         //文件过滤要求，文件名包含extn
 public DirFilter(String extn) //构造方法
  { this.extn=extn;  }
public boolean accept(File dir,String name)
 {boolean isAccept; 
  String f=(new File(dir,name)).getName();   
  if(f.indexOf(extn)==-1)     //文件名不包含extn
    isAccept=false;
  else                              //文件名包含extn
    isAccept=true;
  return isAccept;
 }
} 

public class DirList  {
 public static void main(String[] args)  {
  try {
   File file=new File(".");            //当前路径文件对象
   String[] list1=file.list(new DirFilter(".java"));
   for(int i=0;i<list1.length;i++)
   System.out.println(list1[i]);
  }
  catch(Exception e)  {
  System.out.println(e.toString()); }
 }
}

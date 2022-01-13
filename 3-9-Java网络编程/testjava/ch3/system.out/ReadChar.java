//import java.io.*;     //利用java输入、输出类
public class ReadChar{
	public static void main(String args[]){
            char ch;
		try{       //try 语句
			//ch=(char)System.in.read(); //读一个字符存ch 中, ch为局部变量
                          
                          //do{ ch=(char)(System.in.read());
			     //System.out.println(ch);  }while(ch!='\n');   //从键盘读入的字符，重新输出到屏幕
		//System.out.println(ch); 

                byte[] a=new byte[12];
                 int x=System.in.read(a);
                  String s=new String(a);
                
                 System.out.println(s);          
                   System.out.println(x);
	  for(byte b:a){
			 System.out.print(Integer.toHexString(b&0xffff)+" ");
		 }
System.out.println();
       byte[] a1=s.getBytes("charset");

               for(byte b:a1){
			 System.out.print(Integer.toHexString(b&0xffff)+" ");
		 }

             }catch(Exception e){}      //catch 语句

     
//System.out.println('\u0061');
//System.out.println("This is a \"dog\" !");
//System.out.println("This is a "+'\u0022'+"dog"+'\u0022');
	}//


}

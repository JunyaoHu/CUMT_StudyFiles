//import java.io.*;     //����java���롢�����
public class ReadChar{
	public static void main(String args[]){
            char ch;
		try{       //try ���
			//ch=(char)System.in.read(); //��һ���ַ���ch ��, chΪ�ֲ�����
                          
                          //do{ ch=(char)(System.in.read());
			     //System.out.println(ch);  }while(ch!='\n');   //�Ӽ��̶�����ַ��������������Ļ
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

             }catch(Exception e){}      //catch ���

     
//System.out.println('\u0061');
//System.out.println("This is a \"dog\" !");
//System.out.println("This is a "+'\u0022'+"dog"+'\u0022');
	}//


}

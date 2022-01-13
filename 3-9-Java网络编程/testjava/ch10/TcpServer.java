import java.io.*;
import java.net.*;
public class TcpServer
{	
        static public void main(String args[]) throws IOException
       {
            ServerSocket svrsoc=null;
            Socket soc=null;
            DataInputStream in=null;
            PrintStream out=null;
            InetAddress clientIP=null;
            String str=null;
            try
            {
                svrsoc=new ServerSocket(8000);  // ����rverSockets���󣬶˿�Ϊ8000
                soc=svrsoc.accept();     //�����ߵȴ�һ�����ӣ��������׽ӿ�soc
                in=new DataInputStream(soc.getInputStream());//�����׽ӿ�soc�Ϲ���//DataInputStream����in
                out=new PrintStream(soc.getOutputStream());//�����׽ӿ�soc�Ϲ���     // PrintStream����out
                clientIP=soc.getInetAddress();       //�õ��˿ͷ�IP��ַ
                System.out.println("Client's IP address:"+clientIP);
                out.println("Welcome!...");
                str=in.readLine();          //��in�϶�һ��
                while(!str.equals("quit"))    //������Ĳ��ǡ�quit��,������
                {
                    System.out.println("Client said:"+str);
                    str=in.readLine();
                }
                System.out.println("Client want to leave.");
            }
            catch(Exception e)
            {
                System.out.println("Error:"+e);
            }
}
}
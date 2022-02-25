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
                svrsoc=new ServerSocket(8000);  // 构造rverSockets对象，端口为8000
                soc=svrsoc.accept();     //服务者等待一个连接，返回新套接口soc
                in=new DataInputStream(soc.getInputStream());//在新套接口soc上构造//DataInputStream对象in
                out=new PrintStream(soc.getOutputStream());//在新套接口soc上构造     // PrintStream对象out
                clientIP=soc.getInetAddress();       //得到顾客方IP地址
                System.out.println("Client's IP address:"+clientIP);
                out.println("Welcome!...");
                str=in.readLine();          //在in上读一行
                while(!str.equals("quit"))    //如读出的不是“quit”,继续读
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
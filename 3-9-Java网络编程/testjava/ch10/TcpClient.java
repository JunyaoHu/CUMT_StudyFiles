import java.net.*;
import java.io.*;
public class TcpClient
{
      static public void main(String args[])  throws IOException
      {
          Socket soc=null;
          BufferedReader in=null;
          PrintWriter out=null;
          String strin=null;
          String strout=null;
          try
          {
              soc=new Socket("localhost",8000);
              System.out.println("Connecting to the Server...");
              in=new BufferedReader(
                    new InputStreamReader(
                     soc.getInputStream()));
              out=new PrintWriter(
                     new BufferedWriter(
                      new OutputStreamWriter(
                        soc.getOutputStream())),true);
              strin=in.readLine();
              System.out.println("Server said:"+strin);
              byte bmsg[] = new byte[20];
              System.in.read(bmsg);
              String msg=new String(bmsg);
              msg=msg.trim();
               out.println(msg);
              while(!msg.equals("quit"))
              {
                 
                  System.in.read(bmsg);
                  msg=new String(bmsg);

                  msg=msg.trim();
                  out.println(msg);
                 // System.out.println(msg);
              }
             //out.println(strout);
          }
         catch (Exception e) 
          { System.out.println("Error: "+e);
          }
         finally
          {
            in.close();
            out.close();
            soc.close();
            System.exit(0);
          }
    }
}                         

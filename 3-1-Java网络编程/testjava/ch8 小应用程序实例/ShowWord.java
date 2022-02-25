//在Applet动态显示文字

import java.applet.*;
import java.awt.*;

public class ShowWord extends Applet implements Runnable{
   String Str="Welcome to our java world";
   int i=0;
   public void run(){
      i++;
      i=i%Str.length()+1;
      repaint();
      try{
         Thread.sleep(500);
      }catch(Exception e){System.err.println("Error:"+e);}
   }
   public void paint(Graphics g){
      g.setColor(Color.red);
      g.drawChars(Str.toCharArray(),0,i,10,50);
      run();
   }
}
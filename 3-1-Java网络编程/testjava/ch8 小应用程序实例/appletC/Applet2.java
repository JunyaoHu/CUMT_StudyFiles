import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class Applet2 extends Applet
{ 
public void init()
{
this.setBackground(Color.green);
}
public void paint(Graphics g){
g.drawString("这是被改变的部分！",10,10);
}
public String[][] getParameterInfo()
{
      return null;
}
}

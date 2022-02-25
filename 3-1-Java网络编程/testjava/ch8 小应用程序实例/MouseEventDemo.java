//Applet中的鼠标事件

import java.awt.*;
import java.applet.*;

public class MouseEventDemo extends Applet{
   String MouseDownEvent = null;
   String MouseUpEvent = null;
   String MouseDragEvent = null;

   public boolean mouseUp(Event event,int x,int y){
      MouseUpEvent = "mouseUp:"+x+","+y;
      repaint();
      return true;
   }
   public boolean mouseDown(Event event,int x,int y){
      MouseDownEvent = "mouseDown:"+x+","+y;
      repaint();
      return true;
   }
   public boolean mouseDrag(Event event,int x,int y){
      MouseDragEvent = "mouseDrag:"+x+","+y;
      repaint();
      return true;
   }
   public void paint(Graphics g){
      if(MouseDragEvent!=null)
         g.drawString(MouseDragEvent,5,15);
      if(MouseUpEvent!=null)
         g.drawString(MouseUpEvent,5,45);
      if(MouseDownEvent!=null)
         g.drawString(MouseDownEvent,5,75);
   }










}
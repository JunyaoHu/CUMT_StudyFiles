//¼üÅÌÊÂ¼þ
import java.awt.*;
import java.applet.*;

public class KeyEventDemo extends Applet{
   String KeyDownEvent = null;
   String KeyUpEvent = null;
   public boolean keyUp(Event event,int letter){
      if(letter==27)
         KeyUpEvent = "Ese key released";
      else 
         KeyUpEvent = "KeyUp:"+(char)letter;
      repaint();
      return(true);
   }
   public boolean keyDown(Event event,int letter){
      if(letter==27)
         KeyDownEvent = "Esc key pressed";
      else
         KeyDownEvent = "KeyDown:"+(char)letter;
      repaint();
      return(true);
   }
   public void paint(Graphics g){
      if(KeyUpEvent!=null)
         g.drawString(KeyUpEvent,5,45);
      if(KeyDownEvent!=null)
         g.drawString(KeyDownEvent,5,75); 
   }
}
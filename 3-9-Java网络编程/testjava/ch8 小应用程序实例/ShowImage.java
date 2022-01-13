//ÏÔÊ¾Í¼ÏñÊ¾Àı1
import java.awt.*;
import java.applet.*;

public class ShowImage extends Applet{
   Image picture;
   public void init(){
      picture = getImage(getCodeBase(),"./image/girl.jpg");
   }
   public void paint(Graphics g){
      g.drawImage(picture,10,10,this);
   }
}
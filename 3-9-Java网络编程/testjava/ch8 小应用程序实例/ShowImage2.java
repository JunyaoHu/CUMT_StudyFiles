//使用双缓冲图像技术
import java.awt.*;
import java.applet.*;

public class ShowImage2 extends Applet{
   Image picture;
   boolean imageLoaded = false;
   public void init(){
      picture = getImage(getCodeBase(),"./image/girl.jpg");
      Image offScreenImage = createImage(size().width,size().height);
      Graphics offScreenGC = offScreenImage.getGraphics();
      offScreenGC.drawImage(picture,10,10,this);
   }   
   public void paint(Graphics g){
      if(imageLoaded){
         g.drawImage(picture,10,10,null);
         showStatus("Done");
      }
      else showStatus("Loading image");
   }
   public boolean imageUpdate(Image img,int infoflags,int x,int y,int w,int h){
      if(infoflags==ALLBITS){
         imageLoaded=true;
         repaint();
         return false;
      }
      else return true;
   }
}
//使用MediaTracker类等待图像完全加载后显示
import java.awt.*;
import java.awt.image.*;
import java.applet.*;

public class ShowImage3 extends Applet{
   Image picture;
   public void init(){
      picture = getImage(getCodeBase(),"./image/girl.jpg");
      MediaTracker mt = new MediaTracker(this);
      mt.addImage(picture,0);
      try{
         mt.waitForID(0);
      }catch(InterruptedException e){e.printStackTrace();}
      System.out.println("image width="+picture.getWidth(this));
      System.out.println("image height="+picture.getHeight(this));
   }
   public void paint(Graphics g){
      g.drawImage(picture,10,10,this);
   }
}
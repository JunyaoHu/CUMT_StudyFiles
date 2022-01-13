//装入一个名为Sample.Au的声音文件并播放
import java.awt.*;
import java.applet.*;
public class SoundDemo extends Applet
{
   AudioClip audioClip;
   public void init(){
    audioClip=
          getAudioClip(getCodeBase(),"./image/001.au"); //创建AudioClip对象
      }
    public void paint(Graphics g){
       
          //并用getAudioClip方法将其初始化。
          g.drawString("Sound Demo! ",5,15);
          //audioClip.play();   //使用AudioClip类的play方法播放一次
         // audioClip.loop();     //使用AudioClip类的loop方法循环播放
    }

    public void start(){
       audioClip.play();

    }

    public void stop(){
       audioClip.stop();}
}

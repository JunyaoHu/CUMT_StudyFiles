//װ��һ����ΪSample.Au�������ļ�������
import java.awt.*;
import java.applet.*;
public class SoundDemo extends Applet
{
   AudioClip audioClip;
   public void init(){
    audioClip=
          getAudioClip(getCodeBase(),"./image/001.au"); //����AudioClip����
      }
    public void paint(Graphics g){
       
          //����getAudioClip���������ʼ����
          g.drawString("Sound Demo! ",5,15);
          //audioClip.play();   //ʹ��AudioClip���play��������һ��
         // audioClip.loop();     //ʹ��AudioClip���loop����ѭ������
    }

    public void start(){
       audioClip.play();

    }

    public void stop(){
       audioClip.stop();}
}

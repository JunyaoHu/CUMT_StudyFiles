
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet1 extends Applet
{
boolean isStanda1one=false;
Label label2=new Label();      //��ǩ��Ա����
Button button1=new Button();   //��ť��Ա����
AppletContext ac=null;         //AppletContext���Ա�������ö���ӳ��Applet
Applet appletcolor=null;       //AppletContext���Ա����

public void init()             //��ʼ��Applet
{
this.setBackground(new Color(192,192,192));  //���ñ���ɫ
label2.setText("����Applet2����ɫ��");
button1.setLabel ("��ɫ");
button1.addActionListener(new java.awt.event.ActionListener()
{
       public void actionPerformed(ActionEvent e)
       {
          appletcolor.setBackground(Color.red);
       }
  });
this.add(label2);
this.add(button1);
ac=this.getAppletContext();
appletcolor=ac.getApplet("Applet2");
}
public String getAppletInfo()       
{
return "Applet Information";
}
public String[][] getParmeterInfo(){
return null;
}
}

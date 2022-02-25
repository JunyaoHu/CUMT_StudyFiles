
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet1 extends Applet
{
boolean isStanda1one=false;
Label label2=new Label();      //标签成员变量
Button button1=new Button();   //按钮成员变量
AppletContext ac=null;         //AppletContext类成员变量，该对象反映了Applet
Applet appletcolor=null;       //AppletContext类成员变量

public void init()             //初始化Applet
{
this.setBackground(new Color(192,192,192));  //设置背景色
label2.setText("控制Applet2的颜色：");
button1.setLabel ("红色");
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

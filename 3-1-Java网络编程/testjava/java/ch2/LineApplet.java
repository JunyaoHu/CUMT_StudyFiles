import java.awt.Graphics;
import java.awt.Color;

//定义一个Desk类

class Line
{
   
   //成员变量
   public int initialX;
   public int initialY;
   public int terminalX;
   public int terminalY;
   public Color color;
   
   
  


   //成员方法
   void draw(Graphics g){
   	g.setColor(color);
   	g.drawLine(initialX,initialY,terminalX,terminalY);
  
   }
   




   void LineMessage(Graphics g)	
   {
   	g.drawString("起点："+initialX+","+initialY+")",initialX,initialY+20);
   	g.drawString("终点："+terminalX+","+terminalY+")",terminalX,initialY+20);
   }
}


//以小应用程序作为画图界面，创建Line对象
 public class LineApplet extends java.applet.Applet
 {
 	public void paint(Graphics g){
 		Line MyLine=new Line();
 		//给MyLine的实例变量赋值
 		
 		MyLine.initialX=5;
 		MyLine.initialY=5;
 		MyLine.terminalX=200;
 		MyLine.terminalY=5;
 		MyLine.color=Color.red;
 		
 		//调用对象MyLine的方法画线
 		MyLine.draw(g);
 		MyLine.LineMessage(g);
 	}
 }
import java.awt.Graphics;
import java.awt.Color;

//����һ��Desk��

class Line
{
   
   //��Ա����
   public int initialX;
   public int initialY;
   public int terminalX;
   public int terminalY;
   public Color color;
   
   
  


   //��Ա����
   void draw(Graphics g){
   	g.setColor(color);
   	g.drawLine(initialX,initialY,terminalX,terminalY);
  
   }
   




   void LineMessage(Graphics g)	
   {
   	g.drawString("��㣺"+initialX+","+initialY+")",initialX,initialY+20);
   	g.drawString("�յ㣺"+terminalX+","+terminalY+")",terminalX,initialY+20);
   }
}


//��СӦ�ó�����Ϊ��ͼ���棬����Line����
 public class LineApplet extends java.applet.Applet
 {
 	public void paint(Graphics g){
 		Line MyLine=new Line();
 		//��MyLine��ʵ��������ֵ
 		
 		MyLine.initialX=5;
 		MyLine.initialY=5;
 		MyLine.terminalX=200;
 		MyLine.terminalY=5;
 		MyLine.color=Color.red;
 		
 		//���ö���MyLine�ķ�������
 		MyLine.draw(g);
 		MyLine.LineMessage(g);
 	}
 }

import java.awt.Graphics;
import java.awt.Color;


public class LineApplet1 extends java.applet.Applet
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
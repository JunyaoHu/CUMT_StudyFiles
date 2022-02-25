
import java.awt.Graphics;
import java.awt.Color;


public class LineApplet1 extends java.applet.Applet
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
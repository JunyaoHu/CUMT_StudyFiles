import javax.swing.*;

import java.awt.*;

public class ChangeExample extends JFrame{
	static boolean b=true;
	
	public ChangeExample(){
		this.setBounds(100,100, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("一个简单的动画");
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.red);
		if(b)g.drawRect(40,50,100,100);
		else g.drawOval(40,50,150,100);
		b=!b;
	     try{Thread.sleep(1000);} catch(InterruptedException e){}
		repaint();
		
	}
	
	public static void main(String[] args){
		ChangeExample e=new ChangeExample();
		e.setVisible(true);
	}

}

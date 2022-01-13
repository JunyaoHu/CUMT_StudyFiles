package pptExample;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class jiafa4 extends JFrame {
		JTextField jiashu1;
		JTextField jiashu2;
		JTextField he;
		JButton jiafa;
		
		public jiafa4(){
			setLayout(new FlowLayout());
			jiashu1=new JTextField(5);
			jiashu2=new JTextField(5);
			he=new JTextField(5);
			jiafa=new JButton("=");
			add(jiashu1);
			add(jiashu2);
			add(jiafa);
			add(he);
			setLocation(300,300);
			setSize(500,100);
			setTitle("¼Ó·¨Æ÷");	
			jiafa.addActionListener(new MyActionListener());
			
			
		}
		
		
		public static void main(String[] args){
			jiafa4 j=new jiafa4();
			j.setVisible(true);
		}
		
		class MyActionListener implements ActionListener{

			

			public void actionPerformed(ActionEvent e){
				int x=Integer.parseInt(jiashu1.getText());
				int y=Integer.parseInt(jiashu2.getText());
				int z=x+y;
				he.setText(Integer.toString(z));
			}
		}
	}



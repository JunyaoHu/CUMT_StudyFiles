package pptExample;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class jiafa2 extends JFrame implements ActionListener{
		JTextField jiashu1;
		JTextField jiashu2;
		JTextField he;
		JButton jiafa;
		
		public jiafa2(){
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
			jiafa.addActionListener(this);
			
			
		}
		
		
		public void actionPerformed(ActionEvent e){
			int x=Integer.parseInt(jiashu1.getText());
			int y=Integer.parseInt(jiashu2.getText());
			int z=x+y;
			he.setText(Integer.toString(z));
		}
		
		public static void main(String[] args){
			jiafa2 j=new jiafa2();
			j.setVisible(true);
		}
		

	}
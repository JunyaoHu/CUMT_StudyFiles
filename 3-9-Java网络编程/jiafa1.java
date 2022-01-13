package pptExample;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class jiafa1 extends JFrame {
	//const
		JTextField jiashu1;
		JTextField jiashu2;
		JTextField he;
		JButton jiafa;
		
		public jiafa1(){
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
			jiafa.addActionListener(new MyActionListener(jiashu1,jiashu2,he));
			
			
		}
		
		
		public static void main(String[] args){
			jiafa1 j=new jiafa1();
			j.setVisible(true);
		}
		

	}

class MyActionListener implements ActionListener{
		JTextField jia1;
		JTextField jia2;
		JTextField he;
		
		public MyActionListener(JTextField jia1,JTextField jia2,JTextField he){
		this.jia1=jia1;
		this.jia2=jia2;
		this.he=he;
		}
		public void actionPerformed(ActionEvent e){
			int x=Integer.parseInt(jia1.getText());
			int y=Integer.parseInt(jia2.getText());
			int z=x+y;
			he.setText(Integer.toString(z));
		}
	}


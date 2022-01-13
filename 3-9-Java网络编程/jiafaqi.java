import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class jiafaqi extends JFrame {
	JTextField jiashu1;
	JTextField jiashu2;
	JTextField he;
	JButton jiafa;
	/*public void actionPerformed(ActionEvent e){
		int x=Integer.parseInt(jiashu1.getText());
		int y=Integer.parseInt(jiashu2.getText());
		int z=x+y;
		he.setText(Integer.toString(z));
	}*/
	
	public jiafaqi(){
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
		jiafa.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int x=Integer.parseInt(jiashu1.getText());
				int y=Integer.parseInt(jiashu2.getText());
				int z=x+y;
				he.setText(Integer.toString(z));
			}
			
		}
		);
		
	}
	
	
	public static void main(String[] args){
		jiafaqi j=new jiafaqi();
		j.setVisible(true);
	}
	

}

/*class MyActionListener implements ActionListener{
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
}*/

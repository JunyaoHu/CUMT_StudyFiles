import javax.swing.*;


public class SwingExample1 {


	public static void main(String args[]) {
		
		JFrame frame = new JFrame();
		frame.setLayout(null);
		JLabel jLabelWelcome=new JLabel();
		jLabelWelcome.setText("��ӭ������Swing�������磬"+"�⽫������һ��ͼ�ν��潻�����򣡣���");
		jLabelWelcome.setBounds(40,30,450,30);
		frame.add(jLabelWelcome);
		frame.setTitle("��һ��Swing����");
		frame.setBounds(330,250, 500, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
}

}

import javax.swing.*;


public class SwingExample1 {


	public static void main(String args[]) {
		
		JFrame frame = new JFrame();
		frame.setLayout(null);
		JLabel jLabelWelcome=new JLabel();
		jLabelWelcome.setText("欢迎您来到Swing额编程世界，"+"这将是您第一个图形界面交互程序！！！");
		jLabelWelcome.setBounds(40,30,450,30);
		frame.add(jLabelWelcome);
		frame.setTitle("第一个Swing程序");
		frame.setBounds(330,250, 500, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
}

}

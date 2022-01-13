import javax.swing.*;
public class SwingExample extends JFrame{
   private JLabel jLabelWelcome;
	/**
	 * Launch the application
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		SwingExample frame = new SwingExample();
		frame.setVisible(true);

	}

	/**
	 * Create the frame
	 */
	public SwingExample() {
		// 设置窗体的布局管理器为null
		setLayout(null);
		jLabelWelcome=new JLabel();
		jLabelWelcome.setText("欢迎您来到Swing额编程世界，"+"这将是您第一个图形界面交互程序！！！");
		jLabelWelcome.setBounds(40,30,450,30);
		add(jLabelWelcome);
		setTitle("第一个Swing程序");
		setBounds(330, 250, 500, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//
	}
	
	}



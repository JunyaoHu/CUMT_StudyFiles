import javax.swing.*;


public class SwingExample2 {
	public static void main(String[] args)
	{
		SimpleFrame frame=new SimpleFrame();
		
	}

}


class SimpleFrame extends JFrame
{
	private JLabel jLabelWelcome;
	public SimpleFrame() {
		//���ô���Ĳ��ֹ�����Ϊnull
		setLayout(null);
		jLabelWelcome=new JLabel();
		jLabelWelcome.setText("��ӭ������Swing�������磬"+"�⽫������һ��ͼ�ν��潻�����򣡣���");
		jLabelWelcome.setBounds(40,30,450,30);
		add(jLabelWelcome);
		setTitle("��һ��Swing����");
		setBounds(330,250, 500, 150);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		//
	}
}
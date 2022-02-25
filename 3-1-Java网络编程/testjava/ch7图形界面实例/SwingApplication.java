
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingApplication{
	private static String labelPrefix="Number of button clicks:";
	private int numClicks=0;
	
	public Component createComponents(){
		final JLabel label=new JLabel(labelPrefix+"0");
		JButton button=new JButton("I'm a Swing button");
		button.setMnemonic(KeyEvent.VK_L);//设置按钮的热键为"L"
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			numClicks++;
			label.setText(labelPrefix+numClicks);
			}
		});
		label.setLabelFor(button);
		//在顶层容器及其内容之间纺织控件的常用办法是把内容添加到Jpanel上，而JPanel本身没有边框
		JPanel pane=new JPanel();
		pane.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		pane.setLayout(new GridLayout(0,1));//单列多行
		pane.add(button);
		pane.add(label);
		return pane;
	}
	
	public static void main(String[] args){
		try{
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
);//设置窗口风格
		}catch(Exception e){}
		JFrame frame=new JFrame("SwingApplication");
		SwingApplication app=new SwingApplication();
		Component contents=app.createComponents();
		frame.getContentPane().add(contents,BorderLayout.CENTER);
		
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		frame.pack();
		frame.setVisible(true);
	}
}
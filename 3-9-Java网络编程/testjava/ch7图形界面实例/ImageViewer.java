import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.EventQueue;
import javax.swing.*;
import java.io.*;

public class ImageViewer extends JFrame {

	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu Menu = new JMenu();
	private final JMenuItem openItem = new JMenuItem();
	private final JMenuItem exitItem = new JMenuItem();
	private final JLabel label = new JLabel();
	private JFileChooser chooser;
	
	/**
	 * Launch the application
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
			           ImageViewer frame = new ImageViewer();
			            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			           frame.setVisible(true);
				}
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame
	 */
	public ImageViewer() {
		super();
		setBounds(100, 100, 500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			jbInit();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		//
	}
	private void jbInit() throws Exception {
		//getContentPane().setLayout(new BorderLayout());
		System.currentTimeMillis();
		setJMenuBar(menuBar);
		
		menuBar.add(Menu);
		Menu.setText("File");
		
		Menu.add(openItem);
		openItem.addActionListener(new OpenItemActionListener());
		openItem.setText("Open");
		
		Menu.add(exitItem);
		exitItem.addActionListener(new ExitItemActionListener());
		exitItem.setText("Exit");
		
		//getContentPane().add(label);
		add(label);
		//label.setText("New JLabel");
		
		chooser=new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		
		
	}
	
	

	protected void openItem_actionPerformed(ActionEvent e) {
		int result=chooser.showOpenDialog(null);
		
		if(result==JFileChooser.APPROVE_OPTION)
		{
			String name=chooser.getSelectedFile().getPath();
			label.setIcon(new ImageIcon(name));
		}
		}
	protected void exitItem_actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	private class OpenItemActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			openItem_actionPerformed(e);
		}
	}
	private class ExitItemActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			exitItem_actionPerformed(e);
		}
	}
	}



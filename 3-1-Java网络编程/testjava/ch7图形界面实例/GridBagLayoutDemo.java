
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GridBagLayoutDemo  {

	/**
	 * Launch the application
	 * @param args
	 */
	public static void main(String args[]) {
		
			FontFrame frame=new FontFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		
	}

	/**
	 * Create the frame
	 */
	
}



class FontFrame extends JFrame
{
	
	 private static final int DEFAULT_WIDTH=300;
	 private static final int DEFAULT_HEIGHT=200;
	 private JComboBox face;
	 private JComboBox size;
	 private JCheckBox bold;
	 private JCheckBox italic;
	 private JTextArea sample;
	 

	 
	public FontFrame(){
		
		setTitle("gridBagLayoutDemo");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		GridBagLayout layout=new GridBagLayout();
		setLayout(layout);
		
		ActionListener listener=new FontAction();
		
		JLabel faceLabel=new JLabel("Face: ");
		face=new JComboBox(new String[]{"Serif","SansSerif","Monospaced","Dialog","DialogInput"});
		
		JLabel sizeLabel=new JLabel("Size: ");
		size=new JComboBox(new String[] {"8","10","12","15","18","24","36","48"});
		
		size.addActionListener(listener);
		
		bold=new JCheckBox("Bold");
		bold.addActionListener(listener);
		
		italic=new JCheckBox("Italic");
		italic.addActionListener(listener);
		
		sample=new JTextArea();
		sample.setText("The quick brown fox jumps over the lazy dog");
		sample.setEditable(false);
		sample.setLineWrap(true);
		sample.setBorder(BorderFactory.createEtchedBorder());
		
		add(faceLabel,new GridBagConstraints(0,0,1,1,0.0,0.0,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0));
		add(face,new GridBagConstraints(1,0,1,1,0.0,0.0,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0));
		add(sizeLabel,new GridBagConstraints(0,1,1,1,0.0,0.0,GridBagConstraints.EAST,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0));
		add(size,new GridBagConstraints(1,1,1,1,100,0,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0));
		add(bold,new GridBagConstraints(0,2,2,1,100,100,GridBagConstraints.CENTER,GridBagConstraints.CENTER,new Insets(0,0,0,0),0,0));
		add(italic,new GridBagConstraints(0,3,2,1,100,100,GridBagConstraints.CENTER,GridBagConstraints.CENTER,new Insets(0,0,0,0),0,0));
		add(sample,new GridBagConstraints(2,0,1,4,100,100,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
		
	}
	
	
	private class FontAction implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			String fontFace=(String)face.getSelectedItem();
			int fontStyle=(bold.isSelected()?Font.BOLD:0)+(italic.isSelected()?Font.ITALIC:0);
			int fontSize=Integer.parseInt((String)size.getSelectedItem());
			Font font=new Font(fontFace,fontStyle,fontSize);
			sample.setFont(font);
			sample.repaint();
		}
	}
	
}
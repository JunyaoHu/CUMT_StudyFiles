import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JFrameDemo implements ActionListener{
    public JFrameDemo(){        
        JFrame f = new JFrame("JFrameDemo");//创建一个具有标题的JFrame对象
        Container contentPane1 = f.getContentPane();//获得JFrame的容器        
        JButton b = new JButton("Click me to get new Window");        
        b.addActionListener(this);     //为按钮b注册一个监听器   
        contentPane1.add(b);        //将按钮b加入容器中
        f.pack();        
        f.show();        //使JFrame可见
        f.addWindowListener(new WindowAdapter(){            
            public void windowClosing(WindowEvent e) {                    
                System.exit(0);            
            }        
        });    
    }           
    public void actionPerformed(ActionEvent e){        
        JFrame newf = new JFrame();      //创建一个无标题的JFrame
        Container contentPane2 = newf.getContentPane();   
        newf.setSize(200,200);     
        JLabel l = new JLabel("Hello!");   
        contentPane2.add(l); 
        newf.pack(); 
        newf.show();    
    }            
    public static void main(String[] arg) {        
        new JFrameDemo();    
    }
}

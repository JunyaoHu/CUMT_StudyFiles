import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JFrameDemo implements ActionListener{
    public JFrameDemo(){        
        JFrame f = new JFrame("JFrameDemo");//����һ�����б����JFrame����
        Container contentPane1 = f.getContentPane();//���JFrame������        
        JButton b = new JButton("Click me to get new Window");        
        b.addActionListener(this);     //Ϊ��ťbע��һ��������   
        contentPane1.add(b);        //����ťb����������
        f.pack();        
        f.show();        //ʹJFrame�ɼ�
        f.addWindowListener(new WindowAdapter(){            
            public void windowClosing(WindowEvent e) {                    
                System.exit(0);            
            }        
        });    
    }           
    public void actionPerformed(ActionEvent e){        
        JFrame newf = new JFrame();      //����һ���ޱ����JFrame
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

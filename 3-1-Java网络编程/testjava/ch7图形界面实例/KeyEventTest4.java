import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventTest4{

    public static void main(String[] args)
    {
          JFrame f=new JFrame("�����¼�����4")��
          JLabel l=new JLabel();
          f.add(l);
          f.setSize(300,200);
          f.setVisible(true);
          f.addKeyListener(new MyKeyAdapter());
    }
}


 class MyKeyAdapter extends KeyAdapter{
 
         public void keyPressed(KeyEvent e) {//����
           l.setText("key down");
          }
         public void keyReleased(KeyEvent e) {//�ͷ�
           l.setText("key up");
          }
      } 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventTest5{

    public static void main(String[] args)
    {
          JFrame f=new JFrame("�����¼�����5");
          //f.setTitle(("�����¼�����5");
          JLabel l=new JLabel();
          f.add(l);
          f.setSize(300,200);
          f.setVisible(true);
          f.addKeyListener(new MyKeyAdapter(l));
    }
}


 class MyKeyAdapter extends KeyAdapter{
        JLabel l;
          public MyKeyAdapter(JLabel x){
             l=x;
         }
         public void keyPressed(KeyEvent e) {//����
           l.setText("key down");
          }
         public void keyReleased(KeyEvent e) {//�ͷ�
           l.setText("key up");
          }
      } 
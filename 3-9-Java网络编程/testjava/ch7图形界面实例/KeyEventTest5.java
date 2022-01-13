import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventTest5{

    public static void main(String[] args)
    {
          JFrame f=new JFrame("键盘事件处理5");
          //f.setTitle(("键盘事件处理5");
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
         public void keyPressed(KeyEvent e) {//按下
           l.setText("key down");
          }
         public void keyReleased(KeyEvent e) {//释放
           l.setText("key up");
          }
      } 
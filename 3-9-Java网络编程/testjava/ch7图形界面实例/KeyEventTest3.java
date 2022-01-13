
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventTest3{

    public static void main(String[] args)
    {
          JFrame f=new JFrame()£»
          f.setTitle("")
          JLabel l=new JLabel();
          f.add(l);
          f.setSize(300,200);
          f.setVisible(true);
          f.addKeyListener(new KeyAdapter(){
 
          public void keyPressed(KeyEvent e) {//°´ÏÂ
           l.setText("key down");
          }
          public void keyReleased(KeyEvent e) {//ÊÍ·Å
           l.setText("key up");
          }
     }); 
    }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventTest2 extends JFrame{
    JLabel l;

    public KeyEventTest2(){
     l=new JLabel();
     add(l);
     l.setFont(new Font("Serif",Font.ITALIC,50));
     l.setForeground(Color.RED);
     this.setTitle("键盘事件处理1");
     this.setSize(300,200);
     this.setVisible(true);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.addKeyListener(new KeyAdapter(){
 
      public void keyPressed(KeyEvent e) {//按下
           l.setText("key down");
         }
      public void keyReleased(KeyEvent e) {//释放
           l.setText("key up");
      }
     });

    }

      public static void main(String[] args){
            new KeyEventTest1();
          }
  

}
 class MyKeyListener implements{
      public void keyPressed(KeyEvent e) {//按下
           l.setText("key down");
         }
      public void keyReleased(KeyEvent e) {//释放
           l.setText("key up");
      }
   public void keyTyped(KeyEvent e) {
           
      }
}
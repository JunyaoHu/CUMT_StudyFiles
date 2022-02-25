import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyEventTest extends JFrame implements KeyListener{
 JLabel l = new JLabel();
    public KeyEventTest() {
     add(l);
     l.setHorizontalAlignment(SwingConstants.CENTER);//设置标签文字水平对齐方式为居中
     l.setFont(new Font("Serif",Font.ITALIC,50));//设置字体
     l.setForeground(Color.RED);//设置前景色
     this.setTitle("键盘事件处理");
     this.setSize(300,200);
     this.setVisible(true);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗口关闭动作处理
     this.addKeyListener(this);//添加注册键盘事件监听器
    }
 public void keyTyped(KeyEvent e) {//敲击
 
 }
 public void keyPressed(KeyEvent e) {//按下
  l.setText("key down");
 }
 public void keyReleased(KeyEvent e) {//释放
  l.setText(e.getKeyChar()+"key up");
 }
    public static void main(String[] args){
     new KeyEventTest();
    }
    
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyEventTest extends JFrame implements KeyListener{
 JLabel l = new JLabel();
    public KeyEventTest() {
     add(l);
     l.setHorizontalAlignment(SwingConstants.CENTER);//���ñ�ǩ����ˮƽ���뷽ʽΪ����
     l.setFont(new Font("Serif",Font.ITALIC,50));//��������
     l.setForeground(Color.RED);//����ǰ��ɫ
     this.setTitle("�����¼�����");
     this.setSize(300,200);
     this.setVisible(true);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ڹرն�������
     this.addKeyListener(this);//���ע������¼�������
    }
 public void keyTyped(KeyEvent e) {//�û�
 
 }
 public void keyPressed(KeyEvent e) {//����
  l.setText("key down");
 }
 public void keyReleased(KeyEvent e) {//�ͷ�
  l.setText(e.getKeyChar()+"key up");
 }
    public static void main(String[] args){
     new KeyEventTest();
    }
    
}
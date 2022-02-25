
import java.awt.*;
import javax.swing.*;

public class SwingAWT extends JFrame {
      
      private JMenuBar mb=new JMenuBar();
      private JMenu mm=new JMenu("文件");
      private JMenuItem mi1=new JMenuItem("复制");
      private JMenuItem mi2=new JMenuItem("粘贴");
     // private JLabel l=new JLabel();
      private Label l=new Label();

      public static void main(String args[]) {
           SwingAWT frame = new SwingAWT();
      }
public SwingAWT() {
           super();
           setLayout(null);
           mm.add(mi1);
           mm.add(mi2);
           mb.add(mm);
           setJMenuBar(mb);
           l.setText("此程序是用来演示Swing与AWT控件的混用效果的，请读者注意观察！！！");
           l.setBounds(10,10,450,30);
           add(l);
           setBounds(330, 250, 500, 150);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setVisible(true);
       }

}

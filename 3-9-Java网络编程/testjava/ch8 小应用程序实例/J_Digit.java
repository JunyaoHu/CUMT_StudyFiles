// ////////////////////////////////////////////////////////
// 
// J_Digit.java
// 
// Created by Jun-Hai Yong,    on XX xx, xxxx (Date)
// ////////////////////////////////////////////////////////
// Readme:
// Digit Example.
// ////////////////////////////////////////////////////////
// Using this example, please explicitly refer to the book:
//     Jun-Hai Yong. Programming in Java. 
//     Beijing: Tsinghua University Press, 2004.
// ʹ�ñ����ӣ���ע������:
//     Ӻ����. Java �������. ����: �廪��ѧ������, 2004.
// Please note that the author and publisher make no 
// warranty of any kind on the examples provided.
// ////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class J_Digit extends JApplet implements ActionListener
{
    private JTextField m_textField= new JTextField( );

    public void init( )
    { 
        Container container = getContentPane( );
        JButton b;
        String [] s= {BorderLayout.SOUTH, BorderLayout.EAST,
                                 BorderLayout.NORTH, BorderLayout.WEST};
        int i;
        for (i= 0; i<4; i++)
        {
            b= new JButton(""+i);
            container.add(b, s[i]);
            b.addActionListener(this);
        }
        container.add(m_textField, BorderLayout.CENTER);
    } // End of method: init

    public void actionPerformed(ActionEvent e)
    {
        String s= m_textField.getText( )+e.getActionCommand( );
        m_textField.setText(s);
    } // End of method: actionPerformed

} // End of class: J_Digit



import java.awt.*;
import javax.swing.*;

public class J_PrintState extends JApplet
{
    public void init( )
    { 
        System.out.println("init: Applet begins");
    } // End of method: init

    public void start( )
    { 
        System.out.println("start: Enter applet");
    } // End of method: start

    public void paint(Graphics g)
    { 
        System.out.println("paint: Draw applet");
        g.drawString("Applet Demo", 80, 40);
    } // End of method: paint 

    public void stop( )
    { 
        System.out.println("stop: Leave applet");
    } // End of method: stop

    public void destroy( )
    { 
        System.out.println("destroy: Close applet");
    } // End of method: destroy

} // End of class: J_PrintState

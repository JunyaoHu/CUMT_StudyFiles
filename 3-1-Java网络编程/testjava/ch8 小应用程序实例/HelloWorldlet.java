import   java.awt.Graphics;   
  import   java.applet.Applet;   
    
  public   class   HelloWorldlet   extends   Applet   
  {   
      String   strText;   
      int   i_start;   
      int   i_stop;   
      int   i_paint;   
        
      public   void   init()   
      {   
          strText   =   "Hello   Apllet   World!";   
          i_start   =   0;   
          i_stop   =   0;   
          i_paint   =   0;   
      }   
        
      public   void   start()   
      {   
          i_start++;   
      }   
    
      public   void   stop()   
      {   
          i_stop++;   
      }   
    
      public   void   paint(Graphics   g)   
      {   
          i_paint++;   
    
          String   strOut   =   strText;   
          g.drawString(strOut,25,20);   
    
          strOut   =   "The   time(s)   of   start   is(are)   "   +   i_start;   
          g.drawString(strOut,25,35);   
    
          strOut   =   "The   time(s)   of   stop   is(are)   "   +   i_stop;   
          g.drawString(strOut,25,50);   
    
          strOut   =   "The   time(s)   of   paint   is(are)   "   +   i_paint;   
          g.drawString(strOut,25,65);   
      }   
  }   
    

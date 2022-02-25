
public class Goods3{
     private void internalTracking(boolean b) {
          if(b) {
          	//在if语句作用域中定义内部类TrackingSlip
               class TrackingSlip {
                    private String id;
                    TrackingSlip(String s) {
                         id = s;
                    }
                    String getSlip() { return id; }
               }
               TrackingSlip ts = new TrackingSlip("slip");
               String s = ts.getSlip();
          } 
     }

     public void track() { internalTracking(true); }

     public static void main(String[] args) {
          Goods3 g= new Goods3();
          g.track();
     }
}

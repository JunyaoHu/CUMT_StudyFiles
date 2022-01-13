import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import java.awt.GraphicsConfiguration;
import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import javax.vecmath.*;
public class rotationcon3D extends Applet {
  boolean isStandalone = false;
    private SimpleUniverse u = null;

    public BranchGroup createSceneGraph() {  // 定义创建3D场景图方法
	BranchGroup objRoot = new BranchGroup();
	TransformGroup objTrans = new TransformGroup();
	objTrans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
	objRoot.addChild(objTrans);
	Appearance app = new Appearance();
 	Material material = new Material();
  	material.setEmissiveColor(new Color3f(1.0f,0.0f,0.0f));
  	app.setMaterial(material);
	Cone c=new Cone(0.5f,1.0f,1,app);
	objTrans.addChild(c);  // 创建三维立方体
	ColorCube b=new ColorCube(0.3f);
	objTrans.addChild(b);
	Transform3D yAxis = new Transform3D();
	Alpha rotationAlpha = new Alpha(-1, 4000);
	RotationInterpolator rotator =          // 创建旋转变量
	    new RotationInterpolator(rotationAlpha, objTrans, yAxis,0.0f, (float) Math.PI*2.0f);
	BoundingSphere bounds =new BoundingSphere(new Point3d(0.0,0.0,0.0), 100.0);
	rotator.setSchedulingBounds(bounds);
	objRoot.addChild(rotator);
        objRoot.compile();
	return objRoot;
    }

    public rotationcon3D () {
    }

    public void init() {
	setLayout(new BorderLayout());
        GraphicsConfiguration config =SimpleUniverse.getPreferredConfiguration();
	Canvas3D c = new Canvas3D(config);
	add("Center", c);
	BranchGroup scene = createSceneGraph();
	u = new SimpleUniverse(c);
        u.getViewingPlatform().setNominalViewingTransform();
	u.addBranchGraph(scene);
    }

    public void destroy() {
	u.cleanup();
    }
  public static void main(String[] args) {
    rotationcon3D applet = new rotationcon3D ();
    applet.isStandalone = true;
    Frame frame;
    frame = new Frame() {
      protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
          System.exit(0);
        }
      }
      public synchronized void setTitle(String title) {
        super.setTitle(title);
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
      }
    };
    frame.setTitle("3D形体旋转演示");
    frame.add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(300,300);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    frame.setVisible(true);
  }
}
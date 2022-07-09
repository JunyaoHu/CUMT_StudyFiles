/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */
package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;


public class AbstractBinaryTreeTest {static class __CLR4_4_1eaeal43y7qhu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0030\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0052\u0065\u0064\u0042\u006c\u0061\u0063\u006b\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654593441756L,8589935092L,517,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {__CLR4_4_1eaeal43y7qhu.R.globalSliceStart(getClass().getName(),514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pt4bdea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eaeal43y7qhu.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eaeal43y7qhu.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractBinaryTreeTest.test00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pt4bdea() throws Throwable{try{__CLR4_4_1eaeal43y7qhu.R.inc(514);
	      __CLR4_4_1eaeal43y7qhu.R.inc(515);RedBlackTree redBlackTree0 = new RedBlackTree();
	      // Undeclared exception!
	      __CLR4_4_1eaeal43y7qhu.R.inc(516);redBlackTree0.insert((-6));
	  }finally{__CLR4_4_1eaeal43y7qhu.R.flushNeeded();}}

//	@Test(timeout = 4000)
//	  public void test000()  throws Throwable  {
//	      RedBlackTree redBlackTree0 = new RedBlackTree();
//	      Node node0 = redBlackTree0.insert(4832);
//	      Node node1 = redBlackTree0.delete((int) node0.value);
//	      node0.parent = redBlackTree0.root;
//	      redBlackTree0.createNode((-1433), node0, node1, node1);
//	      node1.parent = node0;
//	      redBlackTree0.rotateLeft(redBlackTree0.root);
//	      redBlackTree0.rotateRight(node1);
//	      node1.parent = node0;
//	      // Undeclared exception!
//	      redBlackTree0.contains((-1433));
//	  }

//	  @Test(timeout = 4000)
//	  public void test01()  throws Throwable  {
//	      RedBlackTree redBlackTree0 = new RedBlackTree();
//	      redBlackTree0.printTreePostOrder();
//	      int int0 = 1019;
//	      redBlackTree0.printTreeInOrder();
//	      redBlackTree0.insert(0);
//	      // Undeclared exception!
//	      redBlackTree0.insert((-377));
//	  }
//
//	  @Test(timeout = 4000)
//	  public void test02()  throws Throwable  {
//	      RedBlackTree redBlackTree0 = new RedBlackTree();
//	      assertEquals(0, redBlackTree0.getSize());
//	      assertNotNull(redBlackTree0);
//	      
//	      Node node0 = redBlackTree0.insert(0);
//	      redBlackTree0.createNode(0, node0, node0, node0);
//	      redBlackTree0.getMaximum(node0);
//	      // Undeclared exception!
//	      redBlackTree0.getSuccessor((-567));
//	  }

//	  @Test(timeout = 4000)
//	  public void test03()  throws Throwable  {
//	      RedBlackTree redBlackTree0 = new RedBlackTree();
//	      redBlackTree0.delete(2882);
//	      redBlackTree0.root = null;
//	      Node node0 = redBlackTree0.insert((-584));
//	      // Undeclared exception!
//	      redBlackTree0.getSuccessor(node0);
//	  }
//
//	  @Test(timeout = 4000)
//	  public void test04()  throws Throwable  {
//	      RedBlackTree redBlackTree0 = new RedBlackTree();
//	      redBlackTree0.root = null;
//	      Node node0 = redBlackTree0.insert((-1));
//	      redBlackTree0.search((int) node0.value);
//	      // Undeclared exception!
//	      redBlackTree0.insert((-1));
//	  }
//
//	  @Test(timeout = 4000)
//	  public void test05()  throws Throwable  {
//	      RedBlackTree redBlackTree0 = new RedBlackTree();
//	      RedBlackTree redBlackTree1 = new RedBlackTree();
//	      Node node0 = redBlackTree1.insert((-1));
//	      Node node1 = redBlackTree0.delete(node0);
//	      redBlackTree0.createNode((-1), node1, redBlackTree1.root, (Node) null);
//	      Integer integer0 = new Integer((-746));
//	      RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
//	      Node node2 = new Node(integer0, redBlackTree_RedBlackNode0, redBlackTree0.root, redBlackTree_RedBlackNode0);
//	      node2.parent = null;
//	      redBlackTree_RedBlackNode0.parent = node2;
//	      // Undeclared exception!
//	      try { 
//	        redBlackTree0.delete(node2);
//	        fail("Expecting exception: ClassCastException");
//	      
//	      } catch(ClassCastException e) {
//	         //
//	         // net.mooctest.Node cannot be cast to net.mooctest.RedBlackTree$RedBlackNode
//	         //
//	         verifyException("net.mooctest.RedBlackTree", e);
//	      }
//	  }
}

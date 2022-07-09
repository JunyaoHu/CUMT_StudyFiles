/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class RedBlackTreeTest {static class __CLR4_4_1glgll43y7qnv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0030\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0052\u0065\u0064\u0042\u006c\u0061\u0063\u006b\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654593441756L,8589935092L,675,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test
    public void testInsert() {__CLR4_4_1glgll43y7qnv.R.globalSliceStart(getClass().getName(),597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adr9w2gl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1glgll43y7qnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1glgll43y7qnv.R.globalSliceEnd(getClass().getName(),"net.mooctest.RedBlackTreeTest.testInsert",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adr9w2gl(){try{__CLR4_4_1glgll43y7qnv.R.inc(597);
        __CLR4_4_1glgll43y7qnv.R.inc(598);RedBlackTree tree = new RedBlackTree();
    }finally{__CLR4_4_1glgll43y7qnv.R.flushNeeded();}}
    @Test
    public void test() {__CLR4_4_1glgll43y7qnv.R.globalSliceStart(getClass().getName(),599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3gn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1glgll43y7qnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1glgll43y7qnv.R.globalSliceEnd(getClass().getName(),"net.mooctest.RedBlackTreeTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3gn(){try{__CLR4_4_1glgll43y7qnv.R.inc(599);
        __CLR4_4_1glgll43y7qnv.R.inc(600);RedBlackTree tree = new RedBlackTree();
        __CLR4_4_1glgll43y7qnv.R.inc(601);assertNull(tree.delete(12345));
        __CLR4_4_1glgll43y7qnv.R.inc(602);assertFalse(tree.contains(12345));

        __CLR4_4_1glgll43y7qnv.R.inc(603);Random rand = new Random();
        __CLR4_4_1glgll43y7qnv.R.inc(604);List<Node> nodes = new ArrayList<>();
        __CLR4_4_1glgll43y7qnv.R.inc(605);StringBuilder sb = new StringBuilder();
        __CLR4_4_1glgll43y7qnv.R.inc(606);for (int i = 0; (((i < 1000)&&(__CLR4_4_1glgll43y7qnv.R.iget(607)!=0|true))||(__CLR4_4_1glgll43y7qnv.R.iget(608)==0&false)); i++) {{
            __CLR4_4_1glgll43y7qnv.R.inc(609);nodes.add(tree.insert(i));
            __CLR4_4_1glgll43y7qnv.R.inc(610);sb.append(i);
            __CLR4_4_1glgll43y7qnv.R.inc(611);sb.append(System.lineSeparator());
        }
        }__CLR4_4_1glgll43y7qnv.R.inc(612);assertEquals(255, tree.root.value.intValue());
        __CLR4_4_1glgll43y7qnv.R.inc(613);assertEquals(1000, tree.getSize());
        __CLR4_4_1glgll43y7qnv.R.inc(614);assertEquals(0, tree.getMinimum());
        __CLR4_4_1glgll43y7qnv.R.inc(615);assertEquals(999, tree.getMaximum());

        __CLR4_4_1glgll43y7qnv.R.inc(616);tree.printTreePreOrder();
        __CLR4_4_1glgll43y7qnv.R.inc(617);tree.printTreePostOrder();

        __CLR4_4_1glgll43y7qnv.R.inc(618);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_4_1glgll43y7qnv.R.inc(619);PrintStream ps = new PrintStream(os);
        __CLR4_4_1glgll43y7qnv.R.inc(620);System.setOut(ps);
        __CLR4_4_1glgll43y7qnv.R.inc(621);tree.printTreeInOrder();
        __CLR4_4_1glgll43y7qnv.R.inc(622);assertEquals(sb.toString(), os.toString());

        __CLR4_4_1glgll43y7qnv.R.inc(623);Collections.shuffle(nodes);
        __CLR4_4_1glgll43y7qnv.R.inc(624);for (Node node : nodes) {{
            __CLR4_4_1glgll43y7qnv.R.inc(625);assertEquals(31 + node.value.hashCode(), node.hashCode());
            __CLR4_4_1glgll43y7qnv.R.inc(626);assertTrue(node.equals(node));
            __CLR4_4_1glgll43y7qnv.R.inc(627);assertTrue(tree.contains(node.value));
            __CLR4_4_1glgll43y7qnv.R.inc(628);tree.delete(node.value);
        }
        }__CLR4_4_1glgll43y7qnv.R.inc(629);assertEquals(0, tree.getSize());

        __CLR4_4_1glgll43y7qnv.R.inc(630);nodes.clear();
        __CLR4_4_1glgll43y7qnv.R.inc(631);tree = new RedBlackTree();
        __CLR4_4_1glgll43y7qnv.R.inc(632);for (int i = 1000; (((i >= 1)&&(__CLR4_4_1glgll43y7qnv.R.iget(633)!=0|true))||(__CLR4_4_1glgll43y7qnv.R.iget(634)==0&false)); i--) {{
            __CLR4_4_1glgll43y7qnv.R.inc(635);nodes.add(tree.insert(i));
        }
        }__CLR4_4_1glgll43y7qnv.R.inc(636);assertEquals(745, tree.root.value.intValue());
        __CLR4_4_1glgll43y7qnv.R.inc(637);assertEquals(1000, tree.getSize());
        __CLR4_4_1glgll43y7qnv.R.inc(638);assertEquals(1, tree.getMinimum());
        __CLR4_4_1glgll43y7qnv.R.inc(639);assertEquals(1000, tree.getMaximum());

        __CLR4_4_1glgll43y7qnv.R.inc(640);assertTrue(new Node(0, null, null, null).isLeaf());
        __CLR4_4_1glgll43y7qnv.R.inc(641);assertFalse(new Node(0, null, new Node(0, null, null, null), null).isLeaf());
        __CLR4_4_1glgll43y7qnv.R.inc(642);assertFalse(new Node(0, null, null, new Node(0, null, null, null)).isLeaf());
        __CLR4_4_1glgll43y7qnv.R.inc(643);assertFalse(new Node(0, null, null, null).equals(null));
        __CLR4_4_1glgll43y7qnv.R.inc(644);assertFalse(new Node(0, null, null, null).equals(""));
        __CLR4_4_1glgll43y7qnv.R.inc(645);assertFalse(new Node(null, null, null, null).equals(new Node(233, null, null, null)));
        __CLR4_4_1glgll43y7qnv.R.inc(646);assertTrue(new Node(null, null, null, null).equals(new Node(null, null, null, null)));
        __CLR4_4_1glgll43y7qnv.R.inc(647);assertFalse(new Node(233, null, null, null).equals(new Node(234, null, null, null)));
    }finally{__CLR4_4_1glgll43y7qnv.R.flushNeeded();}}
    
    

//    @Test(timeout = 4000)
//    public void test02()  throws Throwable  {
//        RedBlackTree redBlackTree0 = new RedBlackTree();
//        // Undeclared exception!
//        try { 
//          redBlackTree0.printTree();
//          fail("Expecting exception: NullPointerException");
//        
//        } catch(NullPointerException e) {
//           //
//           // no message in exception (getMessage() returned null)
//           //
//           verifyException("net.mooctest.AbstractBinaryTree", e);
//        }
//    }
//
//    @Test(timeout = 4000)
//    public void test03()  throws Throwable  {
//        RedBlackTree.ColorEnum.values();
//        int int0 = (-1);
//        Integer integer0 = new Integer((-1));
//        RedBlackTree redBlackTree0 = new RedBlackTree();
//        redBlackTree0.printTreePreOrder();
//        Node node0 = redBlackTree0.insert(int0);
//        String string0 = "        ";
//        Integer.getInteger(string0, integer0);
//        node0.right = redBlackTree0.root;
//        RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
//        RedBlackTree.RedBlackNode redBlackTree_RedBlackNode1 = new RedBlackTree.RedBlackNode(node0.value, node0.right, redBlackTree_RedBlackNode0, redBlackTree_RedBlackNode0, ((RedBlackTree.RedBlackNode) node0).color);
//        redBlackTree0.delete((Node) redBlackTree_RedBlackNode1);
//        String string1 = "wUjzI";
//        RedBlackTree.ColorEnum redBlackTree_ColorEnum0 = RedBlackTree.ColorEnum.BLACK;
//        redBlackTree_RedBlackNode0.value = integer0;
//        redBlackTree0.getMinimum((Node) redBlackTree_RedBlackNode1);
//        redBlackTree0.delete((Node) redBlackTree_RedBlackNode1);
//        Node node1 = redBlackTree0.insert((int) node0.right.value);
//        redBlackTree0.rotateLeft(node1);
//        redBlackTree0.getMinimum((Node) redBlackTree_RedBlackNode0);
//        String string2 = " \\";
//        RedBlackTree.ColorEnum.valueOf(string2);
//        RedBlackTree.ColorEnum.valueOf(string1);
//        Node node2 = null;
//        redBlackTree0.rotateLeft(node2);
//    }
//
    @Test(timeout = 4000)
    public void test04()  throws Throwable  {__CLR4_4_1glgll43y7qnv.R.globalSliceStart(getClass().getName(),648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpszh9i0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1glgll43y7qnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1glgll43y7qnv.R.globalSliceEnd(getClass().getName(),"net.mooctest.RedBlackTreeTest.test04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpszh9i0() throws Throwable{try{__CLR4_4_1glgll43y7qnv.R.inc(648);
        __CLR4_4_1glgll43y7qnv.R.inc(649);RedBlackTree redBlackTree0 = new RedBlackTree();
        __CLR4_4_1glgll43y7qnv.R.inc(650);RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
        // Undeclared exception!
        __CLR4_4_1glgll43y7qnv.R.inc(651);try { 
          __CLR4_4_1glgll43y7qnv.R.inc(652);redBlackTree0.rotateRight(redBlackTree_RedBlackNode0);
          __CLR4_4_1glgll43y7qnv.R.inc(653);fail("Expecting exception: NullPointerException");
        
        } catch(NullPointerException e) {
           //
           // no message in exception (getMessage() returned null)
           //
        }
    }finally{__CLR4_4_1glgll43y7qnv.R.flushNeeded();}}
//
    @Test(timeout = 4000)
    public void test05()  throws Throwable  {__CLR4_4_1glgll43y7qnv.R.globalSliceStart(getClass().getName(),654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gysy9qi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1glgll43y7qnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1glgll43y7qnv.R.globalSliceEnd(getClass().getName(),"net.mooctest.RedBlackTreeTest.test05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gysy9qi6() throws Throwable{try{__CLR4_4_1glgll43y7qnv.R.inc(654);
        __CLR4_4_1glgll43y7qnv.R.inc(655);RedBlackTree redBlackTree0 = new RedBlackTree();
        __CLR4_4_1glgll43y7qnv.R.inc(656);RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
        __CLR4_4_1glgll43y7qnv.R.inc(657);Node node0 = redBlackTree0.getSuccessor((Node) redBlackTree_RedBlackNode0);
        __CLR4_4_1glgll43y7qnv.R.inc(658);redBlackTree0.rotateRight(node0);
    }finally{__CLR4_4_1glgll43y7qnv.R.flushNeeded();}}

//    @Test(timeout = 4000)
//    public void test06()  throws Throwable  {
//        RedBlackTree redBlackTree0 = new RedBlackTree();
//        int int0 = 2001;
//        Node node0 = redBlackTree0.insert(int0);
//        node0.right = redBlackTree0.root;
//        Node node1 = redBlackTree0.rotateLeft(node0);
//        node1.left = node0;
//        redBlackTree0.delete(node1);
//        node0.left = redBlackTree0.root;
//        Node node2 = redBlackTree0.getMaximum(node0);
//        int int1 = 0;
//        Integer integer0 = new Integer(int1);
//        node0.left.right = node2;
//        node0.left.value = integer0;
//        redBlackTree0.delete(node0.right);
//        redBlackTree0.getMaximum(node1.left);
//        redBlackTree0.getMinimum(node0);
//        node0.left = node1;
//        node0.right = redBlackTree0.root;
//        String string0 = "----- ";
//        RedBlackTree.ColorEnum.valueOf(string0);
//        redBlackTree0.createNode((int) node0.left.value, node0.left, node0.left, node0);
//        Node node3 = redBlackTree0.insert((int) node1.value);
//        int int2 = 1496;
//        Integer integer1 = new Integer(int2);
//        Node node4 = new Node(integer1, node1.left, node3, node0);
//        redBlackTree0.getMaximum(node4);
//    }
//
    @Test(timeout = 4000)
    public void test07()  throws Throwable  {__CLR4_4_1glgll43y7qnv.R.globalSliceStart(getClass().getName(),659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngsvuoib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1glgll43y7qnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1glgll43y7qnv.R.globalSliceEnd(getClass().getName(),"net.mooctest.RedBlackTreeTest.test07",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngsvuoib() throws Throwable{try{__CLR4_4_1glgll43y7qnv.R.inc(659);
        __CLR4_4_1glgll43y7qnv.R.inc(660);RedBlackTree redBlackTree0 = new RedBlackTree();
        // Undeclared exception!
        __CLR4_4_1glgll43y7qnv.R.inc(661);try { 
          __CLR4_4_1glgll43y7qnv.R.inc(662);RedBlackTree.ColorEnum.valueOf("eBaoyVEb{`^-k-<U");
          __CLR4_4_1glgll43y7qnv.R.inc(663);fail("Expecting exception: IllegalArgumentException");
        
        } catch(IllegalArgumentException e) {
           //
           // No enum constant net.mooctest.RedBlackTree.ColorEnum.eBaoyVEb{`^-k-<U
           //
           __CLR4_4_1glgll43y7qnv.R.inc(664);verifyException("java.lang.Enum", e);
        }
    }finally{__CLR4_4_1glgll43y7qnv.R.flushNeeded();}}

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {__CLR4_4_1glgll43y7qnv.R.globalSliceStart(getClass().getName(),665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpsun5ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1glgll43y7qnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1glgll43y7qnv.R.globalSliceEnd(getClass().getName(),"net.mooctest.RedBlackTreeTest.test08",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpsun5ih() throws Throwable{try{__CLR4_4_1glgll43y7qnv.R.inc(665);
        __CLR4_4_1glgll43y7qnv.R.inc(666);RedBlackTree redBlackTree0 = new RedBlackTree();
        __CLR4_4_1glgll43y7qnv.R.inc(667);RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
        __CLR4_4_1glgll43y7qnv.R.inc(668);redBlackTree0.getMinimum((Node) redBlackTree_RedBlackNode0);
    }finally{__CLR4_4_1glgll43y7qnv.R.flushNeeded();}}

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {__CLR4_4_1glgll43y7qnv.R.globalSliceStart(getClass().getName(),669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tystfmil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1glgll43y7qnv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1glgll43y7qnv.R.globalSliceEnd(getClass().getName(),"net.mooctest.RedBlackTreeTest.test09",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tystfmil() throws Throwable{try{__CLR4_4_1glgll43y7qnv.R.inc(669);
        __CLR4_4_1glgll43y7qnv.R.inc(670);RedBlackTree redBlackTree0 = new RedBlackTree();
        __CLR4_4_1glgll43y7qnv.R.inc(671);redBlackTree0.search(2667);
        // Undeclared exception!
        __CLR4_4_1glgll43y7qnv.R.inc(672);try { 
          __CLR4_4_1glgll43y7qnv.R.inc(673);redBlackTree0.getMinimum((Node) null);
          __CLR4_4_1glgll43y7qnv.R.inc(674);fail("Expecting exception: NullPointerException");
        
        } catch(NullPointerException e) {
           //
           // no message in exception (getMessage() returned null)
           //
        }
    }finally{__CLR4_4_1glgll43y7qnv.R.flushNeeded();}}
//
//    @Test(timeout = 4000)
//    public void test10()  throws Throwable  {
//        RedBlackTree redBlackTree0 = new RedBlackTree();
//        redBlackTree0.search((-3077));
//        // Undeclared exception!
//        try { 
//          redBlackTree0.getMaximum((Node) null);
//          fail("Expecting exception: NullPointerException");
//        
//        } catch(NullPointerException e) {
//           //
//           // no message in exception (getMessage() returned null)
//           //
//        }
//    }
    
}

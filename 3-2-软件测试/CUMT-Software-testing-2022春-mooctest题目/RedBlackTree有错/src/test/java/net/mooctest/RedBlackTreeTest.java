package net.mooctest;

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
public class RedBlackTreeTest {
    
    @Test
    public void testInsert() {
        RedBlackTree tree = new RedBlackTree();
    }
    @Test
    public void test() {
        RedBlackTree tree = new RedBlackTree();
        assertNull(tree.delete(12345));
        assertFalse(tree.contains(12345));

        Random rand = new Random();
        List<Node> nodes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            nodes.add(tree.insert(i));
            sb.append(i);
            sb.append(System.lineSeparator());
        }
        assertEquals(255, tree.root.value.intValue());
        assertEquals(1000, tree.getSize());
        assertEquals(0, tree.getMinimum());
        assertEquals(999, tree.getMaximum());

        tree.printTreePreOrder();
        tree.printTreePostOrder();

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        tree.printTreeInOrder();
        assertEquals(sb.toString(), os.toString());

        Collections.shuffle(nodes);
        for (Node node : nodes) {
            assertEquals(31 + node.value.hashCode(), node.hashCode());
            assertTrue(node.equals(node));
            assertTrue(tree.contains(node.value));
            tree.delete(node.value);
        }
        assertEquals(0, tree.getSize());

        nodes.clear();
        tree = new RedBlackTree();
        for (int i = 1000; i >= 1; i--) {
            nodes.add(tree.insert(i));
        }
        assertEquals(745, tree.root.value.intValue());
        assertEquals(1000, tree.getSize());
        assertEquals(1, tree.getMinimum());
        assertEquals(1000, tree.getMaximum());

        assertTrue(new Node(0, null, null, null).isLeaf());
        assertFalse(new Node(0, null, new Node(0, null, null, null), null).isLeaf());
        assertFalse(new Node(0, null, null, new Node(0, null, null, null)).isLeaf());
        assertFalse(new Node(0, null, null, null).equals(null));
        assertFalse(new Node(0, null, null, null).equals(""));
        assertFalse(new Node(null, null, null, null).equals(new Node(233, null, null, null)));
        assertTrue(new Node(null, null, null, null).equals(new Node(null, null, null, null)));
        assertFalse(new Node(233, null, null, null).equals(new Node(234, null, null, null)));
    }
    
    

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
    public void test04()  throws Throwable  {
        RedBlackTree redBlackTree0 = new RedBlackTree();
        RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
        // Undeclared exception!
        try { 
          redBlackTree0.rotateRight(redBlackTree_RedBlackNode0);
          fail("Expecting exception: NullPointerException");
        
        } catch(NullPointerException e) {
           //
           // no message in exception (getMessage() returned null)
           //
        }
    }
//
//    @Test(timeout = 4000)
//    public void test05()  throws Throwable  {
//        RedBlackTree redBlackTree0 = new RedBlackTree();
//        RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
//        Node node0 = redBlackTree0.getSuccessor((Node) redBlackTree_RedBlackNode0);
//        redBlackTree0.rotateRight(node0);
//    }
//
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
//    @Test(timeout = 4000)
//    public void test07()  throws Throwable  {
//        RedBlackTree redBlackTree0 = new RedBlackTree();
//        // Undeclared exception!
//        try { 
//          RedBlackTree.ColorEnum.valueOf("eBaoyVEb{`^-k-<U");
//          fail("Expecting exception: IllegalArgumentException");
//        
//        } catch(IllegalArgumentException e) {
//           //
//           // No enum constant net.mooctest.RedBlackTree.ColorEnum.eBaoyVEb{`^-k-<U
//           //
//           verifyException("java.lang.Enum", e);
//        }
//    }
//
//    @Test(timeout = 4000)
//    public void test08()  throws Throwable  {
//        RedBlackTree redBlackTree0 = new RedBlackTree();
//        RedBlackTree.RedBlackNode redBlackTree_RedBlackNode0 = RedBlackTree.nilNode;
//        redBlackTree0.getMinimum((Node) redBlackTree_RedBlackNode0);
//    }
//
//    @Test(timeout = 4000)
//    public void test09()  throws Throwable  {
//        RedBlackTree redBlackTree0 = new RedBlackTree();
//        redBlackTree0.search(2667);
//        // Undeclared exception!
//        try { 
//          redBlackTree0.getMinimum((Node) null);
//          fail("Expecting exception: NullPointerException");
//        
//        } catch(NullPointerException e) {
//           //
//           // no message in exception (getMessage() returned null)
//           //
//        }
//    }
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

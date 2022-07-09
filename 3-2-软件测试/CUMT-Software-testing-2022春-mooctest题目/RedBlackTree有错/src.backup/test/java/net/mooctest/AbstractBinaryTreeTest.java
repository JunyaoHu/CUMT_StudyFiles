
package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;


public class AbstractBinaryTreeTest {
	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      RedBlackTree redBlackTree0 = new RedBlackTree();
	      // Undeclared exception!
	      redBlackTree0.insert((-6));
	  }

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

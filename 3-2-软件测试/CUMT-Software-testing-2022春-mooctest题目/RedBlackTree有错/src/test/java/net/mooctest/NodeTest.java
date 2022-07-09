package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import net.mooctest.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class NodeTest {
	 @Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      Integer integer0 = Integer.getInteger("l0V", (-1965));
	      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      node0.hashCode();
	      assertTrue(node0.isLeaf());
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      Node node1 = new Node(integer0, node0, (Node) null, node0);
	      node1.parent = node1;
	      boolean boolean0 = node1.isLeaf();
	      assertTrue(node0.isLeaf());
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      Integer integer0 = new Integer((-1965));
	      Integer integer1 = new Integer((-3435));
	      Node node0 = new Node(integer1, (Node) null, (Node) null, (Node) null);
	      Node node1 = new Node(integer0, node0, node0, node0);
	      boolean boolean0 = node0.equals(node1);
	      assertTrue(node0.isLeaf());
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      Node node0 = new Node((Integer) null, (Node) null, (Node) null, (Node) null);
	      Node node1 = new Node((Integer) null, (Node) null, (Node) null, (Node) null);
	      boolean boolean0 = node0.equals(node1);
	      assertTrue(node1.isLeaf());
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      Integer integer0 = Integer.valueOf(0);
	      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      node0.value = null;
	      Node node1 = new Node(integer0, node0, node0, node0);
	      boolean boolean0 = node0.equals(node1);
	      assertFalse(node1.equals((Object)node0));
	      assertFalse(boolean0);
	      assertTrue(node0.isLeaf());
	  }

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      Node node1 = new Node(integer0, node0, (Node) null, node0);
	      boolean boolean0 = node0.equals(node1);
	      assertTrue(boolean0);
	      assertFalse(node1.isLeaf());
	      assertTrue(node0.isLeaf());
	  }

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      boolean boolean0 = node0.equals((Object) null);
	      assertFalse(boolean0);
	      assertTrue(node0.isLeaf());
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      boolean boolean0 = node0.equals(node0);
	      assertTrue(boolean0);
	      assertTrue(node0.isLeaf());
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      boolean boolean0 = node0.equals(integer0);
	      assertTrue(node0.isLeaf());
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      Integer integer0 = Integer.valueOf(0);
	      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      node0.value = null;
	      node0.hashCode();
	      assertTrue(node0.isLeaf());
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      Integer integer0 = Integer.valueOf(0);
	      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      boolean boolean0 = node0.isLeaf();
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      Integer integer0 = Integer.valueOf(0);
	      Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      Node node1 = new Node(node0.value, node0, node0, node0);
	      boolean boolean0 = node1.isLeaf();
	      assertFalse(boolean0);
	      assertTrue(node0.isLeaf());
	  }
	  
}

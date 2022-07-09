package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* LeafEvent Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5�� 31, 2022</pre> 
* @version 1.0 
*/ 
public class LeafEventTest {

/** 
* 
* Method: getValue() 
* 
*/ 
@Test
public void testGetValue() throws Exception {
    LeafEvent le = new LeafEvent();
    Assert.assertEquals(0, le.getValue());
    LeafEvent le1 = new LeafEvent(1);
    Assert.assertEquals(1, le1.getValue());
} 

/** 
* 
* Method: getLeft() 
* 
*/ 
@Test
public void testGetLeft() throws Exception {
    LeafEvent le = new LeafEvent();
    Assert.assertNull(le.getLeft());
} 

/** 
* 
* Method: getRight() 
* 
*/ 
@Test
public void testGetRight() throws Exception {
    LeafEvent le = new LeafEvent();
    Assert.assertNull(le.getRight());
} 

/** 
* 
* Method: max() 
* 
*/ 
@Test
public void testMax() throws Exception {
    LeafEvent le = new LeafEvent();
    Assert.assertEquals(0, le.max());
    LeafEvent le1 = new LeafEvent(1);
    Assert.assertEquals(1, le1.max());
} 

/** 
* 
* Method: min() 
* 
*/ 
@Test
public void testMin() throws Exception {
    LeafEvent le = new LeafEvent();
    Assert.assertEquals(0, le.min());
    LeafEvent le1 = new LeafEvent(1);
    Assert.assertEquals(1, le1.min());
} 

/** 
* 
* Method: maxDepth(int depth) 
* 
*/ 
@Test
public void testMaxDepth() throws Exception {
    LeafEvent le = new LeafEvent();
    Assert.assertEquals(2, le.maxDepth(2));
} 

/** 
* 
* Method: isLeaf() 
* 
*/ 
@Test
public void testIsLeaf() throws Exception {
    LeafEvent le = new LeafEvent();
    Assert.assertTrue(le.isLeaf());
} 

/** 
* 
* Method: lift(int m) 
* 
*/ 
@Test
public void testLift() throws Exception {
    LeafEvent le = new LeafEvent();
    Event le1 = le.lift(5);
    Assert.assertEquals("5",le1.toString());
    Event le2 = le1.lift(5);
    Assert.assertEquals("10",le2.toString());
} 

/** 
* 
* Method: sink(int m) 
* 
*/ 
@Test
public void testSink() throws Exception {
    LeafEvent le = new LeafEvent();
    Event le1 = le.sink(5);
    Assert.assertEquals("-5",le1.toString());
    Event le2 = le1.sink(5);
    Assert.assertEquals("-10",le2.toString());
} 

/** 
* 
* Method: normalize() 
* 
*/ 
@Test
public void testNormalize() throws Exception {
    LeafEvent le = new LeafEvent();
    Assert.assertEquals(le, le.normalize());
} 

/** 
* 
* Method: leq(Event other) 
* 
*/ 
@Test
public void testLeq() throws Exception {
    LeafEvent le = new LeafEvent();
    Assert.assertFalse(le.leq(new LeafEvent(-1)));
    Assert.assertTrue(le.leq(new LeafEvent(0)));
    Assert.assertTrue(le.leq(new LeafEvent(1)));
}

/** 
* 
* Method: join(Event other) 
* 
*/ 
@Test
public void testJoin() throws Exception {
    LeafEvent le = new LeafEvent();
    Event other = new LeafEvent(5);
    Assert.assertEquals("5", le.join(other).toString());
}

@Test
public void testJoin1() throws Exception {
    LeafEvent le = new LeafEvent();
    Event other = new LeafEvent(-5);
    Assert.assertEquals("0", le.join(other).toString());
}

@Test
public void testJoin2() throws Exception {
    LeafEvent le = new LeafEvent(6);
    NonLeafEvent other = new NonLeafEvent(10, new LeafEvent(-5), new LeafEvent(5));
    le.join(other);
    Assert.assertEquals("(6, 0, 9)", le.join(other).toString());
}

@Test
public void testJoin4() throws Exception {
    LeafEvent le = new LeafEvent(12);
    NonLeafEvent other = new NonLeafEvent(10, new LeafEvent(-5), new LeafEvent(5));
    le.join(other);
    Assert.assertEquals("(12, 0, 3)", le.join(other).toString());
}

/** 
* 
* Method: equals(Object object) 
* 
*/ 
@Test
public void testEquals() throws Exception {
    LeafEvent le = new LeafEvent();
    String s = "1";
    Assert.assertFalse(le.equals(s));
    LeafEvent le1 = new LeafEvent(5);
    Event le2 = le1.sink(5);
    Assert.assertTrue(le2.equals(le));
} 

/** 
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception {
    LeafEvent le = new LeafEvent();
    Assert.assertEquals(205,le.hashCode());
    Event le1 = new LeafEvent(5);
    Assert.assertEquals(210,le1.hashCode());
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {
    LeafEvent le = new LeafEvent();
    Assert.assertEquals("0",le.toString());
    Event le1 = new LeafEvent(5);
    Assert.assertEquals("5",le1.toString());
} 


} 

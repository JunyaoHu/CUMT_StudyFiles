package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* NonLeafEvent Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5�� 31, 2022</pre> 
* @version 1.0 
*/ 
public class NonLeafEventTest { 


/** 
* 
* Method: getValue() 
* 
*/ 
@Test
public void testGetValue() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    Assert.assertEquals(0, nle.getValue());
} 

/** 
* 
* Method: getLeft() 
* 
*/ 
@Test
public void testGetLeft() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    Assert.assertEquals("1", nle.getLeft().toString());
} 

/** 
* 
* Method: getRight() 
* 
*/ 
@Test
public void testGetRight() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    Assert.assertEquals("-1", nle.getRight().toString());
} 

/** 
* 
* Method: min() 
* 
*/ 
@Test
public void testMin() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    Assert.assertEquals(-1, nle.min());
    NonLeafEvent nle1 = new NonLeafEvent(3, new LeafEvent(-2), new LeafEvent(2));
    Assert.assertEquals(1, nle1.min());
    NonLeafEvent nle2 = new NonLeafEvent(-1, new LeafEvent(0), new LeafEvent(0));
    Assert.assertEquals(-1, nle2.min());
} 

/** 
* 
* Method: max() 
* 
*/ 
@Test
public void testMax() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    Assert.assertEquals(1, nle.max());
    NonLeafEvent nle1 = new NonLeafEvent(3, new LeafEvent(-2), new LeafEvent(2));
    Assert.assertEquals(5, nle1.max());
    NonLeafEvent nle2 = new NonLeafEvent(-1, new LeafEvent(0), new LeafEvent(0));
    Assert.assertEquals(-1, nle2.max());
} 

/** 
* 
* Method: maxDepth(int depth) 
* 
*/ 
@Test
public void testMaxDepth() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1)));
    Assert.assertEquals(12, nle.maxDepth(10));
} 

/** 
* 
* Method: isLeaf() 
* 
*/ 
@Test
public void testIsLeaf() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    Assert.assertFalse(nle.isLeaf());
} 

/** 
* 
* Method: lift(int m) 
* 
*/ 
@Test
public void testLift() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1)));
    NonLeafEvent nle1 = new NonLeafEvent(5, new LeafEvent(1), new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1)));
    Assert.assertEquals(nle1, nle.lift(5));
}

/** 
* 
* Method: sink(int m) 
* 
*/ 
@Test
public void testSink() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1)));
    NonLeafEvent nle1 = new NonLeafEvent(-5, new LeafEvent(1), new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1)));
    Assert.assertEquals(nle1, nle.sink(5));
} 

/** 
* 
* Method: normalize() 
* 
*/ 
@Test
public void testNormalize() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: equals(Object object) 
* 
*/ 
@Test
public void testEquals() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    Assert.assertEquals(362397, nle.hashCode());
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    Assert.assertEquals("(0, 1, -1)", nle.toString());
} 




/** 
* 
* Method: liftedLeft(Event event) 
* 
*/ 
@Test
public void testLiftedLeft() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1));
    Assert.assertEquals("3", NonLeafEvent.liftedLeft(nle).toString());
}

@Test
public void testLiftedLeft1() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(-5,  new NonLeafEvent(4, new NonLeafEvent(2, new LeafEvent(-2), new LeafEvent(-1)), new LeafEvent(-1)), new LeafEvent(6));
    Assert.assertEquals("(-1, (2, -2, -1), -1)", NonLeafEvent.liftedLeft(nle).toString());
}
    //(-5 (4 (2 -2 -1) -1 ) 6)  value = -5
    //(4 (2 -2 -1) -1 )         get left
    //(-1 (2 -2 -1) -1 )        non-leaf �� lift 4 + -5 = -1

/**
*
* Method: liftedRight(Event event)
*
*/ 
@Test
public void testLiftedRight0() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1));
    Assert.assertEquals("1", NonLeafEvent.liftedRight(nle).toString());
}

@Test
public void testLiftedRight1() throws Exception {
    NonLeafEvent nle = new NonLeafEvent(-5,  new LeafEvent(6), new NonLeafEvent(4, new LeafEvent(-1), new NonLeafEvent(2, new LeafEvent(-2), new LeafEvent(-1))));
    Assert.assertEquals("(-1, -1, (2, -2, -1))", NonLeafEvent.liftedRight(nle).toString());
}
    //(-5 6 (4  -1 (2 -2 -1)) )  value = -5
    //(4  -1 (2 -2 -1))         get right
    //(-1 -1 (2 -2 -1) )        non-leaf �� lift 4 + -5 = -1

        /**
    *
    * Method: leqNonLeafs(Event other)
    *
    */
    @Test
    public void testLeqNonLeafs() throws Exception {
        NonLeafEvent nle = new NonLeafEvent(-1, new LeafEvent(1), new LeafEvent(1));
        NonLeafEvent nle1 = new NonLeafEvent(0, new LeafEvent(0), new LeafEvent(0));
        Assert.assertTrue(nle.leqNonLeafs(nle1));
        NonLeafEvent nle2 = new NonLeafEvent(-1, new LeafEvent(2), new LeafEvent(2));
        Assert.assertTrue(nle.leqNonLeafs(nle2));
        NonLeafEvent nle3 = new NonLeafEvent(-2, new LeafEvent(0), new LeafEvent(0));
        Assert.assertFalse(nle.leqNonLeafs(nle3));
    }

    /**
     *
     * Method: leqLeaf(Event other)
     *
     */
    @Test
    public void testLeqLeaf() throws Exception {
        NonLeafEvent nle = new NonLeafEvent(-2, new LeafEvent(-1), new LeafEvent(1));
        LeafEvent le1 = new LeafEvent(0);
        Assert.assertTrue(nle.leqLeaf(le1));
        LeafEvent le2 = new LeafEvent(-1);
        Assert.assertTrue(nle.leqLeaf(le2));
        LeafEvent le3 = new LeafEvent(-2);
        Assert.assertFalse(nle.leqLeaf(le3));

    }

    /**
     *
     * Method: leq(Event other)
     *
     */
    @Test
    public void testLeq() throws Exception {
        NonLeafEvent nle = new NonLeafEvent(-1, new LeafEvent(-5), new LeafEvent(5));

        NonLeafEvent nle1 = new NonLeafEvent(5, new LeafEvent(-11), new LeafEvent(-1));
        Assert.assertTrue(nle.leqNonLeafs(nle1));
        NonLeafEvent nle2 = new NonLeafEvent(5, new LeafEvent(-12), new LeafEvent(-1));
        Assert.assertFalse(nle.leqNonLeafs(nle2));
        NonLeafEvent nle3 = new NonLeafEvent(5, new LeafEvent(-11), new LeafEvent(-2));
        Assert.assertFalse(nle.leqNonLeafs(nle3));

        LeafEvent le1 = new LeafEvent(3);
        Assert.assertFalse(nle.leqLeaf(le1));
        LeafEvent le2 = new LeafEvent(4);
        Assert.assertTrue(nle.leqLeaf(le2));
        LeafEvent le3 = new LeafEvent(5);
        Assert.assertTrue(nle.leqLeaf(le3));

    }

    /**
     *
     * Method: join(Event other)
     *
     */
    @Test
    public void testJoin() throws Exception {
        NonLeafEvent nle = new NonLeafEvent(-1, new LeafEvent(-5), new LeafEvent(5));

        NonLeafEvent nle1 = new NonLeafEvent(-6, new LeafEvent(-4), new LeafEvent(4));
        Assert.assertEquals("(-6, 0, 10)", nle.join(nle1).toString());

        LeafEvent other = new LeafEvent(4);
        Assert.assertEquals("4", nle.join(other).toString());
    }

    /**
    *
    * Method: joinNonLeaf(Event other)
    *
    */
    @Test
    public void testJoinNonLeaf() throws Exception {
        NonLeafEvent nle = new NonLeafEvent(-1, new LeafEvent(-5), new LeafEvent(5));
        NonLeafEvent nle1 = new NonLeafEvent(-2, new LeafEvent(-6), new LeafEvent(6));
        Assert.assertEquals("(-6, 0, 10)", nle.joinNonLeaf(nle1).toString());
        NonLeafEvent nle2 = new NonLeafEvent(0, new LeafEvent(-6), new LeafEvent(6));
        Assert.assertEquals("(-6, 0, 12)", nle.joinNonLeaf(nle2).toString());
    }

    /**
    *
    * Method: leftJoin(Event other)
    *
    */
    @Test
    public void testLeftJoin() throws Exception {
        NonLeafEvent nle = new NonLeafEvent(5, new LeafEvent(-5), new LeafEvent(5));
        NonLeafEvent nle1 = new NonLeafEvent(2, new LeafEvent(-1), new LeafEvent(1));
        Assert.assertEquals("-4", nle.leftJoin(nle1).toString());
    }

    /**
    *
    * Method: rightJoin(Event other)
    *
    */
    @Test
    public void testRightJoin() throws Exception {
        NonLeafEvent nle = new NonLeafEvent(5, new LeafEvent(-5), new LeafEvent(5));
        NonLeafEvent nle1 = new NonLeafEvent(2, new LeafEvent(-1), new LeafEvent(1));
        Assert.assertEquals("5", nle.rightJoin(nle1).toString());
    }

} 

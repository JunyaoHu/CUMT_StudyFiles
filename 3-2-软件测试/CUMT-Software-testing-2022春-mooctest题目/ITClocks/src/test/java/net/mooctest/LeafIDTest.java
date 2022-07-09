package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* LeafID Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5�� 29, 2022</pre> 
* @version 1.0 
*/ 
public class LeafIDTest {


    /**
    *
    * Method: getValue()
    *
    */
    @Test
    public void testGetValue() throws Exception {
        LeafID lid = new LeafID(0);
        Assert.assertEquals(0, lid.getValue());
    }

    /**
    *
    * Method: getLeft()
    *
    */
    @Test
    public void testGetLeft() throws Exception {
        LeafID lid = new LeafID(0);
        Assert.assertNull(lid.getLeft());
    }

    /**
    *
    * Method: getRight()
    *
    */
    @Test
    public void testGetRight() throws Exception {
        LeafID lid = new LeafID(0);
        Assert.assertNull(lid.getRight());
    }

    /**
    *
    * Method: isZero()
    *
    */
    @Test
    public void testIsZero() throws Exception {
        LeafID lid = new LeafID(0);
        Assert.assertTrue(lid.isZero());
    }

    /**
    *
    * Method: isOne()
    *
    */
    @Test
    public void testIsOne() throws Exception {
        LeafID lid = new LeafID(0);
        Assert.assertFalse(lid.isOne());
    }

    /**
    *
    * Method: isLeaf()
    *
    */
    @Test
    public void testIsLeaf() throws Exception {
        LeafID lid = new LeafID(0);
        Assert.assertTrue(lid.isLeaf());

    }

    /**
    *
    * Method: normalize()
    *
    */
    @Test
    public void testNormalize() throws Exception {
        LeafID lid = new LeafID(0);
        Assert.assertEquals(lid, lid.normalize());
    }

    /**
    *
    * Method: split()
    *
    */
    @Test
    public void testSplit00() throws Exception {
        LeafID lid = new LeafID(0);
        ID[] ids = lid.split();
        Assert.assertTrue(ids[0].isZero());
        Assert.assertTrue(ids[1].isZero());
    }

    @Test
    public void testSplit01() throws Exception {
        LeafID lid = new LeafID(1);
        ID[] ids = lid.split();
        Assert.assertTrue(ids[0].getLeft().isOne());
        Assert.assertTrue(ids[0].getRight().isZero());
        Assert.assertTrue(ids[1].getLeft().isZero());
        Assert.assertTrue(ids[1].getRight().isOne());
    }

    /**
    *
    * Method: sum(ID other)
    *
    */
    @Test
    public void testSum00() throws Exception {
        LeafID lid = new LeafID(0);
        LeafID otherid = new LeafID(0);
        Assert.assertFalse(lid.sum(otherid).isOne());
    }

    @Test
    public void testSum01() throws Exception {
        LeafID lid = new LeafID(0);
        LeafID otherid = new LeafID(1);
        Assert.assertTrue(lid.sum(otherid).isOne());
    }

    @Test
    public void testSum10() throws Exception {
        LeafID lid = new LeafID(1);
        LeafID otherid = new LeafID(0);
        Assert.assertTrue(lid.sum(otherid).isOne());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSum11() throws Exception {
        LeafID lid = new LeafID(1);
        LeafID otherid = new LeafID(1);
        lid.sum(otherid).isOne();
    }

    /**
    *
    * Method: equals(Object object)
    *
    */
    @Test
    public void testEquals() throws Exception {
        LeafID lid = new LeafID(0);
        Object other = "hjy cs 2019-4 06192081 pls dont copy my code directly";
        Assert.assertFalse(lid.equals(other));
    }

    @Test
    public void testEquals1() throws Exception {
        LeafID lid = new LeafID(0);
        LeafID other = new LeafID(0);
        Assert.assertTrue(lid.equals(other));
    }


    /**
    *
    * Method: hashCode()
    *
    */
    @Test
    public void testHashCode() throws Exception {
        LeafID lid = new LeafID(0);
        Assert.assertEquals(51, lid.hashCode());
    }

    /**
    *
    * Method: toString()
    *
    */
    @Test
    public void testToString() throws Exception {
        LeafID lid = new LeafID(0);
        Assert.assertEquals("0", lid.toString());
    }


} 

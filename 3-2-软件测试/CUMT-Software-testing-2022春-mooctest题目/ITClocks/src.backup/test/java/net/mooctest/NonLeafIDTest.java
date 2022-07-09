package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* NonLeafID Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5�� 31, 2022</pre> 
* @version 1.0 
*/ 
public class NonLeafIDTest { 

/** 
* 
* Method: getLeft() 
* 
*/ 
@Test
public void testGetLeft() throws Exception {
    NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    Assert.assertTrue(nlid.getLeft().isZero());
}

/** 
* 
* Method: getRight() 
* 
*/ 
@Test
public void testGetRight() throws Exception {
    NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    Assert.assertTrue(nlid.getRight().isOne());
} 

/** 
* 
* Method: isOne() 
* 
*/ 
@Test
public void testIsOne() throws Exception {
    NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    Assert.assertFalse(nlid.isOne());
}

/** 
* 
* Method: isZero() 
* 
*/ 
@Test
public void testIsZero() throws Exception {
    NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    Assert.assertFalse(nlid.isZero());
} 

/** 
* 
* Method: isLeaf() 
* 
*/ 
@Test
public void testIsLeaf() throws Exception {
    NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    Assert.assertFalse(nlid.isLeaf());
} 

/** 
* 
* Method: normalize() 
* 
*/ 
@Test
public void testNormalize() throws Exception {
    NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    Assert.assertEquals(new NonLeafID((new LeafID(0)).normalize(), (new LeafID(1)).normalize()) ,nlid.normalize());
}

    /**
    *
    * Method: normalize(ID left, ID right)
    *
    */
    @Test
    public void testNormalizeForLeftRight00() throws Exception {
        Assert.assertEquals(IDs.zero(), NonLeafID.normalize(new LeafID(0), new LeafID(0)));
    }

    @Test
    public void testNormalizeForLeftRight01() throws Exception {
        LeafID left = new LeafID(0);
        LeafID right = new LeafID(1);
        Assert.assertEquals(IDs.with(left, right), NonLeafID.normalize(left, right));
    }

    @Test
    public void testNormalizeForLeftRight10() throws Exception {
        LeafID left = new LeafID(1);
        LeafID right = new LeafID(0);
        Assert.assertEquals(IDs.with(left, right), NonLeafID.normalize(left, right));
    }

    @Test
    public void testNormalizeForLeftRight11() throws Exception {
        Assert.assertEquals(IDs.one(), NonLeafID.normalize(new LeafID(1), new LeafID(1)));
    }

    /**
* 
* Method: split() 
* 
*/ 
@Test
public void testSplit() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: splitWithLeftZero() 
* 
*/ 
@Test
public void testSplitWithLeftZero() throws Exception {
    LeafID left = new LeafID(0);
    LeafID right = new LeafID(1);
    NonLeafID nlid = new NonLeafID(left,right);
    ID[] result = nlid.splitWithLeftZero();
    Assert.assertEquals("(0, (1, 0))", result[0].toString());
    Assert.assertEquals("(0, (0, 1))", result[1].toString());
} 

/** 
* 
* Method: splitWithRightZero() 
* 
*/ 
@Test
public void testSplitWithRightZero() throws Exception {
    LeafID left = new LeafID(1);
    LeafID right = new LeafID(0);
    NonLeafID nlid = new NonLeafID(left,right);
    ID[] result = nlid.splitWithRightZero();
    Assert.assertEquals("((1, 0), 0)", result[0].toString());
    Assert.assertEquals("((0, 1), 0)", result[1].toString());
}

    /**
    *
    * Method: sum(ID other)
    *
    */
    @Test
    public void testSum01() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        LeafID other = new LeafID(0);
        Assert.assertEquals(nlid,nlid.sum(other));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSum02() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        LeafID other = new LeafID(1);
        nlid.sum(other);
    }

    @Test
    public void testSum03() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(0));
        Assert.assertEquals("(0, 1)",nlid.sum(other).toString());
    }

    @Test
    public void testSum04() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(1),new LeafID(0));
        NonLeafID other = new NonLeafID(new LeafID(0),new NonLeafID(new LeafID(0), new LeafID(0)));
        Assert.assertEquals("(1, 0)",nlid.sum(other).toString());
    }

    @Test
    public void testSum05() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(0));
        NonLeafID other = new NonLeafID(new LeafID(0),new NonLeafID(new LeafID(1), new LeafID(0)));
        Assert.assertEquals("(0, (1, 0))",nlid.sum(other).toString());
    }
    /**
    *
    * Method: sumNonLeaf(ID other)
    *
    */
    @Test
    public void testSumNonLeaf00() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(0));
        Assert.assertEquals("(0, 1)" , nlid.sumNonLeaf(other).toString());
    }

    @Test
    public void testSumNonLeaf001() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(0));
        NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(0));
        Assert.assertEquals("0" , nlid.sumNonLeaf(other).toString());
    }

    @Test
    public void testSumNonLeaf002() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(0));
        NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(1));
        Assert.assertEquals("(0, 1)" , nlid.sumNonLeaf(other).toString());
    }

    @Test
    public void testSumNonLeaf003() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(1),new LeafID(0));
        NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(0));
        Assert.assertEquals("(1, 0)" , nlid.sumNonLeaf(other).toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumNonLeaf01() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(1),new LeafID(1));
        NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(1));
        Assert.assertEquals("(0, 1)" , nlid.sumNonLeaf(other).toString());
    }

    @Test
    public void testSumNonLeaf10() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        NonLeafID other = new NonLeafID(new LeafID(1),new LeafID(0));
        Assert.assertEquals("1" , nlid.sumNonLeaf(other).toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumNonLeaf11() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        NonLeafID other = new NonLeafID(new LeafID(1),new LeafID(1));
        Assert.assertEquals("(0, 1)" , nlid.sumNonLeaf(other).toString());
    }

/** 
* 
* Method: equals(Object object) 
* 
*/ 
    @Test
    public void testEquals00() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(1));
        Assert.assertTrue(nlid.equals(other));
    }

    @Test
    public void testEquals01() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        LeafID other = new LeafID(0);
        Assert.assertFalse(nlid.equals(other));
    }

    @Test
    public void testEquals02() throws Exception {
        NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        NonLeafID other = new NonLeafID(new LeafID(1),new LeafID(1));
        Assert.assertFalse(nlid.equals(other));
    }

    /**
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception {
    NonLeafID nlid = new NonLeafID(new NonLeafID(new LeafID(1), new LeafID(0)),new NonLeafID(new LeafID(0), new LeafID(1)));
    Assert.assertEquals(84899, nlid.hashCode());
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {
    NonLeafID nlid = new NonLeafID(new NonLeafID(new LeafID(1), new LeafID(0)),new NonLeafID(new LeafID(0), new LeafID(1)));
    Assert.assertEquals("((1, 0), (0, 1))", nlid.toString());
}


}

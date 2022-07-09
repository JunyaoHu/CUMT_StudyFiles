package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* IDs Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5�� 31, 2022</pre> 
* @version 1.0 
*/ 
public class IDsTest { 

/** 
* 
* Method: zero() 
* 
*/ 
@Test
public void testZero() throws Exception {
    Assert.assertEquals("0", IDs.zero().toString());
} 

/** 
* 
* Method: one() 
* 
*/ 
@Test
public void testOne() throws Exception {
    Assert.assertEquals("1", IDs.one().toString());
} 

/** 
* 
* Method: with(ID id1, ID id2) 
* 
*/ 
@Test
public void testWith() throws Exception {
    Assert.assertEquals("(0, 1)", IDs.with(new LeafID(0), new LeafID(1)).toString());
} 


} 

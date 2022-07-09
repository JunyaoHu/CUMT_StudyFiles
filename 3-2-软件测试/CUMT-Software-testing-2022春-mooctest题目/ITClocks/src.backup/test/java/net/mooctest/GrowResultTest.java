package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;

/** 
* GrowResult Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5�� 31, 2022</pre> 
* @version 1.0 
*/ 
public class GrowResultTest { 


/** 
* 
* Method: getEvent() 
* 
*/ 
@Test
public void testGetEvent() throws Exception {
    GrowResult gr = new GrowResult(new LeafEvent(0), 0);
    Assert.assertEquals("0",gr.getEvent().toString());
} 

/** 
* 
* Method: getCost() 
* 
*/ 
@Test
public void testGetCost() throws Exception {
    GrowResult gr = new GrowResult(new LeafEvent(0), 0);
    Assert.assertEquals(0,gr.getCost());
} 

/** 
* 
* Method: setCost(int cost) 
* 
*/ 
@Test
public void testSetCost() throws Exception {
    GrowResult gr = new GrowResult(new LeafEvent(0), 0);
    gr.setCost(10);
    Assert.assertEquals(10, gr.getCost());
} 


} 

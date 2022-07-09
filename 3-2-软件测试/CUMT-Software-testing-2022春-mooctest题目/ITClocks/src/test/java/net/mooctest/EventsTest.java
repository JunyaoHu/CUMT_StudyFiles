package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;

/** 
* Events Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5�� 31, 2022</pre> 
* @version 1.0 
*/ 
public class EventsTest { 



/** 
* 
* Method: zero() 
* 
*/ 
@Test
public void testZero() throws Exception {
    Assert.assertEquals("0", Events.zero().toString());
} 

/** 
* 
* Method: with(int value) 
* 
*/ 
@Test
public void testWithValue() throws Exception {
    Assert.assertEquals("5", Events.with(5).toString());
}

/** 
* 
* Method: with(int value, Event left, Event right) 
* 
*/ 
@Test
public void testWithForValueLeftRight() throws Exception {
    Assert.assertEquals("(1, 2, 3)", Events.with(1, new LeafEvent(2), new LeafEvent(3)).toString());

} 


} 

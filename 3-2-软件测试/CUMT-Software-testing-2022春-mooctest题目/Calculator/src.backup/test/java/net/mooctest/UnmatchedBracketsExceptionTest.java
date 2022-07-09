package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* UnmatchedBracketsException Tester. 
* 
* @author <Authors name> 
* @since <pre>5�� 26, 2022</pre> 
* @version 1.0 
*/ 
public class UnmatchedBracketsExceptionTest { 


/** 
* 
* Method: getIndexOfBracket() 
* 
*/ 
@Test
public void testGetIndexOfBracket0() throws Exception {
    UnmatchedBracketsException ube = new UnmatchedBracketsException("exp", 1);
    Assert.assertEquals(1, ube.getIndexOfBracket());
}

@Test
public void testGetIndexOfBracket1() throws Exception {
    UnmatchedBracketsException ube = new UnmatchedBracketsException("exp", 2);
    Assert.assertNotEquals(1, ube.getIndexOfBracket());
}



} 

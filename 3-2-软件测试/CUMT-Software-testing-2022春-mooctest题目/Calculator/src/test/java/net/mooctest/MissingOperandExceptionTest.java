package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* MissingOperandException Tester. 
* 
* @author <Authors name> 
* @since <pre>5�� 26, 2022</pre> 
* @version 1.0 
*/ 
public class MissingOperandExceptionTest { 


/** 
* 
* Method: getOperator() 
* 
*/ 
@Test
public void testGetOperator() throws Exception {
    MissingOperandException moe = new MissingOperandException("exp", "op");
    Assert.assertEquals("op", moe.getOperator());
} 

} 

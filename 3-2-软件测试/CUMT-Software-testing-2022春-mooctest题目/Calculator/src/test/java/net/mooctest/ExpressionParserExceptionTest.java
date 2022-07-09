package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;


/** 
* ExpressionParserException Tester. 
* 
* @author <Authors name> 
* @since <pre>5�� 26, 2022</pre> 
* @version 1.0 
*/ 
public class ExpressionParserExceptionTest { 



/** 
* 
* Method: getFaultyExpression() 
* 
*/ 
@Test
public void testGetFaultyExpression() throws Exception {
    ExpressionParserException epe = new ExpressionParserException("hello");
    Assert.assertEquals("hello", epe.getFaultyExpression());
} 




} 

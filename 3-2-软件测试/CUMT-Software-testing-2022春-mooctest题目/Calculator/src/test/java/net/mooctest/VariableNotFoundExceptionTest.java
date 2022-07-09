package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* VariableNotFoundException Tester. 
* 
* @author <Authors name> 
* @since <pre>5�� 26, 2022</pre> 
* @version 1.0 
*/ 
public class VariableNotFoundExceptionTest { 



/** 
* 
* Method: getVar() 
* 
*/ 
@Test
public void testGetVar0() throws Exception {
    VariableNotFoundException vnfe = new VariableNotFoundException("v");
    Assert.assertEquals("v", vnfe.getVar());
}

@Test
public void testGetVar1() throws Exception {
    VariableNotFoundException vnfe = new VariableNotFoundException("exp", "v");
    Assert.assertEquals("v", vnfe.getVar());
}




} 

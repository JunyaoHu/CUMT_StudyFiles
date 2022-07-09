package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;

/** 
* CommandNotFoundException Tester. 
* 
* @author <Authors name> 
* @since <pre>5�� 26, 2022</pre> 
* @version 1.0 
*/ 
public class CommandNotFoundExceptionTest { 


/** 
* 
* Method: getCommand() 
* 
*/ 
@Test
public void testGetCommand() throws Exception {
    CommandNotFoundException cnfe = new CommandNotFoundException("hello");
    Assert.assertEquals("hello", cnfe.getCommand());

} 




} 

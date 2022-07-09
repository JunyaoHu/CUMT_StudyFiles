package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* FunctionNotFoundException Tester. 
* 
* @author <Authors name> 
* @since <pre>5�� 26, 2022</pre> 
* @version 1.0 
*/ 
public class FunctionNotFoundExceptionTest {


    /**
     * Method: getFunc()
     */
    @Test
    public void testGetFunc1() throws Exception {
        FunctionNotFoundException fnfe = new FunctionNotFoundException("hello", "hello1");
        Assert.assertEquals("hello1", fnfe.getFunc());
    }

    @Test
    public void testGetFunc2() throws Exception {
        FunctionNotFoundException fnfe = new FunctionNotFoundException("hello");
        Assert.assertEquals("hello", fnfe.getFunc());
    }
}
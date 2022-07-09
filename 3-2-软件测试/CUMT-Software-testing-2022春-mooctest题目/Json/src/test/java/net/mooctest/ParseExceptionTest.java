package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;

/** 
* ParseException Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>6�� 29, 2022</pre> 
* @version 1.0 
*/ 
public class ParseExceptionTest { 



/** 
* 
* Method: getLocation() 
* 
*/ 
@Test
public void testGetLocation() throws Exception {
    ParseException parseException = new ParseException("test", new Location(101,102,103));
    Assert.assertEquals("102:103",parseException.getLocation().toString());
} 

/** 
* 
* Method: getOffset() 
* 
*/ 
@Test
public void testGetOffset() throws Exception {
    ParseException parseException = new ParseException("test", new Location(101,102,103));
    Assert.assertEquals(101,parseException.getOffset());
} 

/** 
* 
* Method: getLine() 
* 
*/ 
@Test
public void testGetLine() throws Exception {
    ParseException parseException = new ParseException("test", new Location(101,102,103));
    Assert.assertEquals(102,parseException.getLine());
} 

/** 
* 
* Method: getColumn() 
* 
*/ 
@Test
public void testGetColumn() throws Exception {
    ParseException parseException = new ParseException("test", new Location(101,102,103));
    Assert.assertEquals(103,parseException.getColumn());
} 


} 

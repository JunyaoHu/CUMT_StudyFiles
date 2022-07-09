package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/** 
* JsonNumber Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>7月 3, 2022</pre> 
* @version 1.0 
*/ 
public class JsonNumberTest {
    JsonNumber jsonNumber;
@Before
public void before() throws Exception {
    jsonNumber = new JsonNumber("115114");
} 

@After
public void after() throws Exception { 
}

@Test(expected = NullPointerException.class)
public void test1() throws Exception {
    JsonNumber jsonNumber1 = new JsonNumber(null);
}
/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {
    Assert.assertEquals("115114", jsonNumber.toString());
} 

/** 
* 
* Method: write(JsonWriter writer) 
* 
*/ 
@Test
public void testWrite() throws Exception {
    JsonNumber jsonNumber0 = new JsonNumber(".o9VI}T+zu");
    StringWriter stringWriter0 = new StringWriter();
    JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
    jsonNumber0.write(jsonWriter0);
    Assert.assertEquals(".o9VI}T+zu", jsonNumber0.toString());
} 


@Test(expected= NullPointerException.class)
public void testWrite1() throws Exception {
    JsonNumber jsonNumber0 = new JsonNumber("a}u]Isa4! <y");
    PrettyPrint prettyPrint0 = PrettyPrint.indentWithTabs();
    JsonWriter jsonWriter0 = prettyPrint0.createWriter((Writer) null);
    jsonNumber0.write(jsonWriter0);
} 

/** 
* 
* Method: isNumber() 
* 
*/ 
@Test
public void testIsNumber() throws Exception {
    Assert.assertTrue(jsonNumber.isNumber());
} 

/** 
* 
* Method: asInt() 
* 
*/ 
@Test
public void testAsInt() throws Exception {
    System.out.println(jsonNumber.asInt());
} 

/** 
* 
* Method: asLong() 
* 
*/ 
@Test
public void testAsLong() throws Exception {
    System.out.println(jsonNumber.asLong());
} 

/** 
* 
* Method: asFloat() 
* 
*/ 
@Test
public void testAsFloat() throws Exception {
    System.out.println(jsonNumber.asFloat());
} 

/** 
* 
* Method: asDouble() 
* 
*/ 
@Test
public void testAsDouble() throws Exception {
    System.out.println(jsonNumber.asDouble());
} 

/** 
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception {
    System.out.println(jsonNumber.hashCode()); 
} 

/** 
* 
* Method: equals(Object object) 
* 
*/ 
@Test
public void testEquals() throws Exception {
    JsonNumber jsonNumber1 = jsonNumber;
    JsonNumber jsonNumber2 = new JsonNumber("115114");
    JsonNumber jsonNumber3 = new JsonNumber("1414810");
    JsonNumber jsonNumber4 = null;
    String string = "hello";
    Assert.assertEquals(jsonNumber,jsonNumber1);
    Assert.assertEquals(jsonNumber,jsonNumber2);
    Assert.assertNotEquals(jsonNumber,jsonNumber3);
    Assert.assertNotEquals(jsonNumber,jsonNumber4);
    Assert.assertNotEquals(jsonNumber,string);
} 


@Test(timeout = 4000)
public void test00() throws Throwable {
    JsonNumber jsonNumber0 = new JsonNumber(".o9VI}T+zu");
    StringWriter stringWriter0 = new StringWriter();
    JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
    jsonNumber0.write(jsonWriter0);
    Assert.assertEquals(".o9VI}T+zu", jsonNumber0.toString());
}

} 

package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/** 
* JsonString Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>7月 2, 2022</pre> 
* @version 1.0 
*/ 
public class JsonStringTest {
    JsonString jsonString;
@Before
public void before() throws Exception {
    jsonString = new JsonString("hello");
} 



@Test(expected = NullPointerException.class)
public void test1() throws Exception {
    JsonString jsonString1 = new JsonString(null);
}
    /**
* 
* Method: write(JsonWriter writer) 
* 
*/ 
@Test
public void testWrite() throws Exception {
    Writer writer11 = new Writer() {
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {

        }

        @Override
        public void flush() throws IOException {

        }

        @Override
        public void close() throws IOException {

        }
    };
    JsonWriter jsonWriter = new JsonWriter(writer11);
    jsonString.write(jsonWriter);

} 

/** 
* 
* Method: isString() 
* 
*/ 
@Test
public void testIsString() throws Exception {
    System.out.println(jsonString.isString());
} 

/** 
* 
* Method: asString() 
* 
*/ 
@Test
public void testAsString() throws Exception {
    System.out.println(jsonString.asString());
} 

/** 
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception {
    System.out.println(jsonString.hashCode());
} 

/** 
* 
* Method: equals(Object object) 
* 
*/ 
@Test
public void testEquals() throws Exception {
    JsonString jsonString1 = jsonString;
    JsonString jsonString2 = new JsonString("hello");
    JsonString jsonString3 = new JsonString("hello1");
    JsonString jsonString4 = null;
    String string = "hello";
    Assert.assertEquals(jsonString,jsonString1);
    Assert.assertEquals(jsonString,jsonString2);
    Assert.assertNotEquals(jsonString,jsonString3);
    Assert.assertNotEquals(jsonString,jsonString4);
    Assert.assertNotEquals(jsonString,string);


} 




@Test(timeout = 4000)
public void test07()  throws Throwable  {
    JsonString jsonString0 = new JsonString("net.mooctest.JsonWriter");
    StringWriter stringWriter0 = new StringWriter();
    JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
    jsonString0.write(jsonWriter0);
    Assert.assertFalse(jsonString0.isObject());
    Assert.assertFalse(jsonString0.isArray());
    Assert.assertFalse(jsonString0.isBoolean());
    Assert.assertFalse(jsonString0.isTrue());
    Assert.assertFalse(jsonString0.isFalse());
    Assert.assertFalse(jsonString0.isNull());
    
}







} 

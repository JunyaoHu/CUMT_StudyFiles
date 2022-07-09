package net.mooctest; 

import net.mooctest.JsonLiteral;
import net.mooctest.JsonWriter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.StringWriter;

/**
* JsonLiteral Tester.
*
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>7月 3, 2022</pre>
* @version 1.0
*/
public class JsonLiteralTest {
    JsonLiteral jsonLiteral;
@Before
public void before() throws Exception {
    jsonLiteral = new JsonLiteral("true");
}

@After
public void after() throws Exception {
}

/**
*
* Method: write(JsonWriter writer)
*
*/
@Test
public void testWrite() throws Exception {
    StringWriter stringWriter0 = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter0);
    jsonLiteral.write(jsonWriter);
}

/**
*
* Method: toString()
*
*/
@Test
public void testToString() throws Exception {
    Assert.assertEquals("true", jsonLiteral.toString());
}

/**
*
* Method: hashCode()
*
*/
@Test
public void testHashCode() throws Exception {
    System.out.println(jsonLiteral.hashCode());
}

/**
*
* Method: isNull()
*
*/
@Test
public void testIsNull() throws Exception {
    Assert.assertFalse(jsonLiteral.isNull());
}

/**
*
* Method: isTrue()
*
*/
@Test
public void testIsTrue() throws Exception {
    Assert.assertTrue(jsonLiteral.isTrue());
}

/**
*
* Method: isFalse()
*
*/
@Test
public void testIsFalse() throws Exception {
    Assert.assertFalse(jsonLiteral.isFalse());
}

/**
*
* Method: isBoolean()
*
*/
@Test
public void testIsBoolean() throws Exception {
    Assert.assertTrue(jsonLiteral.isBoolean());

    JsonLiteral jsonLiteral2 = new JsonLiteral("false");
    JsonLiteral jsonLiteral3 = new JsonLiteral("null");
    Assert.assertTrue(jsonLiteral2.isBoolean());
    Assert.assertFalse(jsonLiteral3.isBoolean());
}

/**
*
* Method: asBoolean()
*
*/
@Test (expected = UnsupportedOperationException.class)
public void testAsBoolean() throws Exception {
    Assert.assertTrue(jsonLiteral.asBoolean());

    JsonLiteral jsonLiteral2 = new JsonLiteral("false");
    JsonLiteral jsonLiteral3 = new JsonLiteral("null");

    Assert.assertFalse(jsonLiteral2.asBoolean());
    jsonLiteral3.asBoolean();
}

/**
*
* Method: equals(Object object)
*
*/
@Test
public void testEquals() throws Exception {
    JsonLiteral jsonLiteral1 = jsonLiteral;
    JsonLiteral jsonLiteral2 = new JsonLiteral("true");
    JsonLiteral jsonLiteral3 = new JsonLiteral("hello1");
    JsonLiteral jsonLiteral4 = null;
    String string = "hello";
    Assert.assertEquals(jsonLiteral,jsonLiteral1);
    Assert.assertEquals(jsonLiteral,jsonLiteral2);
    Assert.assertNotEquals(jsonLiteral,jsonLiteral3);
    Assert.assertNotEquals(jsonLiteral,jsonLiteral4);
    Assert.assertNotEquals(jsonLiteral,string);


} 



} 

package net.mooctest;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

/** 
* Json Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>6月 29, 2022</pre> 
* @version 1.0 
*/ 
public class JsonTest {

/** 
* 
* Method: value(int value) 
* 
*/ 
@Test
public void testValueValue() throws Exception {
    int num1 = 1909;
    long num2 = 19092022;
    float num3 = 1909.22f;
    double num4 = -0.6192081;
    JsonValue jsonValue;
    jsonValue = Json.value(num1);
    Assert.assertEquals("1909",jsonValue.toString());
    jsonValue = Json.value(num2);
    Assert.assertEquals("19092022",jsonValue.toString());
    jsonValue = Json.value(num3);
    Assert.assertEquals("1909.22",jsonValue.toString());
    jsonValue = Json.value(num4);
    Assert.assertEquals("-0.6192081",jsonValue.toString());
}

@Test (expected = IllegalArgumentException.class)
public void testValueValue01() throws Exception {
    float num = Float.POSITIVE_INFINITY;
    Json.value(num);
}

@Test (expected = IllegalArgumentException.class)
public void testValueValue02() throws Exception {
    float num = Float.NaN;
    Json.value(num);
}

@Test (expected = IllegalArgumentException.class)
public void testValueValue03() throws Exception {
    double num = Double.NaN;
    Json.value(num);
}

@Test (expected = IllegalArgumentException.class)
public void testValueValue04() throws Exception {
    double num = Double.NaN;
    Json.value(num);
}

    /**
* 
* Method: value(String string) 
* 
*/ 
@Test
public void testValueString() throws Exception {
    String string;
    string = null;
    Assert.assertEquals("null", Json.value(string).toString());
    string = "hujunyao";
    Assert.assertEquals("\"hujunyao\"", Json.value(string).toString());
}

/**
 *
 * Method: value(Boolean bool)
 *
 */
@Test
public void testValueBool() throws Exception {
    Assert.assertEquals("true", Json.value(true).toString());
    Assert.assertEquals("false", Json.value(false).toString());
}

    /**
* 
* Method: array() 
* 
*/ 
@Test
public void testArray() throws Exception {
    JsonArray jsonarray = Json.array();
    Assert.assertTrue(jsonarray.isEmpty());
} 

/** 
* 
* Method: array(int... values) 
* 
*/ 
@Test
public void testArrayValues01() throws Exception {
    Assert.assertEquals(4, Json.array(-1, 0, 2, 10).size());
    Assert.assertEquals(4, Json.array(-1, 0, 2, 6192081L).size());
    Assert.assertEquals(4, Json.array(-1, 0, 2, 1909.2022f).size());
    Assert.assertEquals(4, Json.array(-1, 0, 2, 0.6192081).size());
    Assert.assertEquals(3, Json.array("cumt", "hujunyao", "06192081").size());
    Assert.assertEquals(3, Json.array(true, true, false).size());
}

@Test(expected = NullPointerException.class)
public void testArrayValues02() throws Exception {
    int[] array = null;
    Json.array(array);
}

@Test(expected = NullPointerException.class)
public void testArrayValues03() throws Exception {
    float[] array = null;
    Json.array(array);
}

@Test(expected = NullPointerException.class)
public void testArrayValues04() throws Exception {
    double[] array = null;
    Json.array(array);
}

@Test(expected = NullPointerException.class)
public void testArrayValues05() throws Exception {
    boolean[] array = null;
    Json.array(array);
}

@Test(expected = NullPointerException.class)
public void testArrayValues06() throws Exception {
    long[] array = null;
    Json.array(array);
}

@Test(expected = NullPointerException.class)
public void testArrayValues07() throws Exception {
    String[] array = null;
    Json.array(array);
}

/** 
* 
* Method: object() 
* 
*/ 
@Test
public void testObject() throws Exception {
    Json.object();
} 

/** 
* 
* Method: parse(String string) 
* 
*/ 
@Test
public void testParseString() throws Exception {
    System.out.println(Json.parse("{\"hello\":[1.2,1.3], \n" +
            "\"hh\":{\n" +
                    "\"123\":666,\n" +
                    "\"789\":[222,101],\n" +
                    "\"66\":[true,false]\n" +
            "}, \n" +
            "\"hh123\": [1230000000000000,4560000000000,99900000000000], \n" +
            "\"hh1234\": []\n" +
            "}"));
}

@Test(expected = NullPointerException.class)
public void testParseString01() throws Exception {
    String string = null;
    System.out.println(Json.parse(string));
}

    /**
* 
* Method: parse(Reader reader) 
* 
*/ 
@Test
public void testParseReader() throws Exception {
//    Reader reader = new Reader() {
//        @Override
//        public int read(char[] cbuf, int off, int len) throws IOException {
//            try{
//                for (int i=off; i<len; i++){
//                    System.out.print(cbuf[i]);
//                }
//                return 1;
//            } catch (Exception e ) {
//                return -1;
//            }
//        }
//
//        @Override
//        public void close() throws IOException {
//
//        }
//    };
//    Json.parse(reader);
} 

/** 
* 
* Method: startArray() 
* 
*/ 
@Test
public void testStartArray() throws Exception {
    Json.DefaultHandler defaultHandler = new Json.DefaultHandler();
    JsonArray jsonArray = defaultHandler.startArray();
    Assert.assertEquals("[]",jsonArray.toString());
} 

/** 
* 
* Method: startObject() 
* 
*/ 
@Test
public void testStartObject() throws Exception {
    Json.DefaultHandler defaultHandler = new Json.DefaultHandler();
    JsonObject jsonObject = defaultHandler.startObject();
    Assert.assertEquals("{}",jsonObject.toString());
} 

/** 
* 
* Method: endNull() 
* 
*/ 
@Test
public void testEndNull() throws Exception {
    Json.DefaultHandler defaultHandler = new Json.DefaultHandler();
    defaultHandler.endNull();
    Assert.assertEquals("null",defaultHandler.getValue().toString());
} 

/** 
* 
* Method: endBoolean(boolean bool) 
* 
*/ 
@Test
public void testEndBoolean() throws Exception {
    Json.DefaultHandler defaultHandler = new Json.DefaultHandler();
    defaultHandler.endBoolean(true);
    Assert.assertEquals("true",defaultHandler.getValue().toString());
    defaultHandler.endBoolean(false);
    Assert.assertEquals("false",defaultHandler.getValue().toString());
} 

/** 
* 
* Method: endString(String string) 
* 
*/ 
@Test
public void testEndString() throws Exception {
    Json.DefaultHandler defaultHandler = new Json.DefaultHandler();
    defaultHandler.endString("hujunyao");
    Assert.assertEquals("\"hujunyao\"",defaultHandler.getValue().toString());
} 

/** 
* 
* Method: endNumber(String string) 
* 
*/ 
@Test
public void testEndNumber() throws Exception {
    Json.DefaultHandler defaultHandler = new Json.DefaultHandler();
    defaultHandler.endNumber("3.1415926");
    Assert.assertEquals("3.1415926",defaultHandler.getValue().toString());
} 

/** 
* 
* Method: endArray(JsonArray array) 
* 
*/ 
@Test
public void testEndArray() throws Exception {
    Json.DefaultHandler defaultHandler = new Json.DefaultHandler();
    JsonArray jsonArray = new JsonArray();
    defaultHandler.endArray(jsonArray);
    Assert.assertEquals("[]",defaultHandler.getValue().toString());
} 

/** 
* 
* Method: endObject(JsonObject object) 
* 
*/ 
@Test
public void testEndObject() throws Exception {
    Json.DefaultHandler defaultHandler = new Json.DefaultHandler();
    JsonObject jsonObject = new JsonObject();
    defaultHandler.endObject(jsonObject);
    Assert.assertEquals("{}",defaultHandler.getValue().toString());
} 

/** 
* 
* Method: endArrayValue(JsonArray array) 
* 
*/ 
@Test
public void testEndArrayValue() throws Exception {
    Json.DefaultHandler defaultHandler = new Json.DefaultHandler();
    JsonArray jsonArray1 = new JsonArray();
    JsonArray jsonArray2 = new JsonArray();

    jsonArray1.add(1.2);

    jsonArray2.add(100);
    jsonArray2.add("arr2");

    defaultHandler.endArray(jsonArray2);
    defaultHandler.endArrayValue(jsonArray1);
    Assert.assertEquals("[100,\"arr2\"]",defaultHandler.getValue().toString());
}

/** 
* 
* Method: endObjectValue(JsonObject object, String name) 
* 
*/ 
@Test
public void testEndObjectValue() throws Exception {
    Json.DefaultHandler defaultHandler = new Json.DefaultHandler();
    JsonObject jsonObject1 = new JsonObject();
    JsonObject jsonObject2 = new JsonObject();

    jsonObject1.add("aa", 1.2);

    jsonObject2.add("cumt",1909);
    jsonObject2.add("hjy",0.6192081);

    defaultHandler.endObject(jsonObject2);
    defaultHandler.endObjectValue(jsonObject1,"obj");
    Assert.assertEquals("{\"cumt\":1909,\"hjy\":0.6192081}",defaultHandler.getValue().toString());
}

/** 
* 
* Method: getValue() 
* 
*/ 
@Test
public void testGetValue() throws Exception {
    Json.DefaultHandler defaultHandler = new Json.DefaultHandler();
    Assert.assertNull(defaultHandler.getValue());
} 


/** 
* 
* Method: cutOffPointZero(String string) 
* 
*/ 
@Test
public void testCutOffPointZero() throws Exception {
    Assert.assertEquals("123", Json.cutOffPointZero("123"));
    Assert.assertEquals("66", Json.cutOffPointZero("66.0"));

} 










//@Test(timeout = 4000)
//public void test08()  throws Throwable  {
//    StringReader stringReader0 = new StringReader("72");
//    JsonValue jsonValue0 = Json.parse((Reader) stringReader0);
//    Assert.assertFalse(jsonValue0.isTrue());
//}
//
//@Test(timeout = 4000)
//public void test09()  throws Throwable  {
//    StringReader stringReader0 = new StringReader("null");
//    JsonValue jsonValue0 = Json.parse((Reader) stringReader0);
//    Assert.assertFalse(jsonValue0.isString());
//}
//
//@Test(timeout = 4000)
//public void test17()  throws Throwable  {
//    float[] floatArray0 = new float[0];
//    JsonArray jsonArray0 = Json.array(floatArray0);
//    Assert.assertFalse(jsonArray0.isNumber());
//}



//7843

@Test(timeout = 4000)
public void test00()  throws Throwable  {
    Json.DefaultHandler json_DefaultHandler0 = new Json.DefaultHandler();
    JsonObject jsonObject0 = json_DefaultHandler0.startObject();
    Assert.assertFalse(jsonObject0.isString());
}

@Test(timeout = 4000)
public void test01()  throws Throwable  {
    Json.DefaultHandler json_DefaultHandler0 = new Json.DefaultHandler();
    JsonObject jsonObject0 = Json.object();
    json_DefaultHandler0.endObject(jsonObject0);
    Assert.assertFalse(jsonObject0.isBoolean());
}

@Test(timeout = 4000)
public void test02()  throws Throwable  {
    Json.DefaultHandler json_DefaultHandler0 = new Json.DefaultHandler();
    JsonObject jsonObject0 = new JsonObject();
    json_DefaultHandler0.endBoolean(false);
    json_DefaultHandler0.endObjectValue(jsonObject0, "{}");
    Assert.assertFalse(jsonObject0.isNull());
}

@Test(timeout = 4000)
public void test03()  throws Throwable  {
    Json.DefaultHandler json_DefaultHandler0 = new Json.DefaultHandler();
    JsonArray jsonArray0 = Json.array();
    json_DefaultHandler0.endNumber("vL4BZ&rOo4_Ht");
    json_DefaultHandler0.endArrayValue(jsonArray0);
    Assert.assertFalse(jsonArray0.isNull());
}

@Test(timeout = 4000)
public void test04()  throws Throwable  {
    JsonValue jsonValue0 = Json.parse("72");
    Assert.assertFalse(jsonValue0.isBoolean());
}

@Test(timeout = 4000)
public void test05()  throws Throwable  {
    JsonValue jsonValue0 = Json.parse("null");
    Assert.assertFalse(jsonValue0.isFalse());
}

@Test(timeout = 4000)
public void test06()  throws Throwable  {
    JsonValue jsonValue0 = Json.parse("false");
    Assert.assertTrue(jsonValue0.isFalse());
}

@Test(timeout = 4000)
public void test07()  throws Throwable  {
    JsonValue jsonValue0 = Json.parse("{}");
    Assert.assertFalse(jsonValue0.isArray());
}

@Test(timeout = 4000)
public void test08()  throws Throwable  {
    StringReader stringReader0 = new StringReader("72");
    JsonValue jsonValue0 = Json.parse((Reader) stringReader0);
    Assert.assertFalse(jsonValue0.isTrue());
}

@Test(timeout = 4000)
public void test09()  throws Throwable  {
    StringReader stringReader0 = new StringReader("null");
    JsonValue jsonValue0 = Json.parse((Reader) stringReader0);
    Assert.assertFalse(jsonValue0.isString());
}

@Test(timeout = 4000)
public void test10()  throws Throwable  {
    StringReader stringReader0 = new StringReader("false");
    JsonValue jsonValue0 = Json.parse((Reader) stringReader0);
    Assert.assertTrue(jsonValue0.isFalse());
}

@Test(timeout = 4000)
public void test11()  throws Throwable  {
    StringReader stringReader0 = new StringReader("true");
    JsonValue jsonValue0 = Json.parse((Reader) stringReader0);
    Assert.assertFalse(jsonValue0.isFalse());
}

@Test(timeout = 4000)
public void test12()  throws Throwable  {
    String string0 = Json.cutOffPointZero("");
    Assert.assertEquals("", string0);
}

@Test(timeout = 4000)
public void test13()  throws Throwable  {
    boolean[] booleanArray0 = new boolean[0];
    JsonArray jsonArray0 = Json.array(booleanArray0);
    Assert.assertFalse(jsonArray0.isTrue());
}

@Test(timeout = 4000)
public void test14()  throws Throwable  {
    String[] stringArray0 = new String[0];
    JsonArray jsonArray0 = Json.array(stringArray0);
    Assert.assertTrue(jsonArray0.isEmpty());
}

@Test(timeout = 4000)
public void test15()  throws Throwable  {
    long[] longArray0 = new long[0];
    JsonArray jsonArray0 = Json.array(longArray0);
    Assert.assertFalse(jsonArray0.isTrue());
}

@Test(timeout = 4000)
public void test16()  throws Throwable  {
    int[] intArray0 = new int[0];
    JsonArray jsonArray0 = Json.array(intArray0);
    Assert.assertFalse(jsonArray0.isTrue());
}

@Test(timeout = 4000)
public void test17()  throws Throwable  {
    float[] floatArray0 = new float[0];
    JsonArray jsonArray0 = Json.array(floatArray0);
    Assert.assertFalse(jsonArray0.isNumber());
}

@Test(timeout = 4000)
public void test18()  throws Throwable  {
    double[] doubleArray0 = new double[0];
    JsonArray jsonArray0 = Json.array(doubleArray0);
    Assert.assertFalse(jsonArray0.isObject());
}

@Test(timeout = 4000,expected = RuntimeException.class)
public void test19()  throws Throwable  {
      Json.parse("`J]H.");
}

  @Test(timeout = 4000,expected = IOException.class)
public void test20()  throws Throwable  {
    StringReader stringReader0 = new StringReader("");
    stringReader0.close();
      Json.parse((Reader) stringReader0);

}

  @Test(timeout = 4000,expected = NullPointerException.class)
public void test21()  throws Throwable  {

      Json.cutOffPointZero((String) null);

}

@Test(timeout = 4000)
public void test22()  throws Throwable  {
    String string0 = Json.cutOffPointZero("mGh)J7L");
    Assert.assertEquals("mGh)J7L", string0);
}

@Test(timeout = 4000)
public void test23()  throws Throwable  {
    String string0 = Json.cutOffPointZero("E?Cj\"'.0");
    Assert.assertEquals("E?Cj\"'", string0);
}

@Test(timeout = 4000)
public void test24()  throws Throwable  {
    JsonValue jsonValue0 = Json.value(true);
    Assert.assertTrue(jsonValue0.isTrue());
}

@Test(timeout = 4000)
public void test25()  throws Throwable  {
    JsonValue jsonValue0 = Json.value((String) null);
    Assert.assertFalse(jsonValue0.isBoolean());
}

@Test(timeout = 4000)
public void test26()  throws Throwable  {
    JsonValue jsonValue0 = Json.value(4060.0607521795);
    Assert.assertEquals(4060.0607521795, jsonValue0.asDouble(), 0.01);
}

@Test(timeout = 4000)
public void test27()  throws Throwable  {
    JsonValue jsonValue0 = Json.value(0.0F);
    Assert.assertEquals("0", jsonValue0.toString());
}

@Test(timeout = 4000)
public void test28()  throws Throwable  {
    JsonValue jsonValue0 = Json.value(516L);
    Assert.assertEquals("516", jsonValue0.toString());
}

@Test(timeout = 4000)
public void test29()  throws Throwable  {
    Json.DefaultHandler json_DefaultHandler0 = new Json.DefaultHandler();
    JsonValue jsonValue0 = json_DefaultHandler0.getValue();
    Assert.assertNull(jsonValue0);
}

@Test(timeout = 4000)
public void test30()  throws Throwable  {
    JsonValue jsonValue0 = Json.value(2356);
    Assert.assertEquals(2356L, jsonValue0.asLong());
}

@Test(timeout = 4000)
public void test31()  throws Throwable  {
    double[] doubleArray0 = new double[8];
    doubleArray0[1] = (-140.3);
    JsonArray jsonArray0 = Json.array(doubleArray0);
    Assert.assertEquals(8, jsonArray0.size());
}

  @Test(timeout = 4000,expected = NullPointerException.class)
public void test32()  throws Throwable  {

      Json.parse((Reader) null);

}
  @Test(timeout = 4000,expected = NullPointerException.class)
public void test33()  throws Throwable  {
      Json.parse((String) null);

}

@Test(timeout = 4000)
public void test34()  throws Throwable  {
    JsonValue jsonValue0 = Json.parse("true");
    Assert.assertEquals("true", jsonValue0.toString());
}

  @Test(timeout = 4000,expected = NullPointerException.class)
public void test35()  throws Throwable  {

      Json.array((String[]) null);

}

  @Test(timeout = 4000,expected = NullPointerException.class)
public void test36()  throws Throwable  {

      Json.array((boolean[]) null);

}

  @Test(timeout = 4000,expected = NullPointerException.class)
public void test37()  throws Throwable  {

      Json.array((double[]) null);

}

  @Test(timeout = 4000,expected = NullPointerException.class)
public void test38()  throws Throwable  {

      Json.array((float[]) null);

}

  @Test(timeout = 4000,expected = NullPointerException.class)
public void test39()  throws Throwable  {

      Json.array((long[]) null);

}

  @Test(timeout = 4000,expected = NullPointerException.class)
public void test40()  throws Throwable  {

      Json.array((int[]) null);

}

@Test(timeout = 4000)
public void test41()  throws Throwable  {
    boolean[] booleanArray0 = new boolean[23];
    booleanArray0[7] = true;
    JsonArray jsonArray0 = Json.array(booleanArray0);
    Assert.assertEquals(23, jsonArray0.size());
}

@Test(timeout = 4000)
public void test42()  throws Throwable  {
    JsonValue jsonValue0 = Json.value(false);
    Assert.assertEquals("false", jsonValue0.toString());
}

@Test(timeout = 4000)
public void test43()  throws Throwable  {
    String[] stringArray0 = new String[5];
    JsonArray jsonArray0 = Json.array(stringArray0);
    Assert.assertEquals(5, jsonArray0.size());
}

@Test(timeout = 4000)
public void test44()  throws Throwable  {
    JsonValue jsonValue0 = Json.value("true");
    Assert.assertFalse(jsonValue0.isArray());
}

@Test(timeout = 4000)
public void test45()  throws Throwable  {
    long[] longArray0 = new long[7];
    JsonArray jsonArray0 = Json.array(longArray0);
    Assert.assertEquals(7, jsonArray0.size());
}

@Test(timeout = 4000)
public void test46()  throws Throwable  {
    Json.DefaultHandler json_DefaultHandler0 = new Json.DefaultHandler();
    json_DefaultHandler0.endString("yXKpl},");
}

@Test(timeout = 4000)
public void test47()  throws Throwable  {
    Json.DefaultHandler json_DefaultHandler0 = new Json.DefaultHandler();
    json_DefaultHandler0.endNull();
}

@Test(timeout = 4000,expected = RuntimeException.class)
public void test48()  throws Throwable  {
    StringReader stringReader0 = new StringReader("{}");
    Json.parse((Reader) stringReader0);
      Json.parse((Reader) stringReader0);

}

@Test(timeout = 4000)
public void test49()  throws Throwable  {
    Json.DefaultHandler json_DefaultHandler0 = new Json.DefaultHandler();
    JsonArray jsonArray0 = json_DefaultHandler0.startArray();
    Assert.assertTrue(jsonArray0.isArray());
}

  @Test(timeout = 4000,expected = NullPointerException.class)
public void test50()  throws Throwable  {
    int[] intArray0 = new int[27];
    JsonArray jsonArray0 = Json.array(intArray0);
    Json.DefaultHandler json_DefaultHandler0 = new Json.DefaultHandler();
      json_DefaultHandler0.endArrayValue(jsonArray0);

}

@Test(timeout = 4000)
public void test51()  throws Throwable  {
    float[] floatArray0 = new float[15];
    JsonArray jsonArray0 = Json.array(floatArray0);
    Json.DefaultHandler json_DefaultHandler0 = new Json.DefaultHandler();
    json_DefaultHandler0.endArray(jsonArray0);
    Assert.assertEquals(15, jsonArray0.size());
}




} 

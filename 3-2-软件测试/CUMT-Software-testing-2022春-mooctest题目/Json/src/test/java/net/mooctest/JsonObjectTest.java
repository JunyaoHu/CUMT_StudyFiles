package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/** 
* JsonObject Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>7月 5, 2022</pre> 
* @version 1.0 
*/ 
public class JsonObjectTest { 



/** 
* 
* Method: readFrom(Reader reader) 
* 
*/ 
@Test(timeout = 4000)
public void testReadFromReader() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    jsonObject0.toString();
    JsonObject jsonObject1 = jsonObject0.add("`#", (-37.28381F));
    String string0 = "n/w\\)";
    jsonObject0.get("n/w)");
    JsonObject jsonObject2 = jsonObject0.set("n/w)", 0L);
    JsonObject jsonObject3 = new JsonObject(jsonObject2);
    JsonObject jsonObject4 = jsonObject3.remove("n/w)");
    jsonObject1.set("`#", 123);
    JsonObject jsonObject5 = jsonObject2.add("config is null", (JsonValue) jsonObject3);
    StringReader stringReader0 = new StringReader("{\n\n}");
    JsonObject jsonObject6 = JsonObject.readFrom((Reader) stringReader0);
    jsonObject2.equals(jsonObject4);
    String string1 = "Klxx]d6[8b+@7c {}";
    jsonObject6.set("name is null", (float) 0L);
    jsonObject5.set("NsVJ9C{[JU2", (JsonValue) jsonObject4);
    jsonObject0.getInt("`#", 93);
} 

/** 
* 
* Method: readFrom(String string) 
* 
*/
@Test
public void testReadFromString() throws Exception {

    JsonObject jsonObject0 = new JsonObject();
    jsonObject0.toString();
    jsonObject0.toString();
    long long0 = 2629L;
    JsonObject.readFrom("{\n\n}");
}

@Test(expected = UnsupportedOperationException.class)
public void testReadFromString1() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    jsonObject0.getDouble("_/\"bG1#J}5Q:18T)#1/", (-1362.19410243));
    jsonObject0.set("null", false);
    StringReader stringReader0 = new StringReader("null");
    JsonObject.readFrom((Reader) stringReader0);

}


/** 
* 
* Method: unmodifiableObject(JsonObject object) 
* 
*/ 
@Test
public void testUnmodifiableObject() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    JsonObject jsonObject1 = JsonObject.unmodifiableObject(jsonObject0);
} 

/** 
* 
* Method: add(String name, int value) 
* 
*/ 
@Test
public void testAddSetForNameValue() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    jsonObject0.set("jN%i:", 456);
    jsonObject0.getLong("", 0L);
    JsonObject jsonObject1 = new JsonObject(jsonObject0);
    JsonObject jsonObject2 = jsonObject0.merge(jsonObject1);
    JsonObject jsonObject3 = jsonObject0.add("net.mooctest.JsonArray", (double) 0L);
    JsonObject jsonObject4 = jsonObject0.set("net.mooctest.JsonObject", 9.1);
    String string0 = "7see";
    JsonObject jsonObject5 = jsonObject4.set("7see", 1.2);
    jsonObject4.get("net.mooctest.JsonObject");
    JsonObject jsonObject6 = jsonObject5.merge(jsonObject2);
    jsonObject6.getFloat("rkF9bp\"", (-1315.67F));
    JsonObject.HashIndexTable jsonObject_HashIndexTable0 = new JsonObject.HashIndexTable();
    jsonObject_HashIndexTable0.get(jsonObject3);
    JsonObject jsonObject7 = jsonObject0.set("name is null", 666);
    jsonObject7.getFloat("name is null", (-1));
} 

/** 
* 
* Method: remove(String name) 
* 
*/ 
@Test
public void testRemoveName() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    JsonObject jsonObject1 = new JsonObject(jsonObject0);
    jsonObject1.add("net.mooctest.JsonObject", (JsonValue) jsonObject0);
    JsonObject jsonObject2 = jsonObject0.add("net.mooctest.JsonObject", "net.mooctest.JsonObject");
    jsonObject2.remove("VwK6Rq");
    JsonObject.Member jsonObject_Member0 = new JsonObject.Member("=zi", jsonObject1);
    jsonObject1.equals(jsonObject_Member0);
    String string0 = "Fe.9";
    jsonObject1.add("Fe.9", 0.0);
    jsonObject1.merge(jsonObject0);
    StringReader stringReader0 = new StringReader("{\"hhh\":1909}");
    JsonObject.readFrom((Reader) stringReader0);
} 

/** 
* 
* Method: contains(String name) 
* 
*/ 
@Test
public void testContains() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    String string0 = "-.%UaU/Z+S}!gE(+.1h";
    JsonObject jsonObject1 = jsonObject0.set("-.%UaU/Z+S}!gE(+.1h", 0.0);
    JsonObject jsonObject2 = jsonObject1.set("-.%UaU/Z+S}!gE(+.1h", 0.0);
    jsonObject0.getLong("-.%UaU/Z+S}!gE(+.1h", 0L);
    jsonObject0.iterator();
    JsonObject jsonObject3 = JsonObject.unmodifiableObject(jsonObject2);
    JsonObject jsonObject4 = JsonObject.unmodifiableObject(jsonObject1);
    JsonObject jsonObject5 = jsonObject0.merge(jsonObject3);
    jsonObject3.getInt("ys[IF-GJ=", 255);
    jsonObject5.contains("-.%UaU/Z+S}!gE(+.1h");
    JsonObject.Member jsonObject_Member0 = new JsonObject.Member("object is null", jsonObject4);
    JsonObject.Member jsonObject_Member1 = new JsonObject.Member("object is null", jsonObject0);
    jsonObject_Member0.equals(jsonObject_Member1);
    jsonObject5.asObject();
} 

/** 
* 
* Method: merge(JsonObject object) 
* 
*/ 
@Test
public void testMerge() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    String string0 = "-.%UaU/Z+S}!gE(+.1h";
    JsonObject jsonObject1 = jsonObject0.set("-.%UaU/Z+S}!gE(+.1h", 0.0);
    JsonObject jsonObject2 = jsonObject1.set("-.%UaU/Z+S}!gE(+.1h", 0.0);
    jsonObject0.getLong("-.%UaU/Z+S}!gE(+.1h", 0L);
    jsonObject0.iterator();
    JsonObject jsonObject3 = new JsonObject(jsonObject0);
    jsonObject1.add("-.%UaU/Z+S}!gE(+.1h", false);
    JsonObject jsonObject4 = new JsonObject();
    JsonObject jsonObject5 = jsonObject0.merge(jsonObject3);
    jsonObject5.contains("-.%UaU/Z+S}!gE(+.1h");
    JsonObject.Member jsonObject_Member0 = new JsonObject.Member("object is null", jsonObject4);
    JsonObject.Member jsonObject_Member1 = new JsonObject.Member("object is null", jsonObject0);
    jsonObject0.merge(jsonObject5);
    jsonObject2.isEmpty();
    jsonObject_Member0.equals(jsonObject_Member1);
    jsonObject5.asObject();
} 

/** 
* 
* Method: get(String name) 
* 
*/ 
@Test
public void testGetName() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    jsonObject0.indexOf("':'");
    JsonString jsonString0 = new JsonString("<!$n5uASK^clg6BU*X");
    JsonObject jsonObject1 = jsonObject0.add(":}7mjBZ -YUX.Dc}S", (JsonValue) jsonString0);
    JsonObject jsonObject2 = jsonObject0.add("array is null", (long) (-1));
    JsonObject.HashIndexTable jsonObject_HashIndexTable0 = new JsonObject.HashIndexTable();
    JsonObject.HashIndexTable jsonObject_HashIndexTable1 = new JsonObject.HashIndexTable(jsonObject_HashIndexTable0);
    jsonObject_HashIndexTable1.remove((-4065));
    JsonObject jsonObject3 = jsonObject2.set("':'", (long) (-4065));
    JsonObject jsonObject4 = jsonObject1.set("<!$n5uASK^clg6BU*X", (-1L));
    jsonObject4.spliterator();
    jsonObject0.set("H4\"WF69a(cz{-[5", (JsonValue) jsonObject2);
    jsonObject3.add("<!$n5uASK^clg6BU*X", (-1.0));
    jsonObject4.set("NsVJ9C{[JU2", 0L);
    jsonObject2.get("H4\"WF69a(cz{-[5");
    jsonObject_HashIndexTable0.remove(648);
    jsonObject3.names();
} 

/** 
* 
* Method: getInt(String name, int defaultValue) 
* 
*/ 
@Test
public void testGetInt() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    JsonObject jsonObject1 = jsonObject0.set("`#", 1);
    jsonObject1.toString();
    JsonObject jsonObject2 = jsonObject0.add("`#", 6666666);
    String string0 = "n/w\\)";
    jsonObject0.get("n/w)");
    JsonObject jsonObject3 = jsonObject0.set("n/w)", 0L);
    JsonObject jsonObject4 = new JsonObject(jsonObject3);
    JsonObject jsonObject5 = jsonObject4.remove("n/w)");
    jsonObject2.set("#L(Y?6XAB", "#L(Y?6XAB");
    JsonObject jsonObject6 = jsonObject3.add("config is null", (JsonValue) jsonObject4);
    StringReader stringReader0 = new StringReader("{\n\"`#\": 1\n}");
    JsonObject jsonObject7 = JsonObject.readFrom((Reader) stringReader0);
    jsonObject6.set(";/(maJ", (double) 1);
    jsonObject3.equals(jsonObject5);
    String string1 = "Klxx]d6[8b+@7c {}";
    jsonObject7.set("name is null", (float) 0L);
    jsonObject6.set("NsVJ9C{[JU2", (JsonValue) jsonObject5);
    jsonObject0.getInt("`#", 93);
} 

/** 
* 
* Method: getLong(String name, long defaultValue) 
* 
*/ 
@Test(expected = NullPointerException.class)
public void testGetLong() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    JsonObject jsonObject1 = JsonObject.unmodifiableObject(jsonObject0);
    Assert.assertEquals("", jsonObject1.getLong((String) null, 950L));
}
    @Test
public void testGetLong1() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    JsonObject jsonObject1 = JsonObject.unmodifiableObject(jsonObject0);
    Assert.assertEquals(950, jsonObject1.getLong("(String) null", 950L));
} //8744

    /**
* 
* Method: getFloat(String name, float defaultValue) 
* 
*/ 
@Test
public void testGetFloat() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    jsonObject0.getFloat("`#", 12f);
} 

/** 
* 
* Method: getDouble(String name, double defaultValue) 
* 
*/ 
@Test
public void testGetDouble() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    jsonObject0.getDouble("`#", 1.2);
} 

/** 
* 
* Method: getBoolean(String name, boolean defaultValue) 
* 
*/ 
@Test
public void testGetBoolean() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    jsonObject0.getBoolean("`#", false);
} 

/** 
* 
* Method: getString(String name, String defaultValue) 
* 
*/ 
@Test
public void testGetString() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    JsonObject jsonObject1 = new JsonObject();
    jsonObject0.set(":}7mjBZ -YUX.Dc}S", 0L);
    JsonObject jsonObject2 = jsonObject1.set("3Y~", 0L);
    double double0 = jsonObject2.getDouble("0STB$Bho$8-(>eG[", 1.0);
    Assert.assertEquals(1.0, double0, 0.01);

    jsonObject0.set("3Y~", 0.0F);
    String string0 = jsonObject0.getString("'XeSq[@;~pq=iSX", "");
    Assert.assertEquals("", string0);
} //8794

/** 
* 
* Method: size() 
* 
*/ 
@Test
public void testSize() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    jsonObject0.set("", 0L);
    jsonObject0.set("", 0.0F);
    JsonObject jsonObject1 = jsonObject0.set("3Y~", 3817L);
    jsonObject1.getDouble("0STB$Bho$8-(>eG[", 1.0);
    jsonObject0.set("3Y~", 0.0F);
    Assert.assertEquals(2, jsonObject0.size());
} 

/** 
* 
* Method: isEmpty() 
* 
*/ 
@Test
public void testIsEmpty() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    JsonObject jsonObject1 = jsonObject0.set("nt.moocest.JsonObject$Member", 0L);
    jsonObject0.getString("value is null", "nt.moocest.JsonObject$Member");
    jsonObject0.asObject();
    jsonObject1.isEmpty();
} //8807

/** 
* 
* Method: names() 
* 
*/ 
@Test
public void testNames() throws Exception {
    JsonObject.HashIndexTable jsonObject_HashIndexTable0 = new JsonObject.HashIndexTable();
    jsonObject_HashIndexTable0.remove((-3293));
    JsonObject jsonObject0 = new JsonObject();
    JsonObject jsonObject1 = new JsonObject(jsonObject0);
    JsonObject jsonObject2 = new JsonObject(jsonObject1);
    JsonObject jsonObject3 = jsonObject2.set("8'", (double) (-3293));
    jsonObject0.getFloat("", (-3293));
    jsonObject_HashIndexTable0.remove((-3293));
    StringWriter stringWriter0 = new StringWriter();
    jsonObject2.writeTo((Writer) stringWriter0);
    jsonObject1.add("8'", (-3293.0F));
    jsonObject1.getFloat("8'", (-3293.0F));
    jsonObject1.names();
    jsonObject3.add("8'", "net.mooctest.JsonHandler");
    JsonObject.Member jsonObject_Member0 = new JsonObject.Member("lYCup1=`KM~$X%q$3", jsonObject1);
    jsonObject0.getString("8'", "net.mooctest.JsonHandler");
} //8820



/** 
* 
* Method: isObject() 
* 
*/ 
@Test
public void testIsObject() throws Exception {
    JsonObject.HashIndexTable jsonObject_HashIndexTable0 = new JsonObject.HashIndexTable();
    jsonObject_HashIndexTable0.remove((-4228));
    JsonObject jsonObject0 = new JsonObject();
    jsonObject_HashIndexTable0.remove((-4228));
    JsonObject jsonObject1 = jsonObject0.set("5N(a", 0.0F);
    Assert.assertTrue(jsonObject1.isObject());
} //8832

/** 
* 
* Method: asObject() 
* 
*/ 
@Test
public void testAsObject() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    PrettyPrint.singleLine();
    jsonObject0.hashCode();
    JsonObject jsonObject1 = jsonObject0.add("LwGwuCWy4KhT?;E", 109L);
    JsonObject jsonObject2 = jsonObject0.asObject();
    JsonObject jsonObject3 = jsonObject0.set("LwGwuCWy4KhT?;E", (JsonValue) jsonObject0);
    JsonObject.Member jsonObject_Member0 = new JsonObject.Member("LwGwuCWy4KhT?;E", jsonObject0);
    jsonObject3.getDouble("G", 109L);
    jsonObject0.size();
    jsonObject2.isObject();
    jsonObject_Member0.getName();
    jsonObject1.contains("iaHk-{x&G&5%/>>.}8F");
    jsonObject3.add("", "LwGwuCWy4KhT?;E");
    Assert.assertEquals(2, jsonObject0.size());
} //8845

///** 
//* 
//* Method: iterator() 
//* 
//*/ 
//@Test
//public void testIterator() throws Exception {
//    JsonObject jsonObject0 = new JsonObject();
//    jsonObject0.getFloat("", 0.0F);
//    JsonObject jsonObject1 = jsonObject0.add("LwGwuCWy4KhT?;E", 109L);
//    PrettyPrint prettyPrint0 = PrettyPrint.indentWithSpaces(0);
//    StringWriter stringWriter0 = new StringWriter();
//    WriterConfig.MINIMAL = (WriterConfig) prettyPrint0;
//    JsonWriter jsonWriter0 = prettyPrint0.createWriter(stringWriter0);
//    jsonObject0.write(jsonWriter0);
//    jsonObject0.hashCode();
//    jsonObject0.add("", 109L);
//    JsonObject jsonObject2 = jsonObject0.add("", "");
//    JsonObject jsonObject3 = jsonObject0.asObject();
//    jsonObject2.iterator();
//    jsonObject3.set("", false);
//    JsonObject jsonObject4 = jsonObject2.set("", (JsonValue) jsonObject1);
//    JsonObject.Member jsonObject_Member0 = new JsonObject.Member("", jsonObject2);
//    jsonObject_Member0.getName();
//    jsonObject0.size();
//    jsonObject3.isObject();
//    JsonObject jsonObject5 = jsonObject2.set("LwGwuCWy4KhT?;E", 340.0523F);
//    jsonObject5.add("", (float) 0);
//    jsonObject_Member0.getName();
//    jsonObject5.contains("iaHk-{x&G&5%/>>.}8F");
//    jsonObject4.add("", "");
//    jsonObject2.get("");
//    Assert.assertEquals(5, jsonObject0.size());
//} 

///** 
//* 
//* Method: write(JsonWriter writer) 
//* 
//*/ 
//@Test
//public void testWrite() throws Exception {
//    JsonObject jsonObject0 = new JsonObject();
//    jsonObject0.getFloat("", 0.0F);
//    JsonObject jsonObject1 = jsonObject0.add("LwGwuCWy4KhT?;E", 109L);
//    PrettyPrint prettyPrint0 = PrettyPrint.indentWithSpaces(0);
//    StringWriter stringWriter0 = new StringWriter();
//    WriterConfig.MINIMAL = (WriterConfig) prettyPrint0;
//    JsonWriter jsonWriter0 = prettyPrint0.createWriter(stringWriter0);
//    jsonObject0.write(jsonWriter0);
//    jsonObject0.hashCode();
//    jsonObject0.add("", 109L);
//    JsonObject jsonObject2 = jsonObject0.add("", "");
//    JsonObject jsonObject3 = jsonObject0.asObject();
//    jsonObject2.iterator();
//    JsonObject jsonObject4 = jsonObject2.set("", (JsonValue) jsonObject1);
//    JsonObject.Member jsonObject_Member0 = new JsonObject.Member("", jsonObject2);
//    jsonObject_Member0.getName();
//    jsonObject0.size();
//    jsonObject3.isObject();
//    JsonObject jsonObject5 = jsonObject2.set("LwGwuCWy4KhT?;E", 340.0523F);
//    jsonObject5.add("", (float) 0);
//    jsonObject_Member0.getName();
//    jsonObject5.contains("iaHk-{x&G&5%/>>.}8F");
//    jsonObject4.add("", "");
//    Assert.assertEquals(5, jsonObject1.size());
//    Assert.assertEquals(5, jsonObject0.size());
//} 



//
//
///** 
//* 
//* Method: hashCode() 
//* 
//*/ 
//@Test
//public void testHashCode() throws Exception {
//    JsonObject jsonObject0 = new JsonObject();
//    PrettyPrint prettyPrint0 = PrettyPrint.singleLine();
//    StringWriter stringWriter0 = new StringWriter();
//    WriterConfig.MINIMAL = (WriterConfig) prettyPrint0;
//    JsonWriter jsonWriter0 = prettyPrint0.createWriter(stringWriter0);
//    jsonObject0.write(jsonWriter0);
//    jsonObject0.hashCode();
//} 
//
/** 
* 
* Method: equals(Object obj) 
* 
*/ 
@Test
public void testEqualsObj() throws Exception {
    JsonObject jsonObject0 = new JsonObject();
    JsonObject jsonObject1 = jsonObject0.set("", 1);
    jsonObject1.toString();
    JsonObject jsonObject2 = jsonObject0.add("", 1909);
    String string0 = "n/w\\)";
    jsonObject0.get("n/w)");
    JsonObject jsonObject3 = jsonObject0.set("n/w)", 0L);
    JsonObject jsonObject4 = JsonObject.unmodifiableObject(jsonObject3);
    JsonObject jsonObject5 = JsonObject.unmodifiableObject(jsonObject2);
    jsonObject2.set("#L(Y?6XAB", "#L(Y?6XAB");
    JsonObject jsonObject6 = jsonObject3.add("config is null", (JsonValue) jsonObject4);
    jsonObject6.set(";/(maJ", (double) 1);
    jsonObject3.equals(jsonObject5);
    String string1 = "Klxx]d6[8b+@7c {}";
    jsonObject0.getInt("", 93);
    
    

}
    @Test
    public void testEqualsObj1() throws Exception {
        JsonObject jsonObject0 = new JsonObject();
        JsonObject jsonObject1 = new JsonObject();
        String string0 = "net.mooctest.JsonWriter";
        jsonObject0.getLong("net.mooctest.JsonWriter", 0L);
        JsonObject.Member jsonObject_Member0 = new JsonObject.Member("object is null", jsonObject0);
        jsonObject_Member0.equals(jsonObject_Member0);
        jsonObject0.asObject();
    }
    @Test
    public void testEqualsObj2() throws Exception {
        JsonObject jsonObject0 = new JsonObject();
        JsonObject.Member jsonObject_Member0 = new JsonObject.Member("", jsonObject0);
        jsonObject_Member0.equals("object is null");
        jsonObject_Member0.equals((Object) null);
        jsonObject0.add("wWjO<<` rHE;", (-1.0F));
        JsonObject jsonObject1 = jsonObject0.add(">D3{PdLe$A4", false);
        Assert.assertEquals(2, jsonObject1.size());
    }

//    /**
//* 
//* Method: indexOf(String name) 
//* 
//*/ 
//@Test
//public void testIndexOf() throws Exception {
//    JsonObject jsonObject0 = new JsonObject();
//    jsonObject0.isEmpty();
//    String string0 = ">QGj!_9%}2zt5dE>[";
//    JsonObject jsonObject1 = jsonObject0.set(">QGj!_9%}2zt5dE>[", 32);
//    JsonObject jsonObject2 = jsonObject0.merge(jsonObject1);
//    JsonObject jsonObject3 = jsonObject2.set(">QGj!_9%}2zt5dE>[", ">QGj!_9%}2zt5dE>[");
//    char[] charArray0 = new char[7];
//    charArray0[0] = 'j';
//    charArray0[1] = '';
//    charArray0[2] = '!';
//    charArray0[3] = 'Q';
//    charArray0[4] = '}';
//    charArray0[5] = '/';
//    charArray0[6] = '.';
//    PrettyPrint prettyPrint0 = new PrettyPrint(charArray0);
//    jsonObject3.toString((WriterConfig) prettyPrint0);
//    StringWriter stringWriter0 = new StringWriter();
//    jsonObject2.writeTo((Writer) stringWriter0);
//    jsonObject1.indexOf(">QGj!_9%}2zt5dE>[");
//    jsonObject2.contains(">QGj!_9%}2zt5dE>[");
//    JsonObject jsonObject4 = jsonObject2.add(">QGj!_9%}2zt5dE>[", (long) 0);
//    jsonObject4.names();
//    String string1 = "\\";
//    jsonObject1.remove("");
//} 
//
///** 
//* 
//* Method: getValue() 
//* 
//*/ 
//@Test
//public void testGetValue() throws Exception {
//    JsonObject jsonObject0 = new JsonObject();
//    JsonObject.Member jsonObject_Member0 = new JsonObject.Member("", jsonObject0);
//    jsonObject_Member0.getValue();
//    JsonObject.HashIndexTable jsonObject_HashIndexTable0 = new JsonObject.HashIndexTable();
//    jsonObject0.remove("");
//    jsonObject_HashIndexTable0.add("", 1);
//    JsonObject jsonObject1 = jsonObject0.asObject();
//    JsonObject jsonObject2 = jsonObject1.asObject();
//    jsonObject2.getFloat("", 0.0F);
//    JsonObject jsonObject3 = jsonObject2.add("", false);
//    jsonObject3.get("");
//    PrettyPrint.singleLine();
//} 
//
///** 
//* 
//* Method: equals(Object object) 
//* 
//*/ 
//@Test
//public void testEqualsObject() throws Exception {
//    JsonObject jsonObject0 = new JsonObject();
//    String string0 = "-.%UaU/Z+S}!gE(+=1h";
//    JsonObject jsonObject1 = jsonObject0.set("-.%UaU/Z+S}!gE(+=1h", 0.0);
//    jsonObject0.getLong("-.%UaU/Z+S}!gE(+=1h", 0L);
//    JsonObject.unmodifiableObject(jsonObject1);
//    JsonObject jsonObject2 = new JsonObject();
//    jsonObject0.contains("-.%UaU/Z+S}!gE(+=1h");
//    JsonObject.Member jsonObject_Member0 = new JsonObject.Member("object is null", jsonObject2);
//    JsonObject.Member jsonObject_Member1 = new JsonObject.Member("object is null", jsonObject0);
//    jsonObject_Member0.equals(jsonObject_Member1);
//} 
//
///** 
//* 
//* Method: add(String name, int index) 
//* 
//*/ 
//@Test
//public void testAddForNameIndex() throws Exception {
//    JsonObject.HashIndexTable jsonObject_HashIndexTable0 = new JsonObject.HashIndexTable();
//    jsonObject_HashIndexTable0.add("151556", 2715);
//    JsonObject.HashIndexTable jsonObject_HashIndexTable1 = new JsonObject.HashIndexTable();
//    JsonObject.readFrom("{\"cumt\":1909}");
//} 
//
///** 
//* 
//* Method: remove(int index) 
//* 
//*/ 
//@Test
//public void testRemoveIndex() throws Exception {
//    JsonObject.HashIndexTable jsonObject_HashIndexTable0 = new JsonObject.HashIndexTable();
//    jsonObject_HashIndexTable0.remove((-3293));
//    JsonObject jsonObject0 = new JsonObject();
//    JsonObject jsonObject1 = new JsonObject(jsonObject0);
//    JsonObject jsonObject2 = new JsonObject(jsonObject1);
//    JsonObject jsonObject3 = jsonObject2.set("8'", (double) (-3293));
//    jsonObject0.getFloat("", (-3293));
//    jsonObject_HashIndexTable0.remove((-3293));
//    StringWriter stringWriter0 = new StringWriter();
//    jsonObject2.writeTo((Writer) stringWriter0);
//    jsonObject1.add("8'", (-3293.0F));
//    jsonObject1.getFloat("8'", (-3293.0F));
//    JsonObject jsonObject4 = new JsonObject(jsonObject2);
//    JsonObject.Member jsonObject_Member0 = new JsonObject.Member("lYCup1=`KM~$X%q$3", jsonObject1);
//    JsonObject jsonObject5 = JsonObject.unmodifiableObject(jsonObject3);
//    jsonObject_Member0.equals(jsonObject5);
//    jsonObject4.add("9nu{8j| .]NK#)", (long) (-3293));
//    Assert.assertTrue(jsonObject2.equals((Object)jsonObject1));
//    Assert.assertTrue(jsonObject1.equals((Object)jsonObject3));
//} 
//

} 

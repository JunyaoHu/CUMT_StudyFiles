package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

/** 
* JsonParser Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>7月 4, 2022</pre> 
* @version 1.0 
*/ 
public class JsonParserTest {
    JsonParser jsonParser;
    JsonHandler<JsonArray, JsonObject> jsonHandler;
@Before
public void before() throws Exception {
    jsonHandler = new JsonHandler<JsonArray, JsonObject>() {

    };
    jsonParser = new JsonParser(jsonHandler);
} 

@After
public void after() throws Exception { 
}

@Test (expected = NullPointerException.class)
public void test1() throws Exception {
    JsonHandler<JsonArray, JsonObject> jsonHandler1 = null;
    new JsonParser(jsonHandler1);

}
    /**
* 
* Method: parse(String string) 
* 
*/ 
@Test
public void testParseString() throws Exception {
    jsonParser.parse("[1,2,3,\"h\"]");
    Assert.assertEquals("[[, 1, ,, 2, ,, 3, ,, \", h, \", ]]", Arrays.toString(jsonParser.buffer));
}

@Test(expected = NullPointerException.class)
public void testParseString0() throws Exception {
    String string = null;
    jsonParser.parse(string);
}

    /**
* 
* Method: parse(Reader reader) 
* 
*/ 
@Test
public void testParseReader() throws Exception {
    Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
    JsonParser jsonParser0 = new JsonParser(jsonHandler0);
    StringReader stringReader0 = new StringReader("null");
    jsonParser0.parse((Reader) stringReader0);
    Assert.assertEquals((-1), jsonParser0.fill);

} 

/** 
* 
* Method: parse(Reader reader, int buffersize) 
* 
*/ 
@Test
public void testParseForReaderBuffersize() throws Exception {
	Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
    JsonParser jsonParser1 = new JsonParser(jsonHandler0);
    StringReader stringReader1 = new StringReader("true");
    jsonParser1.parse((Reader) stringReader1, 44);
    Assert.assertEquals((-1), jsonParser1.fill);
} 

/** 
* 
* Method: getLocation() 
* 
*/ 
@Test
public void testGetLocation() throws Exception {
    Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
    JsonParser jsonParser0 = new JsonParser(jsonHandler0);
    Location location0 = jsonParser0.getLocation();
    Assert.assertEquals((-1), location0.offset);
    Assert.assertEquals(0, location0.column);
    Assert.assertEquals(0, location0.line);
}


    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        Json.DefaultHandler json_DefaultHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(json_DefaultHandler0);
        StringReader stringReader0 = new StringReader("8237e9");
        jsonParser0.parse((Reader) stringReader0);
        jsonParser0.parse("8237e9");
        Assert.assertEquals((-1), jsonParser0.fill);
    }



    @Test(timeout = 4000)
    public void test22()  throws Throwable  {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        StringReader stringReader0 = new StringReader("44");
        jsonParser0.parse((Reader) stringReader0);
        Assert.assertEquals((-1), jsonParser0.fill);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test00() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse("\" ");
    }



    @Test(timeout = 4000, expected = IllegalArgumentException.class)
    public void test02() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        StringReader stringReader0 = new StringReader("R@B]!>=/f@PIk4(");
        jsonParser0.parse((Reader) stringReader0, (-5177));

    } //7652




    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        StringReader stringReader0 = new StringReader("8");
        jsonParser0.parse((Reader) stringReader0);

    } //x

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test08() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        StringReader stringReader0 = new StringReader("\"ed,");

        jsonParser0.parse((Reader) stringReader0);
    }

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test09() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse("30CAlu\tMSWz");
    }

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test10() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(null);
        jsonParser0.parse("[0CAlu\tMWz");
    } //7665

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        StringReader stringReader0 = new StringReader("true");
        jsonParser0.parse((Reader) stringReader0, 44);
        Assert.assertEquals((-1), jsonParser0.fill);
    }

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test12() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        StringReader stringReader0 = new StringReader("30CAlu\tMSWz");
        jsonParser0.parse((Reader) stringReader0, 34);

    }

    @Test(timeout = 4000, expected = NullPointerException.class)
    public void test13() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse((Reader) null, (-701));

    }

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test14() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);

        jsonParser0.parse(" at ");

    }//7716

    @Test(timeout = 4000, expected = NullPointerException.class)
    public void test15() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(null);
        jsonParser0.parse("{}");
        Assert.assertEquals((-1), jsonParser0.fill);
    }

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test16() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(null);
        jsonParser0.parse("{F");

    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse("9");
        Assert.assertEquals((-1), jsonParser0.fill);
    }


    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test19() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        StringReader stringReader0 = new StringReader("7My");
        jsonParser0.parse((Reader) stringReader0);

    }

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test20() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse("6lyD\"t#i(HDVb0-hMZt");

    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse("5");
        Assert.assertEquals((-1), jsonParser0.fill);
    }


    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test23() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse("2ECTUvxsTR['_");

    }

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test24() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse("1~$0*ZO0%7");

    }

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test25() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse("-");

    } //7766

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test26() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse("\"\"de,");


    }

    @Test(timeout = 4000, expected = IllegalArgumentException.class)
    public void test27() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        StringReader stringReader0 = new StringReader("net.mooctest.Json$DefaultHa@dler");
        jsonParser0.parse((Reader) stringReader0, 0);

    }

    @Test(timeout = 4000, expected = NullPointerException.class)
    public void test28() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse((String) null);

    }

    @Test(timeout = 4000, expected = NullPointerException.class)
    public void test29() throws Throwable {
        JsonParser jsonParser0 = null;
        jsonParser0 = new JsonParser((JsonHandler<?, ?>) null);

    }

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test30() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse("net.mooctest.JsonWriter");

    }

    @Test(timeout = 4000, expected = NullPointerException.class)
    public void test31() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse((Reader) null);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        Json.DefaultHandler jsonHandler0 = new Json.DefaultHandler();
        JsonParser jsonParser0 = new JsonParser(jsonHandler0);
        jsonParser0.parse("false");
        Assert.assertEquals((-1), jsonParser0.fill);
    } //7779
    
    
    
    
    
} 

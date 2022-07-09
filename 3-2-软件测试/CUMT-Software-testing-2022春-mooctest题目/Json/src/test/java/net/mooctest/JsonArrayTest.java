package net.mooctest;

import net.mooctest.JsonArray;
import net.mooctest.JsonValue;
import net.mooctest.JsonWriter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

/**
 * JsonArray Tester.
 *
 * @author Hujunyao CUMT CS 2019-4 06192081
 * @since <pre>7月 4, 2022</pre>
 * @version 1.0
 */
public class JsonArrayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: readFrom(Reader reader)
     *
     */
    @Test
    public void testReadFromReader() throws Exception {
        JsonArray jsonArray0 = JsonArray.readFrom("[\n\t\n]");
        Assert.assertEquals(0, jsonArray0.size());
    }

    /**
     *
     * Method: readFrom(String string)
     *
     */
    @Test
    public void testReadFromString() throws Exception {
        StringReader stringReader0 = new StringReader("[1,2,3]");
        JsonArray jsonArray0 = JsonArray.readFrom((Reader) stringReader0);
        Assert.assertEquals(3, jsonArray0.size());
    }

    /**
     *
     * Method: unmodifiableArray(JsonArray array)
     *
     */
    @Test
    public void testUnmodifiableArray() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.add(1530L);
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);
        Assert.assertFalse(jsonArray1.isNull());
    }

    /**
     *
     * Method: add(String value)
     *
     */
    @Test
    public void testAddString() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add((String) null);
        Assert.assertFalse(jsonArray1.isEmpty());
    }


    @Test(timeout = 4000)
    public void testAddBoolean()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add(true);
        Assert.assertFalse(jsonArray1.isNull());
    }

    @Test(timeout = 4000)
    public void testAddFloat()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add(0.0F);
        Assert.assertFalse(jsonArray1.isObject());
    }

    @Test(timeout = 4000)
    public void testAddInt()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add(1909);
        Assert.assertFalse(jsonArray1.isObject());
    }

    @Test(timeout = 4000)
    public void testAddLong()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add(1909L);
        Assert.assertFalse(jsonArray1.isObject());
    }

    @Test(timeout = 4000)
    public void testAddDouble()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add(19.09);
        Assert.assertFalse(jsonArray1.isObject());
    }
    /**
     *
     * Method: set(int index, int value)
     *
     */

    @Test(timeout = 4000)
    public void testSetForIndexJsonValue()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add(0);
        JsonArray jsonArray2 = jsonArray1.set(0, (JsonValue) jsonArray0);
        Assert.assertSame(jsonArray0, jsonArray2);
    }


    @Test(timeout = 4000, expected = NullPointerException.class)
    public void testSetForIndexJsonValue01()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = null;
        jsonArray1.set(0, (JsonValue) jsonArray0);
    }

    @Test(timeout = 4000)
    public void testSetForIndexString()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.add(0);
        JsonArray jsonArray1 = jsonArray0.set(0, (String) null);
        Assert.assertFalse(jsonArray1.isTrue());
    }

    @Test(timeout = 4000)
    public void testSetForIndexLong()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.add((double) 0);
        JsonArray jsonArray1 = jsonArray0.set(0, 1L);
        Assert.assertEquals(1, jsonArray1.size());
    }

    @Test(timeout = 4000)
    public void testSetForIndexInt()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.add(2295L);
        JsonArray jsonArray1 = jsonArray0.set(0, 0);
        Assert.assertSame(jsonArray1, jsonArray0);
    }

    @Test(timeout = 4000)
    public void testSetForIndexFloat()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add((double) 0);
        JsonArray jsonArray2 = jsonArray1.set(0, (float) 0);
        Assert.assertSame(jsonArray2, jsonArray0);
    }

    @Test(timeout = 4000)
    public void testSetForIndexDouble()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add((long) 0);
        JsonArray jsonArray2 = jsonArray1.set(0, (double) 0);
        Assert.assertFalse(jsonArray2.isNull());
    }

    @Test(timeout = 4000)
    public void testSetForIndexBoolean()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add((long) 0);
        JsonArray jsonArray2 = jsonArray1.set(0, true);
        Assert.assertFalse(jsonArray2.isNull());
    }

    /**
     *
     * Method: remove(int index)
     *
     */
    @Test
    public void testRemove() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add(0);
        JsonArray jsonArray2 = jsonArray0.remove(0);
        Assert.assertSame(jsonArray2, jsonArray1);
    }

    /**
     *
     * Method: size()
     *
     */
    @Test
    public void testSize() throws Exception {
        JsonArray jsonArray0 = JsonArray.readFrom("[\n\t\n]");
        Assert.assertEquals(0, jsonArray0.size());

        JsonArray jsonArray01 = new JsonArray();
        int int0 = jsonArray01.size();
        Assert.assertEquals(0, int0);
    }

    /**
     *
     * Method: isEmpty()
     *
     */
    @Test
    public void testIsEmpty() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        Assert.assertTrue(jsonArray0.isEmpty());

        jsonArray0.add(2295L);
        boolean boolean0 = jsonArray0.isEmpty();
        Assert.assertFalse(boolean0);
    }

    /**
     *
     * Method: get(int index)
     *
     */
    @Test
    public void testGet() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add((double) 0);
        JsonValue jsonValue0 = jsonArray1.get(0);
        Assert.assertEquals(0.0F, jsonValue0.asFloat(), 0.01F);
    }

    /**
     *
     * Method: values()
     *
     */
    @Test
    public void testValues() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        List<JsonValue> list0 = jsonArray0.values();
        Assert.assertEquals(0, list0.size());
    }

    /**
     *
     * Method: iterator()
     *
     */
    @Test
    public void testIterator() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        Iterator<JsonValue> iterator0 = jsonArray0.iterator();
        Assert.assertNotNull(iterator0);
    }

    /**
     *
     * Method: write(JsonWriter writer)
     *
     */
    @Test
    public void testWrite() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add((long) 0);
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonArray1.write(jsonWriter0);
        Assert.assertEquals("[0]", stringWriter0.toString());
    }

    /**
     *
     * Method: isArray()
     *
     */
    @Test
    public void testIsArray() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        boolean boolean0 = jsonArray0.isArray();
        Assert.assertTrue(boolean0);
    }

    /**
     *
     * Method: asArray()
     *
     */
    @Test
    public void testAsArray() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.asArray();
        Assert.assertSame(jsonArray0, jsonArray1);
    }

    /**
     *
     * Method: hashCode()
     *
     */
    @Test
    public void testHashCode() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.hashCode();
    }

    /**
     *
     * Method: equals(Object object)
     *
     */
    @Test
    public void testEquals() throws Exception {
        JsonArray jsonArray0 = new JsonArray();
        Object object0 = new Object();
        boolean boolean0 = jsonArray0.equals(object0);
        Assert.assertFalse(boolean0);

        JsonArray jsonArray1 = new JsonArray();
        boolean boolean1 = jsonArray1.equals((Object) null);
        Assert.assertFalse(boolean1);

        JsonArray jsonArray2 = new JsonArray();
        boolean boolean2 = jsonArray2.equals(jsonArray2);
        Assert.assertTrue(boolean2);


    }

    @Test(timeout = 4000)
    public void test52()  throws Throwable  {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = new JsonArray(jsonArray0);
        Assert.assertTrue(jsonArray1.equals((Object)jsonArray0));

        jsonArray0.add((long) 0);
        boolean boolean0 = jsonArray0.equals(jsonArray1);
        Assert.assertFalse(jsonArray1.equals((Object)jsonArray0));
        Assert.assertFalse(boolean0);
    }

    
    
    
    
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.add(1530L);
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);
        Assert.assertFalse(jsonArray1.isNull());
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add(0);
        JsonArray jsonArray2 = jsonArray1.set(0, (JsonValue) jsonArray0);
        Assert.assertSame(jsonArray0, jsonArray2);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.add(0);
        JsonArray jsonArray1 = jsonArray0.set(0, (String) null);
        Assert.assertFalse(jsonArray1.isTrue());
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.add((double) 0);
        JsonArray jsonArray1 = jsonArray0.set(0, 1L);
        Assert.assertEquals(1, jsonArray1.size());
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.add(2295L);
        JsonArray jsonArray1 = jsonArray0.set(0, 0);
        Assert.assertSame(jsonArray1, jsonArray0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add((double) 0);
        JsonArray jsonArray2 = jsonArray1.set(0, (float) 0);
        Assert.assertSame(jsonArray2, jsonArray0);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add((long) 0);
        JsonArray jsonArray2 = jsonArray1.set(0, (double) 0);
        Assert.assertFalse(jsonArray2.isNull());
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add(0);
        JsonArray jsonArray2 = jsonArray0.remove(0);
        Assert.assertSame(jsonArray2, jsonArray1);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        JsonArray jsonArray0 = JsonArray.readFrom("[\n\t\n]");
        Assert.assertEquals(0, jsonArray0.size());
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        Iterator<JsonValue> iterator0 = jsonArray0.iterator();
        Assert.assertNotNull(iterator0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add((double) 0);
        JsonValue jsonValue0 = jsonArray1.get(0);
        Assert.assertEquals(0.0F, jsonValue0.asFloat(), 0.01F);
    }

    @Test(timeout = 4000, expected = NullPointerException.class)
    public void test11() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        PrettyPrint prettyPrint0 = PrettyPrint.indentWithTabs();
        JsonWriter jsonWriter0 = prettyPrint0.createWriter((Writer) null);

        jsonArray0.write(jsonWriter0);
    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test12() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);

        jsonArray1.set(1, true);
    }

    @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
    public void test13() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();

        jsonArray0.set((-2), false);

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test14() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);
        jsonArray1.set((-590), (JsonValue) jsonArray0);

    }

    @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
    public void test15() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();

        jsonArray0.set((-4901), (JsonValue) jsonArray0);

    }

    @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
    public void test16() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.set((-643), "uCu%Y;nNz__Se#s&=");

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test17() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);

        jsonArray1.set(472, (long) 472);

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test18() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);
        jsonArray1.set((-1), 1755);
    }

    @Test(timeout = 4000, expected = IndexOutOfBoundsException.class)
    public void test19() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.set(5, 5);
    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test20() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);
        jsonArray1.set((-3585), 965.9589F);

    }

    @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
    public void test21() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();

        jsonArray0.set((-3349), (float) (-3349));

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test22() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);

        jsonArray1.set(1532, (double) 1532);

    }

    @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
    public void test23() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.set((-1898), (-133.4547883890548));

    }

    @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
    public void test24() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();

        jsonArray0.remove((-217));

    }

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test25() throws Throwable {

        JsonArray.readFrom("");

    }

    @Test(timeout = 4000, expected = NullPointerException.class)
    public void test26() throws Throwable {
        JsonArray.readFrom((String) null);
    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test27() throws Throwable {
        StringReader stringReader0 = new StringReader("false");
        JsonArray.readFrom((Reader) stringReader0);

    }

    @Test(timeout = 4000, expected = NullPointerException.class)
    public void test28() throws Throwable {

            JsonArray.readFrom((Reader) null);

    }

    @Test(timeout = 4000,expected = IOException.class)
    public void test29() throws Throwable {
        StringReader stringReader0 = new StringReader(":*<ejk.qXnivNkc");
        stringReader0.close();

            JsonArray.readFrom((Reader) stringReader0);

    }

    @Test(timeout = 4000, expected = IndexOutOfBoundsException.class)
    public void test30() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
            jsonArray0.get(8);

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test31() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);
        jsonArray1.add(true);

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test32() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);
        jsonArray1.add((JsonValue) jsonArray0);

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test33() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);

        jsonArray1.add("7y |Ea");

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test34() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);

        jsonArray1.add(1L);

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test35() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);
        jsonArray1.add((-1));

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test36() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);

        jsonArray1.add(1794.661F);

    }

    @Test(timeout = 4000,expected = NullPointerException.class)
    public void test37() throws Throwable {
        JsonArray jsonArray0 = null;

            jsonArray0 = new JsonArray((JsonArray) null);

    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        Assert.assertTrue(jsonArray0.isEmpty());

        jsonArray0.add(2295L);
        boolean boolean0 = jsonArray0.isEmpty();
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        int int0 = jsonArray0.size();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000,expected = IndexOutOfBoundsException.class)
    public void test40() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();

            jsonArray0.set(756, 199L);

    }

    @Test(timeout = 4000,expected = IndexOutOfBoundsException.class)
    public void test41() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();

            jsonArray0.set(1532, (double) 1532);

    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        boolean boolean0 = jsonArray0.isArray();
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add((String) null);
        Assert.assertFalse(jsonArray1.isEmpty());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        Object object0 = new Object();
        boolean boolean0 = jsonArray0.equals(object0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        boolean boolean0 = jsonArray0.equals((Object) null);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        boolean boolean0 = jsonArray0.equals(jsonArray0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        boolean boolean0 = jsonArray0.isEmpty();
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000,expected = NullPointerException.class)
    public void test48() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();

            jsonArray0.set(1, (JsonValue) null);

    }

    @Test(timeout = 4000,expected = IndexOutOfBoundsException.class)
    public void test49() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
            jsonArray0.set(0, (JsonValue) jsonArray0);

    }

    @Test(timeout = 4000,expected = NullPointerException.class)
    public void test50() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
            jsonArray0.add((JsonValue) null);

    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.add((JsonValue) jsonArray0);
        JsonArray jsonArray1 = jsonArray0.set(0, false);
        Assert.assertFalse(jsonArray1.isObject());
    }

//    @Test(timeout = 4000)
//    public void test52() throws Throwable {
//        JsonArray jsonArray0 = new JsonArray();
//        JsonArray jsonArray1 = new JsonArray(jsonArray0);
//        Assert.assertTrue(jsonArray1.equals((Object) jsonArray0));
//
//        jsonArray0.add((long) 0);
//        boolean boolean0 = jsonArray0.equals(jsonArray1);
//        Assert.assertFalse(jsonArray1.equals((Object) jsonArray0));
//        Assert.assertFalse(boolean0);
//    }

    @Test(timeout = 4000,expected = NullPointerException.class)
    public void test53() throws Throwable {
            JsonArray.unmodifiableArray((JsonArray) null);

    }

    @Test(timeout = 4000, expected = IndexOutOfBoundsException.class)
    public void test54() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.set(1, true);

    }

    @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
    public void test55() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.set((-1), 1755);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.asArray();
        Assert.assertSame(jsonArray0, jsonArray1);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add((long) 0);
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonArray1.write(jsonWriter0);
        Assert.assertEquals("[0]", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.hashCode();
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        List<JsonValue> list0 = jsonArray0.values();
        Assert.assertEquals(0, list0.size());
    }

    @Test(timeout = 4000, expected = IndexOutOfBoundsException.class)
    public void test60() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.set(0, (String) null);

    }

    @Test(timeout = 4000)
    public void test61() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add(true);
        Assert.assertFalse(jsonArray1.isNull());
    }

    @Test(timeout = 4000, expected = IndexOutOfBoundsException.class)
    public void test62() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.remove(0);

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test63() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = JsonArray.unmodifiableArray(jsonArray0);

        jsonArray1.add((double) 0);

    }

    @Test(timeout = 4000, expected = RuntimeException.class)
    public void test64() throws Throwable {
        StringReader stringReader0 = new StringReader("");

        JsonArray.readFrom((Reader) stringReader0);

    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        JsonArray jsonArray1 = jsonArray0.add(0.0F);
        Assert.assertFalse(jsonArray1.isObject());
    }

    @Test(timeout = 4000, expected = IndexOutOfBoundsException.class)
    public void test66() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();

        jsonArray0.set(2, (float) 2);

    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();
        jsonArray0.add((-16));
        JsonArray jsonArray1 = jsonArray0.asArray();
        Assert.assertFalse(jsonArray1.isObject());
    }

    @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
    public void test68() throws Throwable {
        JsonArray jsonArray0 = new JsonArray();

        jsonArray0.get((-16));

    }

    @Test(timeout = 4000, expected = UnsupportedOperationException.class)
    public void test69() throws Throwable {
        JsonArray.readFrom("2");
    }
    
    
    
    
    
    

} 

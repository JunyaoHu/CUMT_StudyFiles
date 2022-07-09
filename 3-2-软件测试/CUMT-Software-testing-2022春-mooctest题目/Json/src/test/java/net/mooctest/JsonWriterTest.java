package net.mooctest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;

/**
 * JsonWriter Tester.
 *
 * @author Hujunyao CUMT CS 2019-4 06192081
 * @version 1.0
 * @since <pre>7�� 2, 2022</pre>
 */
public class JsonWriterTest {
    JsonWriter jsonWriter;
    WritingBuffer writingBuffer;

    @Before
    public void before() throws Exception {
        writingBuffer= new WritingBuffer(new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                System.out.println(1);
            }

            @Override
            public void flush() throws IOException {
                System.out.println(2);
            }

            @Override
            public void close() throws IOException {
                System.out.println(3);
            }
        });
        jsonWriter = new JsonWriter(writingBuffer);
    }


    /**
     * Method: writeLiteral(String value)
     */
    @Test
    public void testWriteLiteral() throws Exception {
        jsonWriter.writeLiteral("qqq");
    }

    /**
     * Method: writeNumber(String string)
     */
    @Test
    public void testWriteNumber() throws Exception {
        jsonWriter.writeNumber("123");
    }

    /**
     * Method: writeString(String string)
     */
    @Test
    public void testWriteString() throws Exception {
        jsonWriter.writeString("emmm");
    }

    /**
     * Method: writeArrayOpen()
     */
    @Test
    public void testWriteArrayOpen() throws Exception {
        jsonWriter.writeArrayOpen();
    }

    /**
     * Method: writeArrayClose()
     */
    @Test
    public void testWriteArrayClose() throws Exception {
        jsonWriter.writeArrayClose();
    }

    /**
     * Method: writeArraySeparator()
     */
    @Test
    public void testWriteArraySeparator() throws Exception {
        jsonWriter.writeArraySeparator();
    }

    /**
     * Method: writeObjectOpen()
     */
    @Test
    public void testWriteObjectOpen() throws Exception {
        jsonWriter.writeObjectOpen();
    }

    /**
     * Method: writeObjectClose()
     */
    @Test
    public void testWriteObjectClose() throws Exception {
        jsonWriter.writeObjectClose();
    }

    /**
     * Method: writeMemberName(String name)
     */
    @Test
    public void testWriteMemberName() throws Exception {
        jsonWriter.writeMemberName("abcd");
    }

    /**
     * Method: writeMemberSeparator()
     */
    @Test
    public void testWriteMemberSeparator() throws Exception {
        jsonWriter.writeMemberSeparator();
    }

    /**
     * Method: writeObjectSeparator()
     */
    @Test
    public void testWriteObjectSeparator() throws Exception {
        jsonWriter.writeObjectSeparator();
    }

    /**
     * Method: writeJsonString(String string)
     */
    @Test
    public void testWriteJsonString() throws Exception {
        jsonWriter.writeJsonString("hjy[1]\\\"\n\r\t");
        Assert.assertEquals(Arrays.toString(new char[]{'h','j','y','[','1',']','\\', '\\', '\\', '\"', '\\', 'n', '\\', 'r', '\\', 't'}), Arrays.toString(writingBuffer.buffer));
    }


    /**
     * Method: getReplacementChars(char ch)
     */
    @Test
    public void testGetReplacementChars() throws Exception {

        Assert.assertNull(JsonWriter.getReplacementChars('a'));
        Assert.assertNull(JsonWriter.getReplacementChars('A'));
        Assert.assertNull(JsonWriter.getReplacementChars('1'));
        Assert.assertEquals(Arrays.toString(new char[]{'\\', 'u', '2', '0', '2', '8'}), Arrays.toString(JsonWriter.getReplacementChars('\u2028')));
        Assert.assertEquals(Arrays.toString(new char[]{'\\', 'u', '2', '0', '2', '9'}), Arrays.toString(JsonWriter.getReplacementChars('\u2029')));
        Assert.assertEquals(Arrays.toString(new char[]{'\\','\\'}), Arrays.toString(JsonWriter.getReplacementChars('\\')));
        Assert.assertEquals(Arrays.toString(new char[]{'\\','"'}), Arrays.toString(JsonWriter.getReplacementChars('\"')));
        Assert.assertEquals(Arrays.toString(new char[]{'\\','n'}), Arrays.toString(JsonWriter.getReplacementChars('\n')));
        Assert.assertEquals(Arrays.toString(new char[]{'\\','r'}), Arrays.toString(JsonWriter.getReplacementChars('\r')));
        Assert.assertEquals(Arrays.toString(new char[]{'\\','t'}), Arrays.toString(JsonWriter.getReplacementChars('\t')));
        Assert.assertEquals(Arrays.toString(new char[]{'\\', 'u', '0', '0', '1', 'a'}), Arrays.toString(JsonWriter.getReplacementChars('\u001a')));

    }
    
    

    
    
  



    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        StringWriter stringWriter0 = new StringWriter();
        JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
        jsonWriter0.writeJsonString("wA2N!m^\"NW{L;K:Ua%");
        Assert.assertEquals("wA2N!m^\\\"NW{L;K:Ua%", stringWriter0.toString());
    }


    
    
    

    
    
    
    
    
    
    
    

} 

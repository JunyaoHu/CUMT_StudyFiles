package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/** 
* PrettyPrint Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>6月 29, 2022</pre> 
* @version 1.0 
*/ 
public class PrettyPrintTest {
    PrettyPrint prettyPrint;
    Writer writer = new Writer() {
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            writingBuffer.write(cbuf, off, len);
        }

        @Override
        public void flush() throws IOException {
            writingBuffer.flush();
//            System.out.println(writingBuffer.buffer);
        }

        @Override
        public void close() throws IOException {
            writingBuffer.close();
        }
    };
    WritingBuffer writingBuffer = new WritingBuffer(writer, 200);
    PrettyPrint.PrettyPrintWriter prettyPrintWriter;

    PrettyPrint prettyPrint1;
    PrettyPrint.PrettyPrintWriter prettyPrintWriter1;



    @Before
public void before() throws Exception {
    prettyPrint = new PrettyPrint(new char[]{'-','-'});
    prettyPrintWriter = (PrettyPrint.PrettyPrintWriter) prettyPrint.createWriter(writer);
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: singleLine() 
* 
*/ 
@Test
public void testSingleLine() throws Exception {
    PrettyPrint.singleLine();
} 

/** 
* 
* Method: indentWithSpaces(int number) 
* 
*/ 
@Test(expected = IllegalArgumentException.class)
public void testIndentWithSpaces() throws Exception {
    PrettyPrint.indentWithSpaces(-2);
}

@Test
public void testIndentWithSpaces1() throws Exception {
    PrettyPrint.indentWithSpaces(4);
}

    /**
* 
* Method: indentWithTabs() 
* 
*/ 
@Test
public void testIndentWithTabs() throws Exception {
    PrettyPrint.indentWithTabs();
} 

/** 
* 
* Method: createWriter(Writer writer) 
* 
*/ 
@Test
public void testCreateWriter() throws Exception {
    prettyPrint.createWriter(writer);


} 

/** 
* 
* Method: writeArrayOpen() 
* 
*/ 
@Test
public void testWriteArrayOpen() throws Exception {
    String string = "[\n--";
    prettyPrintWriter.writeArrayOpen();
    for ( int i = 0; i < writingBuffer.fill; i++) {
            System.out.print(writingBuffer.buffer[i]);
            Assert.assertEquals(string.charAt(i), writingBuffer.buffer[i]);
    }
    Assert.assertEquals(string.length(), writingBuffer.fill);
}

/** 
* 
* Method: writeArrayClose() 
* 
*/ 
@Test
public void testWriteArrayClose() throws Exception {
    String string = "\n]";
    prettyPrintWriter.writeArrayClose();
    for ( int i = 0; i < writingBuffer.fill; i++) {
        System.out.print(writingBuffer.buffer[i]);
        Assert.assertEquals(string.charAt(i), writingBuffer.buffer[i]);
    }
    Assert.assertEquals(string.length(), writingBuffer.fill);
} 

/** 
* 
* Method: writeArraySeparator() 
* 
*/ 
@Test
public void testWriteArraySeparator() throws Exception {
    String string = ",\n";
    prettyPrintWriter.writeArraySeparator();
    for ( int i = 0; i < writingBuffer.fill; i++) {
        System.out.print(writingBuffer.buffer[i]);
        Assert.assertEquals(string.charAt(i), writingBuffer.buffer[i]);
    }
    Assert.assertEquals(string.length(), writingBuffer.fill);
} 

/** 
* 
* Method: writeObjectOpen() 
* 
*/ 
@Test
public void testWriteObjectOpen() throws Exception {
    String string = "{\n--";
    prettyPrintWriter.writeObjectOpen();
    for ( int i = 0; i < writingBuffer.fill; i++) {
        System.out.print(writingBuffer.buffer[i]);
        Assert.assertEquals(string.charAt(i), writingBuffer.buffer[i]);
    }
    Assert.assertEquals(string.length(), writingBuffer.fill);
} 

/** 
* 
* Method: writeObjectClose() 
* 
*/ 
@Test
public void testWriteObjectClose() throws Exception {
    String string = "\n}";
    prettyPrintWriter.writeObjectClose();
    for ( int i = 0; i < writingBuffer.fill; i++) {
        System.out.print(writingBuffer.buffer[i]);
        Assert.assertEquals(string.charAt(i), writingBuffer.buffer[i]);
    }
    Assert.assertEquals(string.length(), writingBuffer.fill);
} 

/** 
* 
* Method: writeMemberSeparator() 
* 
*/ 
@Test
public void testWriteMemberSeparator() throws Exception {
    String string = ": ";
    prettyPrintWriter.writeMemberSeparator();
    for ( int i = 0; i < writingBuffer.fill; i++) {
        System.out.print(writingBuffer.buffer[i]);
        Assert.assertEquals(string.charAt(i), writingBuffer.buffer[i]);
    }
    Assert.assertEquals(string.length(), writingBuffer.fill);
} 

/** 
* 
* Method: writeObjectSeparator() 
* 
*/ 
@Test
public void testWriteObjectSeparator() throws Exception {
    String string = ",\n";
    prettyPrintWriter.writeObjectSeparator();
    for ( int i = 0; i < writingBuffer.fill; i++) {
        System.out.print(writingBuffer.buffer[i]);
        Assert.assertEquals(string.charAt(i), writingBuffer.buffer[i]);
    }
    Assert.assertEquals(string.length(), writingBuffer.fill);
} 


/** 
* 
* Method: writeNewLine() 
* 
*/ 
@Test
public void testWriteNewLine() throws Exception {
    String string = "[\n--\n--\n]\n";
    prettyPrintWriter.writeArrayOpen();
    Assert.assertTrue(prettyPrintWriter.writeNewLine());
    prettyPrintWriter.writeArrayClose();
    Assert.assertTrue(prettyPrintWriter.writeNewLine());
    for ( int i = 0; i < writingBuffer.fill; i++) {
        System.out.print(writingBuffer.buffer[i]);
        Assert.assertEquals(string.charAt(i), writingBuffer.buffer[i]);
    }
    Assert.assertEquals(string.length(), writingBuffer.fill);

}

@Test
public void testWriteNewLine01() throws Exception {
    prettyPrint1 = new PrettyPrint(null);
    prettyPrintWriter1 = (PrettyPrint.PrettyPrintWriter) prettyPrint1.createWriter(writer);

    String string = "[]";
    prettyPrintWriter1.writeArrayOpen();
    Assert.assertFalse(prettyPrintWriter1.writeNewLine());
    prettyPrintWriter1.writeArrayClose();
    Assert.assertFalse(prettyPrintWriter1.writeNewLine());
    for ( int i = 0; i < writingBuffer.fill; i++) {
        System.out.print(writingBuffer.buffer[i]);
        Assert.assertEquals(string.charAt(i), writingBuffer.buffer[i]);
    }
    Assert.assertEquals(string.length(), writingBuffer.fill);

}


@Test(timeout = 4000)
public void test02()  throws Throwable  {
    PrettyPrint prettyPrint0 = PrettyPrint.singleLine();
    StringWriter stringWriter0 = new StringWriter();
    JsonWriter jsonWriter0 = prettyPrint0.createWriter(stringWriter0);
    jsonWriter0.writeObjectSeparator();
    Assert.assertEquals(", ", stringWriter0.toString());
}

@Test(timeout = 4000)
public void test03()  throws Throwable  {
    char[] charArray0 = new char[5];
    PrettyPrint prettyPrint0 = new PrettyPrint(charArray0);
    StringWriter stringWriter0 = new StringWriter();
    JsonWriter jsonWriter0 = prettyPrint0.createWriter(stringWriter0);
    jsonWriter0.writeObjectSeparator();
    Assert.assertEquals(",\n", stringWriter0.toString());
}

@Test(timeout = 4000)
public void test04()  throws Throwable  {
    PrettyPrint prettyPrint0 = new PrettyPrint((char[]) null);
    StringWriter stringWriter0 = new StringWriter();
    JsonWriter jsonWriter0 = prettyPrint0.createWriter(stringWriter0);
    jsonWriter0.writeArraySeparator();
    Assert.assertEquals(", ", stringWriter0.toString());
}

@Test(timeout = 4000)
public void test05()  throws Throwable  {
    PrettyPrint prettyPrint0 = PrettyPrint.indentWithTabs();
    StringWriter stringWriter0 = new StringWriter(3092);
    JsonWriter jsonWriter0 = prettyPrint0.createWriter(stringWriter0);
    jsonWriter0.writeArraySeparator();
    Assert.assertEquals(",\n", stringWriter0.toString());
}







} 

package net.mooctest; 

import net.mooctest.WritingBuffer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Writer;

/** 
* WritingBuffer Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>6月 29, 2022</pre> 
* @version 1.0 
*/ 
public class WritingBufferTest {
    WritingBuffer writingBuffer;
    WritingBuffer writingBuffer1;

@Before
public void before() throws Exception {
    writingBuffer = new WritingBuffer(new Writer() {
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            System.out.println("write");
        }

        @Override
        public void flush() throws IOException {
            System.out.println("flush");
        }

        @Override
        public void close() throws IOException {
            System.out.println("close");
        }
    });
    writingBuffer1 = new WritingBuffer(new Writer() {
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            System.out.println("write1");
        }

        @Override
        public void flush() throws IOException {
            System.out.println("flush1");
        }

        @Override
        public void close() throws IOException {
            System.out.println("close1");
        }
    },4);
}


/**
* 
* Method: write(int c) 
* 
*/ 
@Test
public void testWriteC() throws Exception {
    for (int i=0; i<16; i++) writingBuffer.write(65);
    Assert.assertEquals(16, writingBuffer.fill);
    writingBuffer.write(65);
    Assert.assertEquals(1, writingBuffer.fill);

} 

/** 
* 
* Method: write(char[] cbuf, int off, int len) 
* 
*/ 
@Test
public void testWriteForCbufOffLen() throws Exception {
    writingBuffer.write(new char[100], 0, 16);   //F
    Assert.assertEquals(16, writingBuffer.fill);

    writingBuffer.write(new char[]{'a','b'}, 0, 2);   //TF
    Assert.assertEquals(2, writingBuffer.fill);

        writingBuffer.write(new char[100], 0, 18);    //TT
    Assert.assertEquals(0, writingBuffer.fill);

} 

/** 
* 
* Method: write(String str, int off, int len) 
* 
*/ 
@Test
public void testWriteForStrOffLen() throws Exception {
    writingBuffer.write("hjy  hjy  hjy  hjy  hjy  hjy  ", 0, 16);   //F
    Assert.assertEquals(16, writingBuffer.fill);

    writingBuffer.write("hjy  ", 0, 5);   //TF
    Assert.assertEquals(5, writingBuffer.fill);

    writingBuffer.write("hjy  hjy  hjy  hjy  hjy  hjy  ", 0, 18);    //TT
    Assert.assertEquals(0, writingBuffer.fill);


} 

/** 
* 
* Method: flush() 
* 
*/ 
@Test
public void testFlush() throws Exception {
    writingBuffer.flush();
    Assert.assertEquals(0, writingBuffer.fill);

} 

/** 
* 
* Method: close() 
* 
*/ 
@Test
public void testClose() throws Exception {
    writingBuffer.close();
} 


} 

/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* NonLeafID Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5\u951f\u65a4\u62f7 31, 2022</pre> 
* @version 1.0 
*/ 
public class NonLeafIDTest {static class __CLR4_4_1p3p3l3zcayti{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314776001L,8589935092L,1014,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; 

/** 
* 
* Method: getLeft() 
* 
*/ 
@Test
public void testGetLeft() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119gyuqp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testGetLeft",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119gyuqp3() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(903);
    __CLR4_4_1p3p3l3zcayti.R.inc(904);NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    __CLR4_4_1p3p3l3zcayti.R.inc(905);Assert.assertTrue(nlid.getLeft().isZero());
}finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

/** 
* 
* Method: getRight() 
* 
*/ 
@Test
public void testGetRight() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_179kbxbp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testGetRight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_179kbxbp6() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(906);
    __CLR4_4_1p3p3l3zcayti.R.inc(907);NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    __CLR4_4_1p3p3l3zcayti.R.inc(908);Assert.assertTrue(nlid.getRight().isOne());
}finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}} 

/** 
* 
* Method: isOne() 
* 
*/ 
@Test
public void testIsOne() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12f4n7zp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testIsOne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12f4n7zp9() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(909);
    __CLR4_4_1p3p3l3zcayti.R.inc(910);NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    __CLR4_4_1p3p3l3zcayti.R.inc(911);Assert.assertFalse(nlid.isOne());
}finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

/** 
* 
* Method: isZero() 
* 
*/ 
@Test
public void testIsZero() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec98nppc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testIsZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec98nppc() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(912);
    __CLR4_4_1p3p3l3zcayti.R.inc(913);NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    __CLR4_4_1p3p3l3zcayti.R.inc(914);Assert.assertFalse(nlid.isZero());
}finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}} 

/** 
* 
* Method: isLeaf() 
* 
*/ 
@Test
public void testIsLeaf() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjl5uppf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testIsLeaf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjl5uppf() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(915);
    __CLR4_4_1p3p3l3zcayti.R.inc(916);NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    __CLR4_4_1p3p3l3zcayti.R.inc(917);Assert.assertFalse(nlid.isLeaf());
}finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}} 

/** 
* 
* Method: normalize() 
* 
*/ 
@Test
public void testNormalize() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0t4sepi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testNormalize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0t4sepi() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(918);
    __CLR4_4_1p3p3l3zcayti.R.inc(919);NonLeafID nlid = new NonLeafID(new LeafID(0), new LeafID(1));
    __CLR4_4_1p3p3l3zcayti.R.inc(920);Assert.assertEquals(new NonLeafID((new LeafID(0)).normalize(), (new LeafID(1)).normalize()) ,nlid.normalize());
}finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    /**
    *
    * Method: normalize(ID left, ID right)
    *
    */
    @Test
    public void testNormalizeForLeftRight00() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lzq63ypl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testNormalizeForLeftRight00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lzq63ypl() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(921);
        __CLR4_4_1p3p3l3zcayti.R.inc(922);Assert.assertEquals(IDs.zero(), NonLeafID.normalize(new LeafID(0), new LeafID(0)));
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testNormalizeForLeftRight01() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8q4wfpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testNormalizeForLeftRight01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8q4wfpn() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(923);
        __CLR4_4_1p3p3l3zcayti.R.inc(924);LeafID left = new LeafID(0);
        __CLR4_4_1p3p3l3zcayti.R.inc(925);LeafID right = new LeafID(1);
        __CLR4_4_1p3p3l3zcayti.R.inc(926);Assert.assertEquals(IDs.with(left, right), NonLeafID.normalize(left, right));
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testNormalizeForLeftRight10() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jbizbnpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testNormalizeForLeftRight10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jbizbnpr() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(927);
        __CLR4_4_1p3p3l3zcayti.R.inc(928);LeafID left = new LeafID(1);
        __CLR4_4_1p3p3l3zcayti.R.inc(929);LeafID right = new LeafID(0);
        __CLR4_4_1p3p3l3zcayti.R.inc(930);Assert.assertEquals(IDs.with(left, right), NonLeafID.normalize(left, right));
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testNormalizeForLeftRight11() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g2j0j6pv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testNormalizeForLeftRight11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g2j0j6pv() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(931);
        __CLR4_4_1p3p3l3zcayti.R.inc(932);Assert.assertEquals(IDs.one(), NonLeafID.normalize(new LeafID(1), new LeafID(1)));
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    /**
* 
* Method: split() 
* 
*/ 
@Test
public void testSplit() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o34tg1px();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSplit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o34tg1px() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(933); 
//TODO: Test goes here... 
}finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}} 

/** 
* 
* Method: splitWithLeftZero() 
* 
*/ 
@Test
public void testSplitWithLeftZero() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtnk2kpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSplitWithLeftZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtnk2kpy() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(934);
    __CLR4_4_1p3p3l3zcayti.R.inc(935);LeafID left = new LeafID(0);
    __CLR4_4_1p3p3l3zcayti.R.inc(936);LeafID right = new LeafID(1);
    __CLR4_4_1p3p3l3zcayti.R.inc(937);NonLeafID nlid = new NonLeafID(left,right);
    __CLR4_4_1p3p3l3zcayti.R.inc(938);ID[] result = nlid.splitWithLeftZero();
    __CLR4_4_1p3p3l3zcayti.R.inc(939);Assert.assertEquals("(0, (1, 0))", result[0].toString());
    __CLR4_4_1p3p3l3zcayti.R.inc(940);Assert.assertEquals("(0, (0, 1))", result[1].toString());
}finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}} 

/** 
* 
* Method: splitWithRightZero() 
* 
*/ 
@Test
public void testSplitWithRightZero() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xc87stq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSplitWithRightZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xc87stq5() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(941);
    __CLR4_4_1p3p3l3zcayti.R.inc(942);LeafID left = new LeafID(1);
    __CLR4_4_1p3p3l3zcayti.R.inc(943);LeafID right = new LeafID(0);
    __CLR4_4_1p3p3l3zcayti.R.inc(944);NonLeafID nlid = new NonLeafID(left,right);
    __CLR4_4_1p3p3l3zcayti.R.inc(945);ID[] result = nlid.splitWithRightZero();
    __CLR4_4_1p3p3l3zcayti.R.inc(946);Assert.assertEquals("((1, 0), 0)", result[0].toString());
    __CLR4_4_1p3p3l3zcayti.R.inc(947);Assert.assertEquals("((0, 1), 0)", result[1].toString());
}finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    /**
    *
    * Method: sum(ID other)
    *
    */
    @Test
    public void testSum01() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146lx5tqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSum01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146lx5tqc() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(948);
        __CLR4_4_1p3p3l3zcayti.R.inc(949);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(950);LeafID other = new LeafID(0);
        __CLR4_4_1p3p3l3zcayti.R.inc(951);Assert.assertEquals(nlid,nlid.sum(other));
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testSum02() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17flvyaqg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,117,109,48,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSum02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17flvyaqg() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(952);
        __CLR4_4_1p3p3l3zcayti.R.inc(953);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(954);LeafID other = new LeafID(1);
        __CLR4_4_1p3p3l3zcayti.R.inc(955);nlid.sum(other);
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testSum03() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aoluqrqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSum03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aoluqrqk() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(956);
        __CLR4_4_1p3p3l3zcayti.R.inc(957);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(958);NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(0));
        __CLR4_4_1p3p3l3zcayti.R.inc(959);Assert.assertEquals("(0, 1)",nlid.sum(other).toString());
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testSum04() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxltj8qo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSum04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxltj8qo() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(960);
        __CLR4_4_1p3p3l3zcayti.R.inc(961);NonLeafID nlid = new NonLeafID(new LeafID(1),new LeafID(0));
        __CLR4_4_1p3p3l3zcayti.R.inc(962);NonLeafID other = new NonLeafID(new LeafID(0),new NonLeafID(new LeafID(0), new LeafID(0)));
        __CLR4_4_1p3p3l3zcayti.R.inc(963);Assert.assertEquals("(1, 0)",nlid.sum(other).toString());
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testSum05() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h6lsbpqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSum05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h6lsbpqs() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(964);
        __CLR4_4_1p3p3l3zcayti.R.inc(965);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(0));
        __CLR4_4_1p3p3l3zcayti.R.inc(966);NonLeafID other = new NonLeafID(new LeafID(0),new NonLeafID(new LeafID(1), new LeafID(0)));
        __CLR4_4_1p3p3l3zcayti.R.inc(967);Assert.assertEquals("(0, (1, 0))",nlid.sum(other).toString());
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}
    /**
    *
    * Method: sumNonLeaf(ID other)
    *
    */
    @Test
    public void testSumNonLeaf00() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6f0zdqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSumNonLeaf00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6f0zdqw() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(968);
        __CLR4_4_1p3p3l3zcayti.R.inc(969);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(970);NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(0));
        __CLR4_4_1p3p3l3zcayti.R.inc(971);Assert.assertEquals("(0, 1)" , nlid.sumNonLeaf(other).toString());
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testSumNonLeaf001() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9uhgar0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSumNonLeaf001",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9uhgar0() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(972);
        __CLR4_4_1p3p3l3zcayti.R.inc(973);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(0));
        __CLR4_4_1p3p3l3zcayti.R.inc(974);NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(0));
        __CLR4_4_1p3p3l3zcayti.R.inc(975);Assert.assertEquals("0" , nlid.sumNonLeaf(other).toString());
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testSumNonLeaf002() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0uintr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSumNonLeaf002",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0uintr4() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(976);
        __CLR4_4_1p3p3l3zcayti.R.inc(977);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(0));
        __CLR4_4_1p3p3l3zcayti.R.inc(978);NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(979);Assert.assertEquals("(0, 1)" , nlid.sumNonLeaf(other).toString());
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testSumNonLeaf003() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grujvcr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSumNonLeaf003",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grujvcr8() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(980);
        __CLR4_4_1p3p3l3zcayti.R.inc(981);NonLeafID nlid = new NonLeafID(new LeafID(1),new LeafID(0));
        __CLR4_4_1p3p3l3zcayti.R.inc(982);NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(0));
        __CLR4_4_1p3p3l3zcayti.R.inc(983);Assert.assertEquals("(1, 0)" , nlid.sumNonLeaf(other).toString());
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testSumNonLeaf01() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfezrurc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,117,109,78,111,110,76,101,97,102,48,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSumNonLeaf01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfezrurc() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(984);
        __CLR4_4_1p3p3l3zcayti.R.inc(985);NonLeafID nlid = new NonLeafID(new LeafID(1),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(986);NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(987);Assert.assertEquals("(0, 1)" , nlid.sumNonLeaf(other).toString());
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testSumNonLeaf10() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4u4g8rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSumNonLeaf10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4u4g8rg() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(988);
        __CLR4_4_1p3p3l3zcayti.R.inc(989);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(990);NonLeafID other = new NonLeafID(new LeafID(1),new LeafID(0));
        __CLR4_4_1p3p3l3zcayti.R.inc(991);Assert.assertEquals("1" , nlid.sumNonLeaf(other).toString());
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testSumNonLeaf11() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evu5nrrk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,117,109,78,111,110,76,101,97,102,49,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testSumNonLeaf11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evu5nrrk() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(992);
        __CLR4_4_1p3p3l3zcayti.R.inc(993);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(994);NonLeafID other = new NonLeafID(new LeafID(1),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(995);Assert.assertEquals("(0, 1)" , nlid.sumNonLeaf(other).toString());
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

/** 
* 
* Method: equals(Object object) 
* 
*/ 
    @Test
    public void testEquals00() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18qojs8ro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testEquals00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18qojs8ro() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(996);
        __CLR4_4_1p3p3l3zcayti.R.inc(997);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(998);NonLeafID other = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(999);Assert.assertTrue(nlid.equals(other));
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testEquals01() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),1000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15hokzrrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testEquals01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15hokzrrs() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(1000);
        __CLR4_4_1p3p3l3zcayti.R.inc(1001);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(1002);LeafID other = new LeafID(0);
        __CLR4_4_1p3p3l3zcayti.R.inc(1003);Assert.assertFalse(nlid.equals(other));
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    @Test
    public void testEquals02() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),1004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_128om7arw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testEquals02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_128om7arw() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(1004);
        __CLR4_4_1p3p3l3zcayti.R.inc(1005);NonLeafID nlid = new NonLeafID(new LeafID(0),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(1006);NonLeafID other = new NonLeafID(new LeafID(1),new LeafID(1));
        __CLR4_4_1p3p3l3zcayti.R.inc(1007);Assert.assertFalse(nlid.equals(other));
    }finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}

    /**
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),1008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv8s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv8s0() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(1008);
    __CLR4_4_1p3p3l3zcayti.R.inc(1009);NonLeafID nlid = new NonLeafID(new NonLeafID(new LeafID(1), new LeafID(0)),new NonLeafID(new LeafID(0), new LeafID(1)));
    __CLR4_4_1p3p3l3zcayti.R.inc(1010);Assert.assertEquals(84899, nlid.hashCode());
}finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {__CLR4_4_1p3p3l3zcayti.R.globalSliceStart(getClass().getName(),1011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdids3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p3p3l3zcayti.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p3p3l3zcayti.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafIDTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdids3() throws Exception{try{__CLR4_4_1p3p3l3zcayti.R.inc(1011);
    __CLR4_4_1p3p3l3zcayti.R.inc(1012);NonLeafID nlid = new NonLeafID(new NonLeafID(new LeafID(1), new LeafID(0)),new NonLeafID(new LeafID(0), new LeafID(1)));
    __CLR4_4_1p3p3l3zcayti.R.inc(1013);Assert.assertEquals("((1, 0), (0, 1))", nlid.toString());
}finally{__CLR4_4_1p3p3l3zcayti.R.flushNeeded();}}


}

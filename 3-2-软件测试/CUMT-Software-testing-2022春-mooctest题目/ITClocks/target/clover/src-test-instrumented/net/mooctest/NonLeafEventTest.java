/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* NonLeafEvent Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5\u951f\u65a4\u62f7 31, 2022</pre> 
* @version 1.0 
*/ 
public class NonLeafEventTest {static class __CLR4_4_1m4m4l3zcayse{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314776001L,8589935092L,903,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; 


/** 
* 
* Method: getValue() 
* 
*/ 
@Test
public void testGetValue() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmkm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmkm4() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(796);
    __CLR4_4_1m4m4l3zcayse.R.inc(797);NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    __CLR4_4_1m4m4l3zcayse.R.inc(798);Assert.assertEquals(0, nle.getValue());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 

/** 
* 
* Method: getLeft() 
* 
*/ 
@Test
public void testGetLeft() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119gyuqm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testGetLeft",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119gyuqm7() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(799);
    __CLR4_4_1m4m4l3zcayse.R.inc(800);NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    __CLR4_4_1m4m4l3zcayse.R.inc(801);Assert.assertEquals("1", nle.getLeft().toString());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 

/** 
* 
* Method: getRight() 
* 
*/ 
@Test
public void testGetRight() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_179kbxbma();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testGetRight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_179kbxbma() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(802);
    __CLR4_4_1m4m4l3zcayse.R.inc(803);NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    __CLR4_4_1m4m4l3zcayse.R.inc(804);Assert.assertEquals("-1", nle.getRight().toString());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 

/** 
* 
* Method: min() 
* 
*/ 
@Test
public void testMin() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psd1llmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psd1llmd() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(805);
    __CLR4_4_1m4m4l3zcayse.R.inc(806);NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    __CLR4_4_1m4m4l3zcayse.R.inc(807);Assert.assertEquals(-1, nle.min());
    __CLR4_4_1m4m4l3zcayse.R.inc(808);NonLeafEvent nle1 = new NonLeafEvent(3, new LeafEvent(-2), new LeafEvent(2));
    __CLR4_4_1m4m4l3zcayse.R.inc(809);Assert.assertEquals(1, nle1.min());
    __CLR4_4_1m4m4l3zcayse.R.inc(810);NonLeafEvent nle2 = new NonLeafEvent(-1, new LeafEvent(0), new LeafEvent(0));
    __CLR4_4_1m4m4l3zcayse.R.inc(811);Assert.assertEquals(-1, nle2.min());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 

/** 
* 
* Method: max() 
* 
*/ 
@Test
public void testMax() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxwg3rmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxwg3rmk() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(812);
    __CLR4_4_1m4m4l3zcayse.R.inc(813);NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    __CLR4_4_1m4m4l3zcayse.R.inc(814);Assert.assertEquals(1, nle.max());
    __CLR4_4_1m4m4l3zcayse.R.inc(815);NonLeafEvent nle1 = new NonLeafEvent(3, new LeafEvent(-2), new LeafEvent(2));
    __CLR4_4_1m4m4l3zcayse.R.inc(816);Assert.assertEquals(5, nle1.max());
    __CLR4_4_1m4m4l3zcayse.R.inc(817);NonLeafEvent nle2 = new NonLeafEvent(-1, new LeafEvent(0), new LeafEvent(0));
    __CLR4_4_1m4m4l3zcayse.R.inc(818);Assert.assertEquals(-1, nle2.max());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 

/** 
* 
* Method: maxDepth(int depth) 
* 
*/ 
@Test
public void testMaxDepth() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rjsi94mr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testMaxDepth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rjsi94mr() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(819);
    __CLR4_4_1m4m4l3zcayse.R.inc(820);NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1)));
    __CLR4_4_1m4m4l3zcayse.R.inc(821);Assert.assertEquals(12, nle.maxDepth(10));
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 

/** 
* 
* Method: isLeaf() 
* 
*/ 
@Test
public void testIsLeaf() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjl5upmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testIsLeaf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjl5upmu() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(822);
    __CLR4_4_1m4m4l3zcayse.R.inc(823);NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    __CLR4_4_1m4m4l3zcayse.R.inc(824);Assert.assertFalse(nle.isLeaf());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 

/** 
* 
* Method: lift(int m) 
* 
*/ 
@Test
public void testLift() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13e5ml8mx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testLift",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13e5ml8mx() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(825);
    __CLR4_4_1m4m4l3zcayse.R.inc(826);NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1)));
    __CLR4_4_1m4m4l3zcayse.R.inc(827);NonLeafEvent nle1 = new NonLeafEvent(5, new LeafEvent(1), new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1)));
    __CLR4_4_1m4m4l3zcayse.R.inc(828);Assert.assertEquals(nle1, nle.lift(5));
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}

/** 
* 
* Method: sink(int m) 
* 
*/ 
@Test
public void testSink() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6964n1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testSink",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6964n1() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(829);
    __CLR4_4_1m4m4l3zcayse.R.inc(830);NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1)));
    __CLR4_4_1m4m4l3zcayse.R.inc(831);NonLeafEvent nle1 = new NonLeafEvent(-5, new LeafEvent(1), new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1)));
    __CLR4_4_1m4m4l3zcayse.R.inc(832);Assert.assertEquals(nle1, nle.sink(5));
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 

/** 
* 
* Method: normalize() 
* 
*/ 
@Test
public void testNormalize() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0t4sen5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testNormalize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0t4sen5() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(833); 
//TODO: Test goes here... 
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 


/** 
* 
* Method: equals(Object object) 
* 
*/ 
@Test
public void testEquals() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e608n6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e608n6() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(834); 
//TODO: Test goes here... 
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 

/** 
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv8n7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv8n7() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(835);
    __CLR4_4_1m4m4l3zcayse.R.inc(836);NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    __CLR4_4_1m4m4l3zcayse.R.inc(837);Assert.assertEquals(362397, nle.hashCode());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidna() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(838);
    __CLR4_4_1m4m4l3zcayse.R.inc(839);NonLeafEvent nle = new NonLeafEvent(0, new LeafEvent(1), new LeafEvent(-1));
    __CLR4_4_1m4m4l3zcayse.R.inc(840);Assert.assertEquals("(0, 1, -1)", nle.toString());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}} 




/** 
* 
* Method: liftedLeft(Event event) 
* 
*/ 
@Test
public void testLiftedLeft() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrnh2ind();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testLiftedLeft",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrnh2ind() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(841);
    __CLR4_4_1m4m4l3zcayse.R.inc(842);NonLeafEvent nle = new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1));
    __CLR4_4_1m4m4l3zcayse.R.inc(843);Assert.assertEquals("3", NonLeafEvent.liftedLeft(nle).toString());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}

@Test
public void testLiftedLeft1() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141jf85ng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testLiftedLeft1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141jf85ng() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(844);
    __CLR4_4_1m4m4l3zcayse.R.inc(845);NonLeafEvent nle = new NonLeafEvent(-5,  new NonLeafEvent(4, new NonLeafEvent(2, new LeafEvent(-2), new LeafEvent(-1)), new LeafEvent(-1)), new LeafEvent(6));
    __CLR4_4_1m4m4l3zcayse.R.inc(846);Assert.assertEquals("(-1, (2, -2, -1), -1)", NonLeafEvent.liftedLeft(nle).toString());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}
    //(-5 (4 (2 -2 -1) -1 ) 6)  value = -5
    //(4 (2 -2 -1) -1 )         get left
    //(-1 (2 -2 -1) -1 )        non-leaf \u951f\u65a4\u62f7 lift 4 + -5 = -1

/**
*
* Method: liftedRight(Event event)
*
*/ 
@Test
public void testLiftedRight0() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_175zf9znj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testLiftedRight0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_175zf9znj() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(847);
    __CLR4_4_1m4m4l3zcayse.R.inc(848);NonLeafEvent nle = new NonLeafEvent(2, new LeafEvent(1), new LeafEvent(-1));
    __CLR4_4_1m4m4l3zcayse.R.inc(849);Assert.assertEquals("1", NonLeafEvent.liftedRight(nle).toString());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}

@Test
public void testLiftedRight1() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aeze2gnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testLiftedRight1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aeze2gnm() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(850);
    __CLR4_4_1m4m4l3zcayse.R.inc(851);NonLeafEvent nle = new NonLeafEvent(-5,  new LeafEvent(6), new NonLeafEvent(4, new LeafEvent(-1), new NonLeafEvent(2, new LeafEvent(-2), new LeafEvent(-1))));
    __CLR4_4_1m4m4l3zcayse.R.inc(852);Assert.assertEquals("(-1, -1, (2, -2, -1))", NonLeafEvent.liftedRight(nle).toString());
}finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}
    //(-5 6 (4  -1 (2 -2 -1)) )  value = -5
    //(4  -1 (2 -2 -1))         get right
    //(-1 -1 (2 -2 -1) )        non-leaf \u951f\u65a4\u62f7 lift 4 + -5 = -1

        /**
    *
    * Method: leqNonLeafs(Event other)
    *
    */
    @Test
    public void testLeqNonLeafs() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ezv76znp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testLeqNonLeafs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ezv76znp() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(853);
        __CLR4_4_1m4m4l3zcayse.R.inc(854);NonLeafEvent nle = new NonLeafEvent(-1, new LeafEvent(1), new LeafEvent(1));
        __CLR4_4_1m4m4l3zcayse.R.inc(855);NonLeafEvent nle1 = new NonLeafEvent(0, new LeafEvent(0), new LeafEvent(0));
        __CLR4_4_1m4m4l3zcayse.R.inc(856);Assert.assertTrue(nle.leqNonLeafs(nle1));
        __CLR4_4_1m4m4l3zcayse.R.inc(857);NonLeafEvent nle2 = new NonLeafEvent(-1, new LeafEvent(2), new LeafEvent(2));
        __CLR4_4_1m4m4l3zcayse.R.inc(858);Assert.assertTrue(nle.leqNonLeafs(nle2));
        __CLR4_4_1m4m4l3zcayse.R.inc(859);NonLeafEvent nle3 = new NonLeafEvent(-2, new LeafEvent(0), new LeafEvent(0));
        __CLR4_4_1m4m4l3zcayse.R.inc(860);Assert.assertFalse(nle.leqNonLeafs(nle3));
    }finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}

    /**
     *
     * Method: leqLeaf(Event other)
     *
     */
    @Test
    public void testLeqLeaf() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xms045nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testLeqLeaf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xms045nx() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(861);
        __CLR4_4_1m4m4l3zcayse.R.inc(862);NonLeafEvent nle = new NonLeafEvent(-2, new LeafEvent(-1), new LeafEvent(1));
        __CLR4_4_1m4m4l3zcayse.R.inc(863);LeafEvent le1 = new LeafEvent(0);
        __CLR4_4_1m4m4l3zcayse.R.inc(864);Assert.assertTrue(nle.leqLeaf(le1));
        __CLR4_4_1m4m4l3zcayse.R.inc(865);LeafEvent le2 = new LeafEvent(-1);
        __CLR4_4_1m4m4l3zcayse.R.inc(866);Assert.assertTrue(nle.leqLeaf(le2));
        __CLR4_4_1m4m4l3zcayse.R.inc(867);LeafEvent le3 = new LeafEvent(-2);
        __CLR4_4_1m4m4l3zcayse.R.inc(868);Assert.assertFalse(nle.leqLeaf(le3));

    }finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}

    /**
     *
     * Method: leq(Event other)
     *
     */
    @Test
    public void testLeq() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19aa1f1o5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testLeq",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19aa1f1o5() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(869);
        __CLR4_4_1m4m4l3zcayse.R.inc(870);NonLeafEvent nle = new NonLeafEvent(-1, new LeafEvent(-5), new LeafEvent(5));

        __CLR4_4_1m4m4l3zcayse.R.inc(871);NonLeafEvent nle1 = new NonLeafEvent(5, new LeafEvent(-11), new LeafEvent(-1));
        __CLR4_4_1m4m4l3zcayse.R.inc(872);Assert.assertTrue(nle.leqNonLeafs(nle1));
        __CLR4_4_1m4m4l3zcayse.R.inc(873);NonLeafEvent nle2 = new NonLeafEvent(5, new LeafEvent(-12), new LeafEvent(-1));
        __CLR4_4_1m4m4l3zcayse.R.inc(874);Assert.assertFalse(nle.leqNonLeafs(nle2));
        __CLR4_4_1m4m4l3zcayse.R.inc(875);NonLeafEvent nle3 = new NonLeafEvent(5, new LeafEvent(-11), new LeafEvent(-2));
        __CLR4_4_1m4m4l3zcayse.R.inc(876);Assert.assertFalse(nle.leqNonLeafs(nle3));

        __CLR4_4_1m4m4l3zcayse.R.inc(877);LeafEvent le1 = new LeafEvent(3);
        __CLR4_4_1m4m4l3zcayse.R.inc(878);Assert.assertFalse(nle.leqLeaf(le1));
        __CLR4_4_1m4m4l3zcayse.R.inc(879);LeafEvent le2 = new LeafEvent(4);
        __CLR4_4_1m4m4l3zcayse.R.inc(880);Assert.assertTrue(nle.leqLeaf(le2));
        __CLR4_4_1m4m4l3zcayse.R.inc(881);LeafEvent le3 = new LeafEvent(5);
        __CLR4_4_1m4m4l3zcayse.R.inc(882);Assert.assertTrue(nle.leqLeaf(le3));

    }finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}

    /**
     *
     * Method: join(Event other)
     *
     */
    @Test
    public void testJoin() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ra67a5oj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testJoin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ra67a5oj() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(883);
        __CLR4_4_1m4m4l3zcayse.R.inc(884);NonLeafEvent nle = new NonLeafEvent(-1, new LeafEvent(-5), new LeafEvent(5));

        __CLR4_4_1m4m4l3zcayse.R.inc(885);NonLeafEvent nle1 = new NonLeafEvent(-6, new LeafEvent(-4), new LeafEvent(4));
        __CLR4_4_1m4m4l3zcayse.R.inc(886);Assert.assertEquals("(-6, 0, 10)", nle.join(nle1).toString());

        __CLR4_4_1m4m4l3zcayse.R.inc(887);LeafEvent other = new LeafEvent(4);
        __CLR4_4_1m4m4l3zcayse.R.inc(888);Assert.assertEquals("4", nle.join(other).toString());
    }finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}

    /**
    *
    * Method: joinNonLeaf(Event other)
    *
    */
    @Test
    public void testJoinNonLeaf() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhlw7eop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testJoinNonLeaf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhlw7eop() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(889);
        __CLR4_4_1m4m4l3zcayse.R.inc(890);NonLeafEvent nle = new NonLeafEvent(-1, new LeafEvent(-5), new LeafEvent(5));
        __CLR4_4_1m4m4l3zcayse.R.inc(891);NonLeafEvent nle1 = new NonLeafEvent(-2, new LeafEvent(-6), new LeafEvent(6));
        __CLR4_4_1m4m4l3zcayse.R.inc(892);Assert.assertEquals("(-6, 0, 10)", nle.joinNonLeaf(nle1).toString());
        __CLR4_4_1m4m4l3zcayse.R.inc(893);NonLeafEvent nle2 = new NonLeafEvent(0, new LeafEvent(-6), new LeafEvent(6));
        __CLR4_4_1m4m4l3zcayse.R.inc(894);Assert.assertEquals("(-6, 0, 12)", nle.joinNonLeaf(nle2).toString());
    }finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}

    /**
    *
    * Method: leftJoin(Event other)
    *
    */
    @Test
    public void testLeftJoin() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8vr6yov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testLeftJoin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8vr6yov() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(895);
        __CLR4_4_1m4m4l3zcayse.R.inc(896);NonLeafEvent nle = new NonLeafEvent(5, new LeafEvent(-5), new LeafEvent(5));
        __CLR4_4_1m4m4l3zcayse.R.inc(897);NonLeafEvent nle1 = new NonLeafEvent(2, new LeafEvent(-1), new LeafEvent(1));
        __CLR4_4_1m4m4l3zcayse.R.inc(898);Assert.assertEquals("-4", nle.leftJoin(nle1).toString());
    }finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}

    /**
    *
    * Method: rightJoin(Event other)
    *
    */
    @Test
    public void testRightJoin() throws Exception {__CLR4_4_1m4m4l3zcayse.R.globalSliceStart(getClass().getName(),899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_138p8sboz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1m4m4l3zcayse.R.rethrow($CLV_t2$);}finally{__CLR4_4_1m4m4l3zcayse.R.globalSliceEnd(getClass().getName(),"net.mooctest.NonLeafEventTest.testRightJoin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_138p8sboz() throws Exception{try{__CLR4_4_1m4m4l3zcayse.R.inc(899);
        __CLR4_4_1m4m4l3zcayse.R.inc(900);NonLeafEvent nle = new NonLeafEvent(5, new LeafEvent(-5), new LeafEvent(5));
        __CLR4_4_1m4m4l3zcayse.R.inc(901);NonLeafEvent nle1 = new NonLeafEvent(2, new LeafEvent(-1), new LeafEvent(1));
        __CLR4_4_1m4m4l3zcayse.R.inc(902);Assert.assertEquals("5", nle.rightJoin(nle1).toString());
    }finally{__CLR4_4_1m4m4l3zcayse.R.flushNeeded();}}

} 

/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* LeafEvent Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5\u951f\u65a4\u62f7 31, 2022</pre> 
* @version 1.0 
*/ 
public class LeafEventTest {static class __CLR4_4_1i3i3l3zcayqi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314776001L,8589935092L,733,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

/** 
* 
* Method: getValue() 
* 
*/ 
@Test
public void testGetValue() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmki3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmki3() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(651);
    __CLR4_4_1i3i3l3zcayqi.R.inc(652);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(653);Assert.assertEquals(0, le.getValue());
    __CLR4_4_1i3i3l3zcayqi.R.inc(654);LeafEvent le1 = new LeafEvent(1);
    __CLR4_4_1i3i3l3zcayqi.R.inc(655);Assert.assertEquals(1, le1.getValue());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: getLeft() 
* 
*/ 
@Test
public void testGetLeft() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119gyuqi8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testGetLeft",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119gyuqi8() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(656);
    __CLR4_4_1i3i3l3zcayqi.R.inc(657);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(658);Assert.assertNull(le.getLeft());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: getRight() 
* 
*/ 
@Test
public void testGetRight() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_179kbxbib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testGetRight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_179kbxbib() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(659);
    __CLR4_4_1i3i3l3zcayqi.R.inc(660);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(661);Assert.assertNull(le.getRight());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: max() 
* 
*/ 
@Test
public void testMax() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hxwg3rie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hxwg3rie() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(662);
    __CLR4_4_1i3i3l3zcayqi.R.inc(663);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(664);Assert.assertEquals(0, le.max());
    __CLR4_4_1i3i3l3zcayqi.R.inc(665);LeafEvent le1 = new LeafEvent(1);
    __CLR4_4_1i3i3l3zcayqi.R.inc(666);Assert.assertEquals(1, le1.max());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: min() 
* 
*/ 
@Test
public void testMin() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psd1llij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psd1llij() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(667);
    __CLR4_4_1i3i3l3zcayqi.R.inc(668);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(669);Assert.assertEquals(0, le.min());
    __CLR4_4_1i3i3l3zcayqi.R.inc(670);LeafEvent le1 = new LeafEvent(1);
    __CLR4_4_1i3i3l3zcayqi.R.inc(671);Assert.assertEquals(1, le1.min());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: maxDepth(int depth) 
* 
*/ 
@Test
public void testMaxDepth() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rjsi94io();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testMaxDepth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rjsi94io() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(672);
    __CLR4_4_1i3i3l3zcayqi.R.inc(673);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(674);Assert.assertEquals(2, le.maxDepth(2));
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: isLeaf() 
* 
*/ 
@Test
public void testIsLeaf() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjl5upir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testIsLeaf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjl5upir() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(675);
    __CLR4_4_1i3i3l3zcayqi.R.inc(676);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(677);Assert.assertTrue(le.isLeaf());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: lift(int m) 
* 
*/ 
@Test
public void testLift() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13e5ml8iu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testLift",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13e5ml8iu() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(678);
    __CLR4_4_1i3i3l3zcayqi.R.inc(679);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(680);Event le1 = le.lift(5);
    __CLR4_4_1i3i3l3zcayqi.R.inc(681);Assert.assertEquals("5",le1.toString());
    __CLR4_4_1i3i3l3zcayqi.R.inc(682);Event le2 = le1.lift(5);
    __CLR4_4_1i3i3l3zcayqi.R.inc(683);Assert.assertEquals("10",le2.toString());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: sink(int m) 
* 
*/ 
@Test
public void testSink() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6964j0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testSink",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6964j0() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(684);
    __CLR4_4_1i3i3l3zcayqi.R.inc(685);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(686);Event le1 = le.sink(5);
    __CLR4_4_1i3i3l3zcayqi.R.inc(687);Assert.assertEquals("-5",le1.toString());
    __CLR4_4_1i3i3l3zcayqi.R.inc(688);Event le2 = le1.sink(5);
    __CLR4_4_1i3i3l3zcayqi.R.inc(689);Assert.assertEquals("-10",le2.toString());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: normalize() 
* 
*/ 
@Test
public void testNormalize() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0t4sej6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testNormalize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0t4sej6() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(690);
    __CLR4_4_1i3i3l3zcayqi.R.inc(691);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(692);Assert.assertEquals(le, le.normalize());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: leq(Event other) 
* 
*/ 
@Test
public void testLeq() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19aa1f1j9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testLeq",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19aa1f1j9() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(693);
    __CLR4_4_1i3i3l3zcayqi.R.inc(694);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(695);Assert.assertFalse(le.leq(new LeafEvent(-1)));
    __CLR4_4_1i3i3l3zcayqi.R.inc(696);Assert.assertTrue(le.leq(new LeafEvent(0)));
    __CLR4_4_1i3i3l3zcayqi.R.inc(697);Assert.assertTrue(le.leq(new LeafEvent(1)));
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}}

/** 
* 
* Method: join(Event other) 
* 
*/ 
@Test
public void testJoin() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ra67a5je();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testJoin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ra67a5je() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(698);
    __CLR4_4_1i3i3l3zcayqi.R.inc(699);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(700);Event other = new LeafEvent(5);
    __CLR4_4_1i3i3l3zcayqi.R.inc(701);Assert.assertEquals("5", le.join(other).toString());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}}

@Test
public void testJoin1() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ovne6cji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testJoin1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ovne6cji() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(702);
    __CLR4_4_1i3i3l3zcayqi.R.inc(703);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(704);Event other = new LeafEvent(-5);
    __CLR4_4_1i3i3l3zcayqi.R.inc(705);Assert.assertEquals("0", le.join(other).toString());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}}

@Test
public void testJoin2() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmnfdvjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testJoin2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmnfdvjm() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(706);
    __CLR4_4_1i3i3l3zcayqi.R.inc(707);LeafEvent le = new LeafEvent(6);
    __CLR4_4_1i3i3l3zcayqi.R.inc(708);NonLeafEvent other = new NonLeafEvent(10, new LeafEvent(-5), new LeafEvent(5));
    __CLR4_4_1i3i3l3zcayqi.R.inc(709);le.join(other);
    __CLR4_4_1i3i3l3zcayqi.R.inc(710);Assert.assertEquals("(6, 0, 9)", le.join(other).toString());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}}

@Test
public void testJoin4() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f4nhsxjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testJoin4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f4nhsxjr() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(711);
    __CLR4_4_1i3i3l3zcayqi.R.inc(712);LeafEvent le = new LeafEvent(12);
    __CLR4_4_1i3i3l3zcayqi.R.inc(713);NonLeafEvent other = new NonLeafEvent(10, new LeafEvent(-5), new LeafEvent(5));
    __CLR4_4_1i3i3l3zcayqi.R.inc(714);le.join(other);
    __CLR4_4_1i3i3l3zcayqi.R.inc(715);Assert.assertEquals("(12, 0, 3)", le.join(other).toString());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}}

/** 
* 
* Method: equals(Object object) 
* 
*/ 
@Test
public void testEquals() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e608jw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e608jw() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(716);
    __CLR4_4_1i3i3l3zcayqi.R.inc(717);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(718);String s = "1";
    __CLR4_4_1i3i3l3zcayqi.R.inc(719);Assert.assertFalse(le.equals(s));
    __CLR4_4_1i3i3l3zcayqi.R.inc(720);LeafEvent le1 = new LeafEvent(5);
    __CLR4_4_1i3i3l3zcayqi.R.inc(721);Event le2 = le1.sink(5);
    __CLR4_4_1i3i3l3zcayqi.R.inc(722);Assert.assertTrue(le2.equals(le));
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv8k3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv8k3() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(723);
    __CLR4_4_1i3i3l3zcayqi.R.inc(724);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(725);Assert.assertEquals(205,le.hashCode());
    __CLR4_4_1i3i3l3zcayqi.R.inc(726);Event le1 = new LeafEvent(5);
    __CLR4_4_1i3i3l3zcayqi.R.inc(727);Assert.assertEquals(210,le1.hashCode());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {__CLR4_4_1i3i3l3zcayqi.R.globalSliceStart(getClass().getName(),728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1i3i3l3zcayqi.R.rethrow($CLV_t2$);}finally{__CLR4_4_1i3i3l3zcayqi.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafEventTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidk8() throws Exception{try{__CLR4_4_1i3i3l3zcayqi.R.inc(728);
    __CLR4_4_1i3i3l3zcayqi.R.inc(729);LeafEvent le = new LeafEvent();
    __CLR4_4_1i3i3l3zcayqi.R.inc(730);Assert.assertEquals("0",le.toString());
    __CLR4_4_1i3i3l3zcayqi.R.inc(731);Event le1 = new LeafEvent(5);
    __CLR4_4_1i3i3l3zcayqi.R.inc(732);Assert.assertEquals("5",le1.toString());
}finally{__CLR4_4_1i3i3l3zcayqi.R.flushNeeded();}} 


} 

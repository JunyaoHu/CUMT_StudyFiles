/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;

/** 
* Grower Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5\u951f\u65a4\u62f7 31, 2022</pre> 
* @version 1.0 
*/ 
public class GrowerTest {static class __CLR4_4_1f0f0l3zcayoa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314776001L,8589935092L,565,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; 


/** 
* 
* Method: grow(ID id, Event event) 
* 
*/ 
@Test
public void testGrow() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h94sx8f0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testGrow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h94sx8f0() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(540);
    __CLR4_4_1f0f0l3zcayoa.R.inc(541);ID nl01 = IDs.with(IDs.zero(), IDs.one());
    __CLR4_4_1f0f0l3zcayoa.R.inc(542);ID nl10 = IDs.with(IDs.one(), IDs.zero());
    __CLR4_4_1f0f0l3zcayoa.R.inc(543);ID nl11 = IDs.with(IDs.one(), IDs.one());
    __CLR4_4_1f0f0l3zcayoa.R.inc(544);ID nl101 = IDs.with(IDs.one(), IDs.with(IDs.zero(), IDs.one()));
    __CLR4_4_1f0f0l3zcayoa.R.inc(545);Event e0 = Events.zero();
    __CLR4_4_1f0f0l3zcayoa.R.inc(546);Grower.grow(nl01, e0);
    __CLR4_4_1f0f0l3zcayoa.R.inc(547);Grower.grow(nl10, e0);
    __CLR4_4_1f0f0l3zcayoa.R.inc(548);Grower.grow(nl11, e0);
    __CLR4_4_1f0f0l3zcayoa.R.inc(549);Grower.grow(nl101, e0);
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}}

@Test(expected = IllegalArgumentException.class)
public void testGrow1() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165oqmrfa();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,114,111,119,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testGrow1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165oqmrfa() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(550);
    __CLR4_4_1f0f0l3zcayoa.R.inc(551);ID nl00 = IDs.with(IDs.zero(), IDs.zero());
    __CLR4_4_1f0f0l3zcayoa.R.inc(552);Event e0 = Events.zero();
    __CLR4_4_1f0f0l3zcayoa.R.inc(553);Grower.grow(nl00, e0);
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}}


/**
* 
* Method: innerGrow(ID id, Event event) 
* 
*/ 
@Test
public void testInnerGrow() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obsps2fe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testInnerGrow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obsps2fe() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(554); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("innerGrow", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}} 

/** 
* 
* Method: growLeafID(ID id, Event event) 
* 
*/ 
@Test
public void testGrowLeafID() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1701bvfff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testGrowLeafID",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1701bvfff() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(555); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growLeafID", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}} 

/** 
* 
* Method: growNonLeafID(ID id, Event event) 
* 
*/ 
@Test
public void testGrowNonLeafID() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13sgzrcfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testGrowNonLeafID",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13sgzrcfg() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(556); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growNonLeafID", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}} 

/** 
* 
* Method: growLeafEvent(ID id, Event event) 
* 
*/ 
@Test
public void testGrowLeafEvent() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vgrxtqfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testGrowLeafEvent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vgrxtqfh() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(557); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growLeafEvent", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}} 

/** 
* 
* Method: growOnRight(ID id, Event event) 
* 
*/ 
@Test
public void testGrowOnRight() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1puetkvfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testGrowOnRight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1puetkvfi() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(558); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growOnRight", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}} 

/** 
* 
* Method: growRight(ID id, Event event) 
* 
*/ 
@Test
public void testGrowRight() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnxf7mfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testGrowRight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnxf7mfj() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(559); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growRight", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}} 

/** 
* 
* Method: rightGrowth(Event event, GrowResult growth) 
* 
*/ 
@Test
public void testRightGrowth() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gooog8fk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testRightGrowth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gooog8fk() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(560); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("rightGrowth", Event.class, GrowResult.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}} 

/** 
* 
* Method: growOnLeft(ID id, Event event) 
* 
*/ 
@Test
public void testGrowOnLeft() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvvlv2fl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testGrowOnLeft",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvvlv2fl() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(561); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growOnLeft", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}} 

/** 
* 
* Method: growLeft(ID id, Event event) 
* 
*/ 
@Test
public void testGrowLeft() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19febfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testGrowLeft",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19febfm() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(562); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growLeft", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}} 

/** 
* 
* Method: leftGrowth(Event event, GrowResult growth) 
* 
*/ 
@Test
public void testLeftGrowth() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kaozbtfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testLeftGrowth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kaozbtfn() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(563); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("leftGrowth", Event.class, GrowResult.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}} 

/** 
* 
* Method: growOnBothSides(ID id, Event event) 
* 
*/ 
@Test
public void testGrowOnBothSides() throws Exception {__CLR4_4_1f0f0l3zcayoa.R.globalSliceStart(getClass().getName(),564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avp2o2fo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f0f0l3zcayoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f0f0l3zcayoa.R.globalSliceEnd(getClass().getName(),"net.mooctest.GrowerTest.testGrowOnBothSides",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avp2o2fo() throws Exception{try{__CLR4_4_1f0f0l3zcayoa.R.inc(564); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growOnBothSides", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1f0f0l3zcayoa.R.flushNeeded();}} 

} 

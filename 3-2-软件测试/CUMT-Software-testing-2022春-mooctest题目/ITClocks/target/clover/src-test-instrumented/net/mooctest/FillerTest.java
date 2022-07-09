/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* Filler Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5\u951f\u65a4\u62f7 31, 2022</pre> 
* @version 1.0 
*/ 
public class FillerTest {static class __CLR4_4_1e5e5l3zcaymw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314776001L,8589935092L,530,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; 

/** 
* 
* Method: fill(ID id, Event event) 
* 
*/ 
@Test
public void testFill() throws Exception {__CLR4_4_1e5e5l3zcaymw.R.globalSliceStart(getClass().getName(),509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9bwv8e5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e5e5l3zcaymw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e5e5l3zcaymw.R.globalSliceEnd(getClass().getName(),"net.mooctest.FillerTest.testFill",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9bwv8e5() throws Exception{try{__CLR4_4_1e5e5l3zcaymw.R.inc(509);
    __CLR4_4_1e5e5l3zcaymw.R.inc(510);ID nl01 = IDs.with(IDs.zero(), IDs.one());
    __CLR4_4_1e5e5l3zcaymw.R.inc(511);ID nl10 = IDs.with(IDs.one(), IDs.zero());
    __CLR4_4_1e5e5l3zcaymw.R.inc(512);ID nl11 = IDs.with(IDs.one(), IDs.one());
    __CLR4_4_1e5e5l3zcaymw.R.inc(513);ID nl101 = IDs.with(IDs.one(), IDs.with(IDs.zero(), IDs.one()));
    __CLR4_4_1e5e5l3zcaymw.R.inc(514);Event e0 = Events.zero();
    __CLR4_4_1e5e5l3zcaymw.R.inc(515);Grower.grow(nl01, e0);
    __CLR4_4_1e5e5l3zcaymw.R.inc(516);Grower.grow(nl10, e0);
    __CLR4_4_1e5e5l3zcaymw.R.inc(517);Grower.grow(nl11, e0);
    __CLR4_4_1e5e5l3zcaymw.R.inc(518);Grower.grow(nl101, e0);
}finally{__CLR4_4_1e5e5l3zcaymw.R.flushNeeded();}}

@Test(expected = IllegalArgumentException.class)
public void testFill1() throws Exception {__CLR4_4_1e5e5l3zcaymw.R.globalSliceStart(getClass().getName(),519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7sja5ef();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,70,105,108,108,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e5e5l3zcaymw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e5e5l3zcaymw.R.globalSliceEnd(getClass().getName(),"net.mooctest.FillerTest.testFill1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7sja5ef() throws Exception{try{__CLR4_4_1e5e5l3zcaymw.R.inc(519);
    __CLR4_4_1e5e5l3zcaymw.R.inc(520);ID nl00 = IDs.with(IDs.zero(), IDs.zero());
    __CLR4_4_1e5e5l3zcaymw.R.inc(521);Event e0 = Events.zero();
    __CLR4_4_1e5e5l3zcaymw.R.inc(522);Grower.grow(nl00, e0);
}finally{__CLR4_4_1e5e5l3zcaymw.R.flushNeeded();}}



    /**
* 
* Method: fillWithLeafID(ID leafID, Event event) 
* 
*/ 
@Test
public void testFillWithLeafID() throws Exception {__CLR4_4_1e5e5l3zcaymw.R.globalSliceStart(getClass().getName(),523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19w7q63ej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e5e5l3zcaymw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e5e5l3zcaymw.R.globalSliceEnd(getClass().getName(),"net.mooctest.FillerTest.testFillWithLeafID",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19w7q63ej() throws Exception{try{__CLR4_4_1e5e5l3zcaymw.R.inc(523); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillWithLeafID", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1e5e5l3zcaymw.R.flushNeeded();}} 

/** 
* 
* Method: fillNonLeafs(ID id, Event event) 
* 
*/ 
@Test
public void testFillNonLeafs() throws Exception {__CLR4_4_1e5e5l3zcaymw.R.globalSliceStart(getClass().getName(),524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qolgek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e5e5l3zcaymw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e5e5l3zcaymw.R.globalSliceEnd(getClass().getName(),"net.mooctest.FillerTest.testFillNonLeafs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qolgek() throws Exception{try{__CLR4_4_1e5e5l3zcaymw.R.inc(524); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillNonLeafs", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1e5e5l3zcaymw.R.flushNeeded();}} 

/** 
* 
* Method: fillLeftOneID(ID id, Event event) 
* 
*/ 
@Test
public void testFillLeftOneID() throws Exception {__CLR4_4_1e5e5l3zcaymw.R.globalSliceStart(getClass().getName(),525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sljavoel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e5e5l3zcaymw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e5e5l3zcaymw.R.globalSliceEnd(getClass().getName(),"net.mooctest.FillerTest.testFillLeftOneID",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sljavoel() throws Exception{try{__CLR4_4_1e5e5l3zcaymw.R.inc(525); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillLeftOneID", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1e5e5l3zcaymw.R.flushNeeded();}} 

/** 
* 
* Method: fillRight(ID id, Event event) 
* 
*/ 
@Test
public void testFillRight() throws Exception {__CLR4_4_1e5e5l3zcaymw.R.globalSliceStart(getClass().getName(),526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzg6giem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e5e5l3zcaymw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e5e5l3zcaymw.R.globalSliceEnd(getClass().getName(),"net.mooctest.FillerTest.testFillRight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzg6giem() throws Exception{try{__CLR4_4_1e5e5l3zcaymw.R.inc(526); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillRight", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1e5e5l3zcaymw.R.flushNeeded();}} 

/** 
* 
* Method: fillRightOneID(ID id, Event event) 
* 
*/ 
@Test
public void testFillRightOneID() throws Exception {__CLR4_4_1e5e5l3zcaymw.R.globalSliceStart(getClass().getName(),527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wmcplren();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e5e5l3zcaymw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e5e5l3zcaymw.R.globalSliceEnd(getClass().getName(),"net.mooctest.FillerTest.testFillRightOneID",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wmcplren() throws Exception{try{__CLR4_4_1e5e5l3zcaymw.R.inc(527); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillRightOneID", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1e5e5l3zcaymw.R.flushNeeded();}} 

/** 
* 
* Method: fillLeft(ID id, Event event) 
* 
*/ 
@Test
public void testFillLeft() throws Exception {__CLR4_4_1e5e5l3zcaymw.R.globalSliceStart(getClass().getName(),528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196i03eo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e5e5l3zcaymw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e5e5l3zcaymw.R.globalSliceEnd(getClass().getName(),"net.mooctest.FillerTest.testFillLeft",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196i03eo() throws Exception{try{__CLR4_4_1e5e5l3zcaymw.R.inc(528); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillLeft", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1e5e5l3zcaymw.R.flushNeeded();}} 

/** 
* 
* Method: fillLeftRight(ID id, Event event) 
* 
*/ 
@Test
public void testFillLeftRight() throws Exception {__CLR4_4_1e5e5l3zcaymw.R.globalSliceStart(getClass().getName(),529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8sowpep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e5e5l3zcaymw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e5e5l3zcaymw.R.globalSliceEnd(getClass().getName(),"net.mooctest.FillerTest.testFillLeftRight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8sowpep() throws Exception{try{__CLR4_4_1e5e5l3zcaymw.R.inc(529); 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillLeftRight", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
}finally{__CLR4_4_1e5e5l3zcaymw.R.flushNeeded();}} 

} 

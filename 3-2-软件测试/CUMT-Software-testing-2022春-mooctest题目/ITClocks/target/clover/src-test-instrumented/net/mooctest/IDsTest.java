/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* IDs Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5\u951f\u65a4\u62f7 31, 2022</pre> 
* @version 1.0 
*/ 
public class IDsTest {static class __CLR4_4_1fpfpl3zcayoz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314776001L,8589935092L,571,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; 

/** 
* 
* Method: zero() 
* 
*/ 
@Test
public void testZero() throws Exception {__CLR4_4_1fpfpl3zcayoz.R.globalSliceStart(getClass().getName(),565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqj5i7fp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fpfpl3zcayoz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fpfpl3zcayoz.R.globalSliceEnd(getClass().getName(),"net.mooctest.IDsTest.testZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqj5i7fp() throws Exception{try{__CLR4_4_1fpfpl3zcayoz.R.inc(565);
    __CLR4_4_1fpfpl3zcayoz.R.inc(566);Assert.assertEquals("0", IDs.zero().toString());
}finally{__CLR4_4_1fpfpl3zcayoz.R.flushNeeded();}} 

/** 
* 
* Method: one() 
* 
*/ 
@Test
public void testOne() throws Exception {__CLR4_4_1fpfpl3zcayoz.R.globalSliceStart(getClass().getName(),567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i94cajfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fpfpl3zcayoz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fpfpl3zcayoz.R.globalSliceEnd(getClass().getName(),"net.mooctest.IDsTest.testOne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i94cajfr() throws Exception{try{__CLR4_4_1fpfpl3zcayoz.R.inc(567);
    __CLR4_4_1fpfpl3zcayoz.R.inc(568);Assert.assertEquals("1", IDs.one().toString());
}finally{__CLR4_4_1fpfpl3zcayoz.R.flushNeeded();}} 

/** 
* 
* Method: with(ID id1, ID id2) 
* 
*/ 
@Test
public void testWith() throws Exception {__CLR4_4_1fpfpl3zcayoz.R.globalSliceStart(getClass().getName(),569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uq6ynft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fpfpl3zcayoz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fpfpl3zcayoz.R.globalSliceEnd(getClass().getName(),"net.mooctest.IDsTest.testWith",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uq6ynft() throws Exception{try{__CLR4_4_1fpfpl3zcayoz.R.inc(569);
    __CLR4_4_1fpfpl3zcayoz.R.inc(570);Assert.assertEquals("(0, 1)", IDs.with(new LeafID(0), new LeafID(1)).toString());
}finally{__CLR4_4_1fpfpl3zcayoz.R.flushNeeded();}} 


} 

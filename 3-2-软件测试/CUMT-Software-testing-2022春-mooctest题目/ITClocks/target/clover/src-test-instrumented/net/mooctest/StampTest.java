/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;


/** 
* Stamp Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5\u93c8\ufffd 31, 2022</pre> 
* @version 1.0 
*/ 
public class StampTest {static class __CLR4_4_1s6s6l3zcayub{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314776001L,8589935092L,1073,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; 


/** 
* 
* Method: getId() 
* 
*/ 
@Test
public void testGetId() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19o0ljas6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testGetId",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19o0ljas6() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1014);
    __CLR4_4_1s6s6l3zcayub.R.inc(1015);Stamp s = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1016);Assert.assertEquals("1", s.getId().toString());
    __CLR4_4_1s6s6l3zcayub.R.inc(1017);Stamp s1 = new Stamp(new LeafID(5), new LeafEvent(6));
    __CLR4_4_1s6s6l3zcayub.R.inc(1018);Assert.assertEquals("5", s1.getId().toString());
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}}

/** 
* 
* Method: getEvent() 
* 
*/ 
@Test
public void testGetEvent() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12650rhsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testGetEvent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12650rhsb() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1019);
    __CLR4_4_1s6s6l3zcayub.R.inc(1020);Stamp s = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1021);Assert.assertEquals("0", s.getEvent().toString());
    __CLR4_4_1s6s6l3zcayub.R.inc(1022);Stamp s1 = new Stamp(new LeafID(5), new LeafEvent(6));
    __CLR4_4_1s6s6l3zcayub.R.inc(1023);Assert.assertEquals("6", s1.getEvent().toString());
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}}

/** 
* 
* Method: fork() 
* 
*/ 
@Test
public void testFork() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_122ipj9sg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testFork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_122ipj9sg() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1024);
    __CLR4_4_1s6s6l3zcayub.R.inc(1025);Stamp s1 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1026);Stamp[] s2 = s1.fork();
    __CLR4_4_1s6s6l3zcayub.R.inc(1027);Assert.assertNotEquals(s2[0], s2[1]);
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}} 

/** 
* 
* Method: peek() 
* 
*/ 
@Test
public void testPeek() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yeuvyksk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testPeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yeuvyksk() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1028);
    __CLR4_4_1s6s6l3zcayub.R.inc(1029);Stamp s1 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1030);Stamp[] s2 = s1.peek();
    __CLR4_4_1s6s6l3zcayub.R.inc(1031);Assert.assertEquals(s1.getId(), s2[0].getId());
    __CLR4_4_1s6s6l3zcayub.R.inc(1032);Assert.assertEquals(IDs.zero(), s2[1].getId());
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}} 

/** 
* 
* Method: join(Stamp other) 
* 
*/ 
@Test(expected = IllegalArgumentException.class)
public void testJoin() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ra67a5sp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,74,111,105,110,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testJoin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ra67a5sp() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1033);
    __CLR4_4_1s6s6l3zcayub.R.inc(1034);Stamp s1 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1035);Stamp s2 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1036);s1.join(s2);
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}}

@Test
public void testJoin1() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ovne6cst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testJoin1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ovne6cst() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1037);
    __CLR4_4_1s6s6l3zcayub.R.inc(1038);Stamp s1 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1039);Stamp s2 = new Stamp(IDs.zero(), Events.zero());
    __CLR4_4_1s6s6l3zcayub.R.inc(1040);s1.join(s2);
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}}

    /**
* 
* Method: event() 
* 
*/ 
@Test(expected = IllegalArgumentException.class)
public void testEvent() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jitwupsx();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,118,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testEvent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jitwupsx() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1041);
    __CLR4_4_1s6s6l3zcayub.R.inc(1042);Stamp s0 = new Stamp(IDs.zero(), Events.zero());
    __CLR4_4_1s6s6l3zcayub.R.inc(1043);s0.event();
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}}

@Test
public void testEvent1() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12klf74t0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testEvent1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12klf74t0() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1044);
    __CLR4_4_1s6s6l3zcayub.R.inc(1045);Stamp s0 = new Stamp(IDs.zero(), Events.zero());
    __CLR4_4_1s6s6l3zcayub.R.inc(1046);Stamp s1 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1047);s1.event();
    __CLR4_4_1s6s6l3zcayub.R.inc(1048);s1.send();
    __CLR4_4_1s6s6l3zcayub.R.inc(1049);s1.receive(s0);
    __CLR4_4_1s6s6l3zcayub.R.inc(1050);s1.sync(s0);
    __CLR4_4_1s6s6l3zcayub.R.inc(1051);s1.leq(s1);
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidt8() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1052);
    __CLR4_4_1s6s6l3zcayub.R.inc(1053);Stamp s1 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1054);Assert.assertEquals("(1, 0)", s1.toString());
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}} 

/** 
* 
* Method: equals(Object o) 
* 
*/ 
@Test
public void testEquals() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e608tb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e608tb() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1055);
    __CLR4_4_1s6s6l3zcayub.R.inc(1056);Stamp s1 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1057);Assert.assertFalse(s1.equals(null));
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}} 

/** 
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv8te();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv8te() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1058);
    __CLR4_4_1s6s6l3zcayub.R.inc(1059);Stamp s1 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1060);Assert.assertEquals(1817, s1.hashCode());
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}} 

/** 
* 
* Method: send() 
* 
*/ 
@Test
public void testSend() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1brl935th();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testSend",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1brl935th() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1061);
    __CLR4_4_1s6s6l3zcayub.R.inc(1062);Stamp s1 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1063);s1.send();
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}} 

/** 
* 
* Method: receive(Stamp other) 
* 
*/ 
@Test
public void testReceive() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15p99t4tk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testReceive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15p99t4tk() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1064);
    __CLR4_4_1s6s6l3zcayub.R.inc(1065);Stamp s1 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1066);Stamp s2 = new Stamp(IDs.zero(), Events.zero());
    __CLR4_4_1s6s6l3zcayub.R.inc(1067);s1.receive(s2);
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}} 

/** 
* 
* Method: sync(Stamp other) 
* 
*/ 
@Test
public void testSync() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6giz0to();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testSync",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6giz0to() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1068);
    __CLR4_4_1s6s6l3zcayub.R.inc(1069);Stamp s1 = new Stamp();
    __CLR4_4_1s6s6l3zcayub.R.inc(1070);Stamp s2 = new Stamp(IDs.zero(), Events.zero());
    __CLR4_4_1s6s6l3zcayub.R.inc(1071);s1.sync(s2);
}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}} 

/** 
* 
* Method: leq(Stamp other) 
* 
*/ 
@Test
public void testLeq() throws Exception {__CLR4_4_1s6s6l3zcayub.R.globalSliceStart(getClass().getName(),1072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19aa1f1ts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1s6s6l3zcayub.R.rethrow($CLV_t2$);}finally{__CLR4_4_1s6s6l3zcayub.R.globalSliceEnd(getClass().getName(),"net.mooctest.StampTest.testLeq",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19aa1f1ts() throws Exception{try{__CLR4_4_1s6s6l3zcayub.R.inc(1072);


}finally{__CLR4_4_1s6s6l3zcayub.R.flushNeeded();}}
}


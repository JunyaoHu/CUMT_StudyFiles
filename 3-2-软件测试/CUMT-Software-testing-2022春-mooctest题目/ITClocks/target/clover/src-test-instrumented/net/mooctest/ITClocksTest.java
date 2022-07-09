/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ITClocksTest {static class __CLR4_4_1fvfvl3zcaypm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314776001L,8589935092L,651,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1fvfvl3zcaypm.R.inc(571);
        __CLR4_4_1fvfvl3zcaypm.R.inc(572);ITClocks itc = new ITClocks();
    }finally{__CLR4_4_1fvfvl3zcaypm.R.flushNeeded();}}

    @Test
    public void testLteEvent() {__CLR4_4_1fvfvl3zcaypm.R.globalSliceStart(getClass().getName(),573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zaf4mifx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fvfvl3zcaypm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fvfvl3zcaypm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ITClocksTest.testLteEvent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zaf4mifx(){try{__CLR4_4_1fvfvl3zcaypm.R.inc(573);
        __CLR4_4_1fvfvl3zcaypm.R.inc(574);Event e1 = Events.zero();
        __CLR4_4_1fvfvl3zcaypm.R.inc(575);Event e2 = Events.with(1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(576);Event e3 = Events.with(0, e1, e1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(577);Event e4 = Events.with(0, e2, e2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(578);assertTrue(ITClocks.lessThanEquals(e1, e1));
        __CLR4_4_1fvfvl3zcaypm.R.inc(579);assertFalse(ITClocks.lessThanEquals(e2, e1));
        __CLR4_4_1fvfvl3zcaypm.R.inc(580);assertTrue(ITClocks.lessThanEquals(e1, e3));
        __CLR4_4_1fvfvl3zcaypm.R.inc(581);assertFalse(ITClocks.lessThanEquals(e2, e3));
        __CLR4_4_1fvfvl3zcaypm.R.inc(582);assertTrue(ITClocks.lessThanEquals(e3, e1));
        __CLR4_4_1fvfvl3zcaypm.R.inc(583);assertFalse(ITClocks.lessThanEquals(e4, e1));
        __CLR4_4_1fvfvl3zcaypm.R.inc(584);assertTrue(ITClocks.lessThanEquals(e3, e4));
        __CLR4_4_1fvfvl3zcaypm.R.inc(585);assertFalse(ITClocks.lessThanEquals(e4, e3));
    }finally{__CLR4_4_1fvfvl3zcaypm.R.flushNeeded();}}

    @Test
    public void testLteStamp() {__CLR4_4_1fvfvl3zcaypm.R.globalSliceStart(getClass().getName(),586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x5e7ttga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fvfvl3zcaypm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fvfvl3zcaypm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ITClocksTest.testLteStamp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x5e7ttga(){try{__CLR4_4_1fvfvl3zcaypm.R.inc(586);
        __CLR4_4_1fvfvl3zcaypm.R.inc(587);Stamp s1 = new Stamp();
        __CLR4_4_1fvfvl3zcaypm.R.inc(588);Stamp s2 = new Stamp(IDs.zero(), Events.zero());
        __CLR4_4_1fvfvl3zcaypm.R.inc(589);assertTrue(ITClocks.lessThanEquals(s1, s2));
        __CLR4_4_1fvfvl3zcaypm.R.inc(590);assertTrue(ITClocks.lessThanEquals(s1, s1));
    }finally{__CLR4_4_1fvfvl3zcaypm.R.flushNeeded();}}

    @Test
    public void testCmpEvent() {__CLR4_4_1fvfvl3zcaypm.R.globalSliceStart(getClass().getName(),591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5ia4zgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fvfvl3zcaypm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fvfvl3zcaypm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ITClocksTest.testCmpEvent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5ia4zgf(){try{__CLR4_4_1fvfvl3zcaypm.R.inc(591);
        __CLR4_4_1fvfvl3zcaypm.R.inc(592);Event e1 = Events.zero();
        __CLR4_4_1fvfvl3zcaypm.R.inc(593);Event e2 = Events.with(2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(594);Event e3 = Events.with(3, e2, e2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(595);Event e4 = Events.with(1, e2, e2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(596);assertTrue(ITClocks.isConcurrent(e1, e1)); // LL
        __CLR4_4_1fvfvl3zcaypm.R.inc(597);assertFalse(ITClocks.isConcurrent(e1, e2)); // LL False
        __CLR4_4_1fvfvl3zcaypm.R.inc(598);assertTrue(ITClocks.isConcurrent(e2, e4)); // LN
        __CLR4_4_1fvfvl3zcaypm.R.inc(599);assertFalse(ITClocks.isConcurrent(e1, e3)); // LN False
        __CLR4_4_1fvfvl3zcaypm.R.inc(600);assertTrue(ITClocks.isConcurrent(e4, e2)); // NL
        __CLR4_4_1fvfvl3zcaypm.R.inc(601);assertFalse(ITClocks.isConcurrent(e3, e1)); // NL False
        __CLR4_4_1fvfvl3zcaypm.R.inc(602);assertTrue(ITClocks.isConcurrent(e4, e4)); // NN
        __CLR4_4_1fvfvl3zcaypm.R.inc(603);assertFalse(ITClocks.isConcurrent(e3, e4)); // NN False
    }finally{__CLR4_4_1fvfvl3zcaypm.R.flushNeeded();}}

    @Test
    public void testUncmp() {__CLR4_4_1fvfvl3zcaypm.R.globalSliceStart(getClass().getName(),604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1mhz2gs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fvfvl3zcaypm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fvfvl3zcaypm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ITClocksTest.testUncmp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1mhz2gs(){try{__CLR4_4_1fvfvl3zcaypm.R.inc(604);
        __CLR4_4_1fvfvl3zcaypm.R.inc(605);Event e1 = Events.with(1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(606);Event e2 = Events.with(2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(607);Event e3 = Events.with(0, e1, e1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(608);Event e4 = Events.with(0, e2, e2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(609);Event e5 = Events.with(0, e4, e4);
        __CLR4_4_1fvfvl3zcaypm.R.inc(610);assertTrue(ITClocks.isConcurrent(e5, e3));
    }finally{__CLR4_4_1fvfvl3zcaypm.R.flushNeeded();}}

    @Test
    public void testHB() {__CLR4_4_1fvfvl3zcaypm.R.globalSliceStart(getClass().getName(),611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18vue5pgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fvfvl3zcaypm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fvfvl3zcaypm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ITClocksTest.testHB",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18vue5pgz(){try{__CLR4_4_1fvfvl3zcaypm.R.inc(611);
        __CLR4_4_1fvfvl3zcaypm.R.inc(612);Event e1 = Events.with(1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(613);Event e2 = Events.with(2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(614);Event e3 = Events.with(0, e1, e1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(615);Event e4 = Events.with(0, e2, e2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(616);Event e5 = Events.with(0, e1, e2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(617);Event e6 = Events.with(0, e2, e1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(618);assertFalse(ITClocks.isConcurrent(e3, e4));
        __CLR4_4_1fvfvl3zcaypm.R.inc(619);assertTrue(ITClocks.isConcurrent(e5, e6));
    }finally{__CLR4_4_1fvfvl3zcaypm.R.flushNeeded();}}

    @Test
    public void testHA() {__CLR4_4_1fvfvl3zcaypm.R.globalSliceStart(getClass().getName(),620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4ucy6h8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fvfvl3zcaypm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fvfvl3zcaypm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ITClocksTest.testHA",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4ucy6h8(){try{__CLR4_4_1fvfvl3zcaypm.R.inc(620);
        __CLR4_4_1fvfvl3zcaypm.R.inc(621);Event e1 = Events.with(1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(622);Event e2 = Events.with(2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(623);Event e3 = Events.with(0, e1, e1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(624);Event e4 = Events.with(0, e2, e2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(625);Event e5 = Events.with(0, e1, e2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(626);Event e6 = Events.with(0, e2, e1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(627);assertFalse(ITClocks.isConcurrent(e4, e3));
        __CLR4_4_1fvfvl3zcaypm.R.inc(628);assertTrue(ITClocks.isConcurrent(e6, e5));
    }finally{__CLR4_4_1fvfvl3zcaypm.R.flushNeeded();}}

    @Test
    public void testCmp0() {__CLR4_4_1fvfvl3zcaypm.R.globalSliceStart(getClass().getName(),629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kkx4pvhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fvfvl3zcaypm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fvfvl3zcaypm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ITClocksTest.testCmp0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kkx4pvhh(){try{__CLR4_4_1fvfvl3zcaypm.R.inc(629);
        __CLR4_4_1fvfvl3zcaypm.R.inc(630);Event e1 = Events.with(1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(631);Event e2 = Events.with(2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(632);Event e3 = Events.with(1, e2, e2);
        __CLR4_4_1fvfvl3zcaypm.R.inc(633);assertFalse(ITClocks.isConcurrent(e1, e3));
        __CLR4_4_1fvfvl3zcaypm.R.inc(634);assertFalse(ITClocks.isConcurrent(e3, e1));
    }finally{__CLR4_4_1fvfvl3zcaypm.R.flushNeeded();}}

    @Test
    public void testCmpNull() {__CLR4_4_1fvfvl3zcaypm.R.globalSliceStart(getClass().getName(),635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14iaw2qhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fvfvl3zcaypm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fvfvl3zcaypm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ITClocksTest.testCmpNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14iaw2qhn(){try{__CLR4_4_1fvfvl3zcaypm.R.inc(635);
        __CLR4_4_1fvfvl3zcaypm.R.inc(636);Event e0 = Events.zero();
        __CLR4_4_1fvfvl3zcaypm.R.inc(637);try {
            __CLR4_4_1fvfvl3zcaypm.R.inc(638);ITClocks.isConcurrent(null, null);
            __CLR4_4_1fvfvl3zcaypm.R.inc(639);fail();
        } catch (Exception ignored) {
        }
        __CLR4_4_1fvfvl3zcaypm.R.inc(640);try {
            __CLR4_4_1fvfvl3zcaypm.R.inc(641);ITClocks.isConcurrent(e0, null);
            __CLR4_4_1fvfvl3zcaypm.R.inc(642);fail();
        } catch (Exception ignored) {
        }
    }finally{__CLR4_4_1fvfvl3zcaypm.R.flushNeeded();}}

    @Test
    public void testCmpBefore() {__CLR4_4_1fvfvl3zcaypm.R.globalSliceStart(getClass().getName(),643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1mswqhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fvfvl3zcaypm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fvfvl3zcaypm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ITClocksTest.testCmpBefore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1mswqhv(){try{__CLR4_4_1fvfvl3zcaypm.R.inc(643);
        __CLR4_4_1fvfvl3zcaypm.R.inc(644);Event e1 = Events.zero();
        __CLR4_4_1fvfvl3zcaypm.R.inc(645);Event e2 = Events.with(1);
        __CLR4_4_1fvfvl3zcaypm.R.inc(646);assertFalse(ITClocks.happensBefore(e1, e1));
        __CLR4_4_1fvfvl3zcaypm.R.inc(647);assertTrue(ITClocks.happensBefore(e1, e2));
    }finally{__CLR4_4_1fvfvl3zcaypm.R.flushNeeded();}}

    @Test
    public void testCmpBeforeStamp() {__CLR4_4_1fvfvl3zcaypm.R.globalSliceStart(getClass().getName(),648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bi326vi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fvfvl3zcaypm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fvfvl3zcaypm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ITClocksTest.testCmpBeforeStamp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bi326vi0(){try{__CLR4_4_1fvfvl3zcaypm.R.inc(648);
        __CLR4_4_1fvfvl3zcaypm.R.inc(649);Stamp s1 = new Stamp();
        __CLR4_4_1fvfvl3zcaypm.R.inc(650);assertFalse(ITClocks.happensBefore(s1, s1));
    }finally{__CLR4_4_1fvfvl3zcaypm.R.flushNeeded();}}

}

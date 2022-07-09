/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;


import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SegmentTreeTest {static class __CLR4_4_1p6p6l4dxl024{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0038\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0053\u0065\u0067\u006d\u0065\u006e\u0074\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1655197042740L,8589935092L,1325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void st() {__CLR4_4_1p6p6l4dxl024.R.globalSliceStart(getClass().getName(),906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlvczcp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6p6l4dxl024.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6p6l4dxl024.R.globalSliceEnd(getClass().getName(),"net.mooctest.SegmentTreeTest.st",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlvczcp6(){try{__CLR4_4_1p6p6l4dxl024.R.inc(906);

        __CLR4_4_1p6p6l4dxl024.R.inc(907);SegmentTree.Data.QuadrantData data = new SegmentTree.Data.QuadrantData(0, 1, 10, 20, 30);
        __CLR4_4_1p6p6l4dxl024.R.inc(908);data.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(909);assertEquals(Long.MIN_VALUE, data.start);
        __CLR4_4_1p6p6l4dxl024.R.inc(910);assertEquals(Long.MAX_VALUE, data.end);

        __CLR4_4_1p6p6l4dxl024.R.inc(911);SegmentTree.Data data1 = new SegmentTree.Data.QuadrantData(1, 30, 20, 10, 0);
        __CLR4_4_1p6p6l4dxl024.R.inc(912);data.combined(data1);
        __CLR4_4_1p6p6l4dxl024.R.inc(913);assertEquals("-9223372036854775808->9223372036854775807 30,20,10,0", data.toString());
    }finally{__CLR4_4_1p6p6l4dxl024.R.flushNeeded();}}

    @Test
    public void st_combine() {__CLR4_4_1p6p6l4dxl024.R.globalSliceStart(getClass().getName(),914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1raz054pe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6p6l4dxl024.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6p6l4dxl024.R.globalSliceEnd(getClass().getName(),"net.mooctest.SegmentTreeTest.st_combine",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1raz054pe(){try{__CLR4_4_1p6p6l4dxl024.R.inc(914);

        __CLR4_4_1p6p6l4dxl024.R.inc(915);SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 10, 20, 30, 40);
        __CLR4_4_1p6p6l4dxl024.R.inc(916);SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, -20, 30, -40, 60);
        __CLR4_4_1p6p6l4dxl024.R.inc(917);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(918);qd1.combined(qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(919);assertEquals("0->0 -10,50,-10,100", qd1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(920);SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<Integer>(0, 2, 1);
        __CLR4_4_1p6p6l4dxl024.R.inc(921);SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<Integer>(2, 3, -1);
        __CLR4_4_1p6p6l4dxl024.R.inc(922);ri1.combined(ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(923);assertEquals("0->3 set=[-1, 1]", ri1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(924);SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<Integer>(-1, 2, 1);
        __CLR4_4_1p6p6l4dxl024.R.inc(925);SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<Integer>(2, 3, 5);
        __CLR4_4_1p6p6l4dxl024.R.inc(926);rm1.combined(rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(927);assertEquals("-1->2 minimum=1", rm1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(928);SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<Integer>(0, 1, 1);
        __CLR4_4_1p6p6l4dxl024.R.inc(929);SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<Integer>(2, 3, 5);
        __CLR4_4_1p6p6l4dxl024.R.inc(930);rx1.combined(rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(931);assertEquals("0->1 maximum=5", rx1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(932);SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<Integer>(0, 1, -1);
        __CLR4_4_1p6p6l4dxl024.R.inc(933);SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<Integer>(1, 3, 5);
        __CLR4_4_1p6p6l4dxl024.R.inc(934);rs1.combined(rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(935);assertEquals("0->1 sum=4", rs1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(936);assertEquals(qd1, qd1);
        __CLR4_4_1p6p6l4dxl024.R.inc(937);assertNotEquals(qd1, qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(938);assertNotEquals(qd1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(939);assertEquals(ri1, ri1);
        __CLR4_4_1p6p6l4dxl024.R.inc(940);assertNotEquals(ri1, ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(941);assertNotEquals(ri1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(942);assertEquals(rm1, rm1);
        __CLR4_4_1p6p6l4dxl024.R.inc(943);assertNotEquals(rm1, rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(944);assertNotEquals(rm1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(945);assertEquals(rx1, rx1);
        __CLR4_4_1p6p6l4dxl024.R.inc(946);assertNotEquals(rx1, rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(947);assertNotEquals(rx1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(948);assertEquals(rs1, rs1);
        __CLR4_4_1p6p6l4dxl024.R.inc(949);assertNotEquals(rs1, rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(950);assertNotEquals(rs1, null);


        __CLR4_4_1p6p6l4dxl024.R.inc(951);assertEquals(4030, qd1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(952);assertEquals(155, ri1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(953);assertEquals(62, rm1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(954);assertEquals(186, rx1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(955);assertEquals(155, rs1.hashCode());

        __CLR4_4_1p6p6l4dxl024.R.inc(956);qd1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(957);ri1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(958);rm1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(959);rx1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(960);rs1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(961);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(962);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(963);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(964);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(965);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        __CLR4_4_1p6p6l4dxl024.R.inc(966);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(967);ri1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(968);rm1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(969);rx1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(970);rs1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(971);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(972);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(973);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(974);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(975);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }finally{__CLR4_4_1p6p6l4dxl024.R.flushNeeded();}}

    @Test
    public void st_combine_long() {__CLR4_4_1p6p6l4dxl024.R.globalSliceStart(getClass().getName(),976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cuvpenr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6p6l4dxl024.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6p6l4dxl024.R.globalSliceEnd(getClass().getName(),"net.mooctest.SegmentTreeTest.st_combine_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cuvpenr4(){try{__CLR4_4_1p6p6l4dxl024.R.inc(976);

        __CLR4_4_1p6p6l4dxl024.R.inc(977);SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 10, 20, 30, 40);
        __CLR4_4_1p6p6l4dxl024.R.inc(978);SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, 2, -1, -2, -3);
        __CLR4_4_1p6p6l4dxl024.R.inc(979);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(980);qd1.combined(qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(981);assertEquals("0->0 12,19,28,37", qd1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(982);SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<Long>(0, 1, (long) 1000);
        __CLR4_4_1p6p6l4dxl024.R.inc(983);SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<Long>(2, 3, (long) -666);
        __CLR4_4_1p6p6l4dxl024.R.inc(984);ri1.combined(ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(985);assertEquals("0->3 set=[-666, 1000]", ri1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(986);SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<Long>(0, 1, (long) 999);
        __CLR4_4_1p6p6l4dxl024.R.inc(987);SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<Long>(1, 2, (long) -333);
        __CLR4_4_1p6p6l4dxl024.R.inc(988);rm1.combined(rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(989);assertEquals("0->1 minimum=-333", rm1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(990);SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<Long>(0, 1, (long) -444);
        __CLR4_4_1p6p6l4dxl024.R.inc(991);SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<Long>(1, 3, (long) 333);
        __CLR4_4_1p6p6l4dxl024.R.inc(992);rx1.combined(rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(993);assertEquals("0->1 maximum=333", rx1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(994);SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<Long>(0, 1, (long) 123);
        __CLR4_4_1p6p6l4dxl024.R.inc(995);SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<Long>(1, 2, (long) 321);
        __CLR4_4_1p6p6l4dxl024.R.inc(996);rs1.combined(rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(997);assertEquals("0->1 sum=444", rs1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(998);assertEquals(qd1, qd1);
        __CLR4_4_1p6p6l4dxl024.R.inc(999);assertNotEquals(qd1, qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1000);assertNotEquals(qd1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1001);assertEquals(ri1, ri1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1002);assertNotEquals(ri1, ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1003);assertNotEquals(ri1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1004);assertEquals(rm1, rm1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1005);assertNotEquals(rm1, rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1006);assertNotEquals(rm1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1007);assertEquals(rx1, rx1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1008);assertNotEquals(rx1, rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1009);assertNotEquals(rx1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1010);assertEquals(rs1, rs1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1011);assertNotEquals(rs1, rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1012);assertNotEquals(rs1, null);


        __CLR4_4_1p6p6l4dxl024.R.inc(1013);assertEquals(2976, qd1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1014);assertEquals(155, ri1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1015);assertEquals(10323, rm1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1016);assertEquals(10354, rx1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1017);assertEquals(13795, rs1.hashCode());

        __CLR4_4_1p6p6l4dxl024.R.inc(1018);qd1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1019);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1020);ri1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1021);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1022);rm1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1023);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1024);rx1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1025);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1026);rs1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1027);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        __CLR4_4_1p6p6l4dxl024.R.inc(1028);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1029);ri1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1030);rm1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1031);rx1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1032);rs1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1033);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1034);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1035);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1036);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1037);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }finally{__CLR4_4_1p6p6l4dxl024.R.flushNeeded();}}

    @Test
    public void st_combine_double() {__CLR4_4_1p6p6l4dxl024.R.globalSliceStart(getClass().getName(),1038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pbeitysu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6p6l4dxl024.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6p6l4dxl024.R.globalSliceEnd(getClass().getName(),"net.mooctest.SegmentTreeTest.st_combine_double",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pbeitysu(){try{__CLR4_4_1p6p6l4dxl024.R.inc(1038);

        __CLR4_4_1p6p6l4dxl024.R.inc(1039);SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 6, 5, 4, 3);
        __CLR4_4_1p6p6l4dxl024.R.inc(1040);SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, 2, -1, -2, -3);
        __CLR4_4_1p6p6l4dxl024.R.inc(1041);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1042);qd1.combined(qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1043);assertEquals("0->0 8,4,2,0", qd1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1044);SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<Double>(0, 1, (double) 1.234519);
        __CLR4_4_1p6p6l4dxl024.R.inc(1045);SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<Double>(1, 10, (double) -19165.48526);
        __CLR4_4_1p6p6l4dxl024.R.inc(1046);ri1.combined(ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1047);assertEquals("0->10 set=[-19165.48526, 1.234519]", ri1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1048);SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<Double>(0, 1, (double) 15.26612);
        __CLR4_4_1p6p6l4dxl024.R.inc(1049);SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<Double>(1, 20, (double) -1.11849);
        __CLR4_4_1p6p6l4dxl024.R.inc(1050);rm1.combined(rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1051);assertEquals("0->1 minimum=-1.11849", rm1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1052);SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<Double>(0, 1, (double) 91.26236);
        __CLR4_4_1p6p6l4dxl024.R.inc(1053);SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<Double>(1, 3, (double) -41.185);
        __CLR4_4_1p6p6l4dxl024.R.inc(1054);rx1.combined(rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1055);assertEquals("0->1 maximum=91.26236", rx1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1056);SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<Double>(0, 1, (double) 1496.149);
        __CLR4_4_1p6p6l4dxl024.R.inc(1057);SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<Double>(1, 2, (double) -1.19864);
        __CLR4_4_1p6p6l4dxl024.R.inc(1058);rs1.combined(rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1059);assertEquals("0->1 sum=1494.9503599999998", rs1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1060);assertEquals(qd1, qd1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1061);assertNotEquals(qd1, qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1062);assertNotEquals(qd1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1063);assertEquals(ri1, ri1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1064);assertNotEquals(ri1, ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1065);assertNotEquals(ri1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1066);assertEquals(rm1, rm1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1067);assertNotEquals(rm1, rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1068);assertNotEquals(rm1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1069);assertEquals(rx1, rx1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1070);assertNotEquals(rx1, rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1071);assertNotEquals(rx1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1072);assertEquals(rs1, rs1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1073);assertNotEquals(rs1, rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1074);assertNotEquals(rs1, null);


        __CLR4_4_1p6p6l4dxl024.R.inc(1075);assertEquals(434, qd1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1076);assertEquals(372, ri1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1077);assertEquals(-518825360, rm1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1078);assertEquals(2012611265, rx1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1079);assertEquals(198715590, rs1.hashCode());

        __CLR4_4_1p6p6l4dxl024.R.inc(1080);qd1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1081);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1082);ri1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1083);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1084);rm1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1085);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1086);rx1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1087);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1088);rs1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1089);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        __CLR4_4_1p6p6l4dxl024.R.inc(1090);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1091);ri1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1092);rm1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1093);rx1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1094);rs1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1095);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1096);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1097);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1098);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1099);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }finally{__CLR4_4_1p6p6l4dxl024.R.flushNeeded();}}

    @Test
    public void st_combine_float() {__CLR4_4_1p6p6l4dxl024.R.globalSliceStart(getClass().getName(),1100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vbdvujuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6p6l4dxl024.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6p6l4dxl024.R.globalSliceEnd(getClass().getName(),"net.mooctest.SegmentTreeTest.st_combine_float",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vbdvujuk(){try{__CLR4_4_1p6p6l4dxl024.R.inc(1100);

        __CLR4_4_1p6p6l4dxl024.R.inc(1101);SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 1, 1, 2, 3);
        __CLR4_4_1p6p6l4dxl024.R.inc(1102);SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, 2, -1, -2, -3);
        __CLR4_4_1p6p6l4dxl024.R.inc(1103);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1104);qd1.combined(qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1105);assertEquals("0->0 3,0,0,0", qd1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1106);SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<Float>(0, 1, (float) 1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1107);SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<Float>(1, 2, (float) -1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1108);ri1.combined(ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1109);assertEquals("0->2 set=[-1.0, 1.0]", ri1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1110);SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<Float>(0, 1, (float) 1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1111);SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<Float>(1, 2, (float) -1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1112);rm1.combined(rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1113);assertEquals("0->1 minimum=-1.0", rm1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1114);SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<Float>(0, 1, (float) 1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1115);SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<Float>(1, 2, (float) -1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1116);rx1.combined(rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1117);assertEquals("0->1 maximum=1.0", rx1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1118);SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<Float>(0, 1, (float) 1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1119);SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<Float>(1, 2, (float) -1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1120);rs1.combined(rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1121);assertEquals("0->1 sum=0.0", rs1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1122);assertEquals(qd1, qd1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1123);assertNotEquals(qd1, qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1124);assertNotEquals(qd1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1125);assertEquals(ri1, ri1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1126);assertNotEquals(ri1, ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1127);assertNotEquals(ri1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1128);assertEquals(rm1, rm1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1129);assertNotEquals(rm1, rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1130);assertNotEquals(rm1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1131);assertEquals(rx1, rx1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1132);assertNotEquals(rx1, rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1133);assertNotEquals(rx1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1134);assertEquals(rs1, rs1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1135);assertNotEquals(rs1, rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1136);assertNotEquals(rs1, null);


        __CLR4_4_1p6p6l4dxl024.R.inc(1137);assertEquals(93, qd1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1138);assertEquals(124, ri1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1139);assertEquals(813695007, rm1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1140);assertEquals(-1333788641, rx1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1141);assertEquals(31, rs1.hashCode());

        __CLR4_4_1p6p6l4dxl024.R.inc(1142);qd1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1143);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1144);ri1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1145);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1146);rm1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1147);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1148);rx1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1149);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1150);rs1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1151);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        __CLR4_4_1p6p6l4dxl024.R.inc(1152);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1153);ri1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1154);rm1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1155);rx1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1156);rs1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1157);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1158);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1159);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1160);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1161);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }finally{__CLR4_4_1p6p6l4dxl024.R.flushNeeded();}}

    @Test
    public void st_combine_biginteger() {__CLR4_4_1p6p6l4dxl024.R.globalSliceStart(getClass().getName(),1162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cldgdwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6p6l4dxl024.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6p6l4dxl024.R.globalSliceEnd(getClass().getName(),"net.mooctest.SegmentTreeTest.st_combine_biginteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cldgdwa(){try{__CLR4_4_1p6p6l4dxl024.R.inc(1162);

        __CLR4_4_1p6p6l4dxl024.R.inc(1163);SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 1, 1, 2, 3);
        __CLR4_4_1p6p6l4dxl024.R.inc(1164);SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, 2, -1, -2, -3);
        __CLR4_4_1p6p6l4dxl024.R.inc(1165);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1166);qd1.combined(qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1167);assertEquals("0->0 3,0,0,0", qd1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1168);SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<BigInteger>(0, 1, new BigInteger("1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1169);SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<BigInteger>(1, 2, new BigInteger("-1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1170);ri1.combined(ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1171);assertEquals("0->2 set=[-1, 1]", ri1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1172);SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<BigInteger>(0, 1, new BigInteger("1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1173);SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<BigInteger>(1, 2, new BigInteger("-1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1174);rm1.combined(rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1175);assertEquals("0->1 minimum=-1", rm1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1176);SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<BigInteger>(0, 1, new BigInteger("1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1177);SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<BigInteger>(1, 2, new BigInteger("-1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1178);rx1.combined(rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1179);assertEquals("0->1 maximum=1", rx1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1180);SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<BigInteger>(0, 1, new BigInteger("1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1181);SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<BigInteger>(1, 2, new BigInteger("-1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1182);rs1.combined(rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1183);assertEquals("0->1 sum=0", rs1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1184);assertEquals(qd1, qd1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1185);assertNotEquals(qd1, qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1186);assertNotEquals(qd1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1187);assertEquals(ri1, ri1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1188);assertNotEquals(ri1, ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1189);assertNotEquals(ri1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1190);assertEquals(rm1, rm1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1191);assertNotEquals(rm1, rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1192);assertNotEquals(rm1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1193);assertEquals(rx1, rx1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1194);assertNotEquals(rx1, rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1195);assertNotEquals(rx1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1196);assertEquals(rs1, rs1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1197);assertNotEquals(rs1, rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1198);assertNotEquals(rs1, null);


        __CLR4_4_1p6p6l4dxl024.R.inc(1199);assertEquals(93, qd1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1200);assertEquals(124, ri1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1201);assertEquals(0, rm1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1202);assertEquals(62, rx1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1203);assertEquals(31, rs1.hashCode());

        __CLR4_4_1p6p6l4dxl024.R.inc(1204);qd1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1205);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1206);ri1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1207);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1208);rm1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1209);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1210);rx1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1211);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1212);rs1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1213);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        __CLR4_4_1p6p6l4dxl024.R.inc(1214);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1215);ri1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1216);rm1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1217);rx1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1218);rs1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1219);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1220);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1221);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1222);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1223);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }finally{__CLR4_4_1p6p6l4dxl024.R.flushNeeded();}}

    @Test
    public void st_combine_bigdecimal() {__CLR4_4_1p6p6l4dxl024.R.globalSliceStart(getClass().getName(),1224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r206gay0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6p6l4dxl024.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6p6l4dxl024.R.globalSliceEnd(getClass().getName(),"net.mooctest.SegmentTreeTest.st_combine_bigdecimal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r206gay0(){try{__CLR4_4_1p6p6l4dxl024.R.inc(1224);

        __CLR4_4_1p6p6l4dxl024.R.inc(1225);SegmentTree.Data qd1 = new SegmentTree.Data.QuadrantData(0, 1, 1, 2, 3);
        __CLR4_4_1p6p6l4dxl024.R.inc(1226);SegmentTree.Data qd2 = new SegmentTree.Data.QuadrantData(1, 2, -1, -2, -3);
        __CLR4_4_1p6p6l4dxl024.R.inc(1227);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1228);qd1.combined(qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1229);assertEquals("0->0 3,0,0,0", qd1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1230);SegmentTree.Data ri1 = new SegmentTree.Data.IntervalData<BigDecimal>(0, 1, new BigDecimal("1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1231);SegmentTree.Data ri2 = new SegmentTree.Data.IntervalData<BigDecimal>(1, 2, new BigDecimal("-1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1232);ri1.combined(ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1233);assertEquals("0->2 set=[-1, 1]", ri1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1234);SegmentTree.Data rm1 = new SegmentTree.Data.RangeMinimumData<BigDecimal>(0, 1, new BigDecimal("1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1235);SegmentTree.Data rm2 = new SegmentTree.Data.RangeMinimumData<BigDecimal>(1, 2, new BigDecimal("-1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1236);rm1.combined(rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1237);assertEquals("0->1 minimum=-1", rm1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1238);SegmentTree.Data rx1 = new SegmentTree.Data.RangeMaximumData<BigDecimal>(0, 1, new BigDecimal("1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1239);SegmentTree.Data rx2 = new SegmentTree.Data.RangeMaximumData<BigDecimal>(1, 2, new BigDecimal("-1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1240);rx1.combined(rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1241);assertEquals("0->1 maximum=1", rx1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1242);SegmentTree.Data rs1 = new SegmentTree.Data.RangeSumData<BigDecimal>(0, 1, new BigDecimal("1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1243);SegmentTree.Data rs2 = new SegmentTree.Data.RangeSumData<BigDecimal>(1, 2, new BigDecimal("-1"));
        __CLR4_4_1p6p6l4dxl024.R.inc(1244);rs1.combined(rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1245);assertEquals("0->1 sum=0", rs1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1246);assertEquals(qd1, qd1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1247);assertNotEquals(qd1, qd2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1248);assertNotEquals(qd1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1249);assertEquals(ri1, ri1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1250);assertNotEquals(ri1, ri2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1251);assertNotEquals(ri1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1252);assertEquals(rm1, rm1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1253);assertNotEquals(rm1, rm2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1254);assertNotEquals(rm1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1255);assertEquals(rx1, rx1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1256);assertNotEquals(rx1, rx2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1257);assertNotEquals(rx1, null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1258);assertEquals(rs1, rs1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1259);assertNotEquals(rs1, rs2);
        __CLR4_4_1p6p6l4dxl024.R.inc(1260);assertNotEquals(rs1, null);


        __CLR4_4_1p6p6l4dxl024.R.inc(1261);assertEquals(93, qd1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1262);assertEquals(124, ri1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1263);assertEquals(-930, rm1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1264);assertEquals(992, rx1.hashCode());
        __CLR4_4_1p6p6l4dxl024.R.inc(1265);assertEquals(31, rs1.hashCode());

        __CLR4_4_1p6p6l4dxl024.R.inc(1266);qd1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1267);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1268);ri1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1269);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1270);rm1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1271);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1272);rx1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1273);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1274);rs1.clear();
        __CLR4_4_1p6p6l4dxl024.R.inc(1275);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());

        __CLR4_4_1p6p6l4dxl024.R.inc(1276);qd1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1277);ri1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1278);rm1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1279);rx1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1280);rs1.combined(null);
        __CLR4_4_1p6p6l4dxl024.R.inc(1281);assertEquals("-9223372036854775808->9223372036854775807 0,0,0,0", qd1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1282);assertEquals("-9223372036854775808->9223372036854775807 set=[]", ri1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1283);assertEquals("-9223372036854775808->9223372036854775807 minimum=null", rm1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1284);assertEquals("-9223372036854775808->9223372036854775807 maximum=null", rx1.toString());
        __CLR4_4_1p6p6l4dxl024.R.inc(1285);assertEquals("-9223372036854775808->9223372036854775807 sum=null", rs1.toString());
    }finally{__CLR4_4_1p6p6l4dxl024.R.flushNeeded();}}

    @Test
    public void dt() {__CLR4_4_1p6p6l4dxl024.R.globalSliceStart(getClass().getName(),1286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nu1gpjzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6p6l4dxl024.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6p6l4dxl024.R.globalSliceEnd(getClass().getName(),"net.mooctest.SegmentTreeTest.dt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nu1gpjzq(){try{__CLR4_4_1p6p6l4dxl024.R.inc(1286);

        __CLR4_4_1p6p6l4dxl024.R.inc(1287);List<SegmentTree.Data> list = new ArrayList<>();

        __CLR4_4_1p6p6l4dxl024.R.inc(1288);list.add(new SegmentTree.Data.QuadrantData(0, 1, 0, 0, 0));
        __CLR4_4_1p6p6l4dxl024.R.inc(1289);list.add(new SegmentTree.Data.IntervalData<Integer>(1, 2, 233));
        __CLR4_4_1p6p6l4dxl024.R.inc(1290);list.add(new SegmentTree.Data.RangeMinimumData<Integer>(2, 3));
        __CLR4_4_1p6p6l4dxl024.R.inc(1291);list.add(new SegmentTree.Data.RangeMaximumData<Integer>(3, 4));
        __CLR4_4_1p6p6l4dxl024.R.inc(1292);list.add(new SegmentTree.Data.RangeSumData<Integer>(5, 6));

        __CLR4_4_1p6p6l4dxl024.R.inc(1293);DynamicSegmentTree<SegmentTree.Data> tree = new DynamicSegmentTree<>(list);

        __CLR4_4_1p6p6l4dxl024.R.inc(1294);SegmentTree.Data query = tree.query(0);
        __CLR4_4_1p6p6l4dxl024.R.inc(1295);assertEquals("0->0 1,0,0,0", query.toString());

        __CLR4_4_1p6p6l4dxl024.R.inc(1296);SegmentTree.Data query1 = tree.query(0, 1);
        __CLR4_4_1p6p6l4dxl024.R.inc(1297);assertEquals("0->1 1,0,0,0", query1.toString());

        __CLR4_4_1p6p6l4dxl024.R.inc(1298);SegmentTree.Data query2 = tree.query(0);
        __CLR4_4_1p6p6l4dxl024.R.inc(1299);assertEquals("0->0 1,0,0,0", query2.toString());

        __CLR4_4_1p6p6l4dxl024.R.inc(1300);SegmentTree.Data query3 = tree.query(6);
        __CLR4_4_1p6p6l4dxl024.R.inc(1301);assertEquals("6->6 sum=null", query3.toString());
    }finally{__CLR4_4_1p6p6l4dxl024.R.flushNeeded();}}

    @Test
    public void ft() {__CLR4_4_1p6p6l4dxl024.R.globalSliceStart(getClass().getName(),1302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c8n7th106();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p6p6l4dxl024.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p6p6l4dxl024.R.globalSliceEnd(getClass().getName(),"net.mooctest.SegmentTreeTest.ft",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c8n7th106(){try{__CLR4_4_1p6p6l4dxl024.R.inc(1302);
        __CLR4_4_1p6p6l4dxl024.R.inc(1303);List<SegmentTree.Data> list = new ArrayList<>();

        __CLR4_4_1p6p6l4dxl024.R.inc(1304);list.add(new SegmentTree.Data.QuadrantData(0, 6, 4, 7, 3));
        __CLR4_4_1p6p6l4dxl024.R.inc(1305);list.add(new SegmentTree.Data.IntervalData<Integer>(1, 2, 142));
        __CLR4_4_1p6p6l4dxl024.R.inc(1306);list.add(new SegmentTree.Data.RangeMinimumData<Integer>(4, 5));
        __CLR4_4_1p6p6l4dxl024.R.inc(1307);list.add(new SegmentTree.Data.RangeMaximumData<Integer>(5, 10));
        __CLR4_4_1p6p6l4dxl024.R.inc(1308);list.add(new SegmentTree.Data.RangeSumData<Integer>(12, 15));
        __CLR4_4_1p6p6l4dxl024.R.inc(1309);list.add(new SegmentTree.Data.RangeSumData<Integer>(18, 20));

        __CLR4_4_1p6p6l4dxl024.R.inc(1310);FlatSegmentTree<SegmentTree.Data> tree = new FlatSegmentTree<>(list);


        __CLR4_4_1p6p6l4dxl024.R.inc(1311);assertEquals("\u9239\u65ba\u6522\u9239\ufffd 0->20 Length=21 Data={0->0 6,4,7,3} Set=[]\n" +
                "    \u9239\u6ebe\u6522\u9239\ufffd 0->9 Length=10 Data={0->0 6,4,7,3} Set=[]\n" +
                "    \u9239\ufffd   \u9239\u6ebe\u6522\u9239\ufffd 0->4 Length=5 Data={0->0 6,4,7,3} Set=[]\n" +
                "    \u9239\ufffd   \u9239\ufffd   \u9239\u6ebe\u6522\u9239\ufffd 0->1 Length=2 Data={0->0 6,4,7,3} Set=[]\n" +
                "    \u9239\ufffd   \u9239\ufffd   \u9239\ufffd   \u9239\u6ebe\u6522\u9239\ufffd 0->0 Length=1 Data={0->0 6,4,7,3} Set=[0->0 Length=1 Data={0->0 6,4,7,3} Set=[]]\n" +
                "    \u9239\ufffd   \u9239\ufffd   \u9239\ufffd   \u9239\u65ba\u6522\u9239\ufffd 1->1 Length=1 Data={1->2 set=[142]} Set=[1->1 Length=1 Data={1->2 set=[142]} Set=[]]\n" +
                "    \u9239\ufffd   \u9239\ufffd   \u9239\u65ba\u6522\u9239\ufffd 2->4 Length=3 Data={1->3 set=[142]} Set=[]\n" +
                "    \u9239\ufffd   \u9239\ufffd       \u9239\u6ebe\u6522\u9239\ufffd 2->2 Length=1 Data={1->2 set=[142]} Set=[2->2 Length=1 Data={1->2 set=[142]} Set=[]]\n" +
                "    \u9239\ufffd   \u9239\ufffd       \u9239\u65ba\u6522\u9239\ufffd 3->4 Length=2 Data={3->3 set=[]} Set=[]\n" +
                "    \u9239\ufffd   \u9239\ufffd           \u9239\u6ebe\u6522\u9239\ufffd 3->3 Length=1 Data={3->3 set=[]} Set=[3->3 Length=1 Data={3->3 set=[]} Set=[]]\n" +
                "    \u9239\ufffd   \u9239\ufffd           \u9239\u65ba\u6522\u9239\ufffd 4->4 Length=1 Data={4->5 minimum=null} Set=[4->4 Length=1 Data={4->5 minimum=null} Set=[]]\n" +
                "    \u9239\ufffd   \u9239\u65ba\u6522\u9239\ufffd 5->9 Length=5 Data={4->5 minimum=null} Set=[]\n" +
                "    \u9239\ufffd       \u9239\u6ebe\u6522\u9239\ufffd 5->6 Length=2 Data={4->5 minimum=null} Set=[]\n" +
                "    \u9239\ufffd       \u9239\ufffd   \u9239\u6ebe\u6522\u9239\ufffd 5->5 Length=1 Data={4->5 minimum=null} Set=[5->5 Length=1 Data={4->5 minimum=null} Set=[]]\n" +
                "    \u9239\ufffd       \u9239\ufffd   \u9239\u65ba\u6522\u9239\ufffd 6->6 Length=1 Data={5->10 maximum=null} Set=[6->6 Length=1 Data={5->10 maximum=null} Set=[]]\n" +
                "    \u9239\ufffd       \u9239\u65ba\u6522\u9239\ufffd 7->9 Length=3 Data={5->10 maximum=null} Set=[]\n" +
                "    \u9239\ufffd           \u9239\u6ebe\u6522\u9239\ufffd 7->7 Length=1 Data={5->10 maximum=null} Set=[7->7 Length=1 Data={5->10 maximum=null} Set=[]]\n" +
                "    \u9239\ufffd           \u9239\u65ba\u6522\u9239\ufffd 8->9 Length=2 Data={5->10 maximum=null} Set=[]\n" +
                "    \u9239\ufffd               \u9239\u6ebe\u6522\u9239\ufffd 8->8 Length=1 Data={5->10 maximum=null} Set=[8->8 Length=1 Data={5->10 maximum=null} Set=[]]\n" +
                "    \u9239\ufffd               \u9239\u65ba\u6522\u9239\ufffd 9->9 Length=1 Data={5->10 maximum=null} Set=[9->9 Length=1 Data={5->10 maximum=null} Set=[]]\n" +
                "    \u9239\u65ba\u6522\u9239\ufffd 10->20 Length=11 Data={5->10 maximum=null} Set=[]\n" +
                "        \u9239\u6ebe\u6522\u9239\ufffd 10->14 Length=5 Data={5->10 maximum=null} Set=[]\n" +
                "        \u9239\ufffd   \u9239\u6ebe\u6522\u9239\ufffd 10->11 Length=2 Data={5->10 maximum=null} Set=[]\n" +
                "        \u9239\ufffd   \u9239\ufffd   \u9239\u6ebe\u6522\u9239\ufffd 10->10 Length=1 Data={5->10 maximum=null} Set=[10->10 Length=1 Data={5->10 maximum=null} Set=[]]\n" +
                "        \u9239\ufffd   \u9239\ufffd   \u9239\u65ba\u6522\u9239\ufffd 11->11 Length=1 Data={11->11 maximum=null} Set=[11->11 Length=1 Data={11->11 maximum=null} Set=[]]\n" +
                "        \u9239\ufffd   \u9239\u65ba\u6522\u9239\ufffd 12->14 Length=3 Data={12->15 sum=null} Set=[]\n" +
                "        \u9239\ufffd       \u9239\u6ebe\u6522\u9239\ufffd 12->12 Length=1 Data={12->15 sum=null} Set=[12->12 Length=1 Data={12->15 sum=null} Set=[]]\n" +
                "        \u9239\ufffd       \u9239\u65ba\u6522\u9239\ufffd 13->14 Length=2 Data={12->15 sum=null} Set=[]\n" +
                "        \u9239\ufffd           \u9239\u6ebe\u6522\u9239\ufffd 13->13 Length=1 Data={12->15 sum=null} Set=[13->13 Length=1 Data={12->15 sum=null} Set=[]]\n" +
                "        \u9239\ufffd           \u9239\u65ba\u6522\u9239\ufffd 14->14 Length=1 Data={12->15 sum=null} Set=[14->14 Length=1 Data={12->15 sum=null} Set=[]]\n" +
                "        \u9239\u65ba\u6522\u9239\ufffd 15->20 Length=6 Data={12->15 sum=null} Set=[]\n" +
                "            \u9239\u6ebe\u6522\u9239\ufffd 15->17 Length=3 Data={12->15 sum=null} Set=[]\n" +
                "            \u9239\ufffd   \u9239\u6ebe\u6522\u9239\ufffd 15->15 Length=1 Data={12->15 sum=null} Set=[15->15 Length=1 Data={12->15 sum=null} Set=[]]\n" +
                "            \u9239\ufffd   \u9239\u65ba\u6522\u9239\ufffd 16->17 Length=2 Data={16->17 sum=null} Set=[]\n" +
                "            \u9239\ufffd       \u9239\u6ebe\u6522\u9239\ufffd 16->16 Length=1 Data={16->17 sum=null} Set=[16->16 Length=1 Data={16->17 sum=null} Set=[]]\n" +
                "            \u9239\ufffd       \u9239\u65ba\u6522\u9239\ufffd 17->17 Length=1 Data={16->17 sum=null} Set=[17->17 Length=1 Data={16->17 sum=null} Set=[]]\n" +
                "            \u9239\u65ba\u6522\u9239\ufffd 18->20 Length=3 Data={18->20 sum=null} Set=[]\n" +
                "                \u9239\u6ebe\u6522\u9239\ufffd 18->18 Length=1 Data={18->20 sum=null} Set=[18->18 Length=1 Data={18->20 sum=null} Set=[]]\n" +
                "                \u9239\u65ba\u6522\u9239\ufffd 19->20 Length=2 Data={18->20 sum=null} Set=[]\n" +
                "                    \u9239\u6ebe\u6522\u9239\ufffd 19->19 Length=1 Data={18->20 sum=null} Set=[19->19 Length=1 Data={18->20 sum=null} Set=[]]\n" +
                "                    \u9239\u65ba\u6522\u9239\ufffd 20->20 Length=1 Data={18->20 sum=null} Set=[20->20 Length=1 Data={18->20 sum=null} Set=[]]\n", tree.toString().replace("\r", ""));


        __CLR4_4_1p6p6l4dxl024.R.inc(1312);SegmentTree.Data query = tree.query(0);
        __CLR4_4_1p6p6l4dxl024.R.inc(1313);assertEquals("0->0 6,4,7,3", query.toString());

        __CLR4_4_1p6p6l4dxl024.R.inc(1314);SegmentTree.Data query1 = tree.query(7, 14);
        __CLR4_4_1p6p6l4dxl024.R.inc(1315);assertEquals("5->10 maximum=null", query1.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1316);SegmentTree.Data query2 = tree.query(17, 18);
        __CLR4_4_1p6p6l4dxl024.R.inc(1317);assertEquals("16->17 sum=null", query2.toString());

        __CLR4_4_1p6p6l4dxl024.R.inc(1318);assertNull(tree.query(-233));


        __CLR4_4_1p6p6l4dxl024.R.inc(1319);SegmentTree.Data query3 = tree.query(5, 100);
        __CLR4_4_1p6p6l4dxl024.R.inc(1320);assertEquals("4->5 minimum=null", query3.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1321);SegmentTree.Data query4 = tree.query(-20, 10);
        __CLR4_4_1p6p6l4dxl024.R.inc(1322);assertEquals("0->0 6,4,7,3", query4.toString());


        __CLR4_4_1p6p6l4dxl024.R.inc(1323);SegmentTree.Data queryx = tree.query(19);
        __CLR4_4_1p6p6l4dxl024.R.inc(1324);assertEquals("18->20 sum=null", queryx.toString());

    }finally{__CLR4_4_1p6p6l4dxl024.R.flushNeeded();}}
}
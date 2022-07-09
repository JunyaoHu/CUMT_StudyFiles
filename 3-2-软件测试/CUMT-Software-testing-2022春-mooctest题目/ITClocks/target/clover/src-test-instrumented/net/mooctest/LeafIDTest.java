/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* LeafID Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5\u951f\u65a4\u62f7 29, 2022</pre> 
* @version 1.0 
*/ 
public class LeafIDTest {static class __CLR4_4_1kdkdl3zcayr6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314776001L,8589935092L,796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    /**
    *
    * Method: getValue()
    *
    */
    @Test
    public void testGetValue() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmkkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmkkd() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(733);
        __CLR4_4_1kdkdl3zcayr6.R.inc(734);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(735);Assert.assertEquals(0, lid.getValue());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    /**
    *
    * Method: getLeft()
    *
    */
    @Test
    public void testGetLeft() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119gyuqkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testGetLeft",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119gyuqkg() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(736);
        __CLR4_4_1kdkdl3zcayr6.R.inc(737);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(738);Assert.assertNull(lid.getLeft());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    /**
    *
    * Method: getRight()
    *
    */
    @Test
    public void testGetRight() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_179kbxbkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testGetRight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_179kbxbkj() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(739);
        __CLR4_4_1kdkdl3zcayr6.R.inc(740);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(741);Assert.assertNull(lid.getRight());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    /**
    *
    * Method: isZero()
    *
    */
    @Test
    public void testIsZero() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec98npkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testIsZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec98npkm() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(742);
        __CLR4_4_1kdkdl3zcayr6.R.inc(743);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(744);Assert.assertTrue(lid.isZero());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    /**
    *
    * Method: isOne()
    *
    */
    @Test
    public void testIsOne() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12f4n7zkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testIsOne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12f4n7zkp() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(745);
        __CLR4_4_1kdkdl3zcayr6.R.inc(746);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(747);Assert.assertFalse(lid.isOne());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    /**
    *
    * Method: isLeaf()
    *
    */
    @Test
    public void testIsLeaf() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mjl5upks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testIsLeaf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mjl5upks() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(748);
        __CLR4_4_1kdkdl3zcayr6.R.inc(749);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(750);Assert.assertTrue(lid.isLeaf());

    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    /**
    *
    * Method: normalize()
    *
    */
    @Test
    public void testNormalize() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0t4sekv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testNormalize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0t4sekv() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(751);
        __CLR4_4_1kdkdl3zcayr6.R.inc(752);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(753);Assert.assertEquals(lid, lid.normalize());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    /**
    *
    * Method: split()
    *
    */
    @Test
    public void testSplit00() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7ssmnky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testSplit00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7ssmnky() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(754);
        __CLR4_4_1kdkdl3zcayr6.R.inc(755);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(756);ID[] ids = lid.split();
        __CLR4_4_1kdkdl3zcayr6.R.inc(757);Assert.assertTrue(ids[0].isZero());
        __CLR4_4_1kdkdl3zcayr6.R.inc(758);Assert.assertTrue(ids[1].isZero());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    @Test
    public void testSplit01() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ykbak0l3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testSplit01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ykbak0l3() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(759);
        __CLR4_4_1kdkdl3zcayr6.R.inc(760);LeafID lid = new LeafID(1);
        __CLR4_4_1kdkdl3zcayr6.R.inc(761);ID[] ids = lid.split();
        __CLR4_4_1kdkdl3zcayr6.R.inc(762);Assert.assertTrue(ids[0].getLeft().isOne());
        __CLR4_4_1kdkdl3zcayr6.R.inc(763);Assert.assertTrue(ids[0].getRight().isZero());
        __CLR4_4_1kdkdl3zcayr6.R.inc(764);Assert.assertTrue(ids[1].getLeft().isZero());
        __CLR4_4_1kdkdl3zcayr6.R.inc(765);Assert.assertTrue(ids[1].getRight().isOne());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    /**
    *
    * Method: sum(ID other)
    *
    */
    @Test
    public void testSum00() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xlydcla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testSum00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xlydcla() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(766);
        __CLR4_4_1kdkdl3zcayr6.R.inc(767);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(768);LeafID otherid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(769);Assert.assertFalse(lid.sum(otherid).isOne());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    @Test
    public void testSum01() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146lx5tle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testSum01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146lx5tle() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(770);
        __CLR4_4_1kdkdl3zcayr6.R.inc(771);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(772);LeafID otherid = new LeafID(1);
        __CLR4_4_1kdkdl3zcayr6.R.inc(773);Assert.assertTrue(lid.sum(otherid).isOne());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    @Test
    public void testSum10() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unguwvli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testSum10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unguwvli() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(774);
        __CLR4_4_1kdkdl3zcayr6.R.inc(775);LeafID lid = new LeafID(1);
        __CLR4_4_1kdkdl3zcayr6.R.inc(776);LeafID otherid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(777);Assert.assertTrue(lid.sum(otherid).isOne());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testSum11() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xwgtpclm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,117,109,49,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testSum11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xwgtpclm() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(778);
        __CLR4_4_1kdkdl3zcayr6.R.inc(779);LeafID lid = new LeafID(1);
        __CLR4_4_1kdkdl3zcayr6.R.inc(780);LeafID otherid = new LeafID(1);
        __CLR4_4_1kdkdl3zcayr6.R.inc(781);lid.sum(otherid).isOne();
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    /**
    *
    * Method: equals(Object object)
    *
    */
    @Test
    public void testEquals() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e608lq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e608lq() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(782);
        __CLR4_4_1kdkdl3zcayr6.R.inc(783);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(784);Object other = "hjy cs 2019-4 06192081 pls dont copy my code directly";
        __CLR4_4_1kdkdl3zcayr6.R.inc(785);Assert.assertFalse(lid.equals(other));
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    @Test
    public void testEquals1() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k4lrc7lu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testEquals1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k4lrc7lu() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(786);
        __CLR4_4_1kdkdl3zcayr6.R.inc(787);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(788);LeafID other = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(789);Assert.assertTrue(lid.equals(other));
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}


    /**
    *
    * Method: hashCode()
    *
    */
    @Test
    public void testHashCode() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv8ly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv8ly() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(790);
        __CLR4_4_1kdkdl3zcayr6.R.inc(791);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(792);Assert.assertEquals(51, lid.hashCode());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}

    /**
    *
    * Method: toString()
    *
    */
    @Test
    public void testToString() throws Exception {__CLR4_4_1kdkdl3zcayr6.R.globalSliceStart(getClass().getName(),793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kdkdl3zcayr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kdkdl3zcayr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.LeafIDTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidm1() throws Exception{try{__CLR4_4_1kdkdl3zcayr6.R.inc(793);
        __CLR4_4_1kdkdl3zcayr6.R.inc(794);LeafID lid = new LeafID(0);
        __CLR4_4_1kdkdl3zcayr6.R.inc(795);Assert.assertEquals("0", lid.toString());
    }finally{__CLR4_4_1kdkdl3zcayr6.R.flushNeeded();}}


} 

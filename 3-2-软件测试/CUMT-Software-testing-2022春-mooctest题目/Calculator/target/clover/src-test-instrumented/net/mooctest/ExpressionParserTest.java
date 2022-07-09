/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* ExpressionParser Tester. 
* 
* @author <Authors name> 
* @since <pre>5\u951f\u65a4\u62f7 26, 2022</pre> 
* @version 1.0 
*/ 
public class ExpressionParserTest {static class __CLR4_4_1d2d2l3zcargm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0043\u0061\u006c\u0063\u0075\u006c\u0061\u0074\u006f\u0072\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314766647L,8589935092L,572,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; 


    /**
    *
    * Method: addVariable(String name, String value)
    *
    */
    @Test
    public void testAddVariable() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15spi32d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testAddVariable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15spi32d2() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(470);
        __CLR4_4_1d2d2l3zcargm.R.inc(471);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(472);ep.addVariable("v1", "10");
        __CLR4_4_1d2d2l3zcargm.R.inc(473);ep.addVariable("v2", "20");
        __CLR4_4_1d2d2l3zcargm.R.inc(474);ep.addVariable("v1", "30");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testAddVariable1() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vpt59d7();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,86,97,114,105,97,98,108,101,49,58,32,91,65,114,114,97,121,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ArrayIndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testAddVariable1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vpt59d7() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(475);
        __CLR4_4_1d2d2l3zcargm.R.inc(476);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(477);ep.addVariable("v1", "10");
        __CLR4_4_1d2d2l3zcargm.R.inc(478);ep.addVariable("v2", "20");
        __CLR4_4_1d2d2l3zcargm.R.inc(479);ep.addVariable("v3", "30");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

        /**
    *
    * Method: evaluate(String exp)
    *
    */
    @Test(expected = NullExpressionException.class)
    public void testEvaluate1() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xgrw3dc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,118,97,108,117,97,116,101,49,58,32,91,78,117,108,108,69,120,112,114,101,115,115,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullExpressionException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testEvaluate1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xgrw3dc() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(480);
        __CLR4_4_1d2d2l3zcargm.R.inc(481);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(482);ep.evaluate("          ");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test
    public void testEvaluate2() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ogt3mdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testEvaluate2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ogt3mdf() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(483);
        __CLR4_4_1d2d2l3zcargm.R.inc(484);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(485);ep.evaluate("  v1     =   10   ");
        __CLR4_4_1d2d2l3zcargm.R.inc(486);Assert.assertEquals("20.0", ep.evaluate("  v2     =   20   "));
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testEvaluate3() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fgub5dj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,118,97,108,117,97,116,101,51,58,32,91,65,114,114,97,121,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ArrayIndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testEvaluate3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fgub5dj() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(487);
        __CLR4_4_1d2d2l3zcargm.R.inc(488);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(489);ep.evaluate("  v1     =   10   ");
        __CLR4_4_1d2d2l3zcargm.R.inc(490);ep.evaluate("  v2     =   20   ");
        __CLR4_4_1d2d2l3zcargm.R.inc(491);ep.evaluate("  v3     =   30   ");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = ExpressionParserException.class)
    public void testEvaluate4() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11tj4hcdo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,118,97,108,117,97,116,101,52,58,32,91,69,120,112,114,101,115,115,105,111,110,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ExpressionParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testEvaluate4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11tj4hcdo() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(492);
        __CLR4_4_1d2d2l3zcargm.R.inc(493);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(494);ep.evaluate("  v1     =   10   ");
        __CLR4_4_1d2d2l3zcargm.R.inc(495);ep.evaluate("  v2     =   abc   ");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}


//    exp = parseVariables(exp);
//    exp = parseParenthesis(exp);
//    exp = parseFunctions(exp);

    @Test(expected = ExpressionParserException.class)
    public void testEvaluate5() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152j39tds();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,118,97,108,117,97,116,101,53,58,32,91,69,120,112,114,101,115,115,105,111,110,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ExpressionParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testEvaluate5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152j39tds() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(496);
        __CLR4_4_1d2d2l3zcargm.R.inc(497);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(498);ep.evaluate("  1 +   ");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = ExpressionParserException.class)
    public void testEvaluate6() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18bj22adv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,118,97,108,117,97,116,101,54,58,32,91,69,120,112,114,101,115,115,105,111,110,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ExpressionParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testEvaluate6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18bj22adv() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(499);
        __CLR4_4_1d2d2l3zcargm.R.inc(500);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(501);ep.evaluate("  sin[   ");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = ExpressionParserException.class)
    public void testEvaluate7() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkj0urdy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,118,97,108,117,97,116,101,55,58,32,91,69,120,112,114,101,115,115,105,111,110,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ExpressionParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testEvaluate7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkj0urdy() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(502);
        __CLR4_4_1d2d2l3zcargm.R.inc(503);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(504);ep.evaluate("  (5+2)+(aa)  ");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    /**
* 
* Method: parseVariables(String exp) 
* 
*/ 
@Test
public void testParseVariables() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v08af1e1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseVariables",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v08af1e1() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(505);
    __CLR4_4_1d2d2l3zcargm.R.inc(506);ExpressionParser ep = new ExpressionParser(2);
    __CLR4_4_1d2d2l3zcargm.R.inc(507);ep.evaluate("  v1     =   10   ");
    __CLR4_4_1d2d2l3zcargm.R.inc(508);ep.evaluate("  v2     =   20   ");
    __CLR4_4_1d2d2l3zcargm.R.inc(509);Assert.assertEquals("10.0 + -20.0", ep.parseVariables("    <   v1   > -<  v2  > "));
}finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

@Test
public void testParseVariables01() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17sc25ee6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseVariables01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17sc25ee6() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(510);
    __CLR4_4_1d2d2l3zcargm.R.inc(511);ExpressionParser ep = new ExpressionParser(2);
    __CLR4_4_1d2d2l3zcargm.R.inc(512);ep.evaluate("  v1     =   10   ");
    __CLR4_4_1d2d2l3zcargm.R.inc(513);ep.evaluate("  v2     =   20   ");
    __CLR4_4_1d2d2l3zcargm.R.inc(514);Assert.assertEquals("10.0  -<", ep.parseVariables("    <   v1   > -<"));
}finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

@Test(expected = VariableNotFoundException.class)
public void testParseVariables02() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14jc3cxeb();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,86,97,114,105,97,98,108,101,115,48,50,58,32,91,86,97,114,105,97,98,108,101,78,111,116,70,111,117,110,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof VariableNotFoundException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseVariables02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14jc3cxeb() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(515);
    __CLR4_4_1d2d2l3zcargm.R.inc(516);ExpressionParser ep = new ExpressionParser(2);
    __CLR4_4_1d2d2l3zcargm.R.inc(517);ep.evaluate("  v1     =   10   ");
    __CLR4_4_1d2d2l3zcargm.R.inc(518);ep.evaluate("  v2     =   20   ");
    __CLR4_4_1d2d2l3zcargm.R.inc(519);ep.parseVariables("    <   v1   > - <  v3  > ");
}finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    /**
* 
* Method: parseParenthesis(String exp) 
* 
*/ 
@Test
public void testParseParenthesis() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1egzfukeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseParenthesis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1egzfukeg() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(520);
    __CLR4_4_1d2d2l3zcargm.R.inc(521);ExpressionParser ep = new ExpressionParser(2);
    __CLR4_4_1d2d2l3zcargm.R.inc(522);Assert.assertEquals("1  +  2.0", ep.parseParenthesis("1 + 2.0"));
    __CLR4_4_1d2d2l3zcargm.R.inc(523);Assert.assertEquals("1  +  -1.0", ep.parseParenthesis("1 +(  2.0 + -3  )"));
    __CLR4_4_1d2d2l3zcargm.R.inc(524);Assert.assertEquals("1 + -5.0", ep.parseParenthesis("1 -(  2.0 + 3  )"));
}finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = UnmatchedBracketsException.class)
    public void testParseParenthesis01() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ddo7tpel();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,80,97,114,101,110,116,104,101,115,105,115,48,49,58,32,91,85,110,109,97,116,99,104,101,100,66,114,97,99,107,101,116,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnmatchedBracketsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseParenthesis01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ddo7tpel() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(525);
        __CLR4_4_1d2d2l3zcargm.R.inc(526);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(527);ep.parseParenthesis("(");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = ExpressionParserException.class)
    public void testParseParenthesis02() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmo6m6eo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,80,97,114,101,110,116,104,101,115,105,115,48,50,58,32,91,69,120,112,114,101,115,115,105,111,110,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ExpressionParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseParenthesis02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmo6m6eo() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(528);
        __CLR4_4_1d2d2l3zcargm.R.inc(529);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(530);ep.parseParenthesis("(aaa + 2)");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    /**
* 
* Method: parseFunctions(String exp) 
* 
*/ 
    @Test
    public void testParseFunctions() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vb8xuper();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseFunctions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vb8xuper() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(531);
        __CLR4_4_1d2d2l3zcargm.R.inc(532);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(533);Assert.assertEquals("120.0", ep.parseFunctions("5 !"));
        __CLR4_4_1d2d2l3zcargm.R.inc(534);Assert.assertEquals("120.0", ep.parseFunctions("fct[5]"));
        __CLR4_4_1d2d2l3zcargm.R.inc(535);Assert.assertEquals("6.0", ep.parseFunctions("fct[1+2]"));
        __CLR4_4_1d2d2l3zcargm.R.inc(536);Assert.assertEquals("-6.0", ep.parseFunctions("-fct[1+2]"));
        __CLR4_4_1d2d2l3zcargm.R.inc(537);Assert.assertEquals("-1.0", ep.parseFunctions("-fct[1+(2 - 3.0)]"));
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = FunctionNotFoundException.class)
    public void testParseFunctions00() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111enmney();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,70,117,110,99,116,105,111,110,115,48,48,58,32,91,70,117,110,99,116,105,111,110,78,111,116,70,111,117,110,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof FunctionNotFoundException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseFunctions00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111enmney() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(538);
        __CLR4_4_1d2d2l3zcargm.R.inc(539);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(540);ep.parseFunctions("fun1[5]");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = FunctionNotFoundException.class)
    public void testParseFunctions01() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_127lb5uf1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,70,117,110,99,116,105,111,110,115,48,49,58,32,91,70,117,110,99,116,105,111,110,78,111,116,70,111,117,110,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof FunctionNotFoundException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseFunctions01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_127lb5uf1() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(541);
        __CLR4_4_1d2d2l3zcargm.R.inc(542);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(543);ep.parseFunctions("fun1[5]");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = ExpressionParserException.class)
    public void testParseFunctions02() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gl9ybf4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,70,117,110,99,116,105,111,110,115,48,50,58,32,91,69,120,112,114,101,115,115,105,111,110,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ExpressionParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseFunctions02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gl9ybf4() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(544);
        __CLR4_4_1d2d2l3zcargm.R.inc(545);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(546);ep.parseFunctions("fun[5");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = MissingOperandException.class)
    public void testParseFunctions04() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1byl7j9f7();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,70,117,110,99,116,105,111,110,115,48,52,58,32,91,77,105,115,115,105,110,103,79,112,101,114,97,110,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MissingOperandException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseFunctions04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1byl7j9f7() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(547);
        __CLR4_4_1d2d2l3zcargm.R.inc(548);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(549);ep.parseFunctions("fct[      ]");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = UnmatchedBracketsException.class)
    public void testParseFunctions05() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7l6bqfa();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,70,117,110,99,116,105,111,110,115,48,53,58,32,91,85,110,109,97,116,99,104,101,100,66,114,97,99,107,101,116,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnmatchedBracketsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseFunctions05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7l6bqfa() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(550);
        __CLR4_4_1d2d2l3zcargm.R.inc(551);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(552);ep.parseFunctions("sin[[[[");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}


    /**
* 
* Method: parseOperators(String exp) 
* 
*/ 
    @Test
    public void testParseOperators() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12w6gkrfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseOperators",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12w6gkrfd() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(553);
        __CLR4_4_1d2d2l3zcargm.R.inc(554);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(555);Assert.assertEquals("0.0",ep.parseOperators("1 - 2 * 3 / 2 + 2"));
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = ExpressionParserException.class)
    public void testParseOperators1() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kv01xmfg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,79,112,101,114,97,116,111,114,115,49,58,32,91,69,120,112,114,101,115,115,105,111,110,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ExpressionParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseOperators1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kv01xmfg() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(556);
        __CLR4_4_1d2d2l3zcargm.R.inc(557);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(558);ep.parseOperators("1 - 2 * a / 2 + 2");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = ExpressionParserException.class)
    public void testParseOperators2() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o400q3fj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,79,112,101,114,97,116,111,114,115,50,58,32,91,69,120,112,114,101,115,115,105,111,110,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ExpressionParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testParseOperators2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o400q3fj() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(559);
        __CLR4_4_1d2d2l3zcargm.R.inc(560);ExpressionParser ep = new ExpressionParser(2);
        __CLR4_4_1d2d2l3zcargm.R.inc(561);ep.parseOperators(" + ");
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}
    /**
    *
    * Method: adjustNumberSpacing(String exp)
    *
    */
    @Test
    public void testAdjustNumberSpacing() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1syxig0fm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testAdjustNumberSpacing",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1syxig0fm() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(562);
        __CLR4_4_1d2d2l3zcargm.R.inc(563);Assert.assertEquals("  1 + +2  ", ExpressionParser.adjustNumberSpacing("1+2"));
        __CLR4_4_1d2d2l3zcargm.R.inc(564);Assert.assertEquals(" 1  +  2  -  -3  +   4.2 + -1e-2  ", ExpressionParser.adjustNumberSpacing("1 + 2 - -3 + 4.2-1e-2"));
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

/** 
* 
* Method: indexOfMatchingBracket(String str, int pos, char open, char close) 
* 
*/ 
    @Test
    public void testIndexOfMatchingBracket() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11y2bhhfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testIndexOfMatchingBracket",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11y2bhhfp() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(565);
        __CLR4_4_1d2d2l3zcargm.R.inc(566);Assert.assertEquals(3,ExpressionParser.indexOfMatchingBracket("(())(()())(()",0,'(',')'));
        __CLR4_4_1d2d2l3zcargm.R.inc(567);Assert.assertEquals(9,ExpressionParser.indexOfMatchingBracket("(())(()())(()",4,'(',')'));
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = UnmatchedBracketsException.class)
    public void testIndexOfMatchingBracket01() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ipq9ofs();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,100,101,120,79,102,77,97,116,99,104,105,110,103,66,114,97,99,107,101,116,48,49,58,32,91,85,110,109,97,116,99,104,101,100,66,114,97,99,107,101,116,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnmatchedBracketsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testIndexOfMatchingBracket01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ipq9ofs() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(568);
        __CLR4_4_1d2d2l3zcargm.R.inc(569);ExpressionParser.indexOfMatchingBracket("(())(()())(()",100,'(',')');
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}

    @Test(expected = UnmatchedBracketsException.class)
    public void testIndexOfMatchingBracket02() throws Exception {__CLR4_4_1d2d2l3zcargm.R.globalSliceStart(getClass().getName(),570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17rpp25fu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,100,101,120,79,102,77,97,116,99,104,105,110,103,66,114,97,99,107,101,116,48,50,58,32,91,85,110,109,97,116,99,104,101,100,66,114,97,99,107,101,116,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnmatchedBracketsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d2d2l3zcargm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d2d2l3zcargm.R.globalSliceEnd(getClass().getName(),"net.mooctest.ExpressionParserTest.testIndexOfMatchingBracket02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17rpp25fu() throws Exception{try{__CLR4_4_1d2d2l3zcargm.R.inc(570);
        __CLR4_4_1d2d2l3zcargm.R.inc(571);ExpressionParser.indexOfMatchingBracket("(())(()())(()",10,'(',')');
    }finally{__CLR4_4_1d2d2l3zcargm.R.flushNeeded();}}
} 

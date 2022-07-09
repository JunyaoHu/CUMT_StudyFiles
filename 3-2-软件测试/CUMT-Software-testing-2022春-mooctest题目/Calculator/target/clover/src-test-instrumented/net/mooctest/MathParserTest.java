/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* MathParser Tester. 
* 
* @author <Authors name> 
* @since <pre>5\u951f\u65a4\u62f7 26, 2022</pre> 
* @version 1.0 
*/ 
public class MathParserTest {static class __CLR4_4_1g2g2l3zcari8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0043\u0061\u006c\u0063\u0075\u006c\u0061\u0074\u006f\u0072\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314766647L,8589935092L,626,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; 

/** 
* 
* Method: isNumber(String str) 
* 
*/ 
    @Test
    public void testIsNumber() throws Exception {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nd01asg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testIsNumber",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nd01asg2() throws Exception{try{__CLR4_4_1g2g2l3zcari8.R.inc(578);
        __CLR4_4_1g2g2l3zcari8.R.inc(579);Assert.assertTrue(MathParser.isNumber("1"));
    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}

    @Test
    public void testIsNumber01() throws Exception {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrbjt9g4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testIsNumber01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrbjt9g4() throws Exception{try{__CLR4_4_1g2g2l3zcari8.R.inc(580);
        __CLR4_4_1g2g2l3zcari8.R.inc(581);Assert.assertTrue(MathParser.isNumber("1.5"));
    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}

    @Test
    public void testIsNumber02() throws Exception {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0bilqg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testIsNumber02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0bilqg6() throws Exception{try{__CLR4_4_1g2g2l3zcari8.R.inc(582);
        __CLR4_4_1g2g2l3zcari8.R.inc(583);Assert.assertTrue(MathParser.isNumber("2.05E2"));
    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}

    @Test
    public void testIsNumber03() throws Exception {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9bhe7g8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testIsNumber03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9bhe7g8() throws Exception{try{__CLR4_4_1g2g2l3zcari8.R.inc(584);
        __CLR4_4_1g2g2l3zcari8.R.inc(585);Assert.assertFalse(MathParser.isNumber("aaa"));
    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}

    @Test
    public void testIsNumber04() throws Exception {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xibg6oga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testIsNumber04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xibg6oga() throws Exception{try{__CLR4_4_1g2g2l3zcari8.R.inc(586);
        __CLR4_4_1g2g2l3zcari8.R.inc(587);Assert.assertFalse(MathParser.isNumber("123E2.5"));
    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}



        /**
    *
    * Method: factorial(double x)
    *
    */
    @Test
    public void testFactorial() throws Exception {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11i9l2egc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testFactorial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11i9l2egc() throws Exception{try{__CLR4_4_1g2g2l3zcari8.R.inc(588);
        __CLR4_4_1g2g2l3zcari8.R.inc(589);Assert.assertEquals(1,MathParser.factorial(-10),0.01);
    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}

    @Test
    public void testFactorial01() throws Exception {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_122n23ge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testFactorial01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_122n23ge() throws Exception{try{__CLR4_4_1g2g2l3zcari8.R.inc(590);
        __CLR4_4_1g2g2l3zcari8.R.inc(591);Assert.assertEquals(1,MathParser.factorial(1),0.01);

    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}

    @Test
    public void testFactorial02() throws Exception {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13b2lukgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testFactorial02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13b2lukgg() throws Exception{try{__CLR4_4_1g2g2l3zcari8.R.inc(592);
        __CLR4_4_1g2g2l3zcari8.R.inc(593);Assert.assertEquals(2,MathParser.factorial(2),0.01);

    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}

    @Test
    public void testFactorial03() throws Exception {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16k2kn1gi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testFactorial03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16k2kn1gi() throws Exception{try{__CLR4_4_1g2g2l3zcari8.R.inc(594);
        __CLR4_4_1g2g2l3zcari8.R.inc(595);Assert.assertEquals(120,MathParser.factorial(5),0.01);

    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}

    /**
    *
    * Method: solveBinaryOperation(double a, String op, double b)
    *
    */
    @Test
    public void testSolveBinaryOperation() throws Exception {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17npatcgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testSolveBinaryOperation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17npatcgk() throws Exception{try{__CLR4_4_1g2g2l3zcari8.R.inc(596);
        __CLR4_4_1g2g2l3zcari8.R.inc(597);Assert.assertEquals(1024,MathParser.solveBinaryOperation(2,"^",10),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(598);Assert.assertEquals(0,MathParser.solveBinaryOperation(10,"%",2),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(599);Assert.assertEquals(1,MathParser.solveBinaryOperation(10,"%",3),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(600);Assert.assertEquals(0.2,MathParser.solveBinaryOperation(2,"/",10),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(601);Assert.assertEquals(20,MathParser.solveBinaryOperation(2,"*",10),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(602);Assert.assertEquals(12,MathParser.solveBinaryOperation(2,"+",10),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(603);Assert.assertEquals(-8,MathParser.solveBinaryOperation(2,"-",10),0.01);
    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}

    /**
    *
    * Method: solveUnaryFunction(String func, double x)
    *
    */
    @Test
    public void testSolveUnaryFunction() throws Exception {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116k2angs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testSolveUnaryFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116k2angs() throws Exception{try{__CLR4_4_1g2g2l3zcari8.R.inc(604);
        __CLR4_4_1g2g2l3zcari8.R.inc(605);double pi = 3.1415926535;
        __CLR4_4_1g2g2l3zcari8.R.inc(606);double e = 2.71828;
        __CLR4_4_1g2g2l3zcari8.R.inc(607);Assert.assertEquals(1,   MathParser.solveUnaryFunction("sin", pi/2),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(608);Assert.assertEquals(0,   MathParser.solveUnaryFunction("cos", pi/2),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(609);Assert.assertEquals(1,   MathParser.solveUnaryFunction("tan", pi/4),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(610);Assert.assertEquals(2,   MathParser.solveUnaryFunction("csc", pi/6),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(611);Assert.assertEquals(2,   MathParser.solveUnaryFunction("sec", pi/3),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(612);Assert.assertEquals(1,   MathParser.solveUnaryFunction("ctn", pi/4),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(613);Assert.assertEquals(pi/2,MathParser.solveUnaryFunction("rad", 90),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(614);Assert.assertEquals(180, MathParser.solveUnaryFunction("deg", pi),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(615);Assert.assertEquals(1,   MathParser.solveUnaryFunction("fct", -1),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(616);Assert.assertEquals(1,   MathParser.solveUnaryFunction("fct", 1),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(617);Assert.assertEquals(2,   MathParser.solveUnaryFunction("fct", 2),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(618);Assert.assertEquals(120, MathParser.solveUnaryFunction("fct", 5),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(619);Assert.assertEquals(10,  MathParser.solveUnaryFunction("abs", -10),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(620);Assert.assertEquals(10,  MathParser.solveUnaryFunction("abs", 10),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(621);Assert.assertEquals(0,   MathParser.solveUnaryFunction("abs", 0),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(622);Assert.assertEquals(e*1, MathParser.solveUnaryFunction("exp", 1),0.01);
        __CLR4_4_1g2g2l3zcari8.R.inc(623);Assert.assertEquals(1,   MathParser.solveUnaryFunction("log", e),0.01);
    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}

    @Test (expected= FunctionNotFoundException.class)
    public void testSolveUnaryFunction01() throws FunctionNotFoundException {__CLR4_4_1g2g2l3zcari8.R.globalSliceStart(getClass().getName(),624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1shwhxehc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,111,108,118,101,85,110,97,114,121,70,117,110,99,116,105,111,110,48,49,58,32,91,70,117,110,99,116,105,111,110,78,111,116,70,111,117,110,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof FunctionNotFoundException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1g2g2l3zcari8.R.rethrow($CLV_t2$);}finally{__CLR4_4_1g2g2l3zcari8.R.globalSliceEnd(getClass().getName(),"net.mooctest.MathParserTest.testSolveUnaryFunction01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1shwhxehc() throws FunctionNotFoundException{try{__CLR4_4_1g2g2l3zcari8.R.inc(624);
        __CLR4_4_1g2g2l3zcari8.R.inc(625);MathParser.solveUnaryFunction("unknown", 1);
    }finally{__CLR4_4_1g2g2l3zcari8.R.flushNeeded();}}

} 

/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;

/** 
* Calculator Tester. 
* 
* @author <Authors name> 
* @since <pre>5\u93c8\ufffd 26, 2022</pre> 
* @version 1.0 
*/ 
public class CalculatorTest {static class __CLR4_4_1bhbhl3zcareq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0043\u0061\u006c\u0063\u0075\u006c\u0061\u0074\u006f\u0072\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314766647L,8589935092L,464,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

/** 
* 
* Method: evaluate(String exp) 
* 
*/
@Test
public void testEvaluate() throws Exception {__CLR4_4_1bhbhl3zcareq.R.globalSliceStart(getClass().getName(),413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1czkatqbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bhbhl3zcareq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bhbhl3zcareq.R.globalSliceEnd(getClass().getName(),"net.mooctest.CalculatorTest.testEvaluate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1czkatqbh() throws Exception{try{__CLR4_4_1bhbhl3zcareq.R.inc(413);
    __CLR4_4_1bhbhl3zcareq.R.inc(414);Calculator.expParser=new ExpressionParser(100);
    __CLR4_4_1bhbhl3zcareq.R.inc(415);Assert.assertEquals("4.0", Calculator.evaluate("1 * (2 + 3) / (10 * (64 ^ -0.5))"));
    __CLR4_4_1bhbhl3zcareq.R.inc(416);Calculator.evaluate("x = 3");
    __CLR4_4_1bhbhl3zcareq.R.inc(417);Assert.assertEquals("4.0", Calculator.evaluate("y = <x> + 1"));
    __CLR4_4_1bhbhl3zcareq.R.inc(418);Assert.assertEquals("5.0", Calculator.evaluate("(<x>^2 + <y>^2)^0.5"));
    __CLR4_4_1bhbhl3zcareq.R.inc(419);Assert.assertEquals("2.0", Calculator.evaluate("x = 1 + (y = 1)"));
    __CLR4_4_1bhbhl3zcareq.R.inc(420);Assert.assertEquals("2.0", Calculator.evaluate("<x>"));
    __CLR4_4_1bhbhl3zcareq.R.inc(421);Assert.assertEquals("1.0", Calculator.evaluate("<y>"));
    __CLR4_4_1bhbhl3zcareq.R.inc(422);Calculator.previousAns = Calculator.evaluate("1 * 2 * 3 * 4");
    __CLR4_4_1bhbhl3zcareq.R.inc(423);Assert.assertEquals("24.0", Calculator.previousAns);
    __CLR4_4_1bhbhl3zcareq.R.inc(424);Assert.assertEquals("120.0", Calculator.evaluate("<ans> * 5"));
    __CLR4_4_1bhbhl3zcareq.R.inc(425);Calculator.evaluate("pi = 3.1415926535");
    __CLR4_4_1bhbhl3zcareq.R.inc(426);Calculator.evaluate("e = 2.71828");
    __CLR4_4_1bhbhl3zcareq.R.inc(427);Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("abs[-1]")), 0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(428);Assert.assertEquals(0,     Double.parseDouble(Calculator.evaluate("abs[0]")      ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(429);Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("abs[1]")      ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(430);Assert.assertEquals(2.718, Double.parseDouble(Calculator.evaluate("exp[1]")      ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(431);Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("log[<e>]")    ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(432);Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("fct[-1]")     ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(433);Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("fct[1]" )     ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(434);Assert.assertEquals(2,     Double.parseDouble(Calculator.evaluate("fct[2]" )     ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(435);Assert.assertEquals(120,   Double.parseDouble(Calculator.evaluate("fct[5]" )     ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(436);Assert.assertEquals(180,   Double.parseDouble(Calculator.evaluate("deg[<pi>]")     ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(437);Assert.assertEquals(1.57,  Double.parseDouble(Calculator.evaluate("rad[90]")   ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(438);Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("sin[<pi>/2]") ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(439);Assert.assertEquals(0,     Double.parseDouble(Calculator.evaluate("cos[<pi>/2]") ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(440);Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("tan[<pi>/4]") ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(441);Assert.assertEquals(2,     Double.parseDouble(Calculator.evaluate("csc[<pi>/6]") ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(442);Assert.assertEquals(2,     Double.parseDouble(Calculator.evaluate("sec[<pi>/3]") ),0.01);
    __CLR4_4_1bhbhl3zcareq.R.inc(443);Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("ctn[<pi>/4]") ),0.01);

}finally{__CLR4_4_1bhbhl3zcareq.R.flushNeeded();}}


/** 
* 
* Method: parseCommand(String command) 
* 
*/ 
@Test
public void testParseCommand() throws Exception {__CLR4_4_1bhbhl3zcareq.R.globalSliceStart(getClass().getName(),444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193irblcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bhbhl3zcareq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bhbhl3zcareq.R.globalSliceEnd(getClass().getName(),"net.mooctest.CalculatorTest.testParseCommand",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193irblcc() throws Exception{try{__CLR4_4_1bhbhl3zcareq.R.inc(444);
    __CLR4_4_1bhbhl3zcareq.R.inc(445);Calculator.parseCommand("exit");
    __CLR4_4_1bhbhl3zcareq.R.inc(446);Calculator.parseCommand("help");
    __CLR4_4_1bhbhl3zcareq.R.inc(447);Calculator.parseCommand("help vars");
    __CLR4_4_1bhbhl3zcareq.R.inc(448);Calculator.parseCommand("help funcs");
    __CLR4_4_1bhbhl3zcareq.R.inc(449);Calculator.parseCommand("help cmds");
    __CLR4_4_1bhbhl3zcareq.R.inc(450);Calculator.parseCommand("list");
    __CLR4_4_1bhbhl3zcareq.R.inc(451);Calculator.parseCommand("list cmds");
    __CLR4_4_1bhbhl3zcareq.R.inc(452);Calculator.parseCommand("list funcs");
}finally{__CLR4_4_1bhbhl3zcareq.R.flushNeeded();}}

    @Test
    public void testParseCommand01() throws Exception {__CLR4_4_1bhbhl3zcareq.R.globalSliceStart(getClass().getName(),453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8lhkicl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bhbhl3zcareq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bhbhl3zcareq.R.globalSliceEnd(getClass().getName(),"net.mooctest.CalculatorTest.testParseCommand01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8lhkicl() throws Exception{try{__CLR4_4_1bhbhl3zcareq.R.inc(453);
        __CLR4_4_1bhbhl3zcareq.R.inc(454);Calculator.expParser=new ExpressionParser(3);
        __CLR4_4_1bhbhl3zcareq.R.inc(455);Calculator.evaluate("x = 1^20+2*3/4");
        __CLR4_4_1bhbhl3zcareq.R.inc(456);Calculator.evaluate("pi = 3.1415926535");
        __CLR4_4_1bhbhl3zcareq.R.inc(457);Calculator.evaluate("y = sin[<pi>/2] + abs[ log[exp[fct[(-10) !]]]]");
        __CLR4_4_1bhbhl3zcareq.R.inc(458);Calculator.previousAns = Calculator.evaluate("<x> + <y>");
        __CLR4_4_1bhbhl3zcareq.R.inc(459);Assert.assertEquals("4.5", Calculator.previousAns);
        __CLR4_4_1bhbhl3zcareq.R.inc(460);Calculator.parseCommand("list vars");
        __CLR4_4_1bhbhl3zcareq.R.inc(461);Calculator.previousAns = Calculator.evaluate("<ans> + 0.5");
        __CLR4_4_1bhbhl3zcareq.R.inc(462);Assert.assertEquals("5.0", Calculator.previousAns);
        __CLR4_4_1bhbhl3zcareq.R.inc(463);Calculator.parseCommand("list vars");
    }finally{__CLR4_4_1bhbhl3zcareq.R.flushNeeded();}}

} 

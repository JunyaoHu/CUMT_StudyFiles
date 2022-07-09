/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.mooctest.MatrixInverse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class MatrixInverseTest {static class __CLR4_4_12p2pl43y7wao{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0030\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u004d\u0061\u0074\u0072\u0069\u0078\u0049\u006e\u0076\u0065\u0072\u0073\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654593449250L,8589935092L,233,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test
	public void Test() {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),97);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mbaxfd2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.Test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mbaxfd2p(){try{__CLR4_4_12p2pl43y7wao.R.inc(97);
		__CLR4_4_12p2pl43y7wao.R.inc(98);double[][] matrix = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		__CLR4_4_12p2pl43y7wao.R.inc(99);MatrixInverse.inverse(matrix);
	}finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}
	
	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pt4bd2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pt4bd2s() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(100);
	      __CLR4_4_12p2pl43y7wao.R.inc(101);double[][] doubleArray0 = new double[2][7];
	      __CLR4_4_12p2pl43y7wao.R.inc(102);double[] doubleArray1 = new double[2];
	      __CLR4_4_12p2pl43y7wao.R.inc(103);doubleArray1[1] = (-1473.139960043111);
	      __CLR4_4_12p2pl43y7wao.R.inc(104);doubleArray0[0] = doubleArray1;
	      __CLR4_4_12p2pl43y7wao.R.inc(105);doubleArray0[1] = doubleArray1;
	      __CLR4_4_12p2pl43y7wao.R.inc(106);boolean boolean0 = MatrixInverse.hasMultipleSolutions(doubleArray0);
	      __CLR4_4_12p2pl43y7wao.R.inc(107);assertEquals(2, doubleArray0.length);
	      __CLR4_4_12p2pl43y7wao.R.inc(108);assertFalse(boolean0);
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yt33u31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yt33u31() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(109);
	      __CLR4_4_12p2pl43y7wao.R.inc(110);double[][] doubleArray0 = new double[2][3];
	      __CLR4_4_12p2pl43y7wao.R.inc(111);double[] doubleArray1 = new double[1];
	      __CLR4_4_12p2pl43y7wao.R.inc(112);doubleArray1[0] = 1.0E-8;
	      __CLR4_4_12p2pl43y7wao.R.inc(113);doubleArray0[0] = doubleArray1;
	      __CLR4_4_12p2pl43y7wao.R.inc(114);boolean boolean0 = MatrixInverse.hasMultipleSolutions(doubleArray0);
	      __CLR4_4_12p2pl43y7wao.R.inc(115);assertEquals(2, doubleArray0.length);
	      __CLR4_4_12p2pl43y7wao.R.inc(116);assertFalse(boolean0);
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177t1wb39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177t1wb39() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(117);
	      __CLR4_4_12p2pl43y7wao.R.inc(118);double[][] doubleArray0 = new double[7][5];
	      __CLR4_4_12p2pl43y7wao.R.inc(119);double[] doubleArray1 = new double[4];
	      __CLR4_4_12p2pl43y7wao.R.inc(120);doubleArray1[0] = 1.0E-8;
	      __CLR4_4_12p2pl43y7wao.R.inc(121);doubleArray1[3] = 3043.272858828877;
	      __CLR4_4_12p2pl43y7wao.R.inc(122);doubleArray0[0] = doubleArray1;
	      __CLR4_4_12p2pl43y7wao.R.inc(123);boolean boolean0 = MatrixInverse.isInconsistent(doubleArray0);
	      __CLR4_4_12p2pl43y7wao.R.inc(124);assertEquals(7, doubleArray0.length);
	      __CLR4_4_12p2pl43y7wao.R.inc(125);assertTrue(boolean0);
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agt0os3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agt0os3i() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(126);
	      __CLR4_4_12p2pl43y7wao.R.inc(127);double[][] doubleArray0 = new double[4][0];
	      __CLR4_4_12p2pl43y7wao.R.inc(128);double[] doubleArray1 = new double[3];
	      __CLR4_4_12p2pl43y7wao.R.inc(129);doubleArray1[2] = 1.0E-8;
	      __CLR4_4_12p2pl43y7wao.R.inc(130);doubleArray0[0] = doubleArray1;
	      // Undeclared exception!
	      __CLR4_4_12p2pl43y7wao.R.inc(131);try { 
	        __CLR4_4_12p2pl43y7wao.R.inc(132);MatrixInverse.isInconsistent(doubleArray0);
	        __CLR4_4_12p2pl43y7wao.R.inc(133);fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 2
	         //
	         __CLR4_4_12p2pl43y7wao.R.inc(134);verifyException("net.mooctest.MatrixInverse", e);
	      }
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpszh93r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpszh93r() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(135);
	      __CLR4_4_12p2pl43y7wao.R.inc(136);double[][] doubleArray0 = new double[2][3];
	      __CLR4_4_12p2pl43y7wao.R.inc(137);double[] doubleArray1 = new double[1];
	      __CLR4_4_12p2pl43y7wao.R.inc(138);doubleArray1[0] = 1.0E-8;
	      __CLR4_4_12p2pl43y7wao.R.inc(139);doubleArray0[0] = doubleArray1;
	      __CLR4_4_12p2pl43y7wao.R.inc(140);MatrixInverse.solve(doubleArray0);
	      __CLR4_4_12p2pl43y7wao.R.inc(141);assertEquals(2, doubleArray0.length);
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gysy9q3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gysy9q3y() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(142);
	      __CLR4_4_12p2pl43y7wao.R.inc(143);double[][] doubleArray0 = new double[6][9];
	      __CLR4_4_12p2pl43y7wao.R.inc(144);double[] doubleArray1 = new double[6];
	      __CLR4_4_12p2pl43y7wao.R.inc(145);doubleArray0[0] = doubleArray1;
	      __CLR4_4_12p2pl43y7wao.R.inc(146);double[][] doubleArray2 = MatrixInverse.inverse(doubleArray0);
	      __CLR4_4_12p2pl43y7wao.R.inc(147);assertNotSame(doubleArray0, doubleArray2);
	      __CLR4_4_12p2pl43y7wao.R.inc(148);assertNotSame(doubleArray2, doubleArray0);
	      __CLR4_4_12p2pl43y7wao.R.inc(149);assertEquals(6, doubleArray0.length);
	      __CLR4_4_12p2pl43y7wao.R.inc(150);assertEquals(6, doubleArray2.length);
	      __CLR4_4_12p2pl43y7wao.R.inc(151);assertFalse(doubleArray2.equals((Object)doubleArray0));
	      __CLR4_4_12p2pl43y7wao.R.inc(152);assertNotNull(doubleArray2);
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7sx2749();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test06",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7sx2749() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(153);
	      __CLR4_4_12p2pl43y7wao.R.inc(154);double[][] doubleArray0 = new double[1][8];
	      __CLR4_4_12p2pl43y7wao.R.inc(155);double[][] doubleArray1 = MatrixInverse.inverse(doubleArray0);
	      __CLR4_4_12p2pl43y7wao.R.inc(156);assertEquals(1, doubleArray0.length);
	      __CLR4_4_12p2pl43y7wao.R.inc(157);assertNull(doubleArray1);
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngsvuo4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test07",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngsvuo4e() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(158);
	      // Undeclared exception!
	      __CLR4_4_12p2pl43y7wao.R.inc(159);try { 
	        __CLR4_4_12p2pl43y7wao.R.inc(160);MatrixInverse.solve((double[][]) null);
	        __CLR4_4_12p2pl43y7wao.R.inc(161);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_12p2pl43y7wao.R.inc(162);verifyException("net.mooctest.MatrixInverse", e);
	      }
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpsun54j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test08",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpsun54j() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(163);
	      __CLR4_4_12p2pl43y7wao.R.inc(164);double[][] doubleArray0 = new double[9][4];
	      __CLR4_4_12p2pl43y7wao.R.inc(165);double[] doubleArray1 = new double[8];
	      __CLR4_4_12p2pl43y7wao.R.inc(166);doubleArray0[0] = doubleArray1;
	      // Undeclared exception!
	      __CLR4_4_12p2pl43y7wao.R.inc(167);try { 
	        __CLR4_4_12p2pl43y7wao.R.inc(168);MatrixInverse.solve(doubleArray0);
	        __CLR4_4_12p2pl43y7wao.R.inc(169);fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 4
	         //
	         __CLR4_4_12p2pl43y7wao.R.inc(170);verifyException("net.mooctest.MatrixInverse", e);
	      }
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tystfm4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test09",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tystfm4r() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(171);
	      // Undeclared exception!
	      __CLR4_4_12p2pl43y7wao.R.inc(172);try { 
	        __CLR4_4_12p2pl43y7wao.R.inc(173);MatrixInverse.isInconsistent((double[][]) null);
	        __CLR4_4_12p2pl43y7wao.R.inc(174);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_12p2pl43y7wao.R.inc(175);verifyException("net.mooctest.MatrixInverse", e);
	      }
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uw4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uw4w() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(176);
	      __CLR4_4_12p2pl43y7wao.R.inc(177);double[][] doubleArray0 = new double[6][3];
	      __CLR4_4_12p2pl43y7wao.R.inc(178);double[] doubleArray1 = new double[1];
	      __CLR4_4_12p2pl43y7wao.R.inc(179);doubleArray0[5] = doubleArray1;
	      // Undeclared exception!
	      __CLR4_4_12p2pl43y7wao.R.inc(180);try { 
	        __CLR4_4_12p2pl43y7wao.R.inc(181);MatrixInverse.isInconsistent(doubleArray0);
	        __CLR4_4_12p2pl43y7wao.R.inc(182);fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 2
	         //
	         __CLR4_4_12p2pl43y7wao.R.inc(183);verifyException("net.mooctest.MatrixInverse", e);
	      }
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonznd54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonznd54() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(184);
	      // Undeclared exception!
	      __CLR4_4_12p2pl43y7wao.R.inc(185);try { 
	        __CLR4_4_12p2pl43y7wao.R.inc(186);MatrixInverse.inverse((double[][]) null);
	        __CLR4_4_12p2pl43y7wao.R.inc(187);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_12p2pl43y7wao.R.inc(188);verifyException("net.mooctest.MatrixInverse", e);
	      }
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3g3ja59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3g3ja59() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(189);
	      __CLR4_4_12p2pl43y7wao.R.inc(190);double[][] doubleArray0 = new double[0][3];
	      // Undeclared exception!
	      __CLR4_4_12p2pl43y7wao.R.inc(191);try { 
	        __CLR4_4_12p2pl43y7wao.R.inc(192);MatrixInverse.inverse(doubleArray0);
	        __CLR4_4_12p2pl43y7wao.R.inc(193);fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 0
	         //
	         __CLR4_4_12p2pl43y7wao.R.inc(194);verifyException("net.mooctest.MatrixInverse", e);
	      }
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uug4qt5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uug4qt5f() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(195);
	      // Undeclared exception!
	      __CLR4_4_12p2pl43y7wao.R.inc(196);try { 
	        __CLR4_4_12p2pl43y7wao.R.inc(197);MatrixInverse.hasMultipleSolutions((double[][]) null);
	        __CLR4_4_12p2pl43y7wao.R.inc(198);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_12p2pl43y7wao.R.inc(199);verifyException("net.mooctest.MatrixInverse", e);
	      }
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test14()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlg5yc5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlg5yc5k() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(200);
	      __CLR4_4_12p2pl43y7wao.R.inc(201);double[][] doubleArray0 = new double[3][3];
	      __CLR4_4_12p2pl43y7wao.R.inc(202);double[] doubleArray1 = new double[6];
	      __CLR4_4_12p2pl43y7wao.R.inc(203);doubleArray0[0] = doubleArray1;
	      // Undeclared exception!
	      __CLR4_4_12p2pl43y7wao.R.inc(204);try { 
	        __CLR4_4_12p2pl43y7wao.R.inc(205);MatrixInverse.hasMultipleSolutions(doubleArray0);
	        __CLR4_4_12p2pl43y7wao.R.inc(206);fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 3
	         //
	         __CLR4_4_12p2pl43y7wao.R.inc(207);verifyException("net.mooctest.MatrixInverse", e);
	      }
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test15()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocg75v5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocg75v5s() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(208);
	      __CLR4_4_12p2pl43y7wao.R.inc(209);double[][] doubleArray0 = new double[2][7];
	      __CLR4_4_12p2pl43y7wao.R.inc(210);boolean boolean0 = MatrixInverse.hasMultipleSolutions(doubleArray0);
	      __CLR4_4_12p2pl43y7wao.R.inc(211);assertTrue(boolean0);
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test16()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3g8de5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3g8de5w() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(212);
	      __CLR4_4_12p2pl43y7wao.R.inc(213);double[][] doubleArray0 = new double[2][7];
	      __CLR4_4_12p2pl43y7wao.R.inc(214);double[] doubleArray1 = new double[2];
	      __CLR4_4_12p2pl43y7wao.R.inc(215);doubleArray1[1] = (-1473.139960043111);
	      __CLR4_4_12p2pl43y7wao.R.inc(216);doubleArray0[0] = doubleArray1;
	      __CLR4_4_12p2pl43y7wao.R.inc(217);doubleArray0[1] = doubleArray1;
	      __CLR4_4_12p2pl43y7wao.R.inc(218);double[][] doubleArray2 = MatrixInverse.inverse(doubleArray0);
	      __CLR4_4_12p2pl43y7wao.R.inc(219);double[][] doubleArray3 = MatrixInverse.inverse(doubleArray2);
	      __CLR4_4_12p2pl43y7wao.R.inc(220);assertEquals(2, doubleArray3.length);
	      
	      __CLR4_4_12p2pl43y7wao.R.inc(221);boolean boolean0 = MatrixInverse.isInconsistent(doubleArray3);
	      __CLR4_4_12p2pl43y7wao.R.inc(222);assertFalse(boolean0);
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test17()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hug9kx67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hug9kx67() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(223);
	      __CLR4_4_12p2pl43y7wao.R.inc(224);double[][] doubleArray0 = new double[2][7];
	      __CLR4_4_12p2pl43y7wao.R.inc(225);MatrixInverse.solve(doubleArray0);
	      __CLR4_4_12p2pl43y7wao.R.inc(226);assertEquals(2, doubleArray0.length);
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test18()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elgasg6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elgasg6b() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(227);
	      __CLR4_4_12p2pl43y7wao.R.inc(228);double[][] doubleArray0 = new double[4][2];
	      __CLR4_4_12p2pl43y7wao.R.inc(229);double[][] doubleArray1 = MatrixInverse.inverse(doubleArray0);
	      __CLR4_4_12p2pl43y7wao.R.inc(230);assertNull(doubleArray1);
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test19()  throws Throwable  {__CLR4_4_12p2pl43y7wao.R.globalSliceStart(getClass().getName(),231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcgbzz6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43y7wao.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43y7wao.R.globalSliceEnd(getClass().getName(),"net.mooctest.MatrixInverseTest.test19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcgbzz6f() throws Throwable{try{__CLR4_4_12p2pl43y7wao.R.inc(231);
	      __CLR4_4_12p2pl43y7wao.R.inc(232);MatrixInverse matrixInverse0 = new MatrixInverse();
	  }finally{__CLR4_4_12p2pl43y7wao.R.flushNeeded();}}
	
}

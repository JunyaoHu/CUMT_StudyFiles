/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;

import org.junit.Test;

import net.mooctest.ALU;

public class ALUTest {static class __CLR4_4_1a9a9l43y8350{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0030\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0041\u004c\u0055\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654593458096L,8589935092L,824,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test(timeout = 4000)
	public void test() {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3a9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3a9(){try{__CLR4_4_1a9a9l43y8350.R.inc(369);
		__CLR4_4_1a9a9l43y8350.R.inc(370);ALU alu = new ALU();
	}finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pt4bdab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pt4bdab() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(371);
	      __CLR4_4_1a9a9l43y8350.R.inc(372);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(373);aLU0.negation("fMcBL(T");
	      __CLR4_4_1a9a9l43y8350.R.inc(374);aLU0.claAdder("<H\"VHv2", "p}=bnMo^}3)HYVZ", 'C');
	      __CLR4_4_1a9a9l43y8350.R.inc(375);aLU0.claAdder("fMcBL(T", "1101110", '-');
	      __CLR4_4_1a9a9l43y8350.R.inc(376);String string0 = "'G67,?)!(-*b:nWFDg";
	      __CLR4_4_1a9a9l43y8350.R.inc(377);int int0 = 2752;
	      __CLR4_4_1a9a9l43y8350.R.inc(378);aLU0.ieee754("", 2752);
	      __CLR4_4_1a9a9l43y8350.R.inc(379);int int1 = (-581);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(380);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(381);aLU0.ieee754("<H\"VHv2", 64);
	        __CLR4_4_1a9a9l43y8350.R.inc(382);fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // For input string: \"<H\"VHv2\"
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(383);verifyException("java.lang.NumberFormatException", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yt33uao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yt33uao() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(384);
	      __CLR4_4_1a9a9l43y8350.R.inc(385);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(386);aLU0.integerTrueValue("gQ;pMhkj");
	      __CLR4_4_1a9a9l43y8350.R.inc(387);aLU0.floatRepresentation("-2920", 373, 52);
	      __CLR4_4_1a9a9l43y8350.R.inc(388);aLU0.ieee754("-2920", 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(389);aLU0.oneAdder("f&zR@mJTIAR)i?>.%#K");
	      __CLR4_4_1a9a9l43y8350.R.inc(390);aLU0.normalize("");
	      __CLR4_4_1a9a9l43y8350.R.inc(391);aLU0.normalize("1");
	      __CLR4_4_1a9a9l43y8350.R.inc(392);aLU0.leftShift(".", 1);
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177t1wbax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177t1wbax() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(393);
	      __CLR4_4_1a9a9l43y8350.R.inc(394);ALU aLU0 = new ALU();
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(395);aLU0.adder("1", "1", '0', 1407);
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agt0osb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agt0osb0() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(396);
	      __CLR4_4_1a9a9l43y8350.R.inc(397);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(398);aLU0.fullAdder('.', 't', '8');
	      __CLR4_4_1a9a9l43y8350.R.inc(399);aLU0.negation("01");
	      __CLR4_4_1a9a9l43y8350.R.inc(400);aLU0.fullAdder('8', '.', 'F');
	      __CLR4_4_1a9a9l43y8350.R.inc(401);aLU0.fullAdder('/', '/', '/');
	      __CLR4_4_1a9a9l43y8350.R.inc(402);aLU0.ieee754("", 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(403);aLU0.floatTrueValue("10", 1, 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(404);aLU0.integerRepresentation("10", 1);
	      __CLR4_4_1a9a9l43y8350.R.inc(405);aLU0.floatRepresentation("0", 0, 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(406);aLU0.negation("10");
	      __CLR4_4_1a9a9l43y8350.R.inc(407);aLU0.fullAdder('a', 'V', '\"');
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(408);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(409);aLU0.floatTrueValue("", 0, 1);
	        __CLR4_4_1a9a9l43y8350.R.inc(410);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpszh9bf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpszh9bf() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(411);
	      __CLR4_4_1a9a9l43y8350.R.inc(412);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(413);aLU0.ieee754("GG3hfKvp", 1);
	      __CLR4_4_1a9a9l43y8350.R.inc(414);aLU0.adder("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "1", 'e', 399);
	      __CLR4_4_1a9a9l43y8350.R.inc(415);aLU0.integerSubtraction("GG3hfKvp", "GG3hfKvp", 399);
	      __CLR4_4_1a9a9l43y8350.R.inc(416);aLU0.floatTrueValue("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111110", 11, 11);
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gysy9qbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gysy9qbl() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(417);
	      __CLR4_4_1a9a9l43y8350.R.inc(418);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(419);aLU0.leftShift("0", 1);
	      __CLR4_4_1a9a9l43y8350.R.inc(420);aLU0.oneAdder("0");
	      __CLR4_4_1a9a9l43y8350.R.inc(421);aLU0.andGate('.', '2');
	      __CLR4_4_1a9a9l43y8350.R.inc(422);aLU0.ieee754("9NYEGSn&d|Md(StQ{", '2');
	      __CLR4_4_1a9a9l43y8350.R.inc(423);aLU0.normalize("01");
	      __CLR4_4_1a9a9l43y8350.R.inc(424);aLU0.normalize("");
	      __CLR4_4_1a9a9l43y8350.R.inc(425);aLU0.integerTrueValue("9NYEGSn&d|Md(StQ{");
	      __CLR4_4_1a9a9l43y8350.R.inc(426);aLU0.fullAdder('.', '2', '2');
	      __CLR4_4_1a9a9l43y8350.R.inc(427);aLU0.oneAdder("0");
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(428);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(429);aLU0.claAdder("0", "9NYEGSn&d|Md(StQ{", '.');
	        __CLR4_4_1a9a9l43y8350.R.inc(430);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7sx27bz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test06",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7sx27bz() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(431);
	      __CLR4_4_1a9a9l43y8350.R.inc(432);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(433);aLU0.oneAdder("JOV");
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(434);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(435);aLU0.leftShift((String) null, (-730));
	        __CLR4_4_1a9a9l43y8350.R.inc(436);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(437);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngsvuoc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test07",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngsvuoc6() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(438);
	      __CLR4_4_1a9a9l43y8350.R.inc(439);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(440);char char0 = '4';
	      __CLR4_4_1a9a9l43y8350.R.inc(441);aLU0.andGate('4', '4');
	      __CLR4_4_1a9a9l43y8350.R.inc(442);String string0 = "%[DPKag<_*:b(Ql";
	      __CLR4_4_1a9a9l43y8350.R.inc(443);int int0 = 4;
	      __CLR4_4_1a9a9l43y8350.R.inc(444);aLU0.floatTrueValue("%[DPKag<_*:b(Ql", 4, 4);
	      __CLR4_4_1a9a9l43y8350.R.inc(445);aLU0.floatRepresentation("40.75", '0', 4);
	      __CLR4_4_1a9a9l43y8350.R.inc(446);aLU0.claAdder("40.75", "40.75", '4');
	      __CLR4_4_1a9a9l43y8350.R.inc(447);aLU0.negation("01111111111111111100000000000000000000000000000110100");
	      __CLR4_4_1a9a9l43y8350.R.inc(448);aLU0.ieee754("01111111111111111100000000000000000000000000000110100", 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(449);int int1 = 1;
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(450);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(451);aLU0.floatRepresentation("%[DPKag<_*:b(Ql", 1, 4);
	        __CLR4_4_1a9a9l43y8350.R.inc(452);fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // For input string: \"%[DPKag<_*:b(Ql\"
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(453);verifyException("java.lang.NumberFormatException", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpsun5cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test08",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpsun5cm() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(454);
	      __CLR4_4_1a9a9l43y8350.R.inc(455);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(456);char char0 = '`';
	      __CLR4_4_1a9a9l43y8350.R.inc(457);aLU0.xorGate('`', '`');
	      __CLR4_4_1a9a9l43y8350.R.inc(458);aLU0.negation("&tMvk");
	      __CLR4_4_1a9a9l43y8350.R.inc(459);aLU0.floatTrueValue("00000", 0, 106);
	      __CLR4_4_1a9a9l43y8350.R.inc(460);aLU0.fullAdder('0', '0', '`');
	      __CLR4_4_1a9a9l43y8350.R.inc(461);aLU0.ieee754("&tMvk", 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(462);aLU0.fullAdder('0', '`', '`');
	      __CLR4_4_1a9a9l43y8350.R.inc(463);String string0 = "";
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(464);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(465);aLU0.integerRepresentation("", (-1));
	        __CLR4_4_1a9a9l43y8350.R.inc(466);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tystfmcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test09",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tystfmcz() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(467);
	      __CLR4_4_1a9a9l43y8350.R.inc(468);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(469);char char0 = '\'';
	      __CLR4_4_1a9a9l43y8350.R.inc(470);aLU0.fullAdder('l', '\'', '\"');
	      __CLR4_4_1a9a9l43y8350.R.inc(471);int int0 = 0;
	      __CLR4_4_1a9a9l43y8350.R.inc(472);aLU0.floatRepresentation("01", 0, 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(473);aLU0.oneAdder("");
	      __CLR4_4_1a9a9l43y8350.R.inc(474);aLU0.negation("");
	      __CLR4_4_1a9a9l43y8350.R.inc(475);aLU0.integerTrueValue("'");
	      __CLR4_4_1a9a9l43y8350.R.inc(476);aLU0.integerRepresentation("1", 0);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(477);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(478);aLU0.leftShift("9", (-1));
	        __CLR4_4_1a9a9l43y8350.R.inc(479);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uwdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uwdc() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(480);
	      __CLR4_4_1a9a9l43y8350.R.inc(481);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(482);aLU0.normalize("");
	      __CLR4_4_1a9a9l43y8350.R.inc(483);aLU0.normalize("0");
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  
	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonznddg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonznddg() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(484);
	      __CLR4_4_1a9a9l43y8350.R.inc(485);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(486);aLU0.integerSubtraction("GG3hf*Kvk>p", "GG3hf*Kvk>p", 399);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(487);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(488);aLU0.floatTrueValue("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111110", 3, 3);
	        __CLR4_4_1a9a9l43y8350.R.inc(489);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	         //
	         // String index out of range: -1
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(490);verifyException("java.lang.AbstractStringBuilder", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3g3jadn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3g3jadn() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(491);
	      __CLR4_4_1a9a9l43y8350.R.inc(492);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(493);aLU0.integerSubtraction("GG3hf*Kvk>p", "GG3hf*Kvk>p", 399);
	      __CLR4_4_1a9a9l43y8350.R.inc(494);aLU0.claAdder("01111111111", "[DPK", ',');
	      __CLR4_4_1a9a9l43y8350.R.inc(495);aLU0.floatTrueValue("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111110", 20, 20);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(496);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(497);aLU0.claAdder("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111110", "0.0", '=');
	        __CLR4_4_1a9a9l43y8350.R.inc(498);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uug4qtdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uug4qtdv() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(499);
	      __CLR4_4_1a9a9l43y8350.R.inc(500);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(501);char char0 = '1';
	      __CLR4_4_1a9a9l43y8350.R.inc(502);aLU0.andGate('1', '1');
	      __CLR4_4_1a9a9l43y8350.R.inc(503);String string0 = "%[DPKag<_*:b(Ql";
	      __CLR4_4_1a9a9l43y8350.R.inc(504);int int0 = (-17);
	      __CLR4_4_1a9a9l43y8350.R.inc(505);int int1 = (-864);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(506);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(507);aLU0.floatTrueValue("%[DPKag<_*:b(Ql", (-17), (-864));
	        __CLR4_4_1a9a9l43y8350.R.inc(508);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test14()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlg5yce5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlg5yce5() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(509);
	      __CLR4_4_1a9a9l43y8350.R.inc(510);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(511);String string0 = null;
	      __CLR4_4_1a9a9l43y8350.R.inc(512);aLU0.floatTrueValue("1S!c::fv", 0, 1422);
	      __CLR4_4_1a9a9l43y8350.R.inc(513);aLU0.floatTrueValue("+Inf", 0, 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(514);aLU0.ieee754(":4Mr8&why kZt)vh", 1422);
	      __CLR4_4_1a9a9l43y8350.R.inc(515);int int0 = 0;
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(516);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(517);aLU0.floatRepresentation((String) null, 0, 1417);
	        __CLR4_4_1a9a9l43y8350.R.inc(518);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(519);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test15()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocg75veg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocg75veg() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(520);
	      __CLR4_4_1a9a9l43y8350.R.inc(521);ALU aLU0 = new ALU();
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(522);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(523);aLU0.integerRepresentation("-", (-309));
	        __CLR4_4_1a9a9l43y8350.R.inc(524);fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // For input string: \"\"
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(525);verifyException("java.lang.NumberFormatException", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test16()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3g8deem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3g8deem() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(526);
	      __CLR4_4_1a9a9l43y8350.R.inc(527);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(528);char char0 = '.';
	      __CLR4_4_1a9a9l43y8350.R.inc(529);char char1 = 't';
	      __CLR4_4_1a9a9l43y8350.R.inc(530);char char2 = '8';
	      __CLR4_4_1a9a9l43y8350.R.inc(531);aLU0.fullAdder('.', 't', '8');
	      __CLR4_4_1a9a9l43y8350.R.inc(532);char char3 = '\"';
	      __CLR4_4_1a9a9l43y8350.R.inc(533);aLU0.negation("01");
	      __CLR4_4_1a9a9l43y8350.R.inc(534);aLU0.fullAdder('8', '.', 'F');
	      __CLR4_4_1a9a9l43y8350.R.inc(535);aLU0.fullAdder('%', '%', '%');
	      __CLR4_4_1a9a9l43y8350.R.inc(536);int int0 = 1;
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(537);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(538);aLU0.floatTrueValue("10", 1, 'a');
	        __CLR4_4_1a9a9l43y8350.R.inc(539);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	         //
	         // String index out of range: -3
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(540);verifyException("java.lang.AbstractStringBuilder", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test17()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hug9kxf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hug9kxf1() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(541);
	      __CLR4_4_1a9a9l43y8350.R.inc(542);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(543);aLU0.integerTrueValue("gQ;pMhk(");
	      __CLR4_4_1a9a9l43y8350.R.inc(544);aLU0.integerRepresentation("-2986", 373);
	      __CLR4_4_1a9a9l43y8350.R.inc(545);aLU0.ieee754("-2986", 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(546);aLU0.oneAdder("f&zR@mJTIAR)i?>.%#K");
	      __CLR4_4_1a9a9l43y8350.R.inc(547);aLU0.normalize("");
	      __CLR4_4_1a9a9l43y8350.R.inc(548);aLU0.normalize("1");
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test18()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elgasgf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elgasgf9() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(549);
	      __CLR4_4_1a9a9l43y8350.R.inc(550);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(551);aLU0.integerSubtraction("GG3hf*Kvk>p", "GG3hf*Kvk>p", 399);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(552);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(553);aLU0.floatTrueValue("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111110", 399, 399);
	        __CLR4_4_1a9a9l43y8350.R.inc(554);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test19()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcgbzzff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcgbzzff() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(555);
	      __CLR4_4_1a9a9l43y8350.R.inc(556);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(557);String string0 = null;
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(558);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(559);aLU0.ieee754((String) null, 32);
	        __CLR4_4_1a9a9l43y8350.R.inc(560);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(561);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
//	  @Test(timeout = 4000)
//	  public void test20()  throws Throwable  {
//	      ALU aLU0 = new ALU();
//	      aLU0.integerSubtraction("GG3hf*Kvk>p", "GG3hf*Kvk>p", 399);
//	      aLU0.integerSubtraction("GG3hf*Kvk>p", "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111110", 399);
//	      aLU0.claAdder("01111111111", "[DPK", ',');
//	      // Undeclared exception!
//	      aLU0.floatTrueValue("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000011111111110", 399, 399);
//	  }
	  
	  @Test(timeout = 4000)
	  public void test21()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ml5s8fm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ml5s8fm() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(562);
	      __CLR4_4_1a9a9l43y8350.R.inc(563);ALU aLU0 = new ALU();
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(564);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(565);aLU0.ieee754("", 32);
	        __CLR4_4_1a9a9l43y8350.R.inc(566);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test22()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dl6zrfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dl6zrfr() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(567);
	      __CLR4_4_1a9a9l43y8350.R.inc(568);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(569);aLU0.adder("<9M", "111", 'v', 16);
	      __CLR4_4_1a9a9l43y8350.R.inc(570);aLU0.adder("01111111111111111", "@8jc]h{6Ki1", 'v', 4);
	      __CLR4_4_1a9a9l43y8350.R.inc(571);aLU0.negation("<9M");
	      __CLR4_4_1a9a9l43y8350.R.inc(572);aLU0.integerTrueValue("Xr^2CET");
	      __CLR4_4_1a9a9l43y8350.R.inc(573);aLU0.normalize("111");
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(574);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(575);aLU0.integerRepresentation("<9M", (-747));
	        __CLR4_4_1a9a9l43y8350.R.inc(576);fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // For input string: \"<9M\"
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(577);verifyException("java.lang.NumberFormatException", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test23()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_114l87ag2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_114l87ag2() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(578);
	      __CLR4_4_1a9a9l43y8350.R.inc(579);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(580);char char0 = '.';
	      __CLR4_4_1a9a9l43y8350.R.inc(581);String string0 = "0";
	      __CLR4_4_1a9a9l43y8350.R.inc(582);aLU0.leftShift("0", 1);
	      __CLR4_4_1a9a9l43y8350.R.inc(583);String string1 = "9NYEGSn&d|Md(StQ{";
	      __CLR4_4_1a9a9l43y8350.R.inc(584);aLU0.claAdder("D ]KW", "9NYEGSn&d|Md(StQ{", 'y');
	      __CLR4_4_1a9a9l43y8350.R.inc(585);char char1 = '2';
	      __CLR4_4_1a9a9l43y8350.R.inc(586);aLU0.andGate('.', '2');
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(587);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(588);aLU0.adder((String) null, (String) null, '.', 2895);
	        __CLR4_4_1a9a9l43y8350.R.inc(589);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test24()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124eql7ge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test24",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124eql7ge() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(590);
	      __CLR4_4_1a9a9l43y8350.R.inc(591);ALU aLU0 = new ALU();
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(592);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(593);aLU0.leftShift((String) null, (-730));
	        __CLR4_4_1a9a9l43y8350.R.inc(594);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(595);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test25()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15depdogk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15depdogk() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(596);
	      __CLR4_4_1a9a9l43y8350.R.inc(597);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(598);aLU0.ieee754((String) null, 299);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(599);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(600);aLU0.integerRepresentation((String) null, 0);
	        __CLR4_4_1a9a9l43y8350.R.inc(601);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(602);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	  
	  @Test(timeout = 4000)
	  public void test26()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18meo65gr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test26",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18meo65gr() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(603);
	      __CLR4_4_1a9a9l43y8350.R.inc(604);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(605);String string0 = "";
	      __CLR4_4_1a9a9l43y8350.R.inc(606);String string1 = "QxE_-F.3yr4|";
	      __CLR4_4_1a9a9l43y8350.R.inc(607);String string2 = "1";
	      __CLR4_4_1a9a9l43y8350.R.inc(608);int int0 = (-835);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(609);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(610);aLU0.integerSubtraction("1", (String) null, (-835));
	        __CLR4_4_1a9a9l43y8350.R.inc(611);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(612);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test27()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvemymh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvemymh1() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(613);
	      __CLR4_4_1a9a9l43y8350.R.inc(614);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(615);int int0 = 0;
	      __CLR4_4_1a9a9l43y8350.R.inc(616);String string0 = "";
	      __CLR4_4_1a9a9l43y8350.R.inc(617);int int1 = 892;
	      __CLR4_4_1a9a9l43y8350.R.inc(618);aLU0.ieee754("", 892);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(619);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(620);aLU0.integerRepresentation("", 0);
	        __CLR4_4_1a9a9l43y8350.R.inc(621);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test28()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f4elr3ha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f4elr3ha() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(622);
	      __CLR4_4_1a9a9l43y8350.R.inc(623);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(624);String string0 = "";
	      __CLR4_4_1a9a9l43y8350.R.inc(625);int int0 = 0;
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(626);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(627);aLU0.claAdder("#vYU@/9l4c-w#tj-ST", (String) null, 'w');
	        __CLR4_4_1a9a9l43y8350.R.inc(628);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(629);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test29()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1idekjkhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1idekjkhi() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(630);
	      __CLR4_4_1a9a9l43y8350.R.inc(631);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(632);String string0 = null;
	      __CLR4_4_1a9a9l43y8350.R.inc(633);char char0 = 'z';
	      __CLR4_4_1a9a9l43y8350.R.inc(634);aLU0.fullAdder('#', 'z', 'z');
	      __CLR4_4_1a9a9l43y8350.R.inc(635);char char1 = '6';
	      __CLR4_4_1a9a9l43y8350.R.inc(636);int int0 = 0;
	      __CLR4_4_1a9a9l43y8350.R.inc(637);aLU0.ieee754((String) null, 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(638);aLU0.leftShift("5roEiq7TbT*", 0);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(639);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(640);aLU0.oneAdder((String) null);
	        __CLR4_4_1a9a9l43y8350.R.inc(641);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(642);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test30()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iu9ryuhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test30",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iu9ryuhv() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(643);
	      __CLR4_4_1a9a9l43y8350.R.inc(644);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(645);aLU0.integerTrueValue("+0}to?u!");
	      __CLR4_4_1a9a9l43y8350.R.inc(646);aLU0.normalize("+0}to?u!");
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test31()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m39qrbhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test31",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m39qrbhz() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(647);
	      __CLR4_4_1a9a9l43y8350.R.inc(648);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(649);aLU0.xorGate('.', '.');
	      __CLR4_4_1a9a9l43y8350.R.inc(650);aLU0.ieee754((String) null, 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(651);aLU0.xorGate('0', '.');
	      __CLR4_4_1a9a9l43y8350.R.inc(652);aLU0.fullAdder('O', '2', '.');
	      __CLR4_4_1a9a9l43y8350.R.inc(653);aLU0.andGate('1', 'V');
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test32()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pc9pjsi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pc9pjsi6() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(654);
	      __CLR4_4_1a9a9l43y8350.R.inc(655);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(656);String string0 = null;
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(657);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(658);aLU0.floatTrueValue((String) null, 4, 0);
	        __CLR4_4_1a9a9l43y8350.R.inc(659);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(660);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test33()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sl9oc9id();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sl9oc9id() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(661);
	      __CLR4_4_1a9a9l43y8350.R.inc(662);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(663);String string0 = "0YQj";
	      __CLR4_4_1a9a9l43y8350.R.inc(664);aLU0.oneAdder("OoYH?hKSO-e");
	      __CLR4_4_1a9a9l43y8350.R.inc(665);aLU0.negation("J%6yB");
	      __CLR4_4_1a9a9l43y8350.R.inc(666);String string1 = "1";
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(667);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(668);aLU0.integerSubtraction("1", "", 4);
	        __CLR4_4_1a9a9l43y8350.R.inc(669);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	         //
	         // String index out of range: 0
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(670);verifyException("java.lang.AbstractStringBuilder", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test34()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vu9n4qin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test34",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vu9n4qin() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(671);
	      __CLR4_4_1a9a9l43y8350.R.inc(672);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(673);char char0 = '-';
	      __CLR4_4_1a9a9l43y8350.R.inc(674);char char1 = '5';
	      __CLR4_4_1a9a9l43y8350.R.inc(675);char char2 = ']';
	      __CLR4_4_1a9a9l43y8350.R.inc(676);aLU0.fullAdder('-', '5', ']');
	      __CLR4_4_1a9a9l43y8350.R.inc(677);aLU0.ieee754("tbq", 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(678);aLU0.ieee754("g-K|^)~~", 2239);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(679);aLU0.integerSubtraction("tbq", "i_AWzq!)K=", 4030);
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test35()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z39lx7iw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test35",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z39lx7iw() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(680);
	      __CLR4_4_1a9a9l43y8350.R.inc(681);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(682);aLU0.adder("s&U/.fz", "s&U/.fz", '', 27);
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}

	  
	  @Test(timeout = 4000)
	  public void test36()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wouh9giz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test36",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wouh9giz() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(683);
	      __CLR4_4_1a9a9l43y8350.R.inc(684);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(685);aLU0.leftShift("", 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(686);aLU0.integerTrueValue("1");
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test37()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tfuigzj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test37",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tfuigzj3() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(687);
	      __CLR4_4_1a9a9l43y8350.R.inc(688);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(689);aLU0.negation("wwP+;,C^=G9_Mt8");
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(690);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(691);aLU0.negation((String) null);
	        __CLR4_4_1a9a9l43y8350.R.inc(692);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(693);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test38()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6ujoija();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test38",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6ujoija() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(694);
	      __CLR4_4_1a9a9l43y8350.R.inc(695);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(696);String string0 = "0";
	      __CLR4_4_1a9a9l43y8350.R.inc(697);aLU0.negation("0");
	      __CLR4_4_1a9a9l43y8350.R.inc(698);aLU0.floatRepresentation("1", 64, 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(699);String string1 = "C'!S2qUn2eK";
	      __CLR4_4_1a9a9l43y8350.R.inc(700);aLU0.ieee754("C'!S2qUn2eK", (-1));
	      __CLR4_4_1a9a9l43y8350.R.inc(701);aLU0.integerTrueValue("1");
	      __CLR4_4_1a9a9l43y8350.R.inc(702);char char0 = 't';
	      __CLR4_4_1a9a9l43y8350.R.inc(703);aLU0.andGate('\"', 't');
	      __CLR4_4_1a9a9l43y8350.R.inc(704);String string2 = "p~@D";
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(705);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(706);aLU0.ieee754("I-W", 64);
	        __CLR4_4_1a9a9l43y8350.R.inc(707);fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // For input string: \"I-W\"
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(708);verifyException("java.lang.NumberFormatException", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test39()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxukw1jp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test39",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxukw1jp() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(709);
	      __CLR4_4_1a9a9l43y8350.R.inc(710);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(711);aLU0.andGate('.', '.');
	      __CLR4_4_1a9a9l43y8350.R.inc(712);aLU0.xorGate('[', 'J');
	      __CLR4_4_1a9a9l43y8350.R.inc(713);aLU0.oneAdder("");
	      __CLR4_4_1a9a9l43y8350.R.inc(714);aLU0.floatRepresentation("0", 11, 1438);
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test40()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mgzdgrjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mgzdgrjv() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(715);
	      __CLR4_4_1a9a9l43y8350.R.inc(716);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(717);aLU0.negation("}*-`v)>AaVg`$GGK");
	      __CLR4_4_1a9a9l43y8350.R.inc(718);aLU0.fullAdder('N', ' ', ',');
	      __CLR4_4_1a9a9l43y8350.R.inc(719);aLU0.floatRepresentation("0000000000000000", 0, 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(720);aLU0.integerRepresentation("0", 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(721);aLU0.oneAdder("");
	      __CLR4_4_1a9a9l43y8350.R.inc(722);aLU0.fullAdder('A', 'w', 'r');
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(723);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(724);aLU0.floatRepresentation("", 1959, 5);
	        __CLR4_4_1a9a9l43y8350.R.inc(725);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test41()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7zeoak6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test41",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7zeoak6() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(726);
	      __CLR4_4_1a9a9l43y8350.R.inc(727);ALU aLU0 = new ALU();
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(728);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(729);aLU0.normalize((String) null);
	        __CLR4_4_1a9a9l43y8350.R.inc(730);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(731);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test42()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyzfvtkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test42",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyzfvtkc() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(732);
	      __CLR4_4_1a9a9l43y8350.R.inc(733);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(734);aLU0.xorGate('Z', 'Z');
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(735);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(736);aLU0.integerTrueValue((String) null);
	        __CLR4_4_1a9a9l43y8350.R.inc(737);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(738);verifyException("net.mooctest.ALU", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test43()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpzh3ckj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test43",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpzh3ckj() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(739);
	      __CLR4_4_1a9a9l43y8350.R.inc(740);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(741);String string0 = "0";
	      __CLR4_4_1a9a9l43y8350.R.inc(742);aLU0.negation("0");
	      __CLR4_4_1a9a9l43y8350.R.inc(743);aLU0.floatRepresentation("1", 64, 0);
	      __CLR4_4_1a9a9l43y8350.R.inc(744);String string1 = "C'!S2qUn2eK";
	      __CLR4_4_1a9a9l43y8350.R.inc(745);aLU0.ieee754("C'!S2qUn2eK", (-1));
	      __CLR4_4_1a9a9l43y8350.R.inc(746);aLU0.integerTrueValue("1");
	      __CLR4_4_1a9a9l43y8350.R.inc(747);char char0 = 't';
	      __CLR4_4_1a9a9l43y8350.R.inc(748);aLU0.andGate('', 't');
	      __CLR4_4_1a9a9l43y8350.R.inc(749);aLU0.ieee754("-1", 64);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(750);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(751);aLU0.floatRepresentation("p~@D", 1639, 1639);
	        __CLR4_4_1a9a9l43y8350.R.inc(752);fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // For input string: \"p~@D\"
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(753);verifyException("java.lang.NumberFormatException", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test44()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gziavky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test44",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gziavky() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(754);
	      __CLR4_4_1a9a9l43y8350.R.inc(755);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(756);aLU0.integerSubtraction("10100", "10100", 587);
	      __CLR4_4_1a9a9l43y8350.R.inc(757);char char0 = 'M';
	      __CLR4_4_1a9a9l43y8350.R.inc(758);aLU0.fullAdder('^', 'M', 'M');
	      __CLR4_4_1a9a9l43y8350.R.inc(759);int int0 = 1;
	      __CLR4_4_1a9a9l43y8350.R.inc(760);aLU0.integerRepresentation("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 1);
	      __CLR4_4_1a9a9l43y8350.R.inc(761);aLU0.adder("10100", "0", 'M', 77);
	      __CLR4_4_1a9a9l43y8350.R.inc(762);int int1 = 5;
	      __CLR4_4_1a9a9l43y8350.R.inc(763);aLU0.integerRepresentation("0", 5);
	      __CLR4_4_1a9a9l43y8350.R.inc(764);aLU0.oneAdder("101101101000");
	      __CLR4_4_1a9a9l43y8350.R.inc(765);int int2 = (-2268);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(766);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(767);aLU0.adder("@`M(n", "@`M(n", '^', (-2268));
	        __CLR4_4_1a9a9l43y8350.R.inc(768);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	         //
	         // String index out of range: -2272
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(769);verifyException("java.lang.AbstractStringBuilder", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test45()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_167zjiele();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test45",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_167zjiele() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(770);
	      __CLR4_4_1a9a9l43y8350.R.inc(771);ALU aLU0 = new ALU();
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(772);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(773);aLU0.integerRepresentation("+Inf", 7);
	        __CLR4_4_1a9a9l43y8350.R.inc(774);fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // For input string: \"+Inf\"
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(775);verifyException("java.lang.NumberFormatException", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test46()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12yzkpxlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test46",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12yzkpxlk() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(776);
	      __CLR4_4_1a9a9l43y8350.R.inc(777);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(778);aLU0.floatRepresentation("000", (-186), (-186));
	      __CLR4_4_1a9a9l43y8350.R.inc(779);int int0 = (-251);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(780);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(781);aLU0.integerRepresentation("!/VL56s+aUs", (-251));
	        __CLR4_4_1a9a9l43y8350.R.inc(782);fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // For input string: \"!/VL56s+aUs\"
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(783);verifyException("java.lang.NumberFormatException", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test47()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0e2kls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test47",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0e2kls() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(784);
	      __CLR4_4_1a9a9l43y8350.R.inc(785);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(786);aLU0.fullAdder('.', 't', '8');
	      __CLR4_4_1a9a9l43y8350.R.inc(787);char char0 = '\"';
	      __CLR4_4_1a9a9l43y8350.R.inc(788);aLU0.fullAdder('\"', 'a', 'y');
	      __CLR4_4_1a9a9l43y8350.R.inc(789);aLU0.fullAdder('/', '/', '/');
	      __CLR4_4_1a9a9l43y8350.R.inc(790);int int0 = (-5);
	      __CLR4_4_1a9a9l43y8350.R.inc(791);aLU0.ieee754("", (-5));
	      __CLR4_4_1a9a9l43y8350.R.inc(792);int int1 = 1;
	      __CLR4_4_1a9a9l43y8350.R.inc(793);aLU0.floatTrueValue("01", 1, (-5));
	      __CLR4_4_1a9a9l43y8350.R.inc(794);aLU0.integerRepresentation("01", 1);
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(795);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(796);aLU0.floatRepresentation("+Inf", (-5), (-5));
	        __CLR4_4_1a9a9l43y8350.R.inc(797);fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // For input string: \"+Inf\"
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(798);verifyException("java.lang.NumberFormatException", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test48()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13j0cv1m7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test48",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13j0cv1m7() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(799);
	      __CLR4_4_1a9a9l43y8350.R.inc(800);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(801);int int0 = 861;
	      __CLR4_4_1a9a9l43y8350.R.inc(802);aLU0.floatTrueValue("1010", 0, 33);
	      __CLR4_4_1a9a9l43y8350.R.inc(803);aLU0.floatRepresentation("1010", 861, 861);
	      __CLR4_4_1a9a9l43y8350.R.inc(804);aLU0.xorGate('C', 'C');
	      __CLR4_4_1a9a9l43y8350.R.inc(805);String string0 = "fDsj:>b/^8*YKsRCYuO";
	      __CLR4_4_1a9a9l43y8350.R.inc(806);aLU0.adder("0111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000111111110010", "0111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000111111110010", '0', 861);
	      __CLR4_4_1a9a9l43y8350.R.inc(807);aLU0.negation("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000000000000000110");
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(808);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(809);aLU0.adder("1010", "", 'C', 95);
	        __CLR4_4_1a9a9l43y8350.R.inc(810);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	         //
	         // String index out of range: 0
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(811);verifyException("java.lang.AbstractStringBuilder", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
	
	  @Test(timeout = 4000)
	  public void test49()  throws Throwable  {__CLR4_4_1a9a9l43y8350.R.globalSliceStart(getClass().getName(),812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16s0bnimk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a9a9l43y8350.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a9a9l43y8350.R.globalSliceEnd(getClass().getName(),"net.mooctest.ALUTest.test49",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16s0bnimk() throws Throwable{try{__CLR4_4_1a9a9l43y8350.R.inc(812);
	      __CLR4_4_1a9a9l43y8350.R.inc(813);ALU aLU0 = new ALU();
	      __CLR4_4_1a9a9l43y8350.R.inc(814);String string0 = "t?g4!(qcC^";
	      __CLR4_4_1a9a9l43y8350.R.inc(815);int int0 = 1;
	      __CLR4_4_1a9a9l43y8350.R.inc(816);aLU0.floatTrueValue("t?g4!(qcC^", 6, 1);
	      __CLR4_4_1a9a9l43y8350.R.inc(817);aLU0.floatRepresentation("1.0", 1, 1);
	      __CLR4_4_1a9a9l43y8350.R.inc(818);String string1 = "NaN";
	      __CLR4_4_1a9a9l43y8350.R.inc(819);char char0 = '\\';
	      // Undeclared exception!
	      __CLR4_4_1a9a9l43y8350.R.inc(820);try { 
	        __CLR4_4_1a9a9l43y8350.R.inc(821);aLU0.adder("NaN", "1.0", '\\', 1);
	        __CLR4_4_1a9a9l43y8350.R.inc(822);fail("Expecting exception: StringIndexOutOfBoundsException");
	      
	      } catch(StringIndexOutOfBoundsException e) {
	         //
	         // String index out of range: -3
	         //
	         __CLR4_4_1a9a9l43y8350.R.inc(823);verifyException("java.lang.AbstractStringBuilder", e);
	      }
	  }finally{__CLR4_4_1a9a9l43y8350.R.flushNeeded();}}
}

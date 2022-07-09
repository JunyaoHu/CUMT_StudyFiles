/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.security.AccessControlException;
import java.security.Permission;

import org.junit.Test;

public class JipaTest {static class __CLR4_4_19z9zl3zcakj5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u004a\u0069\u0070\u0061\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314757735L,8589935092L,440,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
//  @Test((expected = ExitException.class))
//  public void test1()
//  {
//	  
//  }
  @Test(timeout = 4000)
  public void test() {__CLR4_4_19z9zl3zcakj5.R.globalSliceStart(getClass().getName(),359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt39z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19z9zl3zcakj5.R.rethrow($CLV_t2$);}finally{__CLR4_4_19z9zl3zcakj5.R.globalSliceEnd(getClass().getName(),"net.mooctest.JipaTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt39z(){try{__CLR4_4_19z9zl3zcakj5.R.inc(359);
	  __CLR4_4_19z9zl3zcakj5.R.inc(360);Jipa j = new Jipa();
	  __CLR4_4_19z9zl3zcakj5.R.inc(361);int int0 = Jipa.getValue("");
	  __CLR4_4_19z9zl3zcakj5.R.inc(362);Jipa.getValue("1");
	  __CLR4_4_19z9zl3zcakj5.R.inc(363);Jipa.processInstruction("mov \"Al\",100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(364);Jipa.processInstruction("");
	  __CLR4_4_19z9zl3zcakj5.R.inc(365);Jipa.processInstruction("mov Al,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(366);Jipa.processInstruction("mov *Al,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(367);Jipa.processInstruction("cpy Al,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(368);Jipa.processInstruction("set Al,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(369);Jipa.processInstruction("set BL,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(370);Jipa.processInstruction("del AL");
	  __CLR4_4_19z9zl3zcakj5.R.inc(371);Jipa.processInstruction("del &BL");
	  __CLR4_4_19z9zl3zcakj5.R.inc(372);Jipa.processInstruction("del &AL");
	  __CLR4_4_19z9zl3zcakj5.R.inc(373);Jipa.processInstruction("arr 100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(374);Jipa.processInstruction("var 100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(375);Jipa.processInstruction("var 101,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(376);Jipa.processInstruction("var &101,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(377);Jipa.processInstruction("del 101");
//	  Jipa.processInstruction("in AL");
	  __CLR4_4_19z9zl3zcakj5.R.inc(378);Jipa.processInstruction("inc Al");
	  __CLR4_4_19z9zl3zcakj5.R.inc(379);Jipa.processInstruction("dec Al");
	  __CLR4_4_19z9zl3zcakj5.R.inc(380);Jipa.processInstruction("add 100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(381);Jipa.processInstruction("sub 100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(382);Jipa.processInstruction("mul 100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(383);Jipa.processInstruction("div 100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(384);Jipa.processInstruction("mod 100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(385);Jipa.processInstruction("xor 100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(386);Jipa.processInstruction("or 100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(387);Jipa.processInstruction("and 100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(388);Jipa.processInstruction("jmp 100,100");
	  
	  __CLR4_4_19z9zl3zcakj5.R.inc(389);Jipa.processInstruction("jnz 100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(390);Jipa.processInstruction("jnz 0");
	  __CLR4_4_19z9zl3zcakj5.R.inc(391);Jipa.processInstruction("ja 100,100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(392);Jipa.processInstruction("ja 100,99,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(393);Jipa.processInstruction("jae 100,99,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(394);Jipa.processInstruction("jae 100,101,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(395);Jipa.processInstruction("jb 100,100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(396);Jipa.processInstruction("jb 100,101,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(397);Jipa.processInstruction("jbe 100,101,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(398);Jipa.processInstruction("jbe 100,99,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(399);Jipa.processInstruction("jz 0,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(400);Jipa.processInstruction("jz 1,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(401);Jipa.processInstruction("je 100,100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(402);Jipa.processInstruction("je 10,100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(403);Jipa.processInstruction("jne 100,99,al");
	  __CLR4_4_19z9zl3zcakj5.R.inc(404);Jipa.processInstruction("jne 100,100,Al");
	  __CLR4_4_19z9zl3zcakj5.R.inc(405);Jipa.processInstruction("cmp 100,100,100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(406);Jipa.processInstruction("cmp 100,99,AL");
	  __CLR4_4_19z9zl3zcakj5.R.inc(407);Jipa.processInstruction("out 100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(408);Jipa.processInstruction("out 1\"100\"");
	  __CLR4_4_19z9zl3zcakj5.R.inc(409);Jipa.processInstruction("out \"100\"");
	  __CLR4_4_19z9zl3zcakj5.R.inc(410);Jipa.processInstruction("out 1\"100");
	  __CLR4_4_19z9zl3zcakj5.R.inc(411);Jipa.processInstruction("out 1\"100,");
	  
	  __CLR4_4_19z9zl3zcakj5.R.inc(412);Label l = new Label(1,"1");
	  __CLR4_4_19z9zl3zcakj5.R.inc(413);l.getName();
	  __CLR4_4_19z9zl3zcakj5.R.inc(414);l.getLine();
	  __CLR4_4_19z9zl3zcakj5.R.inc(415);l.findLabel("1");
	  __CLR4_4_19z9zl3zcakj5.R.inc(416);try
	  {
		  __CLR4_4_19z9zl3zcakj5.R.inc(417);String str= "as";
		  __CLR4_4_19z9zl3zcakj5.R.inc(418);System.setIn(new ByteArrayInputStream(str.getBytes()));
		  __CLR4_4_19z9zl3zcakj5.R.inc(419);Jipa.processInstruction("in AL");
		  __CLR4_4_19z9zl3zcakj5.R.inc(420);str= "1";
		  __CLR4_4_19z9zl3zcakj5.R.inc(421);System.setIn(new ByteArrayInputStream(str.getBytes()));
		  __CLR4_4_19z9zl3zcakj5.R.inc(422);Jipa.processInstruction("in AL");
		  __CLR4_4_19z9zl3zcakj5.R.inc(423);FileWriter fw = new FileWriter("1.txt");
		  __CLR4_4_19z9zl3zcakj5.R.inc(424);fw.write("1231321\n");
		  __CLR4_4_19z9zl3zcakj5.R.inc(425);fw.write("1231321;\n");
		  __CLR4_4_19z9zl3zcakj5.R.inc(426);fw.write("\"1231321;\"\n");
		  __CLR4_4_19z9zl3zcakj5.R.inc(427);fw.write("lbl \"1231321;\"\n");
		  __CLR4_4_19z9zl3zcakj5.R.inc(428);fw.flush();
		  __CLR4_4_19z9zl3zcakj5.R.inc(429);fw.close();
//		  f.createNewFile();
		  __CLR4_4_19z9zl3zcakj5.R.inc(430);str= "./1.txt";
		  __CLR4_4_19z9zl3zcakj5.R.inc(431);System.setIn(new ByteArrayInputStream(str.getBytes()));
		  __CLR4_4_19z9zl3zcakj5.R.inc(432);Jipa.loadInstructions("");
		  __CLR4_4_19z9zl3zcakj5.R.inc(433);Jipa.loadInstructions("1.txt");
		  __CLR4_4_19z9zl3zcakj5.R.inc(434);Jipa.processInstruction("var AL,100");
		  __CLR4_4_19z9zl3zcakj5.R.inc(435);Jipa.processInstruction("var BL,100");
		  __CLR4_4_19z9zl3zcakj5.R.inc(436);Jipa.processInstruction("jmp \"1231321;\",100");
		  __CLR4_4_19z9zl3zcakj5.R.inc(437);Jipa.processInstruction("jmp BL,100");
		  __CLR4_4_19z9zl3zcakj5.R.inc(438);Jipa.loadInstructions("1");
//		  Jipa.loadInstructions("");
	  }
	  catch(Exception e)
	  {
		  __CLR4_4_19z9zl3zcakj5.R.inc(439);e.printStackTrace();
	  }
	  

//	  Jipa.loadInstructions("q");
//	  Jipa.loadInstructions("C:\\mooctest\\projects\\6537\\119455\\Calculator");
//	  Jipa.processInstruction("halt 100,100");
	  
	  
  }finally{__CLR4_4_19z9zl3zcakj5.R.flushNeeded();}}

}
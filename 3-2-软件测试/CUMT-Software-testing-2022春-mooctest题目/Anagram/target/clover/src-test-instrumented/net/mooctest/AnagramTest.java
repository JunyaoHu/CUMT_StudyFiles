/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import net.mooctest.Anagram;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

public class AnagramTest{static class __CLR4_4_16y6yl4dxksft{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0038\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0041\u006e\u0061\u0067\u0072\u0061\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1655197032943L,8589935092L,282,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  
  
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {__CLR4_4_16y6yl4dxksft.R.globalSliceStart(getClass().getName(),250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beu6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16y6yl4dxksft.R.rethrow($CLV_t2$);}finally{__CLR4_4_16y6yl4dxksft.R.globalSliceEnd(getClass().getName(),"net.mooctest.AnagramTest.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beu6y() throws Throwable{try{__CLR4_4_16y6yl4dxksft.R.inc(250);
      __CLR4_4_16y6yl4dxksft.R.inc(251);Anagram anagram0 = new Anagram((-60), "IGNORE_TYPE_VARIABLE_OR_WILDCARD");
      // Undeclared exception!
      __CLR4_4_16y6yl4dxksft.R.inc(252);try { 
        __CLR4_4_16y6yl4dxksft.R.inc(253);anagram0.findAllAnagrams((String) null);
        __CLR4_4_16y6yl4dxksft.R.inc(254);fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         __CLR4_4_16y6yl4dxksft.R.inc(255);verifyException("net.mooctest.Anagram", e);
      }
  }finally{__CLR4_4_16y6yl4dxksft.R.flushNeeded();}}



  @Test(timeout = 4000)
  public void test3()  throws Throwable  {__CLR4_4_16y6yl4dxksft.R.globalSliceStart(getClass().getName(),256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zs74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16y6yl4dxksft.R.rethrow($CLV_t2$);}finally{__CLR4_4_16y6yl4dxksft.R.globalSliceEnd(getClass().getName(),"net.mooctest.AnagramTest.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zs74() throws Throwable{try{__CLR4_4_16y6yl4dxksft.R.inc(256);
      __CLR4_4_16y6yl4dxksft.R.inc(257);Anagram anagram0 = new Anagram("Annotations are not supported.");
      __CLR4_4_16y6yl4dxksft.R.inc(258);try { 
        __CLR4_4_16y6yl4dxksft.R.inc(259);anagram0.findAllAnagrams("Annotations are not supported.");
        __CLR4_4_16y6yl4dxksft.R.inc(260);fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         __CLR4_4_16y6yl4dxksft.R.inc(261);verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }finally{__CLR4_4_16y6yl4dxksft.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {__CLR4_4_16y6yl4dxksft.R.globalSliceStart(getClass().getName(),262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s97a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16y6yl4dxksft.R.rethrow($CLV_t2$);}finally{__CLR4_4_16y6yl4dxksft.R.globalSliceEnd(getClass().getName(),"net.mooctest.AnagramTest.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s97a() throws Throwable{try{__CLR4_4_16y6yl4dxksft.R.inc(262);
      __CLR4_4_16y6yl4dxksft.R.inc(263);Anagram anagram0 = null;
      __CLR4_4_16y6yl4dxksft.R.inc(264);try {
        __CLR4_4_16y6yl4dxksft.R.inc(265);anagram0 = new Anagram((String) null);
        __CLR4_4_16y6yl4dxksft.R.inc(266);fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }finally{__CLR4_4_16y6yl4dxksft.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {__CLR4_4_16y6yl4dxksft.R.globalSliceStart(getClass().getName(),267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kq7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16y6yl4dxksft.R.rethrow($CLV_t2$);}finally{__CLR4_4_16y6yl4dxksft.R.globalSliceEnd(getClass().getName(),"net.mooctest.AnagramTest.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kq7f() throws Throwable{try{__CLR4_4_16y6yl4dxksft.R.inc(267);
      __CLR4_4_16y6yl4dxksft.R.inc(268);Anagram anagram0 = null;
      __CLR4_4_16y6yl4dxksft.R.inc(269);try {
        __CLR4_4_16y6yl4dxksft.R.inc(270);anagram0 = new Anagram(0, (String) null);
        __CLR4_4_16y6yl4dxksft.R.inc(271);fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }finally{__CLR4_4_16y6yl4dxksft.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {__CLR4_4_16y6yl4dxksft.R.globalSliceStart(getClass().getName(),272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kn65d77k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16y6yl4dxksft.R.rethrow($CLV_t2$);}finally{__CLR4_4_16y6yl4dxksft.R.globalSliceEnd(getClass().getName(),"net.mooctest.AnagramTest.test6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kn65d77k() throws Throwable{try{__CLR4_4_16y6yl4dxksft.R.inc(272);
      __CLR4_4_16y6yl4dxksft.R.inc(273);Anagram anagram0 = null;
      __CLR4_4_16y6yl4dxksft.R.inc(274);try {
        __CLR4_4_16y6yl4dxksft.R.inc(275);anagram0 = new Anagram("");
        __CLR4_4_16y6yl4dxksft.R.inc(276);fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }finally{__CLR4_4_16y6yl4dxksft.R.flushNeeded();}}





  @Test(timeout = 4000)
  public void test9()  throws Throwable  {__CLR4_4_16y6yl4dxksft.R.globalSliceStart(getClass().getName(),277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ue61qm7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16y6yl4dxksft.R.rethrow($CLV_t2$);}finally{__CLR4_4_16y6yl4dxksft.R.globalSliceEnd(getClass().getName(),"net.mooctest.AnagramTest.test9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ue61qm7p() throws Throwable{try{__CLR4_4_16y6yl4dxksft.R.inc(277);
      __CLR4_4_16y6yl4dxksft.R.inc(278);Anagram anagram0 = null;
      __CLR4_4_16y6yl4dxksft.R.inc(279);try {
        __CLR4_4_16y6yl4dxksft.R.inc(280);anagram0 = new Anagram(0, "");
        __CLR4_4_16y6yl4dxksft.R.inc(281);fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }finally{__CLR4_4_16y6yl4dxksft.R.flushNeeded();}}
}

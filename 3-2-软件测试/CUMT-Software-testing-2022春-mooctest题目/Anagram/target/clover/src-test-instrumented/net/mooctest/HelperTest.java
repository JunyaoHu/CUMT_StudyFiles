/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;


import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Set;
import java.util.TreeSet;

import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.Test;
import org.junit.runner.RunWith;

public class HelperTest{static class __CLR4_4_1bqbql4dxksjn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0038\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0041\u006e\u0061\u0067\u0072\u0061\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1655197032943L,8589935092L,537,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(timeout = 4000)
  public void test(){__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3bq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3bq(){try{__CLR4_4_1bqbql4dxksjn.R.inc(422);
      __CLR4_4_1bqbql4dxksjn.R.inc(423);Dictionary dictionary = new Dictionary();
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}
  
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pt4bdbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pt4bdbs() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(424);
      __CLR4_4_1bqbql4dxksjn.R.inc(425);char[] charArray0 = new char[4];
      __CLR4_4_1bqbql4dxksjn.R.inc(426);char[] charArray1 = Helper.setDifference(charArray0, charArray0);
      __CLR4_4_1bqbql4dxksjn.R.inc(427);char[] charArray2 = Helper.setDifference(charArray1, charArray1);
      __CLR4_4_1bqbql4dxksjn.R.inc(428);boolean boolean0 = Helper.isEquivalent(charArray2, charArray1);
      __CLR4_4_1bqbql4dxksjn.R.inc(429);assertTrue(boolean0);
      __CLR4_4_1bqbql4dxksjn.R.inc(430);assertEquals(0, charArray2.length);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}
//
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yt33ubz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yt33ubz() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(431);
      __CLR4_4_1bqbql4dxksjn.R.inc(432);char[] charArray0 = new char[7];
      __CLR4_4_1bqbql4dxksjn.R.inc(433);charArray0[0] = 'W';
      __CLR4_4_1bqbql4dxksjn.R.inc(434);char[] charArray1 = new char[7];
      __CLR4_4_1bqbql4dxksjn.R.inc(435);boolean boolean0 = Helper.isEquivalent(charArray0, charArray1);
      __CLR4_4_1bqbql4dxksjn.R.inc(436);assertFalse(boolean0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}
//
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177t1wbc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177t1wbc5() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(437);
      __CLR4_4_1bqbql4dxksjn.R.inc(438);char[] charArray0 = new char[6];
      __CLR4_4_1bqbql4dxksjn.R.inc(439);charArray0[0] = 'F';
      __CLR4_4_1bqbql4dxksjn.R.inc(440);boolean boolean0 = Helper.isEquivalent(charArray0, charArray0);
      __CLR4_4_1bqbql4dxksjn.R.inc(441);assertTrue(boolean0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}
//
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agt0osca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agt0osca() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(442);
      __CLR4_4_1bqbql4dxksjn.R.inc(443);char[] charArray0 = new char[3];
      __CLR4_4_1bqbql4dxksjn.R.inc(444);charArray0[0] = ',';
      __CLR4_4_1bqbql4dxksjn.R.inc(445);char[] charArray1 = new char[3];
      __CLR4_4_1bqbql4dxksjn.R.inc(446);boolean boolean0 = Helper.isEquivalent(charArray1, charArray0);
      __CLR4_4_1bqbql4dxksjn.R.inc(447);assertFalse(boolean0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}
//
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpszh9cg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpszh9cg() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(448);
      __CLR4_4_1bqbql4dxksjn.R.inc(449);char[] charArray0 = new char[7];
      __CLR4_4_1bqbql4dxksjn.R.inc(450);char[] charArray1 = new char[0];
      __CLR4_4_1bqbql4dxksjn.R.inc(451);boolean boolean0 = Helper.isEquivalent(charArray0, charArray1);
      __CLR4_4_1bqbql4dxksjn.R.inc(452);assertFalse(boolean0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gysy9qcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gysy9qcl() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(453);
      __CLR4_4_1bqbql4dxksjn.R.inc(454);char[] charArray0 = new char[3];
      __CLR4_4_1bqbql4dxksjn.R.inc(455);char[] charArray1 = Helper.setDifference(charArray0, charArray0);
      __CLR4_4_1bqbql4dxksjn.R.inc(456);boolean boolean0 = Helper.isSubset(charArray1, charArray0);
      __CLR4_4_1bqbql4dxksjn.R.inc(457);assertTrue(boolean0);
      __CLR4_4_1bqbql4dxksjn.R.inc(458);assertEquals(0, charArray1.length);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7sx27cr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test06",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7sx27cr() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(459);
      __CLR4_4_1bqbql4dxksjn.R.inc(460);Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 1);
      __CLR4_4_1bqbql4dxksjn.R.inc(461);TreeSet<String> treeSet0 = new TreeSet<String>();
      __CLR4_4_1bqbql4dxksjn.R.inc(462);setArray0[0] = (Set<String>) treeSet0;
      __CLR4_4_1bqbql4dxksjn.R.inc(463);Set<Set<String>> set0 = Helper.setMultiplication(setArray0);
      __CLR4_4_1bqbql4dxksjn.R.inc(464);assertTrue(set0.isEmpty());
      __CLR4_4_1bqbql4dxksjn.R.inc(465);assertNotNull(set0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngsvuocy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test07",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngsvuocy() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(466);
      // Undeclared exception!
      __CLR4_4_1bqbql4dxksjn.R.inc(467);try { 
        __CLR4_4_1bqbql4dxksjn.R.inc(468);Helper.sortWord((String) null);
        __CLR4_4_1bqbql4dxksjn.R.inc(469);fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpsun5d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test08",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpsun5d2() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(470);
      // Undeclared exception!
      __CLR4_4_1bqbql4dxksjn.R.inc(471);try { 
        __CLR4_4_1bqbql4dxksjn.R.inc(472);Helper.isSubset((char[]) null, (char[]) null);
        __CLR4_4_1bqbql4dxksjn.R.inc(473);fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         __CLR4_4_1bqbql4dxksjn.R.inc(474);verifyException("net.mooctest.Helper", e);
      }
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tystfmd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test09",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tystfmd7() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(475);
      // Undeclared exception!
      __CLR4_4_1bqbql4dxksjn.R.inc(476);try { 
        __CLR4_4_1bqbql4dxksjn.R.inc(477);Helper.isEquivalent((char[]) null, (char[]) null);
        __CLR4_4_1bqbql4dxksjn.R.inc(478);fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         __CLR4_4_1bqbql4dxksjn.R.inc(479);verifyException("net.mooctest.Helper", e);
      }
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uwdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uwdc() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(480);
      __CLR4_4_1bqbql4dxksjn.R.inc(481);Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 1);
      __CLR4_4_1bqbql4dxksjn.R.inc(482);TreeSet<String> treeSet0 = new TreeSet<String>();
      __CLR4_4_1bqbql4dxksjn.R.inc(483);treeSet0.add("aOd0[4i;BsNi");
      __CLR4_4_1bqbql4dxksjn.R.inc(484);setArray0[0] = (Set<String>) treeSet0;
      __CLR4_4_1bqbql4dxksjn.R.inc(485);Set<Set<String>> set0 = Helper.setMultiplication(setArray0);
      __CLR4_4_1bqbql4dxksjn.R.inc(486);assertEquals(1, set0.size());
      __CLR4_4_1bqbql4dxksjn.R.inc(487);assertNotNull(set0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonznddk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonznddk() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(488);
      __CLR4_4_1bqbql4dxksjn.R.inc(489);Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 1);
      // Undeclared exception!
      __CLR4_4_1bqbql4dxksjn.R.inc(490);try { 
        __CLR4_4_1bqbql4dxksjn.R.inc(491);Helper.setMultiplication(setArray0);
        __CLR4_4_1bqbql4dxksjn.R.inc(492);fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         __CLR4_4_1bqbql4dxksjn.R.inc(493);verifyException("net.mooctest.Helper", e);
      }
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3g3jadq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3g3jadq() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(494);
      __CLR4_4_1bqbql4dxksjn.R.inc(495);Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 0);
      __CLR4_4_1bqbql4dxksjn.R.inc(496);Set<Set<String>> set0 = Helper.setMultiplication(setArray0);
      __CLR4_4_1bqbql4dxksjn.R.inc(497);assertNull(set0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uug4qtdu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uug4qtdu() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(498);
      __CLR4_4_1bqbql4dxksjn.R.inc(499);Set<Set<String>> set0 = Helper.setMultiplication((Set<String>[]) null);
      __CLR4_4_1bqbql4dxksjn.R.inc(500);assertNull(set0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlg5ycdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlg5ycdx() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(501);
      __CLR4_4_1bqbql4dxksjn.R.inc(502);char[] charArray0 = new char[2];
      __CLR4_4_1bqbql4dxksjn.R.inc(503);char[] charArray1 = Helper.setDifference(charArray0, charArray0);
      __CLR4_4_1bqbql4dxksjn.R.inc(504);boolean boolean0 = Helper.isEquivalent(charArray1, charArray0);
      __CLR4_4_1bqbql4dxksjn.R.inc(505);assertEquals(0, charArray1.length);
      __CLR4_4_1bqbql4dxksjn.R.inc(506);assertFalse(boolean0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocg75ve3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocg75ve3() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(507);
      __CLR4_4_1bqbql4dxksjn.R.inc(508);char[] charArray0 = new char[3];
      __CLR4_4_1bqbql4dxksjn.R.inc(509);char[] charArray1 = new char[3];
      __CLR4_4_1bqbql4dxksjn.R.inc(510);charArray0[2] = '\u0089';
      __CLR4_4_1bqbql4dxksjn.R.inc(511);char[] charArray2 = Helper.setDifference(charArray0, charArray1);
      __CLR4_4_1bqbql4dxksjn.R.inc(512);assertArrayEquals(new char[] {'\u0089'}, charArray2);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3g8dee9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3g8dee9() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(513);
      // Undeclared exception!
      __CLR4_4_1bqbql4dxksjn.R.inc(514);try { 
        __CLR4_4_1bqbql4dxksjn.R.inc(515);Helper.setDifference((char[]) null, (char[]) null);
        __CLR4_4_1bqbql4dxksjn.R.inc(516);fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hug9kxed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hug9kxed() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(517);
      __CLR4_4_1bqbql4dxksjn.R.inc(518);char[] charArray0 = new char[3];
      __CLR4_4_1bqbql4dxksjn.R.inc(519);char[] charArray1 = new char[3];
      __CLR4_4_1bqbql4dxksjn.R.inc(520);charArray0[2] = '\u0089';
      __CLR4_4_1bqbql4dxksjn.R.inc(521);boolean boolean0 = Helper.isSubset(charArray0, charArray1);
      __CLR4_4_1bqbql4dxksjn.R.inc(522);assertFalse(boolean0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elgasgej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elgasgej() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(523);
      __CLR4_4_1bqbql4dxksjn.R.inc(524);char[] charArray0 = new char[2];
      __CLR4_4_1bqbql4dxksjn.R.inc(525);char[] charArray1 = Helper.setDifference(charArray0, charArray0);
      __CLR4_4_1bqbql4dxksjn.R.inc(526);boolean boolean0 = Helper.isSubset(charArray0, charArray1);
      __CLR4_4_1bqbql4dxksjn.R.inc(527);assertEquals(0, charArray1.length);
      __CLR4_4_1bqbql4dxksjn.R.inc(528);assertFalse(boolean0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcgbzzep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcgbzzep() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(529);
      __CLR4_4_1bqbql4dxksjn.R.inc(530);String string0 = Helper.sortWord("");
      __CLR4_4_1bqbql4dxksjn.R.inc(531);assertNull(string0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avl4kpes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avl4kpes() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(532);
      __CLR4_4_1bqbql4dxksjn.R.inc(533);String string0 = Helper.sortWord("eHBJ,9IY8v$bIl\"p{(");
      __CLR4_4_1bqbql4dxksjn.R.inc(534);assertEquals("\"$(,89BHIIJYbelpv{", string0);
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {__CLR4_4_1bqbql4dxksjn.R.globalSliceStart(getClass().getName(),535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ml5s8ev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bqbql4dxksjn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bqbql4dxksjn.R.globalSliceEnd(getClass().getName(),"net.mooctest.HelperTest.test21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ml5s8ev() throws Throwable{try{__CLR4_4_1bqbql4dxksjn.R.inc(535);
      __CLR4_4_1bqbql4dxksjn.R.inc(536);Helper helper0 = new Helper();
  }finally{__CLR4_4_1bqbql4dxksjn.R.flushNeeded();}}
}

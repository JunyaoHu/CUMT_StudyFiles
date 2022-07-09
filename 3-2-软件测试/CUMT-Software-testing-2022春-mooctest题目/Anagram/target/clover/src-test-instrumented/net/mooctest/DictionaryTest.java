/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;


import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.Test;
import org.junit.runner.RunWith;

public class DictionaryTest{static class __CLR4_4_17u7ul4dxkshl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0038\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0041\u006e\u0061\u0067\u0072\u0061\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1655197032943L,8589935092L,422,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(timeout = 4000)
  public void test(){__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt37u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt37u(){try{__CLR4_4_17u7ul4dxkshl.R.inc(282);
      __CLR4_4_17u7ul4dxkshl.R.inc(283);Dictionary dictionary = new Dictionary();
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
//  @Test(timeout = 4000)
//  public void test00()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("$:");
//      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, "ZwH5WHLe'lwyC");
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionaryWithSubsets("$:", "$:", 0);
//      boolean boolean1 = dictionary0.isDictionaryLoaded();
//      assertTrue(boolean1 == boolean0);
//  }

//  @Test(timeout = 4000)
//  public void test01()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[7];
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      FileSystemHandling.shouldAllThrowIOExceptions();
//      try { 
//        dictionary0.loadDictionaryWithSubsets("isDictionaryLoaded?: false\nDictionary: {}", "isDictionaryLoaded?: false\nDictionary: {}", (-3));
//        fail("Expecting exception: IOException");
//      
//      } catch(IOException e) {
//         //
//         // Simulated IOException
//         //
//         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177t1wb7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177t1wb7w() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(284);
      __CLR4_4_17u7ul4dxkshl.R.inc(285);Dictionary dictionary0 = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(286);try { 
        __CLR4_4_17u7ul4dxkshl.R.inc(287);dictionary0.loadDictionaryWithSubsets("^~_2g:'5", "T", (-1985));
        __CLR4_4_17u7ul4dxkshl.R.inc(288);fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         __CLR4_4_17u7ul4dxkshl.R.inc(289);verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

//  @Test(timeout = 4000)
//  public void test03()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[2];
//      FileSystemHandling.shouldAllThrowIOExceptions();
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      try { 
//        dictionary0.loadDictionary("isDictionaryLoaded?: false\nDictionary: {}");
//        fail("Expecting exception: IOException");
//      
//      } catch(IOException e) {
//         //
//         // Simulated IOException
//         //
//         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpszh982();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpszh982() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(290);
      __CLR4_4_17u7ul4dxkshl.R.inc(291);Dictionary dictionary0 = new Dictionary();
      // Undeclared exception!
      __CLR4_4_17u7ul4dxkshl.R.inc(292);try { 
        __CLR4_4_17u7ul4dxkshl.R.inc(293);dictionary0.addWord((String) null);
        __CLR4_4_17u7ul4dxkshl.R.inc(294);fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

//  @Test(timeout = 4000)
//  public void test05()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[2];
//      byteArray0[0] = (byte) (-63);
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionary("isDictionaryLoaded?: false\nDictionary: {}");
//      dictionary0.loadDictionaryWithSubsets("isDictionaryLoaded?: false\nDictionary: {}", "isDictionaryLoaded?: false\nDictionary: {}", (-36));
//      assertTrue(dictionary0.isDictionaryLoaded());
//  }

//  @Test(timeout = 4000)
//  public void test06()  throws Throwable  {
//      Dictionary dictionary0 = new Dictionary();
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("T");
//      FileSystemHandling.appendLineToFile(evoSuiteFile0, "T");
//      dictionary0.loadDictionaryWithSubsets("T", (String) null, 1);
//      assertTrue(dictionary0.isDictionaryLoaded());
//  }

//  @Test(timeout = 4000)
//  public void test07()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[2];
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionaryWithSubsets("isDictionaryLoaded?: false\nDictionary: {}", "isDictionaryLoaded?: false\nDictionary: {}", (-36));
//      assertTrue(dictionary0.isDictionaryLoaded());
//  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpsun587();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test08",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpsun587() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(295);
      __CLR4_4_17u7ul4dxkshl.R.inc(296);Dictionary dictionary0 = new Dictionary();
      // Undeclared exception!
      __CLR4_4_17u7ul4dxkshl.R.inc(297);try { 
        __CLR4_4_17u7ul4dxkshl.R.inc(298);dictionary0.loadDictionaryWithSubsets("", "", 1);
        __CLR4_4_17u7ul4dxkshl.R.inc(299);fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file path invalid
         //
         __CLR4_4_17u7ul4dxkshl.R.inc(300);verifyException("net.mooctest.Dictionary", e);
      }
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tystfm8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test09",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tystfm8d() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(301);
      __CLR4_4_17u7ul4dxkshl.R.inc(302);Dictionary dictionary0 = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(303);dictionary0.getDictionaryKeyList();
      __CLR4_4_17u7ul4dxkshl.R.inc(304);assertFalse(dictionary0.isDictionaryLoaded());
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

//  @Test(timeout = 4000)
//  public void test10()  throws Throwable  {
//      Dictionary dictionary0 = new Dictionary();
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      FileSystemHandling.appendLineToFile(evoSuiteFile0, "isDictionaryLoaded?: false\nDictionary: {}");
//      dictionary0.loadDictionaryWithSubsets("isDictionaryLoaded?: false\nDictionary: {}", "isDictionaryLoaded?: false\nDictionary: {}", 61);
//      // Undeclared exception!
//      try { 
//        dictionary0.findSingleWordAnagrams("");
//        fail("Expecting exception: IllegalStateException");
//      
//      } catch(IllegalStateException e) {
//         //
//         // word string invalid
//         //
//         verifyException("net.mooctest.Dictionary", e);
//      }
//  }

//  @Test(timeout = 4000)
//  public void test11()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("dictionary not loaded");
//      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionary("dictionary not loaded");
//      // Undeclared exception!
//      try { 
//        dictionary0.findSingleWordAnagrams((String) null);
//        fail("Expecting exception: IllegalStateException");
//      
//      } catch(IllegalStateException e) {
//         //
//         // word string invalid
//         //
//         verifyException("net.mooctest.Dictionary", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3g3ja8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3g3ja8h() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(305);
      __CLR4_4_17u7ul4dxkshl.R.inc(306);Dictionary dictionary0 = new Dictionary();
      // Undeclared exception!
      __CLR4_4_17u7ul4dxkshl.R.inc(307);try { 
        __CLR4_4_17u7ul4dxkshl.R.inc(308);dictionary0.findSingleWordAnagrams("U");
        __CLR4_4_17u7ul4dxkshl.R.inc(309);fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // dictionary not loaded
         //
         __CLR4_4_17u7ul4dxkshl.R.inc(310);verifyException("net.mooctest.Dictionary", e);
      }
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uug4qt8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uug4qt8n() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(311);
      __CLR4_4_17u7ul4dxkshl.R.inc(312);Dictionary dictionary0 = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(313);dictionary0.addWord("EBOCK");
      __CLR4_4_17u7ul4dxkshl.R.inc(314);boolean boolean0 = dictionary0.addWord("EBOCK");
      __CLR4_4_17u7ul4dxkshl.R.inc(315);assertFalse(dictionary0.isDictionaryLoaded());
      __CLR4_4_17u7ul4dxkshl.R.inc(316);assertTrue(boolean0);
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlg5yc8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlg5yc8t() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(317);
      __CLR4_4_17u7ul4dxkshl.R.inc(318);Dictionary dictionary0 = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(319);boolean boolean0 = dictionary0.addWord("");
      __CLR4_4_17u7ul4dxkshl.R.inc(320);assertFalse(dictionary0.isDictionaryLoaded());
      __CLR4_4_17u7ul4dxkshl.R.inc(321);assertFalse(boolean0);
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocg75v8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocg75v8y() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(322);
      __CLR4_4_17u7ul4dxkshl.R.inc(323);Dictionary dictionary0 = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(324);boolean boolean0 = dictionary0.addWord("$:");
      __CLR4_4_17u7ul4dxkshl.R.inc(325);assertTrue(boolean0);
      
      __CLR4_4_17u7ul4dxkshl.R.inc(326);dictionary0.getDictionaryKeyList();
      __CLR4_4_17u7ul4dxkshl.R.inc(327);assertFalse(dictionary0.isDictionaryLoaded());
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

//  @Test(timeout = 4000)
//  public void test16()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[2];
//      byteArray0[0] = (byte) (-63);
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionaryWithSubsets("isDictionaryLoaded?: false\nDictionary: {}", "", (byte)60);
//      assertTrue(dictionary0.isDictionaryLoaded());
//  }

//  @Test(timeout = 4000)
//  public void test17()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[2];
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionary("isDictionaryLoaded?: false\nDictionary: {}");
//      Set<String> set0 = dictionary0.findSingleWordAnagrams("\"T^1:53.oC^r");
//      assertNull(set0);
//  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elgasg94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elgasg94() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(328);
      __CLR4_4_17u7ul4dxkshl.R.inc(329);Dictionary dictionary0 = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(330);try { 
        __CLR4_4_17u7ul4dxkshl.R.inc(331);dictionary0.loadDictionary("isDictionaryLoaded?: false\nDictionary: {}");
        __CLR4_4_17u7ul4dxkshl.R.inc(332);fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         __CLR4_4_17u7ul4dxkshl.R.inc(333);verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcgbzz9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcgbzz9a() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(334);
      __CLR4_4_17u7ul4dxkshl.R.inc(335);Dictionary dictionary0 = new Dictionary();
      // Undeclared exception!
      __CLR4_4_17u7ul4dxkshl.R.inc(336);try { 
        __CLR4_4_17u7ul4dxkshl.R.inc(337);dictionary0.loadDictionaryWithSubsets((String) null, "EBOCK", 14);
        __CLR4_4_17u7ul4dxkshl.R.inc(338);fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file path invalid
         //
         __CLR4_4_17u7ul4dxkshl.R.inc(339);verifyException("net.mooctest.Dictionary", e);
      }
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avl4kp9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avl4kp9g() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(340);
      __CLR4_4_17u7ul4dxkshl.R.inc(341);Dictionary dictionary0 = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(342);String string0 = dictionary0.toString();
      __CLR4_4_17u7ul4dxkshl.R.inc(343);assertEquals("isDictionaryLoaded?: false\nDictionary: {}", string0);
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ml5s89k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ml5s89k() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(344);
      __CLR4_4_17u7ul4dxkshl.R.inc(345);Dictionary dictionary0 = new Dictionary();
      // Undeclared exception!
      __CLR4_4_17u7ul4dxkshl.R.inc(346);try { 
        __CLR4_4_17u7ul4dxkshl.R.inc(347);dictionary0.loadDictionary("");
        __CLR4_4_17u7ul4dxkshl.R.inc(348);fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file path invalid
         //
         __CLR4_4_17u7ul4dxkshl.R.inc(349);verifyException("net.mooctest.Dictionary", e);
      }
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dl6zr9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dl6zr9q() throws Throwable{try{__CLR4_4_17u7ul4dxkshl.R.inc(350);
      __CLR4_4_17u7ul4dxkshl.R.inc(351);Dictionary dictionary0 = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(352);boolean boolean0 = dictionary0.isDictionaryLoaded();
      __CLR4_4_17u7ul4dxkshl.R.inc(353);assertFalse(boolean0);
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  
  @Test(timeout = 4000)
  public void test1() throws IOException{__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beu9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beu9u() throws IOException{try{__CLR4_4_17u7ul4dxkshl.R.inc(354);
	  __CLR4_4_17u7ul4dxkshl.R.inc(355);String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      __CLR4_4_17u7ul4dxkshl.R.inc(356);Dictionary dictionary = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(357);dictionary.addWord("");
      __CLR4_4_17u7ul4dxkshl.R.inc(358);dictionary.addWord("abc");
      __CLR4_4_17u7ul4dxkshl.R.inc(359);dictionary.loadDictionary(fileString);
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  @Test(expected = IllegalArgumentException.class)
  public void test2() throws IllegalArgumentException {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7ba0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7ba0() throws IllegalArgumentException{try{__CLR4_4_17u7ul4dxkshl.R.inc(360);
	  __CLR4_4_17u7ul4dxkshl.R.inc(361);Dictionary dictionary = new Dictionary();
	  __CLR4_4_17u7ul4dxkshl.R.inc(362);try {
		__CLR4_4_17u7ul4dxkshl.R.inc(363);dictionary.loadDictionary("");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		__CLR4_4_17u7ul4dxkshl.R.inc(364);e.printStackTrace();
	}
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  @Test(timeout = 4000)
  public void test3() throws IOException{__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zsa5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zsa5() throws IOException{try{__CLR4_4_17u7ul4dxkshl.R.inc(365);
	  __CLR4_4_17u7ul4dxkshl.R.inc(366);String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      __CLR4_4_17u7ul4dxkshl.R.inc(367);Dictionary dictionary = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(368);dictionary.addWord("");
      __CLR4_4_17u7ul4dxkshl.R.inc(369);dictionary.addWord("hj");
      __CLR4_4_17u7ul4dxkshl.R.inc(370);dictionary.loadDictionary(fileString);
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  @Test(timeout = 4000)
  public void test4() throws IOException{__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s9ab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s9ab() throws IOException{try{__CLR4_4_17u7ul4dxkshl.R.inc(371);
	  __CLR4_4_17u7ul4dxkshl.R.inc(372);String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      __CLR4_4_17u7ul4dxkshl.R.inc(373);Dictionary dictionary = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(374);dictionary.addWord("");
      __CLR4_4_17u7ul4dxkshl.R.inc(375);dictionary.addWord("hjyy");
      __CLR4_4_17u7ul4dxkshl.R.inc(376);dictionary.addWord("hjyz");
      __CLR4_4_17u7ul4dxkshl.R.inc(377);dictionary.loadDictionary(fileString);
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  @Test(timeout = 4000)
  public void test5() throws IOException{__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kqai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kqai() throws IOException{try{__CLR4_4_17u7ul4dxkshl.R.inc(378);
	  __CLR4_4_17u7ul4dxkshl.R.inc(379);String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      __CLR4_4_17u7ul4dxkshl.R.inc(380);Dictionary dictionary = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(381);dictionary.addWord("hjyz");
      __CLR4_4_17u7ul4dxkshl.R.inc(382);dictionary.loadDictionary(fileString);
      __CLR4_4_17u7ul4dxkshl.R.inc(383);dictionary.findSingleWordAnagrams("hjyz");

  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  @Test(expected = IllegalStateException.class)
  public void test6() throws IllegalStateException {__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kn65d7ao();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,54,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kn65d7ao() throws IllegalStateException{try{__CLR4_4_17u7ul4dxkshl.R.inc(384);
	  __CLR4_4_17u7ul4dxkshl.R.inc(385);String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
	  __CLR4_4_17u7ul4dxkshl.R.inc(386);Dictionary dictionary = new Dictionary();
	  __CLR4_4_17u7ul4dxkshl.R.inc(387);dictionary.addWord("hjy");
	  __CLR4_4_17u7ul4dxkshl.R.inc(388);dictionary.findSingleWordAnagrams("hjy");
	  
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  @Test(expected = IllegalStateException.class)
  public void test7() throws Exception{__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw645oat();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,55,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw645oat() throws Exception{try{__CLR4_4_17u7ul4dxkshl.R.inc(389);
	  __CLR4_4_17u7ul4dxkshl.R.inc(390);String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      __CLR4_4_17u7ul4dxkshl.R.inc(391);Dictionary dictionary = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(392);dictionary.addWord("hjyz");
      __CLR4_4_17u7ul4dxkshl.R.inc(393);dictionary.loadDictionary(fileString);
      __CLR4_4_17u7ul4dxkshl.R.inc(394);dictionary.findSingleWordAnagrams("");

  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  @Test(timeout = 4000)
  public void test8() throws IOException{__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r562y5az();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r562y5az() throws IOException{try{__CLR4_4_17u7ul4dxkshl.R.inc(395);
	  __CLR4_4_17u7ul4dxkshl.R.inc(396);String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      __CLR4_4_17u7ul4dxkshl.R.inc(397);Dictionary dictionary = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(398);dictionary.addWord("abcd");
      __CLR4_4_17u7ul4dxkshl.R.inc(399);dictionary.isDictionaryLoaded();
      __CLR4_4_17u7ul4dxkshl.R.inc(400);dictionary.loadDictionary(fileString);
      __CLR4_4_17u7ul4dxkshl.R.inc(401);dictionary.isDictionaryLoaded();
      __CLR4_4_17u7ul4dxkshl.R.inc(402);dictionary.findSingleWordAnagrams("abcd");

  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  @Test(timeout = 4000)
  public void test9() throws IOException{__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ue61qmb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ue61qmb7() throws IOException{try{__CLR4_4_17u7ul4dxkshl.R.inc(403);
	  __CLR4_4_17u7ul4dxkshl.R.inc(404);String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      __CLR4_4_17u7ul4dxkshl.R.inc(405);Dictionary dictionary = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(406);dictionary.addWord("abcd");
      __CLR4_4_17u7ul4dxkshl.R.inc(407);dictionary.loadDictionary(fileString);
      __CLR4_4_17u7ul4dxkshl.R.inc(408);dictionary.getDictionaryKeyList();

  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  @Test(timeout = 4000)
  public void test10() throws IOException{__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uwbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uwbd() throws IOException{try{__CLR4_4_17u7ul4dxkshl.R.inc(409);
	  __CLR4_4_17u7ul4dxkshl.R.inc(410);String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      __CLR4_4_17u7ul4dxkshl.R.inc(411);Dictionary dictionary = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(412);dictionary.addWord("abcd");
      __CLR4_4_17u7ul4dxkshl.R.inc(413);dictionary.loadDictionary(fileString);
      __CLR4_4_17u7ul4dxkshl.R.inc(414);dictionary.toString();

  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  @Test(timeout = 4000)
  public void test11() throws IOException{__CLR4_4_17u7ul4dxkshl.R.globalSliceStart(getClass().getName(),415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonzndbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_17u7ul4dxkshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_17u7ul4dxkshl.R.globalSliceEnd(getClass().getName(),"net.mooctest.DictionaryTest.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonzndbj() throws IOException{try{__CLR4_4_17u7ul4dxkshl.R.inc(415);
	  __CLR4_4_17u7ul4dxkshl.R.inc(416);String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      __CLR4_4_17u7ul4dxkshl.R.inc(417);Dictionary dictionary = new Dictionary();
      __CLR4_4_17u7ul4dxkshl.R.inc(418);Anagram anagram1 = new Anagram(fileString);
      __CLR4_4_17u7ul4dxkshl.R.inc(419);Anagram anagram2 = new Anagram(2,fileString);
      __CLR4_4_17u7ul4dxkshl.R.inc(420);anagram2.findAllAnagrams("hjy");
      __CLR4_4_17u7ul4dxkshl.R.inc(421);anagram2.findAllAnagrams("hjy hy");
  }finally{__CLR4_4_17u7ul4dxkshl.R.flushNeeded();}}
  
  
  
  
  
  
}

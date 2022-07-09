/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.evosuite.runtime.EvoAssertions.*;
public class TrieTest {static class __CLR4_4_12p2pl43ltszd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0036\u0032\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0054\u0072\u0069\u0065\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654572636389L,8589935092L,205,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test
	public void test() {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),97);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt32p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt32p(){try{__CLR4_4_12p2pl43ltszd.R.inc(97);
		__CLR4_4_12p2pl43ltszd.R.inc(98);Trie tree=new Trie();
	}finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}
	
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),99);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pt4bd2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pt4bd2r() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(99);
      __CLR4_4_12p2pl43ltszd.R.inc(100);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(101);Trie.TrieNode trie_TrieNode0 = trie0.new TrieNode();
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yt33u2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yt33u2u() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(102);
      __CLR4_4_12p2pl43ltszd.R.inc(103);Trie trie0 = new Trie();
      // Undeclared exception!
      __CLR4_4_12p2pl43ltszd.R.inc(104);try { 
        __CLR4_4_12p2pl43ltszd.R.inc(105);trie0.preTraverse((Trie.TrieNode) null, "");
        __CLR4_4_12p2pl43ltszd.R.inc(106);fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         __CLR4_4_12p2pl43ltszd.R.inc(107);verifyException("net.mooctest.Trie$TrieNode", e);
      }
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177t1wb30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177t1wb30() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(108);
      __CLR4_4_12p2pl43ltszd.R.inc(109);Trie trie0 = new Trie();
      // Undeclared exception!
      __CLR4_4_12p2pl43ltszd.R.inc(110);try { 
        __CLR4_4_12p2pl43ltszd.R.inc(111);trie0.insert("9M/eJ+IF^9^<IlbU]?T");
        __CLR4_4_12p2pl43ltszd.R.inc(112);fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -40
         //
         __CLR4_4_12p2pl43ltszd.R.inc(113);verifyException("net.mooctest.Trie", e);
      }
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agt0os36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agt0os36() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(114);
      __CLR4_4_12p2pl43ltszd.R.inc(115);Trie trie0 = new Trie();
      // Undeclared exception!
      __CLR4_4_12p2pl43ltszd.R.inc(116);try { 
        __CLR4_4_12p2pl43ltszd.R.inc(117);trie0.hasPrefix("OX4?f; ");
        __CLR4_4_12p2pl43ltszd.R.inc(118);fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -18
         //
         __CLR4_4_12p2pl43ltszd.R.inc(119);verifyException("net.mooctest.Trie", e);
      }
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpszh93c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpszh93c() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(120);
      __CLR4_4_12p2pl43ltszd.R.inc(121);Trie trie0 = new Trie();
      // Undeclared exception!
      __CLR4_4_12p2pl43ltszd.R.inc(122);try { 
        __CLR4_4_12p2pl43ltszd.R.inc(123);trie0.has("?I6iv_o<#Q |4kA3*");
        __CLR4_4_12p2pl43ltszd.R.inc(124);fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -34
         //
         __CLR4_4_12p2pl43ltszd.R.inc(125);verifyException("net.mooctest.Trie", e);
      }
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gysy9q3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gysy9q3i() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(126);
      __CLR4_4_12p2pl43ltszd.R.inc(127);Trie trie0 = new Trie();
      // Undeclared exception!
      __CLR4_4_12p2pl43ltszd.R.inc(128);try { 
        __CLR4_4_12p2pl43ltszd.R.inc(129);trie0.countPrefix("9#[oL).M{]@(");
        __CLR4_4_12p2pl43ltszd.R.inc(130);fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -40
         //
         __CLR4_4_12p2pl43ltszd.R.inc(131);verifyException("net.mooctest.Trie", e);
      }
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7sx273o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test06",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7sx273o() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(132);
      __CLR4_4_12p2pl43ltszd.R.inc(133);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(134);trie0.preTraverse((Trie.TrieNode) null);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngsvuo3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test07",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngsvuo3r() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(135);
      __CLR4_4_12p2pl43ltszd.R.inc(136);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(137);Trie.TrieNode trie_TrieNode0 = trie0.getRoot();
      __CLR4_4_12p2pl43ltszd.R.inc(138);trie0.preTraverse(trie_TrieNode0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpsun53v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test08",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpsun53v() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(139);
      __CLR4_4_12p2pl43ltszd.R.inc(140);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(141);trie0.insert("z");
      __CLR4_4_12p2pl43ltszd.R.inc(142);boolean boolean0 = trie0.has("z");
      __CLR4_4_12p2pl43ltszd.R.inc(143);assertTrue(boolean0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tystfm40();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test09",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tystfm40() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(144);
      __CLR4_4_12p2pl43ltszd.R.inc(145);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(146);boolean boolean0 = trie0.has("");
      __CLR4_4_12p2pl43ltszd.R.inc(147);assertFalse(boolean0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uw44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uw44() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(148);
      __CLR4_4_12p2pl43ltszd.R.inc(149);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(150);boolean boolean0 = trie0.has("z");
      __CLR4_4_12p2pl43ltszd.R.inc(151);assertFalse(boolean0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonznd48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonznd48() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(152);
      __CLR4_4_12p2pl43ltszd.R.inc(153);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(154);boolean boolean0 = trie0.has((String) null);
      __CLR4_4_12p2pl43ltszd.R.inc(155);assertFalse(boolean0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3g3ja4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3g3ja4c() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(156);
      __CLR4_4_12p2pl43ltszd.R.inc(157);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(158);trie0.insert("z");
      __CLR4_4_12p2pl43ltszd.R.inc(159);Trie.TrieNode trie_TrieNode0 = trie0.getRoot();
      __CLR4_4_12p2pl43ltszd.R.inc(160);trie0.preTraverse(trie_TrieNode0, "z");
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uug4qt4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uug4qt4h() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(161);
      __CLR4_4_12p2pl43ltszd.R.inc(162);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(163);trie0.insert("z");
      __CLR4_4_12p2pl43ltszd.R.inc(164);String string0 = trie0.hasPrefix("z");
      __CLR4_4_12p2pl43ltszd.R.inc(165);assertNull(string0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlg5yc4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlg5yc4m() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(166);
      __CLR4_4_12p2pl43ltszd.R.inc(167);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(168);String string0 = trie0.hasPrefix("");
      __CLR4_4_12p2pl43ltszd.R.inc(169);assertNull(string0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocg75v4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocg75v4q() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(170);
      __CLR4_4_12p2pl43ltszd.R.inc(171);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(172);String string0 = trie0.hasPrefix("z");
      __CLR4_4_12p2pl43ltszd.R.inc(173);assertNull(string0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3g8de4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3g8de4u() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(174);
      __CLR4_4_12p2pl43ltszd.R.inc(175);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(176);String string0 = trie0.hasPrefix((String) null);
      __CLR4_4_12p2pl43ltszd.R.inc(177);assertNull(string0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hug9kx4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hug9kx4y() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(178);
      __CLR4_4_12p2pl43ltszd.R.inc(179);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(180);trie0.insert("z");
      __CLR4_4_12p2pl43ltszd.R.inc(181);int int0 = trie0.countPrefix("z");
      __CLR4_4_12p2pl43ltszd.R.inc(182);assertEquals(1, int0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elgasg53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elgasg53() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(183);
      __CLR4_4_12p2pl43ltszd.R.inc(184);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(185);int int0 = trie0.countPrefix("");
      __CLR4_4_12p2pl43ltszd.R.inc(186);assertEquals((-1), int0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcgbzz57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcgbzz57() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(187);
      __CLR4_4_12p2pl43ltszd.R.inc(188);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(189);int int0 = trie0.countPrefix("z");
      __CLR4_4_12p2pl43ltszd.R.inc(190);assertEquals(0, int0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avl4kp5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avl4kp5b() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(191);
      __CLR4_4_12p2pl43ltszd.R.inc(192);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(193);int int0 = trie0.countPrefix((String) null);
      __CLR4_4_12p2pl43ltszd.R.inc(194);assertEquals((-1), int0);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ml5s85f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ml5s85f() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(195);
      __CLR4_4_12p2pl43ltszd.R.inc(196);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(197);trie0.insert("z");
      __CLR4_4_12p2pl43ltszd.R.inc(198);trie0.insert("z");
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dl6zr5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dl6zr5j() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(199);
      __CLR4_4_12p2pl43ltszd.R.inc(200);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(201);trie0.insert("");
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {__CLR4_4_12p2pl43ltszd.R.globalSliceStart(getClass().getName(),202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_114l87a5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12p2pl43ltszd.R.rethrow($CLV_t2$);}finally{__CLR4_4_12p2pl43ltszd.R.globalSliceEnd(getClass().getName(),"net.mooctest.TrieTest.test23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_114l87a5m() throws Throwable{try{__CLR4_4_12p2pl43ltszd.R.inc(202);
      __CLR4_4_12p2pl43ltszd.R.inc(203);Trie trie0 = new Trie();
      __CLR4_4_12p2pl43ltszd.R.inc(204);trie0.insert((String) null);
  }finally{__CLR4_4_12p2pl43ltszd.R.flushNeeded();}}

}

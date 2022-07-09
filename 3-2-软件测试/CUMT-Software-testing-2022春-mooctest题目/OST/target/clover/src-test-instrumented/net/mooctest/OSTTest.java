/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.TreeSet;
import org.junit.Test;

import net.mooctest.OST;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.evosuite.shaded.org.mockito.ArgumentMatchers.any;
import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Before;

public class OSTTest {static class __CLR4_4_1fgfgl43ltk77{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0036\u0032\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u004f\u0053\u0054\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654572624914L,8589935092L,1153,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
     
	  @Test(timeout = 4000)
	  public void test00()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pt4bdfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pt4bdfg() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(556);
	      __CLR4_4_1fgfgl43ltk77.R.inc(557);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(558);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(559);oST0.add(comparable0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(560);Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(561);doReturn((-1), 4696).when(comparable1).compareTo(any());
	      __CLR4_4_1fgfgl43ltk77.R.inc(562);oST0.add(comparable1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(563);boolean boolean0 = oST0.isHealthy();
	      __CLR4_4_1fgfgl43ltk77.R.inc(564);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yt33ufp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yt33ufp() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(565);
	      __CLR4_4_1fgfgl43ltk77.R.inc(566);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(567);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(568);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(569);Integer integer1 = new Integer((-2));
	      __CLR4_4_1fgfgl43ltk77.R.inc(570);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(571);Integer integer2 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(572);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(573);Integer integer3 = new Integer((-3051));
	      __CLR4_4_1fgfgl43ltk77.R.inc(574);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(575);Integer integer4 = new Integer((-904));
	      __CLR4_4_1fgfgl43ltk77.R.inc(576);linkedList0.add(integer4);
	      __CLR4_4_1fgfgl43ltk77.R.inc(577);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(578);boolean boolean0 = oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(579);assertEquals(5, oST0.size());
	      __CLR4_4_1fgfgl43ltk77.R.inc(580);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177t1wbg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177t1wbg5() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(581);
	      __CLR4_4_1fgfgl43ltk77.R.inc(582);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(583);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(584);Integer integer0 = new Integer((-2996));
	      __CLR4_4_1fgfgl43ltk77.R.inc(585);Integer integer1 = new Integer(2147483642);
	      __CLR4_4_1fgfgl43ltk77.R.inc(586);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(587);Integer integer2 = new Integer(593);
	      __CLR4_4_1fgfgl43ltk77.R.inc(588);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(589);Integer integer3 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(590);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(591);Integer integer4 = new Integer((-904));
	      __CLR4_4_1fgfgl43ltk77.R.inc(592);linkedList0.add(integer4);
	      __CLR4_4_1fgfgl43ltk77.R.inc(593);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(594);boolean boolean0 = oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(595);assertEquals(5, oST0.size());
	      __CLR4_4_1fgfgl43ltk77.R.inc(596);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agt0osgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agt0osgl() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(597);
	      __CLR4_4_1fgfgl43ltk77.R.inc(598);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(599);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(600);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(601);Integer integer1 = Integer.getInteger("net.mooctest.OST$Node", (-3051));
	      __CLR4_4_1fgfgl43ltk77.R.inc(602);Integer integer2 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(603);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(604);Integer integer3 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(605);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(606);Integer integer4 = new Integer((-904));
	      __CLR4_4_1fgfgl43ltk77.R.inc(607);linkedList0.add(integer4);
	      __CLR4_4_1fgfgl43ltk77.R.inc(608);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(609);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(610);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(611);boolean boolean0 = oST0.removeAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(612);assertTrue(oST0.isEmpty());
	      __CLR4_4_1fgfgl43ltk77.R.inc(613);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpszh9h2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpszh9h2() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(614);
	      __CLR4_4_1fgfgl43ltk77.R.inc(615);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(616);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(617);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(618);Integer integer1 = new Integer(2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(619);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(620);Integer integer2 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(621);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(622);Integer integer3 = new Integer((-904));
	      __CLR4_4_1fgfgl43ltk77.R.inc(623);oST0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(624);Integer integer4 = new Integer((-3051));
	      __CLR4_4_1fgfgl43ltk77.R.inc(625);linkedList0.add(integer4);
	      __CLR4_4_1fgfgl43ltk77.R.inc(626);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(627);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(628);boolean boolean0 = oST0.retainAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(629);assertFalse(oST0.isEmpty());
	      __CLR4_4_1fgfgl43ltk77.R.inc(630);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gysy9qhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gysy9qhj() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(631);
	      __CLR4_4_1fgfgl43ltk77.R.inc(632);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(633);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(634);oST0.get(0);
	        __CLR4_4_1fgfgl43ltk77.R.inc(635);fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // The input index is too large: 0, the size of this tree is 0
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(636);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7sx27hp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test06",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7sx27hp() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(637);
	      __CLR4_4_1fgfgl43ltk77.R.inc(638);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(639);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(640);oST0.add(comparable0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(641);oST0.clear();
	      __CLR4_4_1fgfgl43ltk77.R.inc(642);assertTrue(oST0.isEmpty());
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngsvuohv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test07",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngsvuohv() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(643);
	      __CLR4_4_1fgfgl43ltk77.R.inc(644);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(645);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(646);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(647);Integer integer1 = Integer.getInteger("net.mooctest.OST$Node", (-3051));
	      __CLR4_4_1fgfgl43ltk77.R.inc(648);Integer integer2 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(649);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(650);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(651);Integer integer3 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(652);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(653);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(654);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(655);int int0 = oST0.indexOf(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(656);assertEquals(4, oST0.size());
	      __CLR4_4_1fgfgl43ltk77.R.inc(657);assertEquals(3, int0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpsun5ia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test08",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),658,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpsun5ia() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(658);
	      __CLR4_4_1fgfgl43ltk77.R.inc(659);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(660);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(661);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(662);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(663);Integer integer1 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(664);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(665);Integer integer2 = new Integer(3252);
	      __CLR4_4_1fgfgl43ltk77.R.inc(666);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(667);Integer integer3 = new Integer((-3051));
	      __CLR4_4_1fgfgl43ltk77.R.inc(668);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(669);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(670);int int0 = oST0.indexOf(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(671);assertEquals(4, oST0.size());
	      __CLR4_4_1fgfgl43ltk77.R.inc(672);assertEquals(1, int0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tystfmip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test09",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tystfmip() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(673);
	      __CLR4_4_1fgfgl43ltk77.R.inc(674);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(675);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(676);oST0.add(comparable0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(677);Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(678);doReturn((-1), 0).when(comparable1).compareTo(any());
	      __CLR4_4_1fgfgl43ltk77.R.inc(679);boolean boolean0 = oST0.add(comparable1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(680);assertEquals(2, oST0.size());
	      __CLR4_4_1fgfgl43ltk77.R.inc(681);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uwiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),682,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uwiy() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(682);
	      __CLR4_4_1fgfgl43ltk77.R.inc(683);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(684);Integer integer0 = Integer.getInteger("Removing the same element twice.", 1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(685);oST0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(686);int int0 = oST0.size();
	      __CLR4_4_1fgfgl43ltk77.R.inc(687);assertEquals(1, int0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonzndj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonzndj4() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(688);
	      __CLR4_4_1fgfgl43ltk77.R.inc(689);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(690);HashSet<Object> hashSet0 = new HashSet<Object>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(691);boolean boolean0 = oST0.retainAll(hashSet0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(692);assertFalse(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3g3jaj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3g3jaj9() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(693);
	      __CLR4_4_1fgfgl43ltk77.R.inc(694);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(695);Iterator<Comparable<Object>> iterator0 = oST0.iterator();
	      __CLR4_4_1fgfgl43ltk77.R.inc(696);assertNotNull(iterator0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uug4qtjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uug4qtjd() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(697);
	      __CLR4_4_1fgfgl43ltk77.R.inc(698);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(699);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(700);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(701);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(702);boolean boolean0 = oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(703);boolean boolean1 = oST0.contains(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(704);assertTrue(boolean1 == boolean0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(705);assertTrue(boolean1);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test14()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlg5ycjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlg5ycjm() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(706);
	      __CLR4_4_1fgfgl43ltk77.R.inc(707);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(708);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(709);boolean boolean0 = oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(710);assertFalse(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test15()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocg75vjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocg75vjr() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(711);
	      __CLR4_4_1fgfgl43ltk77.R.inc(712);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(713);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(714);oST0.toArray((Object[]) null);
	        __CLR4_4_1fgfgl43ltk77.R.inc(715);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(716);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test16()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3g8dejx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3g8dejx() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(717);
	      __CLR4_4_1fgfgl43ltk77.R.inc(718);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(719);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(720);oST0.retainAll((Collection<?>) null);
	        __CLR4_4_1fgfgl43ltk77.R.inc(721);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(722);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test17()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hug9kxk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hug9kxk3() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(723);
	      __CLR4_4_1fgfgl43ltk77.R.inc(724);OST<Integer> oST0 = new OST<Integer>();
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(725);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(726);oST0.removeAll((Collection<?>) null);
	        __CLR4_4_1fgfgl43ltk77.R.inc(727);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(728);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test18()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elgasgk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elgasgk9() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(729);
	      __CLR4_4_1fgfgl43ltk77.R.inc(730);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(731);HashSet<Object> hashSet0 = new HashSet<Object>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(732);hashSet0.add(oST0);
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(733);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(734);oST0.removeAll(hashSet0);
	        __CLR4_4_1fgfgl43ltk77.R.inc(735);fail("Expecting exception: ClassCastException");
	      
	      } catch(ClassCastException e) {
	         //
	         // net.mooctest.OST cannot be cast to java.lang.Comparable
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(736);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test19()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcgbzzkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcgbzzkh() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(737);
	      __CLR4_4_1fgfgl43ltk77.R.inc(738);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(739);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(740);oST0.remove(oST0);
	        __CLR4_4_1fgfgl43ltk77.R.inc(741);fail("Expecting exception: ClassCastException");
	      
	      } catch(ClassCastException e) {
	         //
	         // net.mooctest.OST cannot be cast to java.lang.Comparable
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(742);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test20()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avl4kpkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avl4kpkn() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(743);
	      __CLR4_4_1fgfgl43ltk77.R.inc(744);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(745);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(746);oST0.add(comparable0);
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(747);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(748);oST0.indexOf((Comparable<Object>) null);
	        __CLR4_4_1fgfgl43ltk77.R.inc(749);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(750);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test21()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ml5s8kv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ml5s8kv() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(751);
	      __CLR4_4_1fgfgl43ltk77.R.inc(752);OST<Integer> oST0 = new OST<Integer>();
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(753);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(754);oST0.containsAll((Collection<?>) null);
	        __CLR4_4_1fgfgl43ltk77.R.inc(755);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(756);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test22()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dl6zrl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test22",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dl6zrl1() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(757);
	      __CLR4_4_1fgfgl43ltk77.R.inc(758);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(759);HashSet<Object> hashSet0 = new HashSet<Object>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(760);hashSet0.add(oST0);
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(761);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(762);oST0.containsAll(hashSet0);
	        __CLR4_4_1fgfgl43ltk77.R.inc(763);fail("Expecting exception: ClassCastException");
	      
	      } catch(ClassCastException e) {
	         //
	         // net.mooctest.OST cannot be cast to java.lang.Comparable
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(764);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test23()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_114l87al9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test23",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_114l87al9() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(765);
	      __CLR4_4_1fgfgl43ltk77.R.inc(766);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(767);Integer integer0 = Integer.getInteger("Removing the same element twice.", 1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(768);oST0.add(integer0);
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(769);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(770);oST0.contains((Object) null);
	        __CLR4_4_1fgfgl43ltk77.R.inc(771);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test24()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124eql7lg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test24",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124eql7lg() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(772);
	      __CLR4_4_1fgfgl43ltk77.R.inc(773);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(774);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(775);oST0.contains(oST0);
	        __CLR4_4_1fgfgl43ltk77.R.inc(776);fail("Expecting exception: ClassCastException");
	      
	      } catch(ClassCastException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test25()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15depdoll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test25",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15depdoll() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(777);
	      __CLR4_4_1fgfgl43ltk77.R.inc(778);OST<Integer> oST0 = new OST<Integer>();
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(779);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(780);oST0.addAll((Collection<? extends Integer>) null);
	        __CLR4_4_1fgfgl43ltk77.R.inc(781);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(782);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test26()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18meo65lr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test26",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18meo65lr() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(783);
	      __CLR4_4_1fgfgl43ltk77.R.inc(784);OST<Integer> oST0 = new OST<Integer>();
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(785);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(786);oST0.add((Integer) null);
	        __CLR4_4_1fgfgl43ltk77.R.inc(787);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // The input element is null.
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(788);verifyException("java.util.Objects", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test27()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvemymlx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test27",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvemymlx() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(789);
	      __CLR4_4_1fgfgl43ltk77.R.inc(790);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(791);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(792);Integer integer0 = new Integer(2147483644);
	      __CLR4_4_1fgfgl43ltk77.R.inc(793);Integer integer1 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(794);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(795);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(796);boolean boolean0 = oST0.remove(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(797);assertFalse(oST0.isEmpty());
	      __CLR4_4_1fgfgl43ltk77.R.inc(798);assertFalse(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test28()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f4elr3m7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test28",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f4elr3m7() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(799);
	      __CLR4_4_1fgfgl43ltk77.R.inc(800);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(801);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(802);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(803);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(804);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(805);assertEquals(1, oST0.size());
	      
	      __CLR4_4_1fgfgl43ltk77.R.inc(806);boolean boolean0 = oST0.remove(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(807);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test29()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1idekjkmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test29",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1idekjkmg() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(808);
	      __CLR4_4_1fgfgl43ltk77.R.inc(809);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(810);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(811);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(812);Integer integer1 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(813);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(814);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(815);boolean boolean0 = oST0.remove(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(816);assertFalse(oST0.isEmpty());
	      __CLR4_4_1fgfgl43ltk77.R.inc(817);assertFalse(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test30()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iu9ryumq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test30",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iu9ryumq() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(818);
	      __CLR4_4_1fgfgl43ltk77.R.inc(819);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(820);Integer integer0 = new Integer(2498);
	      __CLR4_4_1fgfgl43ltk77.R.inc(821);oST0.add(integer0);
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(822);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(823);oST0.remove((Object) null);
	        __CLR4_4_1fgfgl43ltk77.R.inc(824);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(825);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test31()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m39qrbmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test31",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m39qrbmy() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(826);
	      __CLR4_4_1fgfgl43ltk77.R.inc(827);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(828);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(829);doReturn((-2819), (-2819)).when(comparable0).compareTo(any());
	      __CLR4_4_1fgfgl43ltk77.R.inc(830);doReturn("").when(comparable0).toString();
	      __CLR4_4_1fgfgl43ltk77.R.inc(831);oST0.add(comparable0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(832);Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(833);doReturn((-2819), (-2819), 0).when(comparable1).compareTo(any());
	      __CLR4_4_1fgfgl43ltk77.R.inc(834);doReturn("").when(comparable1).toString();
	      __CLR4_4_1fgfgl43ltk77.R.inc(835);oST0.add(comparable1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(836);HashSet<Object> hashSet0 = new HashSet<Object>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(837);hashSet0.addAll(oST0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(838);boolean boolean0 = hashSet0.removeAll(oST0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(839);assertFalse(hashSet0.isEmpty());
	      __CLR4_4_1fgfgl43ltk77.R.inc(840);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test32()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pc9pjsnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test32",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pc9pjsnd() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(841);
	      __CLR4_4_1fgfgl43ltk77.R.inc(842);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(843);HashSet<Comparable<Object>> hashSet0 = new HashSet<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(844);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(845);hashSet0.add(comparable0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(846);oST0.addAll(hashSet0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(847);Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(848);doReturn(0).when(comparable1).compareTo(any());
	      __CLR4_4_1fgfgl43ltk77.R.inc(849);boolean boolean0 = oST0.add(comparable1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(850);assertEquals(1, oST0.size());
	      __CLR4_4_1fgfgl43ltk77.R.inc(851);assertFalse(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test33()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sl9oc9no();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test33",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sl9oc9no() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(852);
	      __CLR4_4_1fgfgl43ltk77.R.inc(853);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(854);boolean boolean0 = oST0.isHealthy();
	      __CLR4_4_1fgfgl43ltk77.R.inc(855);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test34()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vu9n4qns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test34",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vu9n4qns() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(856);
	      __CLR4_4_1fgfgl43ltk77.R.inc(857);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(858);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(859);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(860);Integer integer1 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(861);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(862);Integer integer2 = new Integer((-3051));
	      __CLR4_4_1fgfgl43ltk77.R.inc(863);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(864);Integer integer3 = new Integer((-904));
	      __CLR4_4_1fgfgl43ltk77.R.inc(865);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(866);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(867);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(868);assertFalse(oST0.isEmpty());
	      
	      __CLR4_4_1fgfgl43ltk77.R.inc(869);boolean boolean0 = oST0.removeAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(870);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test35()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z39lx7o7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test35",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z39lx7o7() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(871);
	      __CLR4_4_1fgfgl43ltk77.R.inc(872);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(873);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(874);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(875);Integer integer1 = Integer.getInteger("net.mooctest.OST$Node", (-3051));
	      __CLR4_4_1fgfgl43ltk77.R.inc(876);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(877);Integer integer2 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(878);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(879);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(880);Integer integer3 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(881);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(882);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(883);Integer integer4 = new Integer(24);
	      __CLR4_4_1fgfgl43ltk77.R.inc(884);boolean boolean0 = oST0.add(integer4);
	      __CLR4_4_1fgfgl43ltk77.R.inc(885);assertEquals(5, oST0.size());
	      __CLR4_4_1fgfgl43ltk77.R.inc(886);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test36()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wouh9gon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test36",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wouh9gon() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(887);
	      __CLR4_4_1fgfgl43ltk77.R.inc(888);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(889);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(890);Integer integer0 = new Integer(2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(891);Integer integer1 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(892);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(893);Integer integer2 = new Integer((-904));
	      __CLR4_4_1fgfgl43ltk77.R.inc(894);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(895);Integer integer3 = new Integer(473);
	      __CLR4_4_1fgfgl43ltk77.R.inc(896);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(897);Integer integer4 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(898);linkedList0.add(integer4);
	      __CLR4_4_1fgfgl43ltk77.R.inc(899);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(900);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(901);assertEquals(5, oST0.size());
	      
	      __CLR4_4_1fgfgl43ltk77.R.inc(902);boolean boolean0 = oST0.removeAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(903);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test37()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tfuigzp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test37",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tfuigzp4() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(904);
	      __CLR4_4_1fgfgl43ltk77.R.inc(905);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(906);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(907);Integer integer0 = new Integer((-2996));
	      __CLR4_4_1fgfgl43ltk77.R.inc(908);Integer integer1 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(909);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(910);Integer integer2 = new Integer(593);
	      __CLR4_4_1fgfgl43ltk77.R.inc(911);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(912);Integer integer3 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(913);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(914);Integer integer4 = new Integer((-904));
	      __CLR4_4_1fgfgl43ltk77.R.inc(915);linkedList0.add(integer4);
	      __CLR4_4_1fgfgl43ltk77.R.inc(916);Integer integer5 = new Integer((-3051));
	      __CLR4_4_1fgfgl43ltk77.R.inc(917);linkedList0.add(integer5);
	      __CLR4_4_1fgfgl43ltk77.R.inc(918);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(919);boolean boolean0 = oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(920);assertEquals(6, oST0.size());
	      __CLR4_4_1fgfgl43ltk77.R.inc(921);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test38()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6ujoipm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test38",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6ujoipm() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(922);
	      __CLR4_4_1fgfgl43ltk77.R.inc(923);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(924);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(925);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(926);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(927);Integer integer1 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(928);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(929);Integer integer2 = new Integer((-3051));
	      __CLR4_4_1fgfgl43ltk77.R.inc(930);Integer integer3 = new Integer((-904));
	      __CLR4_4_1fgfgl43ltk77.R.inc(931);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(932);oST0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(933);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(934);boolean boolean0 = oST0.retainAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(935);assertFalse(oST0.contains((-3051)));
	      __CLR4_4_1fgfgl43ltk77.R.inc(936);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test39()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxukw1q1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test39",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxukw1q1() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(937);
	      __CLR4_4_1fgfgl43ltk77.R.inc(938);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(939);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(940);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(941);Integer integer1 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(942);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(943);Integer integer2 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(944);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(945);Integer integer3 = new Integer((-904));
	      __CLR4_4_1fgfgl43ltk77.R.inc(946);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(947);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(948);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(949);assertEquals(4, oST0.size());
	      
	      __CLR4_4_1fgfgl43ltk77.R.inc(950);boolean boolean0 = oST0.removeAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(951);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test40()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mgzdgrqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test40",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mgzdgrqg() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(952);
	      __CLR4_4_1fgfgl43ltk77.R.inc(953);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(954);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(955);Integer integer0 = new Integer(2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(956);Integer integer1 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(957);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(958);Integer integer2 = new Integer((-904));
	      __CLR4_4_1fgfgl43ltk77.R.inc(959);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(960);Integer integer3 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(961);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(962);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(963);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(964);assertFalse(oST0.isEmpty());
	      
	      __CLR4_4_1fgfgl43ltk77.R.inc(965);boolean boolean0 = oST0.removeAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(966);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test41()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7zeoaqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test41",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7zeoaqv() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(967);
	      __CLR4_4_1fgfgl43ltk77.R.inc(968);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(969);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(970);oST0.get(7);
	        __CLR4_4_1fgfgl43ltk77.R.inc(971);fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // The input index is too large: 7, the size of this tree is 0
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(972);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test42()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyzfvtr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test42",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),973,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyzfvtr1() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(973);
	      __CLR4_4_1fgfgl43ltk77.R.inc(974);OST<Integer> oST0 = new OST<Integer>();
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(975);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(976);oST0.get((-3002));
	        __CLR4_4_1fgfgl43ltk77.R.inc(977);fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // The input index is negative: -3002
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(978);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test43()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpzh3cr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test43",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpzh3cr7() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(979);
	      __CLR4_4_1fgfgl43ltk77.R.inc(980);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(981);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(982);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(983);Integer integer1 = Integer.getInteger("net.mooctest.OST$Node", (-3051));
	      __CLR4_4_1fgfgl43ltk77.R.inc(984);Integer integer2 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(985);linkedList0.add(integer2);
	      __CLR4_4_1fgfgl43ltk77.R.inc(986);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(987);Integer integer3 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(988);linkedList0.add(integer3);
	      __CLR4_4_1fgfgl43ltk77.R.inc(989);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(990);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(991);oST0.toArray();
	      __CLR4_4_1fgfgl43ltk77.R.inc(992);assertEquals(4, oST0.size());
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test44()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gziavrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test44",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gziavrl() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(993);
	      __CLR4_4_1fgfgl43ltk77.R.inc(994);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(995);boolean boolean0 = oST0.isEmpty();
	      __CLR4_4_1fgfgl43ltk77.R.inc(996);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test45()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_167zjierp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test45",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_167zjierp() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(997);
	      __CLR4_4_1fgfgl43ltk77.R.inc(998);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(999);assertTrue(oST0.isEmpty());
	      
	      __CLR4_4_1fgfgl43ltk77.R.inc(1000);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(1001);oST0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1002);boolean boolean0 = oST0.isEmpty();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1003);assertFalse(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test46()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12yzkpxrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test46",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12yzkpxrw() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1004);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1005);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1006);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1007);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(1008);Integer integer1 = new Integer((-3718));
	      __CLR4_4_1fgfgl43ltk77.R.inc(1009);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1010);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1011);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1012);int int0 = oST0.indexOf(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1013);assertFalse(oST0.isEmpty());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1014);assertEquals(1, int0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test47()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0e2ks7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test47",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0e2ks7() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1015);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1016);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1017);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(1018);Integer integer1 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1019);boolean boolean0 = oST0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1020);assertTrue(boolean0);
	      
	      __CLR4_4_1fgfgl43ltk77.R.inc(1021);int int0 = oST0.indexOf(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1022);assertEquals((-1), int0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test48()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13j0cv1sf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test48",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13j0cv1sf() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1023);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1024);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1025);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1026);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(1027);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1028);Integer integer1 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1029);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1030);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1031);int int0 = oST0.indexOf(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1032);assertFalse(oST0.isEmpty());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1033);assertEquals(0, int0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test49()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16s0bnisq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test49",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16s0bnisq() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1034);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1035);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1036);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(1037);int int0 = oST0.indexOf(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1038);assertEquals((-1), int0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test50()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178vj2ssv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test50",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178vj2ssv() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1039);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1040);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1041);HashSet<Comparable<Object>> hashSet0 = new HashSet<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1042);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1043);hashSet0.add(comparable0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1044);oST0.addAll(hashSet0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1045);Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1046);doReturn((-1433)).when(comparable1).compareTo(any());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1047);int int0 = oST0.indexOf(comparable1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1048);assertEquals(1, oST0.size());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1049);assertEquals((-1), int0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test51()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ahvhv9t6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test51",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ahvhv9t6() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1050);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1051);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1052);HashSet<Comparable<Object>> hashSet0 = new HashSet<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1053);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1054);hashSet0.add(comparable0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1055);oST0.addAll(hashSet0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1056);Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1057);doReturn((-1), (-1)).when(comparable1).compareTo(any());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1058);doReturn("").when(comparable1).toString();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1059);oST0.add(comparable1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1060);oST0.get(0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1061);assertEquals(2, oST0.size());
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test52()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqvgnqti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test52",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqvgnqti() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1062);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1063);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1064);HashSet<Comparable<Object>> hashSet0 = new HashSet<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1065);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1066);hashSet0.add(comparable0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1067);oST0.addAll(hashSet0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1068);Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1069);doReturn(1, 1).when(comparable1).compareTo(any());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1070);doReturn("").when(comparable1).toString();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1071);oST0.add(comparable1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1072);assertEquals(2, oST0.size());
	      
	      __CLR4_4_1fgfgl43ltk77.R.inc(1073);Comparable<Object> comparable2 = oST0.get(1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1074);assertSame(comparable2, comparable1);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test53()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzvfg7tv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test53",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzvfg7tv() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1075);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1076);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1077);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1078);Integer integer0 = new Integer(830);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1079);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1080);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1081);Integer integer1 = new Integer(473);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1082);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1083);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1084);assertFalse(oST0.isEmpty());
	      
	      __CLR4_4_1fgfgl43ltk77.R.inc(1085);boolean boolean0 = oST0.removeAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1086);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test54()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k8ve8ou7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test54",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k8ve8ou7() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1087);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1088);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1089);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1090);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(1091);Integer integer1 = new Integer(Integer.MIN_VALUE);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1092);linkedList0.add(integer1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1093);oST0.addAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1094);boolean boolean0 = oST0.contains(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1095);assertEquals(1, oST0.size());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1096);assertFalse(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test55()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhvd15uh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test55",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhvd15uh() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1097);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1098);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1099);LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1100);Integer integer0 = new Integer((-3002));
	      __CLR4_4_1fgfgl43ltk77.R.inc(1101);linkedList0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1102);boolean boolean0 = oST0.removeAll(linkedList0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1103);assertFalse(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test56()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqvbtmuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test56",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqvbtmuo() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1104);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1105);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1106);HashSet<Comparable<Object>> hashSet0 = new HashSet<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1107);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1108);doReturn(0).when(comparable0).compareTo(any());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1109);hashSet0.add(comparable0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1110);oST0.addAll(hashSet0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1111);boolean boolean0 = oST0.containsAll(hashSet0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1112);assertEquals(1, oST0.size());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1113);assertTrue(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test57()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzvam3uy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test57",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzvam3uy() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1114);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1115);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1116);HashSet<Comparable<Object>> hashSet0 = new HashSet<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1117);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1118);hashSet0.add(comparable0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1119);boolean boolean0 = oST0.containsAll(hashSet0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1120);assertFalse(boolean0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test58()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x8v9ekv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test58",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x8v9ekv5() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1121);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1122);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1123);Integer integer0 = Integer.getInteger("Removing the same element twice.", 1);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1124);oST0.add(integer0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1125);assertEquals(1, oST0.size());
	      
	      __CLR4_4_1fgfgl43ltk77.R.inc(1126);Object[] objectArray0 = oST0.toArray();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1127);OST<Comparable<Object>> oST1 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1128);oST1.toArray(objectArray0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1129);assertEquals(1, objectArray0.length);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test59()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yj8ts3ve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test59",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yj8ts3ve() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1130);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1131);OST<Comparable<Object>> oST0 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1132);HashSet<Comparable<Object>> hashSet0 = new HashSet<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1133);Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
	      __CLR4_4_1fgfgl43ltk77.R.inc(1134);doReturn("").when(comparable0).toString();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1135);hashSet0.add(comparable0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1136);oST0.addAll(hashSet0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1137);Integer[] integerArray0 = new Integer[0];
	      // Undeclared exception!
	      __CLR4_4_1fgfgl43ltk77.R.inc(1138);try { 
	        __CLR4_4_1fgfgl43ltk77.R.inc(1139);oST0.toArray(integerArray0);
	        __CLR4_4_1fgfgl43ltk77.R.inc(1140);fail("Expecting exception: ArrayStoreException");
	      
	      } catch(ArrayStoreException e) {
	         //
	         // codegen.java.lang.Comparable$MockitoMock$276334007
	         //
	         __CLR4_4_1fgfgl43ltk77.R.inc(1141);verifyException("net.mooctest.OST", e);
	      }
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test60()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y2dmctvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test60",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y2dmctvq() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1142);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1143);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1144);int int0 = oST0.size();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1145);assertEquals(0, int0);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test61()  throws Throwable  {__CLR4_4_1fgfgl43ltk77.R.globalSliceStart(getClass().getName(),1146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utdnkcvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1fgfgl43ltk77.R.rethrow($CLV_t2$);}finally{__CLR4_4_1fgfgl43ltk77.R.globalSliceEnd(getClass().getName(),"net.mooctest.OSTTest.test61",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utdnkcvu() throws Throwable{try{__CLR4_4_1fgfgl43ltk77.R.inc(1146);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1147);OST<Integer> oST0 = new OST<Integer>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1148);Object[] objectArray0 = oST0.toArray();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1149);OST<Comparable<Object>> oST1 = new OST<Comparable<Object>>();
	      __CLR4_4_1fgfgl43ltk77.R.inc(1150);Object[] objectArray1 = oST1.toArray(objectArray0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1151);assertSame(objectArray1, objectArray0);
	      __CLR4_4_1fgfgl43ltk77.R.inc(1152);assertEquals(0, objectArray1.length);
	  }finally{__CLR4_4_1fgfgl43ltk77.R.flushNeeded();}}
    
}

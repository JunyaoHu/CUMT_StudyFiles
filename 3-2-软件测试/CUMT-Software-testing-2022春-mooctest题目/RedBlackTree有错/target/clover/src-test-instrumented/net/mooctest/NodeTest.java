/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import net.mooctest.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class NodeTest {static class __CLR4_4_1ededl43y7qlb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0030\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0052\u0065\u0064\u0042\u006c\u0061\u0063\u006b\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654593441756L,8589935092L,597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	 @Test(timeout = 4000)
	  public void test00()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pt4bded();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pt4bded() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(517);
	      __CLR4_4_1ededl43y7qlb.R.inc(518);Integer integer0 = Integer.getInteger("l0V", (-1965));
	      __CLR4_4_1ededl43y7qlb.R.inc(519);Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(520);node0.hashCode();
	      __CLR4_4_1ededl43y7qlb.R.inc(521);assertTrue(node0.isLeaf());
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yt33uei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yt33uei() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(522);
	      __CLR4_4_1ededl43y7qlb.R.inc(523);Integer integer0 = new Integer(0);
	      __CLR4_4_1ededl43y7qlb.R.inc(524);Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(525);Node node1 = new Node(integer0, node0, (Node) null, node0);
	      __CLR4_4_1ededl43y7qlb.R.inc(526);node1.parent = node1;
	      __CLR4_4_1ededl43y7qlb.R.inc(527);boolean boolean0 = node1.isLeaf();
	      __CLR4_4_1ededl43y7qlb.R.inc(528);assertTrue(node0.isLeaf());
	      __CLR4_4_1ededl43y7qlb.R.inc(529);assertFalse(boolean0);
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177t1wbeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177t1wbeq() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(530);
	      __CLR4_4_1ededl43y7qlb.R.inc(531);Integer integer0 = new Integer((-1965));
	      __CLR4_4_1ededl43y7qlb.R.inc(532);Integer integer1 = new Integer((-3435));
	      __CLR4_4_1ededl43y7qlb.R.inc(533);Node node0 = new Node(integer1, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(534);Node node1 = new Node(integer0, node0, node0, node0);
	      __CLR4_4_1ededl43y7qlb.R.inc(535);boolean boolean0 = node0.equals(node1);
	      __CLR4_4_1ededl43y7qlb.R.inc(536);assertTrue(node0.isLeaf());
	      __CLR4_4_1ededl43y7qlb.R.inc(537);assertFalse(boolean0);
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agt0osey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agt0osey() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(538);
	      __CLR4_4_1ededl43y7qlb.R.inc(539);Node node0 = new Node((Integer) null, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(540);Node node1 = new Node((Integer) null, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(541);boolean boolean0 = node0.equals(node1);
	      __CLR4_4_1ededl43y7qlb.R.inc(542);assertTrue(node1.isLeaf());
	      __CLR4_4_1ededl43y7qlb.R.inc(543);assertTrue(boolean0);
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpszh9f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpszh9f4() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(544);
	      __CLR4_4_1ededl43y7qlb.R.inc(545);Integer integer0 = Integer.valueOf(0);
	      __CLR4_4_1ededl43y7qlb.R.inc(546);Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(547);node0.value = null;
	      __CLR4_4_1ededl43y7qlb.R.inc(548);Node node1 = new Node(integer0, node0, node0, node0);
	      __CLR4_4_1ededl43y7qlb.R.inc(549);boolean boolean0 = node0.equals(node1);
	      __CLR4_4_1ededl43y7qlb.R.inc(550);assertFalse(node1.equals((Object)node0));
	      __CLR4_4_1ededl43y7qlb.R.inc(551);assertFalse(boolean0);
	      __CLR4_4_1ededl43y7qlb.R.inc(552);assertTrue(node0.isLeaf());
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gysy9qfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gysy9qfd() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(553);
	      __CLR4_4_1ededl43y7qlb.R.inc(554);Integer integer0 = new Integer(0);
	      __CLR4_4_1ededl43y7qlb.R.inc(555);Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(556);Node node1 = new Node(integer0, node0, (Node) null, node0);
	      __CLR4_4_1ededl43y7qlb.R.inc(557);boolean boolean0 = node0.equals(node1);
	      __CLR4_4_1ededl43y7qlb.R.inc(558);assertTrue(boolean0);
	      __CLR4_4_1ededl43y7qlb.R.inc(559);assertFalse(node1.isLeaf());
	      __CLR4_4_1ededl43y7qlb.R.inc(560);assertTrue(node0.isLeaf());
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7sx27fl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test06",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7sx27fl() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(561);
	      __CLR4_4_1ededl43y7qlb.R.inc(562);Integer integer0 = new Integer(0);
	      __CLR4_4_1ededl43y7qlb.R.inc(563);Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(564);boolean boolean0 = node0.equals((Object) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(565);assertFalse(boolean0);
	      __CLR4_4_1ededl43y7qlb.R.inc(566);assertTrue(node0.isLeaf());
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngsvuofr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test07",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngsvuofr() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(567);
	      __CLR4_4_1ededl43y7qlb.R.inc(568);Integer integer0 = new Integer(0);
	      __CLR4_4_1ededl43y7qlb.R.inc(569);Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(570);boolean boolean0 = node0.equals(node0);
	      __CLR4_4_1ededl43y7qlb.R.inc(571);assertTrue(boolean0);
	      __CLR4_4_1ededl43y7qlb.R.inc(572);assertTrue(node0.isLeaf());
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpsun5fx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test08",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpsun5fx() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(573);
	      __CLR4_4_1ededl43y7qlb.R.inc(574);Integer integer0 = new Integer(0);
	      __CLR4_4_1ededl43y7qlb.R.inc(575);Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(576);boolean boolean0 = node0.equals(integer0);
	      __CLR4_4_1ededl43y7qlb.R.inc(577);assertTrue(node0.isLeaf());
	      __CLR4_4_1ededl43y7qlb.R.inc(578);assertFalse(boolean0);
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tystfmg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test09",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tystfmg3() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(579);
	      __CLR4_4_1ededl43y7qlb.R.inc(580);Integer integer0 = Integer.valueOf(0);
	      __CLR4_4_1ededl43y7qlb.R.inc(581);Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(582);node0.value = null;
	      __CLR4_4_1ededl43y7qlb.R.inc(583);node0.hashCode();
	      __CLR4_4_1ededl43y7qlb.R.inc(584);assertTrue(node0.isLeaf());
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uwg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uwg9() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(585);
	      __CLR4_4_1ededl43y7qlb.R.inc(586);Integer integer0 = Integer.valueOf(0);
	      __CLR4_4_1ededl43y7qlb.R.inc(587);Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(588);boolean boolean0 = node0.isLeaf();
	      __CLR4_4_1ededl43y7qlb.R.inc(589);assertTrue(boolean0);
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {__CLR4_4_1ededl43y7qlb.R.globalSliceStart(getClass().getName(),590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonzndge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ededl43y7qlb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ededl43y7qlb.R.globalSliceEnd(getClass().getName(),"net.mooctest.NodeTest.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonzndge() throws Throwable{try{__CLR4_4_1ededl43y7qlb.R.inc(590);
	      __CLR4_4_1ededl43y7qlb.R.inc(591);Integer integer0 = Integer.valueOf(0);
	      __CLR4_4_1ededl43y7qlb.R.inc(592);Node node0 = new Node(integer0, (Node) null, (Node) null, (Node) null);
	      __CLR4_4_1ededl43y7qlb.R.inc(593);Node node1 = new Node(node0.value, node0, node0, node0);
	      __CLR4_4_1ededl43y7qlb.R.inc(594);boolean boolean0 = node1.isLeaf();
	      __CLR4_4_1ededl43y7qlb.R.inc(595);assertFalse(boolean0);
	      __CLR4_4_1ededl43y7qlb.R.inc(596);assertTrue(node0.isLeaf());
	  }finally{__CLR4_4_1ededl43y7qlb.R.flushNeeded();}}
	  
}

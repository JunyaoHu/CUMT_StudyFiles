/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

final class Grower {public static class __CLR4_4_11o1ol3zcayfc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314775364L,8589935092L,117,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static Event grow(ID id, Event event) {try{__CLR4_4_11o1ol3zcayfc.R.inc(60);
        __CLR4_4_11o1ol3zcayfc.R.inc(61);return innerGrow(id, event).getEvent();
    }finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private static GrowResult innerGrow(ID id, Event event) {try{__CLR4_4_11o1ol3zcayfc.R.inc(62);
        __CLR4_4_11o1ol3zcayfc.R.inc(63);if ((((id.isLeaf())&&(__CLR4_4_11o1ol3zcayfc.R.iget(64)!=0|true))||(__CLR4_4_11o1ol3zcayfc.R.iget(65)==0&false))) {{
            __CLR4_4_11o1ol3zcayfc.R.inc(66);return growLeafID(id, event);
        }
        }else {{
            __CLR4_4_11o1ol3zcayfc.R.inc(67);return growNonLeafID(id, event);
        }
    }}finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private static GrowResult growLeafID(ID id, Event event) {try{__CLR4_4_11o1ol3zcayfc.R.inc(68);
        __CLR4_4_11o1ol3zcayfc.R.inc(69);if ((((id.isOne() && event.isLeaf())&&(__CLR4_4_11o1ol3zcayfc.R.iget(70)!=0|true))||(__CLR4_4_11o1ol3zcayfc.R.iget(71)==0&false))) {{
            __CLR4_4_11o1ol3zcayfc.R.inc(72);return new GrowResult(Events.with(event.getValue() + 1), 0);
        }
        }else {{
            __CLR4_4_11o1ol3zcayfc.R.inc(73);throw new IllegalArgumentException("Illegal arguments: " + id + " and " + event);
        }
    }}finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private static GrowResult growNonLeafID(ID id, Event event) {try{__CLR4_4_11o1ol3zcayfc.R.inc(74);
        __CLR4_4_11o1ol3zcayfc.R.inc(75);if ((((event.isLeaf())&&(__CLR4_4_11o1ol3zcayfc.R.iget(76)!=0|true))||(__CLR4_4_11o1ol3zcayfc.R.iget(77)==0&false))) {{
            __CLR4_4_11o1ol3zcayfc.R.inc(78);return growLeafEvent(id, event);
        }
        }else {__CLR4_4_11o1ol3zcayfc.R.inc(79);if ((((id.getLeft().isZero())&&(__CLR4_4_11o1ol3zcayfc.R.iget(80)!=0|true))||(__CLR4_4_11o1ol3zcayfc.R.iget(81)==0&false))) {{
            __CLR4_4_11o1ol3zcayfc.R.inc(82);return growOnRight(id, event);
        }
        }else {__CLR4_4_11o1ol3zcayfc.R.inc(83);if ((((id.getRight().isZero())&&(__CLR4_4_11o1ol3zcayfc.R.iget(84)!=0|true))||(__CLR4_4_11o1ol3zcayfc.R.iget(85)==0&false))) {{
            __CLR4_4_11o1ol3zcayfc.R.inc(86);return growOnLeft(id, event);
        }
        }else {{
            __CLR4_4_11o1ol3zcayfc.R.inc(87);return growOnBothSides(id, event);
        }
    }}}}finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private static GrowResult growLeafEvent(ID id, Event event) {try{__CLR4_4_11o1ol3zcayfc.R.inc(88);
        __CLR4_4_11o1ol3zcayfc.R.inc(89);GrowResult er = innerGrow(id, Events.with(event.getValue(), Events.zero(), Events.zero()));
        __CLR4_4_11o1ol3zcayfc.R.inc(90);er.setCost(er.getCost() + event.maxDepth() + 1);
        __CLR4_4_11o1ol3zcayfc.R.inc(91);return er;
    }finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private static GrowResult growOnRight(ID id, Event event) {try{__CLR4_4_11o1ol3zcayfc.R.inc(92);
        __CLR4_4_11o1ol3zcayfc.R.inc(93);GrowResult rightGrowth = growRight(id, event);
        __CLR4_4_11o1ol3zcayfc.R.inc(94);return rightGrowth(event, rightGrowth);
    }finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private static GrowResult growRight(ID id, Event event) {try{__CLR4_4_11o1ol3zcayfc.R.inc(95);
        __CLR4_4_11o1ol3zcayfc.R.inc(96);return innerGrow(id.getRight(), event.getRight());
    }finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private static GrowResult rightGrowth(Event event, GrowResult growth) {try{__CLR4_4_11o1ol3zcayfc.R.inc(97);
        __CLR4_4_11o1ol3zcayfc.R.inc(98);Event result = Events.with(event.getValue(),
                event.getLeft(), growth.getEvent());
        __CLR4_4_11o1ol3zcayfc.R.inc(99);return new GrowResult(result, growth.getCost() + 1);
    }finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private static GrowResult growOnLeft(ID id, Event event) {try{__CLR4_4_11o1ol3zcayfc.R.inc(100);
        __CLR4_4_11o1ol3zcayfc.R.inc(101);GrowResult leftGrowth = growLeft(id, event);
        __CLR4_4_11o1ol3zcayfc.R.inc(102);return leftGrowth(event, leftGrowth);
    }finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private static GrowResult growLeft(ID id, Event event) {try{__CLR4_4_11o1ol3zcayfc.R.inc(103);
        __CLR4_4_11o1ol3zcayfc.R.inc(104);return innerGrow(id.getLeft(), event.getLeft());
    }finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private static GrowResult leftGrowth(Event event, GrowResult growth) {try{__CLR4_4_11o1ol3zcayfc.R.inc(105);
        __CLR4_4_11o1ol3zcayfc.R.inc(106);Event result = Events.with(event.getValue(),
                growth.getEvent(), event.getRight());
        __CLR4_4_11o1ol3zcayfc.R.inc(107);return new GrowResult(result, growth.getCost() + 1);
    }finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private static GrowResult growOnBothSides(ID id, Event event) {try{__CLR4_4_11o1ol3zcayfc.R.inc(108);
        __CLR4_4_11o1ol3zcayfc.R.inc(109);GrowResult leftGrowth = growLeft(id, event);
        __CLR4_4_11o1ol3zcayfc.R.inc(110);GrowResult rightGrowth = growRight(id, event);
        __CLR4_4_11o1ol3zcayfc.R.inc(111);if ((((leftGrowth.getCost() < rightGrowth.getCost())&&(__CLR4_4_11o1ol3zcayfc.R.iget(112)!=0|true))||(__CLR4_4_11o1ol3zcayfc.R.iget(113)==0&false))) {{
            __CLR4_4_11o1ol3zcayfc.R.inc(114);return leftGrowth(event, leftGrowth);
        }
        }else {{
            __CLR4_4_11o1ol3zcayfc.R.inc(115);return rightGrowth(event, rightGrowth);
        }
    }}finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

    private Grower() {try{__CLR4_4_11o1ol3zcayfc.R.inc(116); }finally{__CLR4_4_11o1ol3zcayfc.R.flushNeeded();}}

}

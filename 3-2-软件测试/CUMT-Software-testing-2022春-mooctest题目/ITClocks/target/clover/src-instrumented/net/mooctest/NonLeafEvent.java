/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.io.Serializable;
import java.util.Objects;

final class NonLeafEvent extends Event implements Serializable {public static class __CLR4_4_18i8il3zcayih{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314775364L,8589935092L,387,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 4390279981057181340L;

    private final int value;
    private final Event left;
    private final Event right;

    NonLeafEvent(int value, Event left, Event right) {try{__CLR4_4_18i8il3zcayih.R.inc(306);
        __CLR4_4_18i8il3zcayih.R.inc(307);this.value = value;
        __CLR4_4_18i8il3zcayih.R.inc(308);this.left = left;
        __CLR4_4_18i8il3zcayih.R.inc(309);this.right = right;
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    int getValue() {try{__CLR4_4_18i8il3zcayih.R.inc(310);
        __CLR4_4_18i8il3zcayih.R.inc(311);return value;
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    Event getLeft() {try{__CLR4_4_18i8il3zcayih.R.inc(312);
        __CLR4_4_18i8il3zcayih.R.inc(313);return left;
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    Event getRight() {try{__CLR4_4_18i8il3zcayih.R.inc(314);
        __CLR4_4_18i8il3zcayih.R.inc(315);return right;
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    int min() {try{__CLR4_4_18i8il3zcayih.R.inc(316);
        __CLR4_4_18i8il3zcayih.R.inc(317);int min = Math.min(left.min(), right.min());
        __CLR4_4_18i8il3zcayih.R.inc(318);return value + min;
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    int max() {try{__CLR4_4_18i8il3zcayih.R.inc(319);
        __CLR4_4_18i8il3zcayih.R.inc(320);int max = Math.max(left.max(), right.max());
        __CLR4_4_18i8il3zcayih.R.inc(321);return value + max;
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    protected int maxDepth(int depth) {try{__CLR4_4_18i8il3zcayih.R.inc(322);
        __CLR4_4_18i8il3zcayih.R.inc(323);int leftDepth = left.maxDepth(depth + 1);
        __CLR4_4_18i8il3zcayih.R.inc(324);int rightDepth = right.maxDepth(depth + 1);
        __CLR4_4_18i8il3zcayih.R.inc(325);return Math.max(leftDepth, rightDepth);
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    boolean isLeaf() {try{__CLR4_4_18i8il3zcayih.R.inc(326);
        __CLR4_4_18i8il3zcayih.R.inc(327);return false;
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    Event lift(int m) {try{__CLR4_4_18i8il3zcayih.R.inc(328);
        __CLR4_4_18i8il3zcayih.R.inc(329);return Events.with(value + m, left, right);
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    Event sink(int m) {try{__CLR4_4_18i8il3zcayih.R.inc(330);
        __CLR4_4_18i8il3zcayih.R.inc(331);return Events.with(value - m, left, right);
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    Event normalize() {try{__CLR4_4_18i8il3zcayih.R.inc(332);
        __CLR4_4_18i8il3zcayih.R.inc(333);if ((((left.isLeaf() && right.isLeaf() && left.getValue() == right.getValue())&&(__CLR4_4_18i8il3zcayih.R.iget(334)!=0|true))||(__CLR4_4_18i8il3zcayih.R.iget(335)==0&false))) {{
            __CLR4_4_18i8il3zcayih.R.inc(336);return Events.with(value + left.getValue());
        }
        }else {{
            __CLR4_4_18i8il3zcayih.R.inc(337);int min = Math.min(left.min(), right.min());
            __CLR4_4_18i8il3zcayih.R.inc(338);return Events.with(value + min, left.sink(min), right.sink(min));
        }
    }}finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    boolean leq(Event other) {try{__CLR4_4_18i8il3zcayih.R.inc(339);
        __CLR4_4_18i8il3zcayih.R.inc(340);if ((((other.isLeaf())&&(__CLR4_4_18i8il3zcayih.R.iget(341)!=0|true))||(__CLR4_4_18i8il3zcayih.R.iget(342)==0&false))) {{
            __CLR4_4_18i8il3zcayih.R.inc(343);return leqLeaf(other);
        }
        }else {{
            __CLR4_4_18i8il3zcayih.R.inc(344);return leqNonLeafs(other);
        }
    }}finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    boolean leqLeaf(Event other) {try{__CLR4_4_18i8il3zcayih.R.inc(345);
        __CLR4_4_18i8il3zcayih.R.inc(346);return value <= other.getValue() &&
               liftedLeft(this).leq(other) &&
               liftedRight(this).leq(other);
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    static Event liftedLeft(Event event) {try{__CLR4_4_18i8il3zcayih.R.inc(347);
        __CLR4_4_18i8il3zcayih.R.inc(348);return event.getLeft().lift(event.getValue());
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    static Event liftedRight(Event event) {try{__CLR4_4_18i8il3zcayih.R.inc(349);
        __CLR4_4_18i8il3zcayih.R.inc(350);return event.getRight().lift(event.getValue());
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    boolean leqNonLeafs(Event other) {try{__CLR4_4_18i8il3zcayih.R.inc(351);
        __CLR4_4_18i8il3zcayih.R.inc(352);return value <= other.getValue() &&
               liftedLeft(this).leq(liftedLeft(other)) &&
               liftedRight(this).leq(liftedRight(other));
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    Event join(Event other) {try{__CLR4_4_18i8il3zcayih.R.inc(353);
        __CLR4_4_18i8il3zcayih.R.inc(354);if ((((other.isLeaf())&&(__CLR4_4_18i8il3zcayih.R.iget(355)!=0|true))||(__CLR4_4_18i8il3zcayih.R.iget(356)==0&false))) {{
            __CLR4_4_18i8il3zcayih.R.inc(357);return join(Events.with(other.getValue(), Events.zero(), Events.zero()));
        }
        }else {{
            __CLR4_4_18i8il3zcayih.R.inc(358);return joinNonLeaf(other);
        }
    }}finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    Event joinNonLeaf(Event other) {try{__CLR4_4_18i8il3zcayih.R.inc(359);
        __CLR4_4_18i8il3zcayih.R.inc(360);if ((((value > other.getValue())&&(__CLR4_4_18i8il3zcayih.R.iget(361)!=0|true))||(__CLR4_4_18i8il3zcayih.R.iget(362)==0&false))) {{
            __CLR4_4_18i8il3zcayih.R.inc(363);return other.join(this);
        }
        }else {{
            __CLR4_4_18i8il3zcayih.R.inc(364);Event join = Events.with(value, leftJoin(other), rightJoin(other));
            __CLR4_4_18i8il3zcayih.R.inc(365);return join.normalize();
        }
    }}finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    Event leftJoin(Event other) {try{__CLR4_4_18i8il3zcayih.R.inc(366);
        __CLR4_4_18i8il3zcayih.R.inc(367);Event otherLiftedLeft = other.getLeft().lift(other.getValue() - value);
        __CLR4_4_18i8il3zcayih.R.inc(368);return left.join(otherLiftedLeft);
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    Event rightJoin(Event other) {try{__CLR4_4_18i8il3zcayih.R.inc(369);
        __CLR4_4_18i8il3zcayih.R.inc(370);Event otherLiftedRight = other.getRight().lift(other.getValue() - value);
        __CLR4_4_18i8il3zcayih.R.inc(371);return right.join(otherLiftedRight);
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    public boolean equals(Object object) {try{__CLR4_4_18i8il3zcayih.R.inc(372);
        __CLR4_4_18i8il3zcayih.R.inc(373);if ((((!(object instanceof NonLeafEvent))&&(__CLR4_4_18i8il3zcayih.R.iget(374)!=0|true))||(__CLR4_4_18i8il3zcayih.R.iget(375)==0&false))) {{
            __CLR4_4_18i8il3zcayih.R.inc(376);return false;
        }
        }else {{
            __CLR4_4_18i8il3zcayih.R.inc(377);NonLeafEvent other = (NonLeafEvent)object;
            __CLR4_4_18i8il3zcayih.R.inc(378);return value == other.value &&
                   Objects.equals(left, other.left) &&
                   Objects.equals(right, other.right);
        }
    }}finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_18i8il3zcayih.R.inc(379);
        __CLR4_4_18i8il3zcayih.R.inc(380);int hash = 7;
        __CLR4_4_18i8il3zcayih.R.inc(381);hash = 37 * hash + value;
        __CLR4_4_18i8il3zcayih.R.inc(382);hash = 37 * hash + left.hashCode();
        __CLR4_4_18i8il3zcayih.R.inc(383);hash = 37 * hash + right.hashCode();
        __CLR4_4_18i8il3zcayih.R.inc(384);return hash;
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_18i8il3zcayih.R.inc(385);
        __CLR4_4_18i8il3zcayih.R.inc(386);return "(" + value + ", " + left + ", " + right + ")";
    }finally{__CLR4_4_18i8il3zcayih.R.flushNeeded();}}

}

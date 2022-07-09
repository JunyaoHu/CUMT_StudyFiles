/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.io.Serializable;

final class LeafEvent extends Event implements Serializable {public static class __CLR4_4_15y5yl3zcayhc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314775364L,8589935092L,259,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -7441138365249091187L;

    private final int value;

    LeafEvent() {try{__CLR4_4_15y5yl3zcayhc.R.inc(214);
        __CLR4_4_15y5yl3zcayhc.R.inc(215);value = 0;
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    LeafEvent(int value) {try{__CLR4_4_15y5yl3zcayhc.R.inc(216);
        __CLR4_4_15y5yl3zcayhc.R.inc(217);this.value = value;
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    int getValue() {try{__CLR4_4_15y5yl3zcayhc.R.inc(218);
        __CLR4_4_15y5yl3zcayhc.R.inc(219);return value;
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    Event getLeft() {try{__CLR4_4_15y5yl3zcayhc.R.inc(220);
        __CLR4_4_15y5yl3zcayhc.R.inc(221);return null;
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    Event getRight() {try{__CLR4_4_15y5yl3zcayhc.R.inc(222);
        __CLR4_4_15y5yl3zcayhc.R.inc(223);return null;
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    int max() {try{__CLR4_4_15y5yl3zcayhc.R.inc(224);
        __CLR4_4_15y5yl3zcayhc.R.inc(225);return value;
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    int min() {try{__CLR4_4_15y5yl3zcayhc.R.inc(226);
        __CLR4_4_15y5yl3zcayhc.R.inc(227);return value;
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    protected int maxDepth(int depth) {try{__CLR4_4_15y5yl3zcayhc.R.inc(228);
        __CLR4_4_15y5yl3zcayhc.R.inc(229);return depth;
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    boolean isLeaf() {try{__CLR4_4_15y5yl3zcayhc.R.inc(230);
        __CLR4_4_15y5yl3zcayhc.R.inc(231);return true;
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    Event lift(int m) {try{__CLR4_4_15y5yl3zcayhc.R.inc(232);
        __CLR4_4_15y5yl3zcayhc.R.inc(233);return new LeafEvent(value + m);
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    Event sink(int m) {try{__CLR4_4_15y5yl3zcayhc.R.inc(234);
        __CLR4_4_15y5yl3zcayhc.R.inc(235);return new LeafEvent(value - m);
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    Event normalize() {try{__CLR4_4_15y5yl3zcayhc.R.inc(236);
        __CLR4_4_15y5yl3zcayhc.R.inc(237);return this;
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    boolean leq(Event other) {try{__CLR4_4_15y5yl3zcayhc.R.inc(238);
        __CLR4_4_15y5yl3zcayhc.R.inc(239);return value <= other.getValue();
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    Event join(Event other) {try{__CLR4_4_15y5yl3zcayhc.R.inc(240);
        __CLR4_4_15y5yl3zcayhc.R.inc(241);if ((((other.isLeaf())&&(__CLR4_4_15y5yl3zcayhc.R.iget(242)!=0|true))||(__CLR4_4_15y5yl3zcayhc.R.iget(243)==0&false))) {{
            __CLR4_4_15y5yl3zcayhc.R.inc(244);return new LeafEvent(Math.max(value, other.getValue()));
        }
        }else {{
            __CLR4_4_15y5yl3zcayhc.R.inc(245);return Events.with(value, Events.zero(), Events.zero()).join(other);
        }
    }}finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    public boolean equals(Object object) {try{__CLR4_4_15y5yl3zcayhc.R.inc(246);
        __CLR4_4_15y5yl3zcayhc.R.inc(247);if((((!(object instanceof LeafEvent))&&(__CLR4_4_15y5yl3zcayhc.R.iget(248)!=0|true))||(__CLR4_4_15y5yl3zcayhc.R.iget(249)==0&false))) {{
            __CLR4_4_15y5yl3zcayhc.R.inc(250);return false;
        }
        }else {{
            __CLR4_4_15y5yl3zcayhc.R.inc(251);final LeafEvent other = (LeafEvent)object;
            __CLR4_4_15y5yl3zcayhc.R.inc(252);return this.value == other.value;
        }
    }}finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_15y5yl3zcayhc.R.inc(253);
        __CLR4_4_15y5yl3zcayhc.R.inc(254);int hash = 5;
        __CLR4_4_15y5yl3zcayhc.R.inc(255);hash = 41 * hash + this.value;
        __CLR4_4_15y5yl3zcayhc.R.inc(256);return hash;
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_15y5yl3zcayhc.R.inc(257);
        __CLR4_4_15y5yl3zcayhc.R.inc(258);return String.valueOf(value);
    }finally{__CLR4_4_15y5yl3zcayhc.R.flushNeeded();}}

}

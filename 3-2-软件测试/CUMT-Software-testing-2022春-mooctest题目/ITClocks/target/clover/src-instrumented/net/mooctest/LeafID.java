/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.io.Serializable;

final class LeafID extends ID implements Serializable {public static class __CLR4_4_17777l3zcayhs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314775364L,8589935092L,306,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 870626177742300327L;

    private final int value;

    LeafID(int value) {try{__CLR4_4_17777l3zcayhs.R.inc(259);
        __CLR4_4_17777l3zcayhs.R.inc(260);this.value = value;
    }finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    int getValue() {try{__CLR4_4_17777l3zcayhs.R.inc(261);
      __CLR4_4_17777l3zcayhs.R.inc(262);return this.value;
    }finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    @Override
    ID getLeft() {try{__CLR4_4_17777l3zcayhs.R.inc(263);
        __CLR4_4_17777l3zcayhs.R.inc(264);return null;
    }finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    @Override
    ID getRight() {try{__CLR4_4_17777l3zcayhs.R.inc(265);
        __CLR4_4_17777l3zcayhs.R.inc(266);return null;
    }finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    @Override
    boolean isZero() {try{__CLR4_4_17777l3zcayhs.R.inc(267);
        __CLR4_4_17777l3zcayhs.R.inc(268);return value == 0;
    }finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    @Override
    boolean isOne() {try{__CLR4_4_17777l3zcayhs.R.inc(269);
        __CLR4_4_17777l3zcayhs.R.inc(270);return value == 1;
    }finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    @Override
    boolean isLeaf() {try{__CLR4_4_17777l3zcayhs.R.inc(271);
        __CLR4_4_17777l3zcayhs.R.inc(272);return true;
    }finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    @Override
    ID normalize() {try{__CLR4_4_17777l3zcayhs.R.inc(273);
        __CLR4_4_17777l3zcayhs.R.inc(274);return this;
    }finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    @Override
    ID[] split() {try{__CLR4_4_17777l3zcayhs.R.inc(275);
        __CLR4_4_17777l3zcayhs.R.inc(276);if ((((isZero())&&(__CLR4_4_17777l3zcayhs.R.iget(277)!=0|true))||(__CLR4_4_17777l3zcayhs.R.iget(278)==0&false))) {{
            __CLR4_4_17777l3zcayhs.R.inc(279);return new ID[] { IDs.zero(), IDs.zero()};
        }
        }else {{ // if (isOne()) {
            __CLR4_4_17777l3zcayhs.R.inc(280);return new ID[] {
                IDs.with(IDs.one(), IDs.zero()),
                IDs.with(IDs.zero(), IDs.one())
            };
        }
    }}finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    @Override
    ID sum(ID other) {try{__CLR4_4_17777l3zcayhs.R.inc(281);
        assert (((other != null)&&(__CLR4_4_17777l3zcayhs.R.iget(282)!=0|true))||(__CLR4_4_17777l3zcayhs.R.iget(283)==0&false));
        __CLR4_4_17777l3zcayhs.R.inc(284);if ((((this.isZero())&&(__CLR4_4_17777l3zcayhs.R.iget(285)!=0|true))||(__CLR4_4_17777l3zcayhs.R.iget(286)==0&false))) {{
            __CLR4_4_17777l3zcayhs.R.inc(287);return other;
        }
        }else {__CLR4_4_17777l3zcayhs.R.inc(288);if ((((other.isZero())&&(__CLR4_4_17777l3zcayhs.R.iget(289)!=0|true))||(__CLR4_4_17777l3zcayhs.R.iget(290)==0&false))) {{
            __CLR4_4_17777l3zcayhs.R.inc(291);return this;
        }
        }else {{
            __CLR4_4_17777l3zcayhs.R.inc(292);throw new IllegalArgumentException("Can't sum " + this + " with " + other);
        }
    }}}finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    @Override
    public boolean equals(Object object) {try{__CLR4_4_17777l3zcayhs.R.inc(293);
        __CLR4_4_17777l3zcayhs.R.inc(294);if((((!(object instanceof LeafID))&&(__CLR4_4_17777l3zcayhs.R.iget(295)!=0|true))||(__CLR4_4_17777l3zcayhs.R.iget(296)==0&false))) {{
            __CLR4_4_17777l3zcayhs.R.inc(297);return false;
        }
        }else {{
            __CLR4_4_17777l3zcayhs.R.inc(298);LeafID other = (LeafID)object;
            __CLR4_4_17777l3zcayhs.R.inc(299);return value == other.value;
        }
    }}finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_17777l3zcayhs.R.inc(300);
        __CLR4_4_17777l3zcayhs.R.inc(301);int hash = 3;
        __CLR4_4_17777l3zcayhs.R.inc(302);hash = 17 * hash + this.value;
        __CLR4_4_17777l3zcayhs.R.inc(303);return hash;
    }finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_17777l3zcayhs.R.inc(304);
        __CLR4_4_17777l3zcayhs.R.inc(305);return String.valueOf(value);
    }finally{__CLR4_4_17777l3zcayhs.R.flushNeeded();}}

}

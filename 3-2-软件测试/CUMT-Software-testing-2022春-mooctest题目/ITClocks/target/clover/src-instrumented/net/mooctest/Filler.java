/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

final class Filler {public static class __CLR4_4_1aal3zcaye8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314775364L,8589935092L,51,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static Event fill(ID id, Event event) {try{__CLR4_4_1aal3zcaye8.R.inc(10);
        __CLR4_4_1aal3zcaye8.R.inc(11);if ((((id.isLeaf())&&(__CLR4_4_1aal3zcaye8.R.iget(12)!=0|true))||(__CLR4_4_1aal3zcaye8.R.iget(13)==0&false))) {{
            __CLR4_4_1aal3zcaye8.R.inc(14);return fillWithLeafID(id, event);
        }
        }else {__CLR4_4_1aal3zcaye8.R.inc(15);if ((((event.isLeaf())&&(__CLR4_4_1aal3zcaye8.R.iget(16)!=0|true))||(__CLR4_4_1aal3zcaye8.R.iget(17)==0&false))) {{
            __CLR4_4_1aal3zcaye8.R.inc(18);return event;
        }
        }else {{
            __CLR4_4_1aal3zcaye8.R.inc(19);return fillNonLeafs(id, event);
        }
    }}}finally{__CLR4_4_1aal3zcaye8.R.flushNeeded();}}

    private static Event fillWithLeafID(ID leafID, Event event) {try{__CLR4_4_1aal3zcaye8.R.inc(20);
        __CLR4_4_1aal3zcaye8.R.inc(21);if ((((leafID.isZero())&&(__CLR4_4_1aal3zcaye8.R.iget(22)!=0|true))||(__CLR4_4_1aal3zcaye8.R.iget(23)==0&false))) {{
            __CLR4_4_1aal3zcaye8.R.inc(24);return event;
        }
        }else {{
            __CLR4_4_1aal3zcaye8.R.inc(25);return Events.with(event.max());
        }
    }}finally{__CLR4_4_1aal3zcaye8.R.flushNeeded();}}

    private static Event fillNonLeafs(ID id, Event event) {try{__CLR4_4_1aal3zcaye8.R.inc(26);
        __CLR4_4_1aal3zcaye8.R.inc(27);if ((((id.getLeft().isOne())&&(__CLR4_4_1aal3zcaye8.R.iget(28)!=0|true))||(__CLR4_4_1aal3zcaye8.R.iget(29)==0&false))) {{
            __CLR4_4_1aal3zcaye8.R.inc(30);return fillLeftOneID(id, event);
        }
        }else {__CLR4_4_1aal3zcaye8.R.inc(31);if ((((id.getRight().isOne())&&(__CLR4_4_1aal3zcaye8.R.iget(32)!=0|true))||(__CLR4_4_1aal3zcaye8.R.iget(33)==0&false))) {{
            __CLR4_4_1aal3zcaye8.R.inc(34);return fillRightOneID(id, event);
        }
        }else {{
            __CLR4_4_1aal3zcaye8.R.inc(35);return fillLeftRight(id, event);
        }
    }}}finally{__CLR4_4_1aal3zcaye8.R.flushNeeded();}}

    private static Event fillLeftOneID(ID id, Event event) {try{__CLR4_4_1aal3zcaye8.R.inc(36);
        __CLR4_4_1aal3zcaye8.R.inc(37);Event filledRight = fillRight(id, event);
        __CLR4_4_1aal3zcaye8.R.inc(38);int max = Math.max(event.getLeft().max(), filledRight.min());
        __CLR4_4_1aal3zcaye8.R.inc(39);return Events.with(event.getValue(), Events.with(max), filledRight).normalize();
    }finally{__CLR4_4_1aal3zcaye8.R.flushNeeded();}}

    private static Event fillRight(ID id, Event event) {try{__CLR4_4_1aal3zcaye8.R.inc(40);
        __CLR4_4_1aal3zcaye8.R.inc(41);return fill(id.getRight(), event.getRight());
    }finally{__CLR4_4_1aal3zcaye8.R.flushNeeded();}}

    private static Event fillRightOneID(ID id, Event event) {try{__CLR4_4_1aal3zcaye8.R.inc(42);
        __CLR4_4_1aal3zcaye8.R.inc(43);Event filledLeft = fillLeft(id, event);
        __CLR4_4_1aal3zcaye8.R.inc(44);int max = Math.max(event.getRight().max(), filledLeft.min());
        __CLR4_4_1aal3zcaye8.R.inc(45);return Events.with(event.getValue(), filledLeft, Events.with(max)).normalize();
    }finally{__CLR4_4_1aal3zcaye8.R.flushNeeded();}}

    private static Event fillLeft(ID id, Event event) {try{__CLR4_4_1aal3zcaye8.R.inc(46);
        __CLR4_4_1aal3zcaye8.R.inc(47);return fill(id.getLeft(), event.getLeft());
    }finally{__CLR4_4_1aal3zcaye8.R.flushNeeded();}}

    private static Event fillLeftRight(ID id, Event event) {try{__CLR4_4_1aal3zcaye8.R.inc(48);
        __CLR4_4_1aal3zcaye8.R.inc(49);return Events.with(event.getValue(), fillLeft(id, event), fillRight(id, event))
                .normalize();
    }finally{__CLR4_4_1aal3zcaye8.R.flushNeeded();}}

    private  Filler() {try{__CLR4_4_1aal3zcaye8.R.inc(50); }finally{__CLR4_4_1aal3zcaye8.R.flushNeeded();}}

}

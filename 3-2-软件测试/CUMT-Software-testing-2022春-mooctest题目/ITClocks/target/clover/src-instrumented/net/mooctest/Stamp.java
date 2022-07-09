/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.io.Serializable;

public final class Stamp implements Serializable {public static class __CLR4_4_1cocol3zcayjy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314775364L,8589935092L,503,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 1750149585711104601L;

    private final ID id;
    private final Event event;

    public Stamp() {try{__CLR4_4_1cocol3zcayjy.R.inc(456);
        __CLR4_4_1cocol3zcayjy.R.inc(457);id = IDs.one();
        __CLR4_4_1cocol3zcayjy.R.inc(458);event = Events.zero();
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    Stamp(ID id, Event event) {try{__CLR4_4_1cocol3zcayjy.R.inc(459);
        __CLR4_4_1cocol3zcayjy.R.inc(460);this.id = id;
        __CLR4_4_1cocol3zcayjy.R.inc(461);this.event = event;
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    ID getId() {try{__CLR4_4_1cocol3zcayjy.R.inc(462);
        __CLR4_4_1cocol3zcayjy.R.inc(463);return id;
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    Event getEvent() {try{__CLR4_4_1cocol3zcayjy.R.inc(464);
        __CLR4_4_1cocol3zcayjy.R.inc(465);return event;
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    public Stamp[] fork() {try{__CLR4_4_1cocol3zcayjy.R.inc(466);
        __CLR4_4_1cocol3zcayjy.R.inc(467);ID[] ids = id.split();
        __CLR4_4_1cocol3zcayjy.R.inc(468);return new Stamp[] {
            new Stamp(ids[0], event),
            new Stamp(ids[1], event)
        };
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    public Stamp[] peek() {try{__CLR4_4_1cocol3zcayjy.R.inc(469);
        __CLR4_4_1cocol3zcayjy.R.inc(470);return new Stamp[] {
            new Stamp(id, event),
            new Stamp(IDs.zero(), event)
        };
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    public Stamp join(Stamp other) {try{__CLR4_4_1cocol3zcayjy.R.inc(471);
        __CLR4_4_1cocol3zcayjy.R.inc(472);ID idSum = id.sum(other.id);
        __CLR4_4_1cocol3zcayjy.R.inc(473);Event eventJoin = event.join(other.event);
        __CLR4_4_1cocol3zcayjy.R.inc(474);return new Stamp(idSum, eventJoin);
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    public Stamp event() {try{__CLR4_4_1cocol3zcayjy.R.inc(475);
        __CLR4_4_1cocol3zcayjy.R.inc(476);Event filled = Filler.fill(id, event);
        __CLR4_4_1cocol3zcayjy.R.inc(477);if ((((!filled.equals(event))&&(__CLR4_4_1cocol3zcayjy.R.iget(478)!=0|true))||(__CLR4_4_1cocol3zcayjy.R.iget(479)==0&false))) {{
            __CLR4_4_1cocol3zcayjy.R.inc(480);return new Stamp(id, filled);
        }
        }else {{
            __CLR4_4_1cocol3zcayjy.R.inc(481);return new Stamp(id, Grower.grow(id, event));
        }
    }}finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_1cocol3zcayjy.R.inc(482);
        __CLR4_4_1cocol3zcayjy.R.inc(483);return "(" + id + ", " + event + ")";
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_4_1cocol3zcayjy.R.inc(484);
        __CLR4_4_1cocol3zcayjy.R.inc(485);if ((((!(o instanceof Stamp))&&(__CLR4_4_1cocol3zcayjy.R.iget(486)!=0|true))||(__CLR4_4_1cocol3zcayjy.R.iget(487)==0&false))) {{
            __CLR4_4_1cocol3zcayjy.R.inc(488);return false;
        }
        }else {{
            __CLR4_4_1cocol3zcayjy.R.inc(489);Stamp other = (Stamp) o;
            __CLR4_4_1cocol3zcayjy.R.inc(490);return id.equals(other.getId()) && event.equals(other.getEvent());
        }
    }}finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_1cocol3zcayjy.R.inc(491);
        __CLR4_4_1cocol3zcayjy.R.inc(492);int result = id.hashCode();
        __CLR4_4_1cocol3zcayjy.R.inc(493);result = 31 * result + event.hashCode();
        __CLR4_4_1cocol3zcayjy.R.inc(494);return result;
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    //----------------------------------------- API methods --------------------------------------

    public Stamp[] send() {try{__CLR4_4_1cocol3zcayjy.R.inc(495);
        __CLR4_4_1cocol3zcayjy.R.inc(496);return event().peek();
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    public Stamp receive(Stamp other) {try{__CLR4_4_1cocol3zcayjy.R.inc(497);
        __CLR4_4_1cocol3zcayjy.R.inc(498);return join(other).event();
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    public Stamp[] sync(Stamp other) {try{__CLR4_4_1cocol3zcayjy.R.inc(499);
        __CLR4_4_1cocol3zcayjy.R.inc(500);return join(other).fork();
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

    public boolean leq(Stamp other) {try{__CLR4_4_1cocol3zcayjy.R.inc(501);
        __CLR4_4_1cocol3zcayjy.R.inc(502);return event.leq(other.event);
    }finally{__CLR4_4_1cocol3zcayjy.R.flushNeeded();}}

}

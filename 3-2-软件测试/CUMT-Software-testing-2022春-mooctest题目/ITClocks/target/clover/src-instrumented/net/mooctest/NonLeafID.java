/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.io.Serializable;
import java.util.Objects;

final class NonLeafID extends ID implements Serializable {public static class __CLR4_4_1ararl3zcayj5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0049\u0054\u0043\u006c\u006f\u0063\u006b\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314775364L,8589935092L,456,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -5030081211956985797L;

    private final ID left;
    private final ID right;

    NonLeafID(ID left, ID right) {try{__CLR4_4_1ararl3zcayj5.R.inc(387);
        __CLR4_4_1ararl3zcayj5.R.inc(388);this.left = left;
        __CLR4_4_1ararl3zcayj5.R.inc(389);this.right = right;
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    ID getLeft() {try{__CLR4_4_1ararl3zcayj5.R.inc(390);
        __CLR4_4_1ararl3zcayj5.R.inc(391);return left;
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    ID getRight() {try{__CLR4_4_1ararl3zcayj5.R.inc(392);
        __CLR4_4_1ararl3zcayj5.R.inc(393);return right;
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    @Override
    boolean isOne() {try{__CLR4_4_1ararl3zcayj5.R.inc(394);
        __CLR4_4_1ararl3zcayj5.R.inc(395);return false;
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    @Override
    boolean isZero() {try{__CLR4_4_1ararl3zcayj5.R.inc(396);
        __CLR4_4_1ararl3zcayj5.R.inc(397);return false;
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    @Override
    boolean isLeaf() {try{__CLR4_4_1ararl3zcayj5.R.inc(398);
        __CLR4_4_1ararl3zcayj5.R.inc(399);return false;
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    @Override
    ID normalize() {try{__CLR4_4_1ararl3zcayj5.R.inc(400);
        __CLR4_4_1ararl3zcayj5.R.inc(401);return normalize(left.normalize(), right.normalize());
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    static ID normalize(ID left, ID right) {try{__CLR4_4_1ararl3zcayj5.R.inc(402);
        __CLR4_4_1ararl3zcayj5.R.inc(403);if ((((left.isZero() && right.isZero())&&(__CLR4_4_1ararl3zcayj5.R.iget(404)!=0|true))||(__CLR4_4_1ararl3zcayj5.R.iget(405)==0&false))) {{
            __CLR4_4_1ararl3zcayj5.R.inc(406);return IDs.zero();
        }
        }else {__CLR4_4_1ararl3zcayj5.R.inc(407);if ((((left.isOne() && right.isOne())&&(__CLR4_4_1ararl3zcayj5.R.iget(408)!=0|true))||(__CLR4_4_1ararl3zcayj5.R.iget(409)==0&false))) {{
            __CLR4_4_1ararl3zcayj5.R.inc(410);return IDs.one();
        }
        }else {{
            __CLR4_4_1ararl3zcayj5.R.inc(411);return IDs.with(left, right);
        }
    }}}finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    @Override
    ID[] split() {try{__CLR4_4_1ararl3zcayj5.R.inc(412);
        __CLR4_4_1ararl3zcayj5.R.inc(413);if ((((left.isZero())&&(__CLR4_4_1ararl3zcayj5.R.iget(414)!=0|true))||(__CLR4_4_1ararl3zcayj5.R.iget(415)==0&false))) {{
            __CLR4_4_1ararl3zcayj5.R.inc(416);return splitWithLeftZero();
        }
        }else {__CLR4_4_1ararl3zcayj5.R.inc(417);if ((((right.isZero())&&(__CLR4_4_1ararl3zcayj5.R.iget(418)!=0|true))||(__CLR4_4_1ararl3zcayj5.R.iget(419)==0&false))) {{
            __CLR4_4_1ararl3zcayj5.R.inc(420);return splitWithRightZero();
        }
        }else {{
            __CLR4_4_1ararl3zcayj5.R.inc(421);return new ID[] {
                IDs.with(left, IDs.zero()),
                IDs.with(IDs.zero(), right)
            };
        }
    }}}finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    ID[] splitWithLeftZero() {try{__CLR4_4_1ararl3zcayj5.R.inc(422);
        __CLR4_4_1ararl3zcayj5.R.inc(423);ID[] rightSplit = right.split();
        __CLR4_4_1ararl3zcayj5.R.inc(424);return new ID[] {
            IDs.with(IDs.zero(), rightSplit[0]),
            IDs.with(IDs.zero(), rightSplit[1])
        };
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    ID[] splitWithRightZero() {try{__CLR4_4_1ararl3zcayj5.R.inc(425);
        __CLR4_4_1ararl3zcayj5.R.inc(426);ID[] leftSplit = left.split();
        __CLR4_4_1ararl3zcayj5.R.inc(427);return new ID[] {
            IDs.with(leftSplit[0], IDs.zero()),
            IDs.with(leftSplit[1], IDs.zero())
        };
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    @Override
    ID sum(ID other) {try{__CLR4_4_1ararl3zcayj5.R.inc(428);
        assert (((other != null)&&(__CLR4_4_1ararl3zcayj5.R.iget(429)!=0|true))||(__CLR4_4_1ararl3zcayj5.R.iget(430)==0&false));
        __CLR4_4_1ararl3zcayj5.R.inc(431);if ((((other.isZero())&&(__CLR4_4_1ararl3zcayj5.R.iget(432)!=0|true))||(__CLR4_4_1ararl3zcayj5.R.iget(433)==0&false))) {{
            __CLR4_4_1ararl3zcayj5.R.inc(434);return this;
        }
        }else {__CLR4_4_1ararl3zcayj5.R.inc(435);if ((((!other.isLeaf())&&(__CLR4_4_1ararl3zcayj5.R.iget(436)!=0|true))||(__CLR4_4_1ararl3zcayj5.R.iget(437)==0&false))) {{
            __CLR4_4_1ararl3zcayj5.R.inc(438);return sumNonLeaf((NonLeafID)other);
        }
        }else {{
            __CLR4_4_1ararl3zcayj5.R.inc(439);throw new IllegalArgumentException("Can't sum " + this + " with 1.");
        }
    }}}finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    ID sumNonLeaf(ID other) {try{__CLR4_4_1ararl3zcayj5.R.inc(440);
        __CLR4_4_1ararl3zcayj5.R.inc(441);ID leftSum = left.sum(other.getLeft());
        __CLR4_4_1ararl3zcayj5.R.inc(442);ID rightSum = right.sum(other.getRight());
        __CLR4_4_1ararl3zcayj5.R.inc(443);ID sum = IDs.with(leftSum, rightSum);
        __CLR4_4_1ararl3zcayj5.R.inc(444);return sum.normalize();
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    @Override
    public boolean equals(Object object) {try{__CLR4_4_1ararl3zcayj5.R.inc(445);
        __CLR4_4_1ararl3zcayj5.R.inc(446);if ((((!(object instanceof NonLeafID))&&(__CLR4_4_1ararl3zcayj5.R.iget(447)!=0|true))||(__CLR4_4_1ararl3zcayj5.R.iget(448)==0&false))) {{
            __CLR4_4_1ararl3zcayj5.R.inc(449);return false;
        }
        }else {{
            __CLR4_4_1ararl3zcayj5.R.inc(450);NonLeafID other = (NonLeafID)object;
            __CLR4_4_1ararl3zcayj5.R.inc(451);return left.equals(other.getLeft()) &&
                   right.equals(other.getRight());
        }
    }}finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_1ararl3zcayj5.R.inc(452);
        __CLR4_4_1ararl3zcayj5.R.inc(453);return Objects.hash(left, right);
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_1ararl3zcayj5.R.inc(454);
        __CLR4_4_1ararl3zcayj5.R.inc(455);return "(" + left + ", " + right + ")";
    }finally{__CLR4_4_1ararl3zcayj5.R.flushNeeded();}}

}

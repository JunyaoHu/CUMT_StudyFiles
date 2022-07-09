/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

public class Node {public static class __CLR4_4_16o6ol43y7qck{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0030\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0052\u0065\u0064\u0042\u006c\u0061\u0063\u006b\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654593441132L,8589935092L,281,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public Node(Integer value, Node parent, Node left, Node right) {
        super();__CLR4_4_16o6ol43y7qck.R.inc(241);try{__CLR4_4_16o6ol43y7qck.R.inc(240);
        __CLR4_4_16o6ol43y7qck.R.inc(242);this.value = value;
        __CLR4_4_16o6ol43y7qck.R.inc(243);this.parent = parent;
        __CLR4_4_16o6ol43y7qck.R.inc(244);this.left = left;
        __CLR4_4_16o6ol43y7qck.R.inc(245);this.right = right;
    }finally{__CLR4_4_16o6ol43y7qck.R.flushNeeded();}}

    public Integer value;
    public Node parent;
    public Node left;
    public Node right;
    
    public boolean isLeaf() {try{__CLR4_4_16o6ol43y7qck.R.inc(246);
        __CLR4_4_16o6ol43y7qck.R.inc(247);return left == null && right == null;
    }finally{__CLR4_4_16o6ol43y7qck.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_16o6ol43y7qck.R.inc(248);
        __CLR4_4_16o6ol43y7qck.R.inc(249);final int prime = 31;
        __CLR4_4_16o6ol43y7qck.R.inc(250);int result = 1;
        __CLR4_4_16o6ol43y7qck.R.inc(251);result = prime * result + (((((value == null) )&&(__CLR4_4_16o6ol43y7qck.R.iget(252)!=0|true))||(__CLR4_4_16o6ol43y7qck.R.iget(253)==0&false))? 0 : value.hashCode());
        __CLR4_4_16o6ol43y7qck.R.inc(254);return result;
    }finally{__CLR4_4_16o6ol43y7qck.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_4_16o6ol43y7qck.R.inc(255);
        __CLR4_4_16o6ol43y7qck.R.inc(256);if ((((this == obj)&&(__CLR4_4_16o6ol43y7qck.R.iget(257)!=0|true))||(__CLR4_4_16o6ol43y7qck.R.iget(258)==0&false)))
            {__CLR4_4_16o6ol43y7qck.R.inc(259);return true;
        }__CLR4_4_16o6ol43y7qck.R.inc(260);if ((((obj == null)&&(__CLR4_4_16o6ol43y7qck.R.iget(261)!=0|true))||(__CLR4_4_16o6ol43y7qck.R.iget(262)==0&false)))
            {__CLR4_4_16o6ol43y7qck.R.inc(263);return false;
        }__CLR4_4_16o6ol43y7qck.R.inc(264);if ((((getClass() != obj.getClass())&&(__CLR4_4_16o6ol43y7qck.R.iget(265)!=0|true))||(__CLR4_4_16o6ol43y7qck.R.iget(266)==0&false)))
            {__CLR4_4_16o6ol43y7qck.R.inc(267);return false;
        }__CLR4_4_16o6ol43y7qck.R.inc(268);Node other = (Node) obj;
        __CLR4_4_16o6ol43y7qck.R.inc(269);if ((((value == null)&&(__CLR4_4_16o6ol43y7qck.R.iget(270)!=0|true))||(__CLR4_4_16o6ol43y7qck.R.iget(271)==0&false))) {{
            __CLR4_4_16o6ol43y7qck.R.inc(272);if ((((other.value != null)&&(__CLR4_4_16o6ol43y7qck.R.iget(273)!=0|true))||(__CLR4_4_16o6ol43y7qck.R.iget(274)==0&false)))
                {__CLR4_4_16o6ol43y7qck.R.inc(275);return false;
        }} }else {__CLR4_4_16o6ol43y7qck.R.inc(276);if ((((!value.equals(other.value))&&(__CLR4_4_16o6ol43y7qck.R.iget(277)!=0|true))||(__CLR4_4_16o6ol43y7qck.R.iget(278)==0&false)))
            {__CLR4_4_16o6ol43y7qck.R.inc(279);return false;
        }}__CLR4_4_16o6ol43y7qck.R.inc(280);return true;
    }finally{__CLR4_4_16o6ol43y7qck.R.flushNeeded();}}

}

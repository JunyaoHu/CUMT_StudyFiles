/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
// *******************************************
// * JIPA - Java Interpreted Pseuso-Assembly *
// ***                                     ***
// * Created by: Dominic Charley-Roy         *
// ***                                     ***
// * Released under GNU General              *
// * Public License                          *
// *******************************************
/**
 * Class Name: Label
 * Class Use: This class will handle all the labels in JIPA, and provide
 *            a basic interface for accessinh and using them.
 * @author Dominic Charley-Roy
 */
import java.util.*;

public class Label {public static class __CLR4_4_17j7jl3zcakgr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u004a\u0069\u0070\u0061\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314757275L,8589935092L,297,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Collection<Label> labelList = new ArrayList<Label>();
    private int lineNumber; private String labelName;

    public Label(int line, String name)
    {try{__CLR4_4_17j7jl3zcakgr.R.inc(271);
        __CLR4_4_17j7jl3zcakgr.R.inc(272);this.lineNumber = line;
        __CLR4_4_17j7jl3zcakgr.R.inc(273);this.labelName = name;
    }finally{__CLR4_4_17j7jl3zcakgr.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_17j7jl3zcakgr.R.inc(274);__CLR4_4_17j7jl3zcakgr.R.inc(275);return labelName;}finally{__CLR4_4_17j7jl3zcakgr.R.flushNeeded();}}
    public int getLine() {try{__CLR4_4_17j7jl3zcakgr.R.inc(276);__CLR4_4_17j7jl3zcakgr.R.inc(277);return lineNumber;}finally{__CLR4_4_17j7jl3zcakgr.R.flushNeeded();}}

    public static int findLabel(String name)
    {try{__CLR4_4_17j7jl3zcakgr.R.inc(278);
        // Iterate through the label list until we find a label with that name
        __CLR4_4_17j7jl3zcakgr.R.inc(279);Iterator<Label> iterator= labelList.iterator();
        __CLR4_4_17j7jl3zcakgr.R.inc(280);while ((((iterator.hasNext())&&(__CLR4_4_17j7jl3zcakgr.R.iget(281)!=0|true))||(__CLR4_4_17j7jl3zcakgr.R.iget(282)==0&false)))
        {{
            __CLR4_4_17j7jl3zcakgr.R.inc(283);Label curLabel = (Label) iterator.next();
            __CLR4_4_17j7jl3zcakgr.R.inc(284);if ((((curLabel.getName().equals(name))&&(__CLR4_4_17j7jl3zcakgr.R.iget(285)!=0|true))||(__CLR4_4_17j7jl3zcakgr.R.iget(286)==0&false)))
                {__CLR4_4_17j7jl3zcakgr.R.inc(287);return curLabel.getLine();
        }}

        }__CLR4_4_17j7jl3zcakgr.R.inc(288);return -1;

    }finally{__CLR4_4_17j7jl3zcakgr.R.flushNeeded();}}

    public static void buildLabelList()
    {try{__CLR4_4_17j7jl3zcakgr.R.inc(289);
        // Loop through each line looking for a label
        __CLR4_4_17j7jl3zcakgr.R.inc(290);for (int ctr=0; (((ctr < Jipa.TOTAL_INSTRUCTIONS)&&(__CLR4_4_17j7jl3zcakgr.R.iget(291)!=0|true))||(__CLR4_4_17j7jl3zcakgr.R.iget(292)==0&false));ctr++)
        {{
            __CLR4_4_17j7jl3zcakgr.R.inc(293);if ((((Jipa.instruction[ctr].toLowerCase().startsWith("lbl "))&&(__CLR4_4_17j7jl3zcakgr.R.iget(294)!=0|true))||(__CLR4_4_17j7jl3zcakgr.R.iget(295)==0&false))){{
                __CLR4_4_17j7jl3zcakgr.R.inc(296);labelList.add(new Label(ctr,Jipa.instruction[ctr].substring(4)));
            }
        }}
    }}finally{__CLR4_4_17j7jl3zcakgr.R.flushNeeded();}}
}

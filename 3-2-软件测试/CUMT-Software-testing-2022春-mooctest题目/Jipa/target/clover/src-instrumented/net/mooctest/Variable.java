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
 * Class Name: Variable
 * Class Use: This class is the basis for the variables in JIPA and will
 *            provide an interface for the interpreter to access.
 * @author Dominic Charley-Roy
 */
import java.util.*;
/**
 *
 * @author Dominic
 */

public class Variable {public static class __CLR4_4_18989l3zcakhj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u004a\u0069\u0070\u0061\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314757275L,8589935092L,359,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static List<Variable> variableList = new ArrayList<Variable>();

    private String varName;
    private int varValue;

    Variable(String varName)
    {try{__CLR4_4_18989l3zcakhj.R.inc(297);
        __CLR4_4_18989l3zcakhj.R.inc(298);this.varName = varName;
        __CLR4_4_18989l3zcakhj.R.inc(299);this.varValue=0;
    }finally{__CLR4_4_18989l3zcakhj.R.flushNeeded();}}

    int getValue(){try{__CLR4_4_18989l3zcakhj.R.inc(300);__CLR4_4_18989l3zcakhj.R.inc(301);return this.varValue;}finally{__CLR4_4_18989l3zcakhj.R.flushNeeded();}}

    void setValue(int varValue){try{__CLR4_4_18989l3zcakhj.R.inc(302);
        __CLR4_4_18989l3zcakhj.R.inc(303);this.varValue = varValue;
    }finally{__CLR4_4_18989l3zcakhj.R.flushNeeded();}}

    String getName() {try{__CLR4_4_18989l3zcakhj.R.inc(304);__CLR4_4_18989l3zcakhj.R.inc(305);return varName;}finally{__CLR4_4_18989l3zcakhj.R.flushNeeded();}}

    public static boolean addVariable(String varName){try{__CLR4_4_18989l3zcakhj.R.inc(306);
        __CLR4_4_18989l3zcakhj.R.inc(307);if ((((findVariable(varName) == -1)&&(__CLR4_4_18989l3zcakhj.R.iget(308)!=0|true))||(__CLR4_4_18989l3zcakhj.R.iget(309)==0&false)))
        {{
            __CLR4_4_18989l3zcakhj.R.inc(310);variableList.add(new Variable(varName));
            __CLR4_4_18989l3zcakhj.R.inc(311);return true;
        }

        }__CLR4_4_18989l3zcakhj.R.inc(312);return false;
    }finally{__CLR4_4_18989l3zcakhj.R.flushNeeded();}}

    public static void removeVariable(String varName){try{__CLR4_4_18989l3zcakhj.R.inc(313);
        __CLR4_4_18989l3zcakhj.R.inc(314);int index = findVariable(varName);
        __CLR4_4_18989l3zcakhj.R.inc(315);if ((((index != -1)&&(__CLR4_4_18989l3zcakhj.R.iget(316)!=0|true))||(__CLR4_4_18989l3zcakhj.R.iget(317)==0&false)))
            {__CLR4_4_18989l3zcakhj.R.inc(318);variableList.remove(index);

    }}finally{__CLR4_4_18989l3zcakhj.R.flushNeeded();}}

    public static int getVariableValue(String varName)
    {try{__CLR4_4_18989l3zcakhj.R.inc(319);
        // Check if we are working with a pointer
        __CLR4_4_18989l3zcakhj.R.inc(320);if ((((varName.startsWith("*"))&&(__CLR4_4_18989l3zcakhj.R.iget(321)!=0|true))||(__CLR4_4_18989l3zcakhj.R.iget(322)==0&false))){{
            __CLR4_4_18989l3zcakhj.R.inc(323);return findVariable(varName.substring(1));
        }

        }__CLR4_4_18989l3zcakhj.R.inc(324);int varIndex = findVariable(varName);
        
        __CLR4_4_18989l3zcakhj.R.inc(325);if ((((varIndex != -1)&&(__CLR4_4_18989l3zcakhj.R.iget(326)!=0|true))||(__CLR4_4_18989l3zcakhj.R.iget(327)==0&false)))
            {__CLR4_4_18989l3zcakhj.R.inc(328);return variableList.get(varIndex).getValue();
        }else
            {__CLR4_4_18989l3zcakhj.R.inc(329);return 0;
    }}finally{__CLR4_4_18989l3zcakhj.R.flushNeeded();}}


    public static void setVariableValue(String varName, int varValue)
    {try{__CLR4_4_18989l3zcakhj.R.inc(330);
        __CLR4_4_18989l3zcakhj.R.inc(331);int varIndex = findVariable(varName);

        __CLR4_4_18989l3zcakhj.R.inc(332);if ((((varIndex != -1)&&(__CLR4_4_18989l3zcakhj.R.iget(333)!=0|true))||(__CLR4_4_18989l3zcakhj.R.iget(334)==0&false)))
            {__CLR4_4_18989l3zcakhj.R.inc(335);variableList.get(varIndex).setValue(varValue);

    }}finally{__CLR4_4_18989l3zcakhj.R.flushNeeded();}}


    static int findVariable(String varName){try{__CLR4_4_18989l3zcakhj.R.inc(336);

        __CLR4_4_18989l3zcakhj.R.inc(337);ListIterator<Variable> i = variableList.listIterator();
        __CLR4_4_18989l3zcakhj.R.inc(338);Variable curVariable;

        // Check if it is a reference variable, and if so, remove ampersand
        __CLR4_4_18989l3zcakhj.R.inc(339);boolean isReference = (((varName.startsWith("&"))&&(__CLR4_4_18989l3zcakhj.R.iget(340)!=0|true))||(__CLR4_4_18989l3zcakhj.R.iget(341)==0&false))?true:false;
        __CLR4_4_18989l3zcakhj.R.inc(342);if ((((isReference)&&(__CLR4_4_18989l3zcakhj.R.iget(343)!=0|true))||(__CLR4_4_18989l3zcakhj.R.iget(344)==0&false)))
            {__CLR4_4_18989l3zcakhj.R.inc(345);varName = varName.substring(1);

        }__CLR4_4_18989l3zcakhj.R.inc(346);while ((((i.hasNext())&&(__CLR4_4_18989l3zcakhj.R.iget(347)!=0|true))||(__CLR4_4_18989l3zcakhj.R.iget(348)==0&false)))
        {{
            __CLR4_4_18989l3zcakhj.R.inc(349);curVariable = (Variable) i.next();
            __CLR4_4_18989l3zcakhj.R.inc(350);if ((((curVariable.getName().equals(varName))&&(__CLR4_4_18989l3zcakhj.R.iget(351)!=0|true))||(__CLR4_4_18989l3zcakhj.R.iget(352)==0&false)))
                // Check if we are working with a reference pointer
                {__CLR4_4_18989l3zcakhj.R.inc(353);if ((((!isReference)&&(__CLR4_4_18989l3zcakhj.R.iget(354)!=0|true))||(__CLR4_4_18989l3zcakhj.R.iget(355)==0&false)))
                    {__CLR4_4_18989l3zcakhj.R.inc(356);return i.previousIndex();
                }else
                    {__CLR4_4_18989l3zcakhj.R.inc(357);return curVariable.getValue();
            
        }}}

        }__CLR4_4_18989l3zcakhj.R.inc(358);return -1;
    }finally{__CLR4_4_18989l3zcakhj.R.flushNeeded();}}

}

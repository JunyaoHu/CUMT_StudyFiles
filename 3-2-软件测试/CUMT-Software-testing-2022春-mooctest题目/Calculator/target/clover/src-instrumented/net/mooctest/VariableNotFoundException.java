/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * Exception thrown when an unrecognized variable is passed to ExpressionParser.
 *
 * @version 1.0, 16/10/2016
 * @since 1.0
 */

public class VariableNotFoundException extends ExpressionParserException {public static class __CLR4_4_1babal3zcarcp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0043\u0061\u006c\u0063\u0075\u006c\u0061\u0074\u006f\u0072\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314766009L,8589935092L,413,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private String var;

	/**
	 * Constructor of VariableNotFoundException. This constructor accepts the
	 * invalid expression as well as the unrecognized variable.
	 *
	 * @param faultyExpression
	 *            the expression which could not be parsed
	 * @param var
	 *            the unrecognized variable
	 * @since 1.0
	 */

	public VariableNotFoundException(String faultyExpression, String var) {
		super(faultyExpression);__CLR4_4_1babal3zcarcp.R.inc(407);try{__CLR4_4_1babal3zcarcp.R.inc(406);
		__CLR4_4_1babal3zcarcp.R.inc(408);this.var = var;
	}finally{__CLR4_4_1babal3zcarcp.R.flushNeeded();}}

	/**
	 * Constructor of VariableNotFoundException. This Constructor accepts only the
	 * unrecognized variable.
	 *
	 * @param var
	 *            the unrecognized variable
	 * @since 1.0
	 */

	public VariableNotFoundException(String var) {
		this("", var);__CLR4_4_1babal3zcarcp.R.inc(410);try{__CLR4_4_1babal3zcarcp.R.inc(409);
	}finally{__CLR4_4_1babal3zcarcp.R.flushNeeded();}}

	/**
	 * Gets the unrecognized variable.
	 *
	 * @return the unrecognized variable
	 * @since 1.0
	 */

	public String getVar() {try{__CLR4_4_1babal3zcarcp.R.inc(411);
		__CLR4_4_1babal3zcarcp.R.inc(412);return var;
	}finally{__CLR4_4_1babal3zcarcp.R.flushNeeded();}}
}

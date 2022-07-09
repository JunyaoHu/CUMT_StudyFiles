/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * MathParser contains methods for solving simple operations involving
 * arithmetic operators and functions. These methods can be accessed by
 * subclasses of MathParser.
 */

public class MathParser {public static class __CLR4_4_18b8bl3zcaraw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0043\u0061\u006c\u0063\u0075\u006c\u0061\u0074\u006f\u0072\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314766009L,8589935092L,394,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/**
	 * Checks whether the String passed to it can be parsed as a number.
	 * 
	 * @param str
	 *            the String to be tested
	 * @return true if the String can be parsed as a number
	 */

	protected static boolean isNumber(String str) {try{__CLR4_4_18b8bl3zcaraw.R.inc(299);
		__CLR4_4_18b8bl3zcaraw.R.inc(300);try {
			/* Return true only if parseDouble(String) doesn't complain! */
			__CLR4_4_18b8bl3zcaraw.R.inc(301);Double.parseDouble(str);
			__CLR4_4_18b8bl3zcaraw.R.inc(302);return true;
		} catch (Exception e) {
			__CLR4_4_18b8bl3zcaraw.R.inc(303);return false;
		}
	}finally{__CLR4_4_18b8bl3zcaraw.R.flushNeeded();}}

	/**
	 * Calculates the factorial of a number.
	 * 
	 * @param x
	 *            the number whose factorial is to be calculated
	 * @return the factorial of the number passed
	 */

	protected static double factorial(double x) {try{__CLR4_4_18b8bl3zcaraw.R.inc(304);
		/* Special cases! */
		__CLR4_4_18b8bl3zcaraw.R.inc(305);if ((((x < 2)&&(__CLR4_4_18b8bl3zcaraw.R.iget(306)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(307)==0&false)))
			{__CLR4_4_18b8bl3zcaraw.R.inc(308);return 1;
		}__CLR4_4_18b8bl3zcaraw.R.inc(309);double n = 1;
		__CLR4_4_18b8bl3zcaraw.R.inc(310);while ((((x > 0)&&(__CLR4_4_18b8bl3zcaraw.R.iget(311)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(312)==0&false)))
			{__CLR4_4_18b8bl3zcaraw.R.inc(313);n *= x--;
		}__CLR4_4_18b8bl3zcaraw.R.inc(314);return n;
	}finally{__CLR4_4_18b8bl3zcaraw.R.flushNeeded();}}

	/**
	 * Solves and returns the result of a simple binary expression. Only the
	 * following operators are supported :
	 * 
	 * <pre>
	 * {@code 
	 * 	^	-	power
	 *	/	-	division
	 *	*	-	multiplication
	 *	+	-	addition
	 *	-	-	subtraction}
	 * </pre>
	 *
	 * @param a
	 *            the operand on the left
	 * @param op
	 *            the opearator
	 * @param b
	 *            the operand on the right
	 * @return the result on evaluating the expression
	 */

	protected static double solveBinaryOperation(double a, String op, double b) {try{__CLR4_4_18b8bl3zcaraw.R.inc(315);
		__CLR4_4_18b8bl3zcaraw.R.inc(316);double result = 0.0;
		/*
		 * Match the operator against a list of supported ones, then perform the
		 * appropriate operation.
		 */
		__CLR4_4_18b8bl3zcaraw.R.inc(317);if ((((op.equals("^"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(318)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(319)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(320);result = Math.pow(a, b);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(321);if ((((op.equals("%"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(322)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(323)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(324);result = a % b;
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(325);if ((((op.equals("/"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(326)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(327)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(328);result = a / b;
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(329);if ((((op.equals("*"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(330)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(331)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(332);result = a * b;
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(333);if ((((op.equals("+"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(334)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(335)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(336);result = a + b;
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(337);if ((((op.equals("-"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(338)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(339)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(340);result = a - b;
		}
		}}}}}}__CLR4_4_18b8bl3zcaraw.R.inc(341);return result;
	}finally{__CLR4_4_18b8bl3zcaraw.R.flushNeeded();}}

	/**
	 * Solves and returns the result of an expression involving a function with only
	 * one operand. Only the following function names are supported :
	 * 
	 * <pre>
	 * {@code 
	 * 	abs	-	absolute value
	 *	fct	-	factorial
	 *	exp	-	exponentiation
	 *	log	-	logarithm (base 'e')
	 *	rad	-	convert degrees to radians
	 *	deg	-	convert radians to degrees
	 *	sin	\
	 *	cos 	|
	 *	tan	 \	standard trigonometric
	 *	sec	 /	functions
	 *	csc	|
	 *	ctn	/}
	 * </pre>
	 *
	 * @param func
	 *            the function name
	 * @param x
	 *            the operand
	 * @return the result on evaluating the expression
	 * @throws cn.edu.nju.ise.math.FunctionNotFoundException
	 *             thrown when func is not recognized
	 */

	protected static double solveUnaryFunction(String func, double x) throws FunctionNotFoundException {try{__CLR4_4_18b8bl3zcaraw.R.inc(342);
		__CLR4_4_18b8bl3zcaraw.R.inc(343);double result = 0.0;
		/*
		 * Math the function name against supported ones, then perform the appropriate
		 * operation.
		 */
		__CLR4_4_18b8bl3zcaraw.R.inc(344);if ((((func.equals("sin"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(345)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(346)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(347);result = Math.sin(x);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(348);if ((((func.equals("cos"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(349)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(350)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(351);result = Math.cos(x);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(352);if ((((func.equals("tan"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(353)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(354)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(355);result = Math.tan(x);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(356);if ((((func.equals("csc"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(357)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(358)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(359);result = 1.0 / Math.sin(x);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(360);if ((((func.equals("sec"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(361)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(362)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(363);result = 1.0 / Math.cos(x);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(364);if ((((func.equals("ctn"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(365)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(366)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(367);result = 1.0 / Math.tan(x);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(368);if ((((func.equals("rad"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(369)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(370)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(371);result = Math.toRadians(x);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(372);if ((((func.equals("deg"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(373)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(374)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(375);result = Math.toDegrees(x);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(376);if ((((func.equals("fct"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(377)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(378)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(379);result = factorial(x);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(380);if ((((func.equals("abs"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(381)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(382)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(383);result = Math.abs(x);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(384);if ((((func.equals("exp"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(385)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(386)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(387);result = Math.exp(x);
		} }else {__CLR4_4_18b8bl3zcaraw.R.inc(388);if ((((func.equals("log"))&&(__CLR4_4_18b8bl3zcaraw.R.iget(389)!=0|true))||(__CLR4_4_18b8bl3zcaraw.R.iget(390)==0&false))) {{
			__CLR4_4_18b8bl3zcaraw.R.inc(391);result = Math.log(x);
		} }else {{
			/*
			 * Throw an Exception if the function name does not match any supported one.
			 */
			__CLR4_4_18b8bl3zcaraw.R.inc(392);throw new FunctionNotFoundException(func + "[]");
		}
		}}}}}}}}}}}}__CLR4_4_18b8bl3zcaraw.R.inc(393);return result;
	}finally{__CLR4_4_18b8bl3zcaraw.R.flushNeeded();}}
}

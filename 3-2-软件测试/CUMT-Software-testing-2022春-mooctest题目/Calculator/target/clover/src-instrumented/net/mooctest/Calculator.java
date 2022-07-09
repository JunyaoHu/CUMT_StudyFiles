/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.Scanner;

/**
 * Calculator is a simple java application which parses mathematical expressions
 * and evaluates the result. Calculator can parse arithmetic operators as well
 * as some functions, store variables, and carry out some pre-defined commands.
 */
public class Calculator {public static class __CLR4_4_100l3zcar5v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0043\u0061\u006c\u0063\u0075\u006c\u0061\u0074\u006f\u0072\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314766009L,8589935092L,126,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/**
	 * Regex which matches a command. This is simply a string of characters
	 * following a forward slash (<code>/</code>).
	 */
	public static String commandRegex = "(\\s+)?(/)(.*)";

	/**
	 * Stores the previously calculated answer. This can be retrieved during runtime
	 * as a variable.
	 */
	public static String previousAns;

	/**
	 * ExpressionParser object which contains methods for parsing arithmetic
	 * expressions.
	 */
	public static ExpressionParser expParser;

	/**
	 * Evaluate a mathematical expression and return the result.
	 *
	 * @param exp
	 *            the expression to be parsed
	 * @return the evaluated result
	 * @throws cn.edu.nju.ise.math.ExpressionParserException
	 *             thrown when an exception is encountered while parsing the
	 *             expression
	 */
	public static String evaluate(String exp) throws ExpressionParserException {try{__CLR4_4_100l3zcar5v.R.inc(0);
		/*
		 * Substitute all indstances of '<ans>' with the previously evaluated answer in
		 * the cache
		 */
		__CLR4_4_100l3zcar5v.R.inc(1);exp = exp.replaceAll("<(\\s+)?ans(\\s+)?>", previousAns);
		/* Return the expression as evaluated by the ExpressionParser library */
		__CLR4_4_100l3zcar5v.R.inc(2);return expParser.evaluate(exp);
	}finally{__CLR4_4_100l3zcar5v.R.flushNeeded();}}

	/**
	 * Parses a command intended for the Calculator shell.
	 *
	 * @param command
	 *            the command to be parsed
	 * @throws CommandNotFoundException
	 *             thrown when an unrecognized command is passed here
	 */
	public static void parseCommand(String command) throws CommandNotFoundException {try{__CLR4_4_100l3zcar5v.R.inc(3);
		__CLR4_4_100l3zcar5v.R.inc(4);if ((((command.equals("exit"))&&(__CLR4_4_100l3zcar5v.R.iget(5)!=0|true))||(__CLR4_4_100l3zcar5v.R.iget(6)==0&false))) {{
			/* If the commmand is '/exit', display an exit message exit the runtime */
			__CLR4_4_100l3zcar5v.R.inc(7);System.out.print("$> Exiting !");
		} }else {__CLR4_4_100l3zcar5v.R.inc(8);if ((((command.equals("help"))&&(__CLR4_4_100l3zcar5v.R.iget(9)!=0|true))||(__CLR4_4_100l3zcar5v.R.iget(10)==0&false))) {{
			/* Display some general helptext */
			__CLR4_4_100l3zcar5v.R.inc(11);System.out.print("$> Calculator Helptext");
			__CLR4_4_100l3zcar5v.R.inc(12);System.out.print("\n   ~~~~~~~~~~~~~~~~~~~");
			__CLR4_4_100l3zcar5v.R.inc(13);System.out.print("\n	    Welcome to  'Calculator', a simple java application written to");
			__CLR4_4_100l3zcar5v.R.inc(14);System.out.print("\n	evaluate mathematical expressions.");
			__CLR4_4_100l3zcar5v.R.inc(15);System.out.print("\n	    This program displays a prompt (?>), after which you can enter");
			__CLR4_4_100l3zcar5v.R.inc(16);System.out.print("\n	a mathematical expression. 'Calculator' will display the result,");
			__CLR4_4_100l3zcar5v.R.inc(17);System.out.print("\n	or point out errors in the expression.");
			__CLR4_4_100l3zcar5v.R.inc(18);System.out.print("\n");
			__CLR4_4_100l3zcar5v.R.inc(19);System.out.print("\n	    'Calculator' can evaluate simple arithmetic expressions, using the");
			__CLR4_4_100l3zcar5v.R.inc(20);System.out.print("\n	operators (+, -, *, /, ^(power)), as well as parenthesis ('(', ')').");
			__CLR4_4_100l3zcar5v.R.inc(21);System.out.print("\n	'Calculator' follows the BODMAS rule.");
			__CLR4_4_100l3zcar5v.R.inc(22);System.out.print("\n");
			__CLR4_4_100l3zcar5v.R.inc(23);System.out.print("\n	    Following are some valid expressions : ");
			__CLR4_4_100l3zcar5v.R.inc(24);System.out.print("\n		1 + 1			=>		 2.0");
			__CLR4_4_100l3zcar5v.R.inc(25);System.out.print("\n		1 * (2 + 3)		=>		 5.0");
			__CLR4_4_100l3zcar5v.R.inc(26);System.out.print("\n		10 * (64 ^ -0.5)	=>		1.25");
			__CLR4_4_100l3zcar5v.R.inc(27);System.out.print("\n");
			__CLR4_4_100l3zcar5v.R.inc(28);System.out.print("\n	    For help on more advanced topics, try entering the following : ");
			__CLR4_4_100l3zcar5v.R.inc(29);System.out.print("\n		/help vars		>	help on Variables");
			__CLR4_4_100l3zcar5v.R.inc(30);System.out.print("\n		/help funcs		>	help on Functions");
			__CLR4_4_100l3zcar5v.R.inc(31);System.out.print("\n		/help cmds		>	help on Commands");
			__CLR4_4_100l3zcar5v.R.inc(32);System.out.print("\n");
			__CLR4_4_100l3zcar5v.R.inc(33);System.out.print("\n	    Enter '/list' for a complete list of valid commands.");
		} }else {__CLR4_4_100l3zcar5v.R.inc(34);if ((((command.equals("help vars"))&&(__CLR4_4_100l3zcar5v.R.iget(35)!=0|true))||(__CLR4_4_100l3zcar5v.R.iget(36)==0&false))) {{
			/* Display help on 'variables' */
			__CLR4_4_100l3zcar5v.R.inc(37);System.out.print("\n$> Variables");
			__CLR4_4_100l3zcar5v.R.inc(38);System.out.print("\n   `````````");
			__CLR4_4_100l3zcar5v.R.inc(39);System.out.print("\n	    'Calculator' can also store user-defined variables.");
			__CLR4_4_100l3zcar5v.R.inc(40);System.out.print("\n	The syntax for assigning and using variables is as follows : ");
			__CLR4_4_100l3zcar5v.R.inc(41);System.out.print("\n		var = value		>	assign 'value' to 'var'");
			__CLR4_4_100l3zcar5v.R.inc(42);System.out.print("\n		<var>			>	<var> will be replaced");
			__CLR4_4_100l3zcar5v.R.inc(43);System.out.print("\n						its value.");
			__CLR4_4_100l3zcar5v.R.inc(44);System.out.print("\n");
			__CLR4_4_100l3zcar5v.R.inc(45);System.out.print("\n	    Following are some valid uses of variables : ");
			__CLR4_4_100l3zcar5v.R.inc(46);System.out.print("\n		x = 3			=>		 3.0");
			__CLR4_4_100l3zcar5v.R.inc(47);System.out.print("\n		y = <x> + 1		=>		 4.0");
			__CLR4_4_100l3zcar5v.R.inc(48);System.out.print("\n		(<x>^2 + <y>^2)^0.5	=>		 5.0 ");
			__CLR4_4_100l3zcar5v.R.inc(49);System.out.print("\n");
			__CLR4_4_100l3zcar5v.R.inc(50);System.out.print("\n	    Nesting of assignments is also supported, as follows : ");
			__CLR4_4_100l3zcar5v.R.inc(51);System.out.print("\n		x = 1 + (y = 1)		=>		 2.0");
			__CLR4_4_100l3zcar5v.R.inc(52);System.out.print("\n		<x>			=>		 2.0");
			__CLR4_4_100l3zcar5v.R.inc(53);System.out.print("\n		<y>			=>		 1.0");
			__CLR4_4_100l3zcar5v.R.inc(54);System.out.print("\n");
			__CLR4_4_100l3zcar5v.R.inc(55);System.out.print("\n	    A special variable <ans> stores the previous expression.");
			__CLR4_4_100l3zcar5v.R.inc(56);System.out.print("\n	Thus, the following is valid : ");
			__CLR4_4_100l3zcar5v.R.inc(57);System.out.print("\n		1 * 2 * 3 * 4		=>		24.0");
			__CLR4_4_100l3zcar5v.R.inc(58);System.out.print("\n		<ans> * 5		=>	       120.0");
			__CLR4_4_100l3zcar5v.R.inc(59);System.out.print("\n");
			__CLR4_4_100l3zcar5v.R.inc(60);System.out.print("\n	    Enter '/list vars' for a list of stored variables.");
		} }else {__CLR4_4_100l3zcar5v.R.inc(61);if ((((command.equals("help funcs"))&&(__CLR4_4_100l3zcar5v.R.iget(62)!=0|true))||(__CLR4_4_100l3zcar5v.R.iget(63)==0&false))) {{
			/* Display help on 'funcitons' */
			__CLR4_4_100l3zcar5v.R.inc(64);System.out.print("\n$> Functions");
			__CLR4_4_100l3zcar5v.R.inc(65);System.out.print("\n   `````````");
			__CLR4_4_100l3zcar5v.R.inc(66);System.out.print("\n	    'Calculator' supports the use of some basic functions.");
			__CLR4_4_100l3zcar5v.R.inc(67);System.out.print("\n	They can be used with the following syntax : ");
			__CLR4_4_100l3zcar5v.R.inc(68);System.out.print("\n		fnc[ value ]		>	evaluate 'fnc' of 'value'");
			__CLR4_4_100l3zcar5v.R.inc(69);System.out.print("\n");
			__CLR4_4_100l3zcar5v.R.inc(70);System.out.print("\n	    Following are some valid uses of functions : ");
			__CLR4_4_100l3zcar5v.R.inc(71);System.out.print("\n		sin[<pi> / 2]		=>		 1.0");
			__CLR4_4_100l3zcar5v.R.inc(72);System.out.print("\n		1 + abs[2 - 3]		=>		 2.0");
			__CLR4_4_100l3zcar5v.R.inc(73);System.out.print("\n		log[<e> ^ 3]		=>		 3.0");
			__CLR4_4_100l3zcar5v.R.inc(74);System.out.print("\n");
			__CLR4_4_100l3zcar5v.R.inc(75);System.out.print("\n 	    Enter '/list funcs' for a list of valid functions.");
		} }else {__CLR4_4_100l3zcar5v.R.inc(76);if ((((command.equals("help cmds"))&&(__CLR4_4_100l3zcar5v.R.iget(77)!=0|true))||(__CLR4_4_100l3zcar5v.R.iget(78)==0&false))) {{
			/* Display help on 'commands' */
			__CLR4_4_100l3zcar5v.R.inc(79);System.out.print("\n$> Commands");
			__CLR4_4_100l3zcar5v.R.inc(80);System.out.print("\n   ````````");
			__CLR4_4_100l3zcar5v.R.inc(81);System.out.print("\n	    'Calculator' interprets expressions starting with '/' as");
			__CLR4_4_100l3zcar5v.R.inc(82);System.out.print("\n	'commands'. These are special expressions which are not parsed as");
			__CLR4_4_100l3zcar5v.R.inc(83);System.out.print("\n	mathematical expressions, but as instructions to the 'Calculator'.");
			__CLR4_4_100l3zcar5v.R.inc(84);System.out.print("\n");
			__CLR4_4_100l3zcar5v.R.inc(85);System.out.print("\n	    Enter '/list' for a complete list of valid commands.");
		} }else {__CLR4_4_100l3zcar5v.R.inc(86);if ((((command.equals("list") || command.equals("list cmds"))&&(__CLR4_4_100l3zcar5v.R.iget(87)!=0|true))||(__CLR4_4_100l3zcar5v.R.iget(88)==0&false))) {{
			/* Display a list of valid, acceptable commands */
			__CLR4_4_100l3zcar5v.R.inc(89);System.out.print("$> Commands : \n");
			__CLR4_4_100l3zcar5v.R.inc(90);System.out.print("\n	/help				>	general help");
			__CLR4_4_100l3zcar5v.R.inc(91);System.out.print("\n	/help vars			>	help on Variables");
			__CLR4_4_100l3zcar5v.R.inc(92);System.out.print("\n	/help funcs			>	help on Functions");
			__CLR4_4_100l3zcar5v.R.inc(93);System.out.print("\n	/help cmds			>	help on Commands");
			__CLR4_4_100l3zcar5v.R.inc(94);System.out.print("\n	/list vars			>	list variables");
			__CLR4_4_100l3zcar5v.R.inc(95);System.out.print("\n	/list funcs			>	list functions");
			__CLR4_4_100l3zcar5v.R.inc(96);System.out.print("\n	/list cmds  or  /list		>	list commands");
			__CLR4_4_100l3zcar5v.R.inc(97);System.out.print("\n	/exit				>	exit Calculator");
		} }else {__CLR4_4_100l3zcar5v.R.inc(98);if ((((command.equals("list vars"))&&(__CLR4_4_100l3zcar5v.R.iget(99)!=0|true))||(__CLR4_4_100l3zcar5v.R.iget(100)==0&false))) {{
			/*
			 * Display a list of defined variables, currently stored in the ExpressionParser
			 */
			__CLR4_4_100l3zcar5v.R.inc(101);System.out.print("$> Variables : \n");
			/* Loop through the variables in the array belonging to the ExpressionParser */
			__CLR4_4_100l3zcar5v.R.inc(102);for (int i = 0; (((i < expParser.numberOfVars)&&(__CLR4_4_100l3zcar5v.R.iget(103)!=0|true))||(__CLR4_4_100l3zcar5v.R.iget(104)==0&false)); i++) {{
				/* Pretty-print the variables */
				__CLR4_4_100l3zcar5v.R.inc(105);System.out.printf("%n\t%-16s=%30s", expParser.variables[i][0], expParser.variables[i][1]);
			}
			/* Display the previously evaluated answer as a special variable : 'ans' */
			}__CLR4_4_100l3zcar5v.R.inc(106);System.out.printf("%n\t%-16s=%30s", "ans", previousAns);
		} }else {__CLR4_4_100l3zcar5v.R.inc(107);if ((((command.equals("list funcs"))&&(__CLR4_4_100l3zcar5v.R.iget(108)!=0|true))||(__CLR4_4_100l3zcar5v.R.iget(109)==0&false))) {{
			/* Display a list of valid functions */
			__CLR4_4_100l3zcar5v.R.inc(110);System.out.print("$ Functions : \n");
			__CLR4_4_100l3zcar5v.R.inc(111);System.out.print("\n	abs[ x ]	>	      absolute value of <x>");
			__CLR4_4_100l3zcar5v.R.inc(112);System.out.print("\n	exp[ x ]	>	      exponent of <x> (<e> ^ <x>)");
			__CLR4_4_100l3zcar5v.R.inc(113);System.out.print("\n	log[ x ]	>	      logarithm of <x> (base <e>)");
			__CLR4_4_100l3zcar5v.R.inc(114);System.out.print("\n	fct[ x ] or x!	>	      factorial of <x>");
			__CLR4_4_100l3zcar5v.R.inc(115);System.out.print("\n	deg[ x ]	>	      convert <x> to degrees from radians");
			__CLR4_4_100l3zcar5v.R.inc(116);System.out.print("\n	rad[ x ]	>	      convert <x> to radians from degrees");
			__CLR4_4_100l3zcar5v.R.inc(117);System.out.print("\n	        	_            ");
			__CLR4_4_100l3zcar5v.R.inc(118);System.out.print("\n	sin[ x ]	 |	      ");
			__CLR4_4_100l3zcar5v.R.inc(119);System.out.print("\n	cos[ x ]	 |	      ");
			__CLR4_4_100l3zcar5v.R.inc(120);System.out.print("\n	tan[ x ]	  >	      trigonometric functions");
			__CLR4_4_100l3zcar5v.R.inc(121);System.out.print("\n	csc[ x ]	 |	         ( <x> in radians )");
			__CLR4_4_100l3zcar5v.R.inc(122);System.out.print("\n	sec[ x ]	 |	      ");
			__CLR4_4_100l3zcar5v.R.inc(123);System.out.print("\n	ctn[ x ]	 |	      ");
			__CLR4_4_100l3zcar5v.R.inc(124);System.out.print("\n	        	~             ");
		} }else {{
			/* Throw an Exception if the command does not match any of the above */
			__CLR4_4_100l3zcar5v.R.inc(125);throw new CommandNotFoundException(command);
		}
	}}}}}}}}}finally{__CLR4_4_100l3zcar5v.R.flushNeeded();}}
}

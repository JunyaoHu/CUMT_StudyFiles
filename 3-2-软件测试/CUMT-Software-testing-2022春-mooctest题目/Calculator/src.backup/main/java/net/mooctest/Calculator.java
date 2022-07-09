package net.mooctest;

import java.util.Scanner;

/**
 * Calculator is a simple java application which parses mathematical expressions
 * and evaluates the result. Calculator can parse arithmetic operators as well
 * as some functions, store variables, and carry out some pre-defined commands.
 */
public class Calculator {

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
	public static String evaluate(String exp) throws ExpressionParserException {
		/*
		 * Substitute all indstances of '<ans>' with the previously evaluated answer in
		 * the cache
		 */
		exp = exp.replaceAll("<(\\s+)?ans(\\s+)?>", previousAns);
		/* Return the expression as evaluated by the ExpressionParser library */
		return expParser.evaluate(exp);
	}

	/**
	 * Parses a command intended for the Calculator shell.
	 *
	 * @param command
	 *            the command to be parsed
	 * @throws CommandNotFoundException
	 *             thrown when an unrecognized command is passed here
	 */
	public static void parseCommand(String command) throws CommandNotFoundException {
		if (command.equals("exit")) {
			/* If the commmand is '/exit', display an exit message exit the runtime */
			System.out.print("$> Exiting !");
		} else if (command.equals("help")) {
			/* Display some general helptext */
			System.out.print("$> Calculator Helptext");
			System.out.print("\n   ~~~~~~~~~~~~~~~~~~~");
			System.out.print("\n	    Welcome to  'Calculator', a simple java application written to");
			System.out.print("\n	evaluate mathematical expressions.");
			System.out.print("\n	    This program displays a prompt (?>), after which you can enter");
			System.out.print("\n	a mathematical expression. 'Calculator' will display the result,");
			System.out.print("\n	or point out errors in the expression.");
			System.out.print("\n");
			System.out.print("\n	    'Calculator' can evaluate simple arithmetic expressions, using the");
			System.out.print("\n	operators (+, -, *, /, ^(power)), as well as parenthesis ('(', ')').");
			System.out.print("\n	'Calculator' follows the BODMAS rule.");
			System.out.print("\n");
			System.out.print("\n	    Following are some valid expressions : ");
			System.out.print("\n		1 + 1			=>		 2.0");
			System.out.print("\n		1 * (2 + 3)		=>		 5.0");
			System.out.print("\n		10 * (64 ^ -0.5)	=>		1.25");
			System.out.print("\n");
			System.out.print("\n	    For help on more advanced topics, try entering the following : ");
			System.out.print("\n		/help vars		>	help on Variables");
			System.out.print("\n		/help funcs		>	help on Functions");
			System.out.print("\n		/help cmds		>	help on Commands");
			System.out.print("\n");
			System.out.print("\n	    Enter '/list' for a complete list of valid commands.");
		} else if (command.equals("help vars")) {
			/* Display help on 'variables' */
			System.out.print("\n$> Variables");
			System.out.print("\n   `````````");
			System.out.print("\n	    'Calculator' can also store user-defined variables.");
			System.out.print("\n	The syntax for assigning and using variables is as follows : ");
			System.out.print("\n		var = value		>	assign 'value' to 'var'");
			System.out.print("\n		<var>			>	<var> will be replaced");
			System.out.print("\n						its value.");
			System.out.print("\n");
			System.out.print("\n	    Following are some valid uses of variables : ");
			System.out.print("\n		x = 3			=>		 3.0");
			System.out.print("\n		y = <x> + 1		=>		 4.0");
			System.out.print("\n		(<x>^2 + <y>^2)^0.5	=>		 5.0 ");
			System.out.print("\n");
			System.out.print("\n	    Nesting of assignments is also supported, as follows : ");
			System.out.print("\n		x = 1 + (y = 1)		=>		 2.0");
			System.out.print("\n		<x>			=>		 2.0");
			System.out.print("\n		<y>			=>		 1.0");
			System.out.print("\n");
			System.out.print("\n	    A special variable <ans> stores the previous expression.");
			System.out.print("\n	Thus, the following is valid : ");
			System.out.print("\n		1 * 2 * 3 * 4		=>		24.0");
			System.out.print("\n		<ans> * 5		=>	       120.0");
			System.out.print("\n");
			System.out.print("\n	    Enter '/list vars' for a list of stored variables.");
		} else if (command.equals("help funcs")) {
			/* Display help on 'funcitons' */
			System.out.print("\n$> Functions");
			System.out.print("\n   `````````");
			System.out.print("\n	    'Calculator' supports the use of some basic functions.");
			System.out.print("\n	They can be used with the following syntax : ");
			System.out.print("\n		fnc[ value ]		>	evaluate 'fnc' of 'value'");
			System.out.print("\n");
			System.out.print("\n	    Following are some valid uses of functions : ");
			System.out.print("\n		sin[<pi> / 2]		=>		 1.0");
			System.out.print("\n		1 + abs[2 - 3]		=>		 2.0");
			System.out.print("\n		log[<e> ^ 3]		=>		 3.0");
			System.out.print("\n");
			System.out.print("\n 	    Enter '/list funcs' for a list of valid functions.");
		} else if (command.equals("help cmds")) {
			/* Display help on 'commands' */
			System.out.print("\n$> Commands");
			System.out.print("\n   ````````");
			System.out.print("\n	    'Calculator' interprets expressions starting with '/' as");
			System.out.print("\n	'commands'. These are special expressions which are not parsed as");
			System.out.print("\n	mathematical expressions, but as instructions to the 'Calculator'.");
			System.out.print("\n");
			System.out.print("\n	    Enter '/list' for a complete list of valid commands.");
		} else if (command.equals("list") || command.equals("list cmds")) {
			/* Display a list of valid, acceptable commands */
			System.out.print("$> Commands : \n");
			System.out.print("\n	/help				>	general help");
			System.out.print("\n	/help vars			>	help on Variables");
			System.out.print("\n	/help funcs			>	help on Functions");
			System.out.print("\n	/help cmds			>	help on Commands");
			System.out.print("\n	/list vars			>	list variables");
			System.out.print("\n	/list funcs			>	list functions");
			System.out.print("\n	/list cmds  or  /list		>	list commands");
			System.out.print("\n	/exit				>	exit Calculator");
		} else if (command.equals("list vars")) {
			/*
			 * Display a list of defined variables, currently stored in the ExpressionParser
			 */
			System.out.print("$> Variables : \n");
			/* Loop through the variables in the array belonging to the ExpressionParser */
			for (int i = 0; i < expParser.numberOfVars; i++) {
				/* Pretty-print the variables */
				System.out.printf("%n\t%-16s=%30s", expParser.variables[i][0], expParser.variables[i][1]);
			}
			/* Display the previously evaluated answer as a special variable : 'ans' */
			System.out.printf("%n\t%-16s=%30s", "ans", previousAns);
		} else if (command.equals("list funcs")) {
			/* Display a list of valid functions */
			System.out.print("$ Functions : \n");
			System.out.print("\n	abs[ x ]	>	      absolute value of <x>");
			System.out.print("\n	exp[ x ]	>	      exponent of <x> (<e> ^ <x>)");
			System.out.print("\n	log[ x ]	>	      logarithm of <x> (base <e>)");
			System.out.print("\n	fct[ x ] or x!	>	      factorial of <x>");
			System.out.print("\n	deg[ x ]	>	      convert <x> to degrees from radians");
			System.out.print("\n	rad[ x ]	>	      convert <x> to radians from degrees");
			System.out.print("\n	        	_            ");
			System.out.print("\n	sin[ x ]	 |	      ");
			System.out.print("\n	cos[ x ]	 |	      ");
			System.out.print("\n	tan[ x ]	  >	      trigonometric functions");
			System.out.print("\n	csc[ x ]	 |	         ( <x> in radians )");
			System.out.print("\n	sec[ x ]	 |	      ");
			System.out.print("\n	ctn[ x ]	 |	      ");
			System.out.print("\n	        	~             ");
		} else {
			/* Throw an Exception if the command does not match any of the above */
			throw new CommandNotFoundException(command);
		}
	}
}

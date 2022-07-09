/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * ExpressionParser provides methods for evaluating mathematical expressions,
 * specifically tailored for parsing with this library. ExpressionParser
 * supports basic arithmetic operators, parenthesized expressions, variable
 * substitution as well as basic functions.
 */
public class ExpressionParser extends MathParser {public static class __CLR4_4_13n3nl3zcar8r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0043\u0061\u006c\u0063\u0075\u006c\u0061\u0074\u006f\u0072\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314766009L,8589935092L,287,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/**
	 * Regex which matches a number. It may be signed or use scientific notation.
	 */
	protected static final String numberRegex = "(([+-]?)\\d+(\\.\\d+)?([eE](-?)\\d+)?)";

	/**
	 * Regex which matches a signed number. It may use scientific notation.
	 */
	protected static final String signedNumberRegex = "([+-]\\d+(\\.\\d+)?([eE](-?)\\d+)?)";

	/**
	 * Regex which matches an assignment statement. It is simply a word, followed by
	 * an equals sign (=) and an expression.
	 */
	protected static final String assignmentRegex = "(\\s+)?(\\w+)(\\s+)(=)(.*)";

	/**
	 * Array of supported operators. The operators are arranged in their order of
	 * precedence. Thus, operators to the left will be evaluated before those to the
	 * right.
	 */
	protected static final String[] operators = { "^", "%", "/", "*", "+", "-" };

	/**
	 * Array of variables maintained by an ExpressionParser object. The first String
	 * in each line stores the variable name, whicle the second stores the value.
	 */
	public String[][] variables;

	/**
	 * Index of the last variable in the 'variables' array. Elements in the
	 * 'variables' array after this index are all blank, so they are not parsed
	 * during expression evaluation.
	 */
	public int numberOfVars;

	/**
	 * Constructor of ExpressionParser. This constructor initializes the variable
	 * cache with the specified maximum size.
	 * 
	 * @param maxVars
	 *            the maximum number of variables to be stored
	 */
	public ExpressionParser(int maxVars) {try{__CLR4_4_13n3nl3zcar8r.R.inc(131);
		__CLR4_4_13n3nl3zcar8r.R.inc(132);variables = new String[maxVars][2];
		__CLR4_4_13n3nl3zcar8r.R.inc(133);numberOfVars = 0;
	}finally{__CLR4_4_13n3nl3zcar8r.R.flushNeeded();}}

	/**
	 * Adds a variable to the variable cache. This method accepts the variable name,
	 * as well as the String each occurrence is to be substituted with.
	 *
	 * @param name
	 *            the name of the variable
	 * @param value
	 *            the value the variable holds
	 */
	public void addVariable(String name, String value) {try{__CLR4_4_13n3nl3zcar8r.R.inc(134);
		/* Loop through the stored variables */
		__CLR4_4_13n3nl3zcar8r.R.inc(135);for (int i = 0; (((i < numberOfVars)&&(__CLR4_4_13n3nl3zcar8r.R.iget(136)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(137)==0&false)); i++) {{
			/* If the variable already exists, simply update the value */
			__CLR4_4_13n3nl3zcar8r.R.inc(138);if ((((variables[i][0].equals(name))&&(__CLR4_4_13n3nl3zcar8r.R.iget(139)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(140)==0&false))) {{
				__CLR4_4_13n3nl3zcar8r.R.inc(141);variables[i][1] = value;
				__CLR4_4_13n3nl3zcar8r.R.inc(142);return;
			}
		}}
		/*
		 * Create a new variable by storing the name and value in the variables array,
		 * then update numberOfVars
		 */
		}__CLR4_4_13n3nl3zcar8r.R.inc(143);variables[numberOfVars][0] = name;
		__CLR4_4_13n3nl3zcar8r.R.inc(144);variables[numberOfVars][1] = value;
		__CLR4_4_13n3nl3zcar8r.R.inc(145);numberOfVars++;
	}finally{__CLR4_4_13n3nl3zcar8r.R.flushNeeded();}}

	/**
	 * Evaluates a String representation of a mathematical expression into a number
	 * (stored as a String).
	 *
	 * @param exp
	 *            the expression to be evaluated
	 * @return the result after evaluating the expression
	 * @throws cn.edu.nju.ise.math.NullExpressionException
	 *             thrown when the expression is empty
	 * @throws cn.edu.nju.ise.math.ExpressionParserException
	 *             thrown when the expression cannot be parsed
	 */
	public String evaluate(String exp) throws ExpressionParserException {try{__CLR4_4_13n3nl3zcar8r.R.inc(146);
		__CLR4_4_13n3nl3zcar8r.R.inc(147);String result = exp;
		__CLR4_4_13n3nl3zcar8r.R.inc(148);if ((((exp.trim().length() == 0)&&(__CLR4_4_13n3nl3zcar8r.R.iget(149)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(150)==0&false))) {{
			/* Throw an Exception if the expression is blank */
			__CLR4_4_13n3nl3zcar8r.R.inc(151);throw new NullExpressionException();
		} }else {__CLR4_4_13n3nl3zcar8r.R.inc(152);if ((((isNumber(exp))&&(__CLR4_4_13n3nl3zcar8r.R.iget(153)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(154)==0&false))) {{
			/* If the expression is already a number, there is nothing to evaluate */
			__CLR4_4_13n3nl3zcar8r.R.inc(155);return "" + Double.parseDouble(exp);
		} }else {__CLR4_4_13n3nl3zcar8r.R.inc(156);if ((((exp.matches(assignmentRegex))&&(__CLR4_4_13n3nl3zcar8r.R.iget(157)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(158)==0&false))) {{
			/*
			 * If the expression is an assignment statement, interpret everything before the
			 * equals sign (=) as the variable name. The rest is simply another expression,
			 * which is also the value of the variable.
			 */
			__CLR4_4_13n3nl3zcar8r.R.inc(159);String varName = exp.substring(0, exp.indexOf("=")).trim();
			__CLR4_4_13n3nl3zcar8r.R.inc(160);String varValue = evaluate(exp.substring(exp.indexOf("=") + 1));

			/*
			 * Add the variable in the cache, then use the value of the variable as the
			 * evaluated result
			 */
			__CLR4_4_13n3nl3zcar8r.R.inc(161);addVariable(varName, varValue);
			__CLR4_4_13n3nl3zcar8r.R.inc(162);exp = varValue;
		} }else {{
			/*
			 * Replace all variables with their values, solve everything within parenthesis,
			 * then Solve all functions
			 */
			__CLR4_4_13n3nl3zcar8r.R.inc(163);exp = parseVariables(exp);
			__CLR4_4_13n3nl3zcar8r.R.inc(164);exp = parseParenthesis(exp);
			__CLR4_4_13n3nl3zcar8r.R.inc(165);exp = parseFunctions(exp);

			/*
			 * The expression is now simply a collection of numbers and arithmetic
			 * operators. Finish off the process by solving each operation, following the
			 * BODMAS rule.
			 */
			__CLR4_4_13n3nl3zcar8r.R.inc(166);exp = parseOperators(exp);
		}

		}}}__CLR4_4_13n3nl3zcar8r.R.inc(167);try {
			/* Check if the result is a valid number */
			__CLR4_4_13n3nl3zcar8r.R.inc(168);result = "" + Double.parseDouble(exp);
		} catch (Exception e) {
			/* Throw an Exception if the result is not a number */
			__CLR4_4_13n3nl3zcar8r.R.inc(169);throw new ExpressionParserException(exp);
		}
		__CLR4_4_13n3nl3zcar8r.R.inc(170);return result;
	}finally{__CLR4_4_13n3nl3zcar8r.R.flushNeeded();}}

	/**
	 * Substitutes all instances of the variables in the cache with their values. A
	 * variable name present in the expression must be enclosed within angled
	 * brackets (<code>&#60;</code>, <code>&#62;</code>) in order to be recognized.
	 * For example, if <code>x = 10.0</code>, then all instances of
	 * <code>&#60;x&#62;</code> will be replaced with <code>10.0</code>
	 *
	 * @param exp
	 *            the expression to be parsed
	 * @return the expression after substituting known values of variables stored in
	 *         the cache
	 * @throws cn.edu.nju.ise.math.VariableNotFoundException
	 *             thrown when an unrecognized variable name is found in the
	 *             expression
	 */

	protected String parseVariables(String exp) throws VariableNotFoundException {try{__CLR4_4_13n3nl3zcar8r.R.inc(171);
		/*
		 * Loop through the variable cache, checking for occurrences of the variables
		 * (enclosed within angled brackets)(<var_name>)
		 */
		__CLR4_4_13n3nl3zcar8r.R.inc(172);for (int i = 0; (((i < numberOfVars)&&(__CLR4_4_13n3nl3zcar8r.R.iget(173)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(174)==0&false)); i++) {{
			/* Replace all instances of the variable with its value directly */
			__CLR4_4_13n3nl3zcar8r.R.inc(175);exp = exp.replaceAll("<(\\s+)?" + variables[i][0] + "(\\s+)?>", variables[i][1]);
		}

		/*
		 * Check if any unrecognized variables are present. This can be done very simply
		 * as the presence of angled brackets (<>) indicates an unreplaced variable.
		 */
		}__CLR4_4_13n3nl3zcar8r.R.inc(176);int start = exp.indexOf("<");
		__CLR4_4_13n3nl3zcar8r.R.inc(177);int end = exp.indexOf(">");
		__CLR4_4_13n3nl3zcar8r.R.inc(178);if ((((start != -1 && end != -1 && start < end)&&(__CLR4_4_13n3nl3zcar8r.R.iget(179)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(180)==0&false))) {{
			/*
			 * Extract the unreplaced variable name, which is clearly in between the angled
			 * brackets, then throw an Exception.
			 */
			__CLR4_4_13n3nl3zcar8r.R.inc(181);throw new VariableNotFoundException(exp, exp.substring(start, end + 1));
		}

		/*
		 * Adjust the number spacing before passing the expression back to the evaluater
		 */
		}__CLR4_4_13n3nl3zcar8r.R.inc(182);exp = adjustNumberSpacing(exp);
		__CLR4_4_13n3nl3zcar8r.R.inc(183);return exp.trim();
	}finally{__CLR4_4_13n3nl3zcar8r.R.flushNeeded();}}

	/**
	 * Substitutes expressions within parenthesis (<code>(</code>, <code>)</code>)
	 * with their results. This ensures that while evaluating an expression
	 * containing parenthesized parts, those parenthesized parts are evaluated
	 * first. This is done so that ExpressionParser follows the BODMAS rule.
	 *
	 * @param exp
	 *            the expression to be parsed
	 * @return the expression such that all parenthesized parts have been evaluated
	 * @throws cn.edu.nju.ise.math.UnmatchedBracketsException
	 *             thrown when brackets in the expression are not closed
	 * @throws cn.edu.nju.ise.math.ExpressionParserException
	 *             thrown if the parenthesized sections cannot be parsed
	 */

	protected String parseParenthesis(String exp) throws ExpressionParserException {try{__CLR4_4_13n3nl3zcar8r.R.inc(184);
		__CLR4_4_13n3nl3zcar8r.R.inc(185);String result = "";
		/*
		 * Buffer the extreme ends with spaces, to make sure no Exceptions are thrown
		 * while extracting portions of the expression.
		 */
		__CLR4_4_13n3nl3zcar8r.R.inc(186);exp = " " + exp + " ";

		/*
		 * Continue replacing parenthesized sections as long as a parenthesis is present
		 */
		__CLR4_4_13n3nl3zcar8r.R.inc(187);while ((((exp.indexOf("(") != -1)&&(__CLR4_4_13n3nl3zcar8r.R.iget(188)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(189)==0&false))) {{
			/* Store the indices of the opening and closing parenthesis */
			__CLR4_4_13n3nl3zcar8r.R.inc(190);int start = exp.indexOf("(");
			__CLR4_4_13n3nl3zcar8r.R.inc(191);int end = indexOfMatchingBracket(exp, start, '(', ')');
			/*
			 * The enclosed section is simply another expression. Pass it to the evaluater
			 */
			__CLR4_4_13n3nl3zcar8r.R.inc(192);result = evaluate(exp.substring(start + 1, end));

			/*
			 * This is a special case. Make sure that ' -(some_expression) ' is interpreted
			 * as the negative of that expression.
			 */
			__CLR4_4_13n3nl3zcar8r.R.inc(193);if ((((exp.charAt(start - 1) == '-')&&(__CLR4_4_13n3nl3zcar8r.R.iget(194)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(195)==0&false))) {{
				/* Multiply the enclosed section by -1, then evaluate the result */
				__CLR4_4_13n3nl3zcar8r.R.inc(196);result = " ( -1 * ( " + result + " ) ) ";
				__CLR4_4_13n3nl3zcar8r.R.inc(197);start--;
			}

			/*
			 * Graft the evaluated parenthesized portion back into the original expression
			 */
			}__CLR4_4_13n3nl3zcar8r.R.inc(198);exp = exp.substring(0, start) + " " // before the opening bracket
					+ result + " " // evaluated part
					+ exp.substring(end + 1); // after the closing bracket
		}
		/*
		 * Adjust the number spacing before passing the expression back to the evaluater
		 */
		}__CLR4_4_13n3nl3zcar8r.R.inc(199);exp = adjustNumberSpacing(exp);
		__CLR4_4_13n3nl3zcar8r.R.inc(200);return exp.trim();
	}finally{__CLR4_4_13n3nl3zcar8r.R.flushNeeded();}}

	/**
	 * Substitutes all occurrences of supported mathematical functions with their
	 * result. A function must be present in the expression in the following format
	 * : <code>function_name[function_argument]</code>, where the function argument
	 * can also be an expression. The function name must be exactly 3 characters
	 * long, and be immediately followed by a sqaure bracket (<code>[</code>).
	 *
	 * @param exp
	 *            the expression to be parsed
	 * @return the expression such that all instances of functions are evaluated
	 * @throws cn.edu.nju.ise.math.MissingOperandException
	 *             thrown if there is no function argument
	 * @throws cn.edu.nju.ise.math.FunctionNotFoundException
	 *             thrown when an unrecognized function name is found in the
	 *             expression
	 * @throws cn.edu.nju.ise.math.UnmatchedBracketsException
	 *             thrown when a square bracket is not closed
	 * @throws cn.edu.nju.ise.math.ExpressionParserException
	 *             thrown if the function argument cannot be parsed
	 */
	protected String parseFunctions(String exp) throws ExpressionParserException {try{__CLR4_4_13n3nl3zcar8r.R.inc(201);
		__CLR4_4_13n3nl3zcar8r.R.inc(202);String result = "";
		__CLR4_4_13n3nl3zcar8r.R.inc(203);String func = "";
		__CLR4_4_13n3nl3zcar8r.R.inc(204);double x = 0.0;
		/*
		 * Buffer the extreme ends with spaces, to make sure no Exceptions are thrown
		 * while extracting portions of the expression.
		 */
		__CLR4_4_13n3nl3zcar8r.R.inc(205);exp = " " + exp + " ";
		__CLR4_4_13n3nl3zcar8r.R.inc(206);try {
			/*
			 * This is another special case. Make sure that expressions of the form
			 * 'number!' are interpreted as the factorial of that number. This can be done
			 * simply by replacing all such cases with the expression 'fct[number]', as
			 * 'fct[]' is a valid function name and can be calculated later.
			 */
			__CLR4_4_13n3nl3zcar8r.R.inc(207);exp = exp.replaceAll(numberRegex + "\\s+!", " fct[$1] ");

			/*
			 * Continue evaluating functions as long as square brackets ([]) are present.
			 * Here, a function is reperssented in the format 'fnc[expression]'. Thus, the
			 * presence of square brackets ([]) implies that a function is present.
			 */
			__CLR4_4_13n3nl3zcar8r.R.inc(208);while ((((exp.indexOf("[") != -1)&&(__CLR4_4_13n3nl3zcar8r.R.iget(209)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(210)==0&false))) {{
				/* Store the indices of the opening and closing square brackets */
				__CLR4_4_13n3nl3zcar8r.R.inc(211);int start = exp.indexOf("[");
				__CLR4_4_13n3nl3zcar8r.R.inc(212);int end = indexOfMatchingBracket(exp, start, '[', ']');

				/*
				 * Here, all function names are exactly 3 characters long. Thus, the function
				 * name is simply the 3 characters preceding the opening bracket.
				 */
				__CLR4_4_13n3nl3zcar8r.R.inc(213);func = exp.substring(start - 3, start);

				/*
				 * The section enclosed within the brackets is also an expression. Evaluate it,
				 * and check whether it is a number. This will be the function argument.
				 */
				__CLR4_4_13n3nl3zcar8r.R.inc(214);x = Double.parseDouble(evaluate(exp.substring(start + 1, end)));

				/* Pass the function name and argument to a function solver */
				__CLR4_4_13n3nl3zcar8r.R.inc(215);result = "" + solveUnaryFunction(func, x);

				/*
				 * This is a special case similar to that in parseParenthesis(String). Make sure
				 * that ' -fnc[some_expression] ' is interpreted as the negative of the result
				 * of that function.
				 */
				__CLR4_4_13n3nl3zcar8r.R.inc(216);if ((((exp.charAt(start - 4) == '-')&&(__CLR4_4_13n3nl3zcar8r.R.iget(217)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(218)==0&false))) {{
					/* Multiply the enclosed section by -1, then evaluate the result */
					__CLR4_4_13n3nl3zcar8r.R.inc(219);result = evaluate(" ( -1 * ( " + result + " ) ) ");
					__CLR4_4_13n3nl3zcar8r.R.inc(220);start--;
				}
				/* Graft the evaluated portion back into the original expression */
				}__CLR4_4_13n3nl3zcar8r.R.inc(221);exp = exp.substring(0, start - 3) + " " // before the function
						+ result + " " // evaluated part
						+ exp.substring(end + 1); // after the function
			}
		}} catch (NullExpressionException e) {
			/* Throw an Exceeption if the function is missing its argument */
			__CLR4_4_13n3nl3zcar8r.R.inc(222);throw new MissingOperandException(exp, func + "[]");
		} catch (FunctionNotFoundException e) {
			/* Throw an Exception if an extracted function name is unsupported */
			__CLR4_4_13n3nl3zcar8r.R.inc(223);throw new FunctionNotFoundException(exp, func);
		} catch (ExpressionParserException e) {
			/* Pass on any Exceptions encountered while evaluating the argument */
			__CLR4_4_13n3nl3zcar8r.R.inc(224);throw e;
		} catch (Exception e) {
			/* Pass on any other Exceptions as ExpressionParserExceptions */
			__CLR4_4_13n3nl3zcar8r.R.inc(225);throw new ExpressionParserException(exp);
		}
		/*
		 * Adjust the number spacing before passing the expression back to the evaluater
		 */
		__CLR4_4_13n3nl3zcar8r.R.inc(226);exp = adjustNumberSpacing(exp);
		__CLR4_4_13n3nl3zcar8r.R.inc(227);return exp.trim();
	}finally{__CLR4_4_13n3nl3zcar8r.R.flushNeeded();}}

	/**
	 * Substitutes all binary expressions involving arithmetic operators with their
	 * result. Operations are performed following the BODMAS rule. The resultant
	 * parsed String is free of all operators, thus containing only numbers. See
	 * {@link cn.edu.nju.ise.math.MathParser#solveBinaryOperation(double, String, double)}
	 * for a list of supported operators. See {@link #operators}, which defines the
	 * order of operations.
	 *
	 * @param exp
	 *            the expression to be parsed
	 * @return the expression such that all arithmetic operations have been carried
	 *         out
	 * @throws cn.edu.nju.ise.math.MissingOperandException
	 *             thrown if a binary operator is missing an operand
	 */
	protected String parseOperators(String exp) throws MissingOperandException {try{__CLR4_4_13n3nl3zcar8r.R.inc(228);
		__CLR4_4_13n3nl3zcar8r.R.inc(229);int leftIndex, rightIndex;

		__CLR4_4_13n3nl3zcar8r.R.inc(230);try {
			/*
			 * This code addresses a small problem in directly implementing BODMAS.
			 * Expressions like (1 - 2 + 3) will mistakenly evaluate to (-4) if the addition
			 * is done first, disregarding the minus sign before the (2). Eliminate this
			 * problem by changing all instances of subtraction to addition of the second
			 * operand's negative form. Thus, the minus sign acting as an operator now
			 * becomes part of the number itself, and all ambiguity disappears.
			 */
			__CLR4_4_13n3nl3zcar8r.R.inc(231);while ((((exp.matches("(.*)" + numberRegex + "\\s+-\\s+" + numberRegex + "(.*)"))&&(__CLR4_4_13n3nl3zcar8r.R.iget(232)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(233)==0&false))) {{
				__CLR4_4_13n3nl3zcar8r.R.inc(234);exp = exp.replaceAll(numberRegex + "\\s+-\\s+" + numberRegex, " $1 + -($6) ");
				__CLR4_4_13n3nl3zcar8r.R.inc(235);exp = parseParenthesis(exp);
			}
		}} catch (Exception e) {
			/*
			 * Something went seriously wrong - the expressions in the 'try' block were
			 * valid
			 */
			__CLR4_4_13n3nl3zcar8r.R.inc(236);System.out.print("You should never see this message. If you do, please inform the author.");
			__CLR4_4_13n3nl3zcar8r.R.inc(237);e.printStackTrace();
		}

		/* Split the expression into a stack of operators and operands */
		__CLR4_4_13n3nl3zcar8r.R.inc(238);String[] stack = exp.split("\\s+");

		/* Loop through all supported operators (in order) */
		__CLR4_4_13n3nl3zcar8r.R.inc(239);for (String op : operators) {{
			/* Loop through the stack, searching for a match with the operator */
			__CLR4_4_13n3nl3zcar8r.R.inc(240);for (int i = 0; (((i < stack.length)&&(__CLR4_4_13n3nl3zcar8r.R.iget(241)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(242)==0&false)); i++) {{
				__CLR4_4_13n3nl3zcar8r.R.inc(243);if ((((stack[i].equals(op))&&(__CLR4_4_13n3nl3zcar8r.R.iget(244)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(245)==0&false))) {{
					__CLR4_4_13n3nl3zcar8r.R.inc(246);leftIndex = rightIndex = i;
					/* Keep on searching before the operator until a valid operand is found */
					__CLR4_4_13n3nl3zcar8r.R.inc(247);while ((((leftIndex >= 0 && !isNumber(stack[leftIndex]))&&(__CLR4_4_13n3nl3zcar8r.R.iget(248)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(249)==0&false)))
						{__CLR4_4_13n3nl3zcar8r.R.inc(250);leftIndex--;
					/* Keep on searching after the operator until a valid operand is found */
					}__CLR4_4_13n3nl3zcar8r.R.inc(251);while ((((rightIndex < stack.length && !isNumber(stack[rightIndex]))&&(__CLR4_4_13n3nl3zcar8r.R.iget(252)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(253)==0&false)))
						{__CLR4_4_13n3nl3zcar8r.R.inc(254);rightIndex++;
					}__CLR4_4_13n3nl3zcar8r.R.inc(255);try {
						/* Get the operands */
						__CLR4_4_13n3nl3zcar8r.R.inc(256);double left = Double.parseDouble(stack[leftIndex]);
						__CLR4_4_13n3nl3zcar8r.R.inc(257);double right = Double.parseDouble(stack[rightIndex]);
						/*
						 * Pass the operands and the operator to an operator solver, then replace the
						 * operator with the result. Also remove the operands.
						 */
						__CLR4_4_13n3nl3zcar8r.R.inc(258);stack[i] = "" + solveBinaryOperation(left, op, right);
						__CLR4_4_13n3nl3zcar8r.R.inc(259);stack[leftIndex] = stack[rightIndex] = "";
					} catch (Exception e) {
						/* Throw an Exception if there is a missing operand */
						__CLR4_4_13n3nl3zcar8r.R.inc(260);throw new MissingOperandException(exp, op);
					}
				}
			}}
		}}
		}__CLR4_4_13n3nl3zcar8r.R.inc(261);exp = "";

		/* Recombine the stack into the solved expression */
		__CLR4_4_13n3nl3zcar8r.R.inc(262);for (String s : stack) {{
			__CLR4_4_13n3nl3zcar8r.R.inc(263);exp += s;
		}
		}__CLR4_4_13n3nl3zcar8r.R.inc(264);return exp.trim();
	}finally{__CLR4_4_13n3nl3zcar8r.R.flushNeeded();}}

	/**
	 * Adjusts the spacings between numbers, variables, functions, operators, etc in
	 * an expression. Each number will be enclosed withhin a 'buffer' of spaces.
	 * Instances of signed numbers immediately following anothoer number will be
	 * interpreted as their sum. (<code>	1  -1</code> is simply
	 * <code>1 + -1</code>)
	 *
	 * @param exp
	 *            the expression to be parsed
	 * @return the expression with adjusted spacing
	 */
	protected static String adjustNumberSpacing(String exp) {try{__CLR4_4_13n3nl3zcar8r.R.inc(265);
		/* Make sure numbers are all spaced out from other symbols */
		__CLR4_4_13n3nl3zcar8r.R.inc(266);exp = exp.replaceAll(numberRegex, " $0 ");
		/*
		 * Make sure the sign in signed numbers is also considered during
		 * addition/subtraction
		 */
		__CLR4_4_13n3nl3zcar8r.R.inc(267);exp = exp.replaceAll(numberRegex + "\\s+" + signedNumberRegex, " $1 + $6 ");
		__CLR4_4_13n3nl3zcar8r.R.inc(268);return exp;
	}finally{__CLR4_4_13n3nl3zcar8r.R.flushNeeded();}}

	/**
	 * Finds the index of a matching closing bracket in a String, given the index of
	 * the opening one. This method can also be given any characters as opening and
	 * closing brackets. Nesting of brackets has also been dealt with.
	 *
	 * @param str
	 *            the String containing the brackets
	 * @param pos
	 *            the index of the opening bracket
	 * @param open
	 *            the character to be recognized as an opening bracket
	 * @param close
	 *            the character to be recognized as a closing bracket
	 * @return the index of the matching closing bracket
	 * @throws cn.edu.nju.ise.math.UnmatchedBracketsException
	 *             thrown if the specified opening bracket is unclosed
	 */
	protected static int indexOfMatchingBracket(String str, int pos, char open, char close)
			throws UnmatchedBracketsException {try{__CLR4_4_13n3nl3zcar8r.R.inc(269);
		__CLR4_4_13n3nl3zcar8r.R.inc(270);int tmp = pos;
		/* Loop through the String, forward from the position of the opening bracket */
		__CLR4_4_13n3nl3zcar8r.R.inc(271);while ((((++pos < str.length())&&(__CLR4_4_13n3nl3zcar8r.R.iget(272)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(273)==0&false))) {{
			/* Exit the loop as soon as a closing bracket is found */
			__CLR4_4_13n3nl3zcar8r.R.inc(274);if ((((str.charAt(pos) == close)&&(__CLR4_4_13n3nl3zcar8r.R.iget(275)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(276)==0&false)))
				{__CLR4_4_13n3nl3zcar8r.R.inc(277);return pos;
			/*
			 * If another opening bracket is found, it becomes clear that bracketed
			 * expressions have been nested. Thus, the next closing bracket will not match
			 * the bracket we have targeted. In order to return the correct bracket, simply
			 * skip everything within the nested portion. This is done by calling
			 * indexOfMatchingBracket(String, int, char, char) recursively.
			 */
			}__CLR4_4_13n3nl3zcar8r.R.inc(278);if ((((str.charAt(pos) == open)&&(__CLR4_4_13n3nl3zcar8r.R.iget(279)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(280)==0&false)))
				{__CLR4_4_13n3nl3zcar8r.R.inc(281);pos = indexOfMatchingBracket(str, pos, open, close);
		}}
		}__CLR4_4_13n3nl3zcar8r.R.inc(282);if ((((pos >= str.length())&&(__CLR4_4_13n3nl3zcar8r.R.iget(283)!=0|true))||(__CLR4_4_13n3nl3zcar8r.R.iget(284)==0&false))) {{
			/* Throw an Exception if a matching bracket is not present */
			__CLR4_4_13n3nl3zcar8r.R.inc(285);throw new UnmatchedBracketsException(str, tmp);
		}
		}__CLR4_4_13n3nl3zcar8r.R.inc(286);return pos;
	}finally{__CLR4_4_13n3nl3zcar8r.R.flushNeeded();}}
}

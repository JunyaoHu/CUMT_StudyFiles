package net.mooctest;

/**
 * Exception thrown when an unrecognized variable is passed to ExpressionParser.
 *
 * @version 1.0, 16/10/2016
 * @since 1.0
 */

public class VariableNotFoundException extends ExpressionParserException {
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
		super(faultyExpression);
		this.var = var;
	}

	/**
	 * Constructor of VariableNotFoundException. This Constructor accepts only the
	 * unrecognized variable.
	 *
	 * @param var
	 *            the unrecognized variable
	 * @since 1.0
	 */

	public VariableNotFoundException(String var) {
		this("", var);
	}

	/**
	 * Gets the unrecognized variable.
	 *
	 * @return the unrecognized variable
	 * @since 1.0
	 */

	public String getVar() {
		return var;
	}
}

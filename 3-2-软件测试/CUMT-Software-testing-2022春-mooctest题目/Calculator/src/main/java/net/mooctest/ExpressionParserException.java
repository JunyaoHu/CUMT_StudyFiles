package net.mooctest;

/**
 * Superclass of all Exceptions thrown by ExpressionParser.
 */
public class ExpressionParserException extends Exception {
	private String faultyExpression;

	/**
	 * Constructor of ExpressionParserException.
	 * 
	 * @param faultyExpression
	 *            the expression which could not be parsed
	 */
	public ExpressionParserException(String faultyExpression) {
		super("ExpressionParserException");
		/* Store the bad expression */
		this.faultyExpression = faultyExpression;
	}

	/**
	 * Gets the expression which could not be parsed.
	 * 
	 * @return the expression which could not be parsed
	 */
	public String getFaultyExpression() {
		return faultyExpression;
	}
}

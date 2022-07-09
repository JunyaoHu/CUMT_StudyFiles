package net.mooctest;

/**
 * Exception thrown when an expression passed to ExpressionParser has a missing
 * operand.
 */

public class MissingOperandException extends ExpressionParserException {
	private String op;

	/**
	 * Constructor of MissingOperandException.
	 * 
	 * @param faultyExpression
	 *            the expression which could not be parsed
	 * @param op
	 *            the operator which is missing an operand
	 */

	public MissingOperandException(String faultyExpression, String op) {
		super(faultyExpression);
		this.op = op;
	}

	/**
	 * Gets the operator which is missing an operand.
	 *
	 * @return the operator which is missing an operand
	 */

	public String getOperator() {
		return op;
	}
}

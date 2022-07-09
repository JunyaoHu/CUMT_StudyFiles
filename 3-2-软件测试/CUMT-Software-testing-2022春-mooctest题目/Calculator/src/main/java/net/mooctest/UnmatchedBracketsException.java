package net.mooctest;

/**
 * Exception thrown when an expression passed to ExpressionParser has unmatched
 * brackets.
 *
 * @version 1.0, 16/10/2016
 * @since 1.0
 */

public class UnmatchedBracketsException extends ExpressionParserException {
	private int pos;

	/**
	 * Constructor of UnmatchedBracketsException.
	 *
	 * @param faultyExpression
	 *            the expression which could not be parsed
	 * @param pos
	 *            the index of the unmatched bracket
	 * @since 1.0
	 */

	public UnmatchedBracketsException(String faultyExpression, int pos) {
		super(faultyExpression);
		this.pos = pos;
	}

	/**
	 * Gets the index of the unmatched bracket.
	 *
	 * @return the index of the unmatched bracket
	 * @since 1.0
	 */

	public int getIndexOfBracket() {
		return pos;
	}
}

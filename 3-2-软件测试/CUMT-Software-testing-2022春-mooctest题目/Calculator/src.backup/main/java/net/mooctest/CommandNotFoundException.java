package net.mooctest;

/**
 * Exception thrown when an unrecognized command is passed to Calculator.
 */
public class CommandNotFoundException extends Exception {
	private String command;

	/**
	 * Constructor of CommandNotFoundException.
	 *
	 * @param command
	 *            the command which could not be parsed
	 * @since 1.0
	 */

	public CommandNotFoundException(String command) {
		super("CommandNotFoundException");
		this.command = command;
	}

	/**
	 * Get the command which could not be parsed.
	 *
	 * @return the command which could not be parsed
	 * @since 1.0
	 */

	public String getCommand() {
		return command;
	}
}

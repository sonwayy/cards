package io.gui.console;

public class ReadConsole extends Console {
	
	public int ensureIntegerBetween(int minimum, int maximum) {
		while (true) {
			int value = Integer.parseInt(keyboard.nextLine());
			if (minimum <= value && value <= maximum)
				return value;
			else {
				this.message("The value must be between " + minimum + " and " + maximum);
			}
		}
	}
}

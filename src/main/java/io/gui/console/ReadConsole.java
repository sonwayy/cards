package io.gui.console;

public class ReadConsole extends Console {
	
	public int ensureInteger() {
		//TODO bugfix: only an integer catch the exception
		//A specific exception must be handled here when something else written
				return Integer.parseInt(keyboard.nextLine());
	}
	
	public int ensureIntegerBetween(int minimum, int maximum) {
		while (true) {
			int value = ensureInteger();
			if (minimum <= value && value <= maximum)
				return value;
			else {
				this.message("The value must be between " + minimum + " and " + maximum);
			}
		}
	}
}

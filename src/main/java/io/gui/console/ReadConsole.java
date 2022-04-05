package io.gui.console;

public class ReadConsole extends Console {
	
	public int ensureInteger() {
			while(true) {
			try {
				return Integer.parseInt(keyboard.nextLine());
			}catch(Exception e) {
				System.out.println("Erreur, un entier doit être saisi !\n");
			}
		}
		
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

package io.gui.console;

public class DisplayConsole extends Console {

	private static final String EXIT_KEY = "0";
	private static final String EXIT_TEXT = "Exit";
	private static final String EXIT_OPTION_LINE = EXIT_KEY + "." + EXIT_TEXT;

	public String showChocolateMenu() {
		String menu = "";
		menu = menu + "1.Dark Chocolate" + LINE_BREAK;
		menu = menu + "2.Milk Chocolate" + LINE_BREAK;
		menu = menu + "3.White Chocolate" + LINE_BREAK;
		menu = menu + EXIT_OPTION_LINE + LINE_BREAK;
		menu = menu + LINE;
		return menu;
	}
}
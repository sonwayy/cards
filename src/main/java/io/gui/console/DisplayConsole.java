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
		return menu;
	}
	
	public String menu(String... options) {
		StringBuilder menuBuilder  = new StringBuilder();

		for (int i = 1; i <= options.length; i++) {
			String optionText = options[i - 1];
			String optionLine = i + "." + optionText + LINE_BREAK;
			menuBuilder.append(optionLine);
		}
		return menuBuilder.toString() + EXIT_OPTION_LINE + LINE_BREAK;
	}
}
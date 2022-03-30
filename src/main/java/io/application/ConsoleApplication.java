package io.application;

import java.util.HashMap;
import java.util.Map;

import io.gui.console.Console;
import io.gui.console.DisplayConsole;

public class ConsoleApplication {

	Console console;
	DisplayConsole display;
	Map<String, String> chocolateMenu;

	public ConsoleApplication() {
		this.console = new Console();
		this.display = new DisplayConsole();

		createChocolateMenu();
	}

	public void test() {

		console.title("Welcome ! What is your favourite chocolate ?");

		console.title("Menu with directly text in method ");
		console.message(display.showChocolateMenu());

		console.title("Menu with varargs as input parameters");
		console.message(display.menu("Dark Chocolate", "Milk Chocolate", "White Chocolate"));

		console.title("Menu with hashmap as input parameter");
		console.message(display.menu(chocolateMenu));

	}

	private void createChocolateMenu() {

		chocolateMenu = new HashMap<>();
		chocolateMenu.put("1", "Dark Chocolate");
		chocolateMenu.put("2", "Milk Chocolate");
		chocolateMenu.put("3", "NetBeans");

		// Java 9 and higher
		// chocolateMenu = Map.of("1", "Dark Chocolate", "2", "Milk Chocolate", "3",
		// "White Chocolate");

	}

	public static void main(String[] args) {

		ConsoleApplication consoleApplication = new ConsoleApplication();
		consoleApplication.test();

	}

}

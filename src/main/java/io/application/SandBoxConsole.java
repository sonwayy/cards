package io.application;

import java.util.HashMap;
import java.util.Map;

import io.gui.console.Console;
import io.gui.console.DisplayConsole;
import io.gui.console.ReadConsole;

public class SandBoxConsole {

	Console console;
	DisplayConsole display;
	ReadConsole read;
	Map<String, String> chocolateMenu;

	public SandBoxConsole() {
		this.console = new Console();
		this.display = new DisplayConsole();
		createChocolateMenu();
		
		this.read = new ReadConsole();

		
	}

	public void test() {

		console.title("Welcome ! What is your favourite chocolate ?");

		console.title("Menu with directly text in method ");
		console.message(display.showChocolateMenu());

		console.title("Menu with varargs as input parameters");
		console.message(display.menu("Dark Chocolate", "Milk Chocolate", "White Chocolate"));

		console.title("Menu with hashmap as input parameter");
		console.message(display.menu(chocolateMenu));
		
		console.message(" Your choice: ");
		console.lineBreak();
		int option = read.ensureIntegerBetween(display.exitKey(), chocolateMenu.size());
		console.message(" Your choice is "+option);

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

		SandBoxConsole consoleApplication = new SandBoxConsole();
		consoleApplication.test();

	}

}

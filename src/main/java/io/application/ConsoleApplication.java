package io.application;

import io.gui.console.Console;
import io.gui.console.DisplayConsole;

public class ConsoleApplication {

	Console console;
	DisplayConsole display;

	public ConsoleApplication() {
		this.console = new Console();
		this.display = new DisplayConsole();
	}

	public void test() {

		console.title("Welcome ! What is your favourite chocolate ?");
		
		console.title("Menu with directly text in method ");
		console.message(display.showChocolateMenu());
			
		console.title("Menu with varargs as input parameters");
		console.message(display.menu("Dark Chocolate", "Milk Chocolate", "White Chocolate"));

	}

	public static void main(String[] args) {

		ConsoleApplication consoleApplication = new ConsoleApplication();
		consoleApplication.test();

	}

}

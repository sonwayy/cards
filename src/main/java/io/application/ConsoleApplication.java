package io.application;

import io.gui.console.Console;

public class ConsoleApplication {

	Console console;

	public ConsoleApplication() {
		this.console = new Console();
	}

	public void test() {

		console.title("Welcome ! What is your favourite chocolate ?");
		console.message("1.Dark Chocolate");
		console.message("2.Milk Chocolate");
		console.message("3.White Chocolate");
		console.message("0.Exit");
		console.line();

	}

	public static void main(String[] args) {

		ConsoleApplication consoleApplication = new ConsoleApplication();
		consoleApplication.test();

	}

}

package io.application;

import io.gui.console.Console;

public class ConsoleApplication {

	Console console;

	public ConsoleApplication() {
		this.console = new Console();
	}

	public void test() {

		console.title("Welcome ! ");

	}

	public static void main(String[] args) {

		ConsoleApplication consoleApplication = new ConsoleApplication();
		consoleApplication.test();

	}

}

package com.learn.design_patterns.behavioural.command;

public class QuotePrinter {
	public void executeOperation(Command command) {
		command.execute();
	}
}
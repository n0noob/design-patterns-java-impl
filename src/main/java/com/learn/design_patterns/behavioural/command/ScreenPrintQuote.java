package com.learn.design_patterns.behavioural.command;

public class ScreenPrintQuote implements Command {

	private Quote quote;
	
	public ScreenPrintQuote(Quote quote) {
		this.quote = quote;
	}
	
	@Override
	public void execute() {
		System.out.println(quote);
	}

}

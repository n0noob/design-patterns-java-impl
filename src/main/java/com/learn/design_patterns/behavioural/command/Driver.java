package com.learn.design_patterns.behavioural.command;

public class Driver {
	public static void main(String[] args) {
		Quote quote = new Quote("Trust the vibes you get, energy doesn't lie", "Anonymous");

		QuotePrinter quotePrinter = new QuotePrinter();
		quotePrinter.executeOperation(new ScreenPrintQuote(quote));

		quotePrinter.executeOperation(new FilePrintQuote(quote));
	}
}

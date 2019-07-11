package com.learn.design_patterns.behavioural.command;

import java.nio.file.FileSystem;

public class FilePrintQuote implements Command{

	private Quote quote;
	//private FileSystem fs;
	
	public FilePrintQuote(/*String fileName*/ Quote quote) {
		this.quote = quote;
	}
	
	@Override
	public void execute() {
		System.out.println("Printing on a file :");
		System.out.println(quote.printQuote());
	}

}

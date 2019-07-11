package com.learn.design_patterns.behavioural.command;

public class Quote {
	private String quote;
	private String author;

	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Quote [quote=" + quote + ", author=" + author + "]";
	}
	
	public String printQuote() {
		StringBuilder sb = new StringBuilder();
		sb.append("=============================================================================\n");
		sb.append(getQuote());
		sb.append(" - " + getAuthor());
		sb.append("\n=============================================================================\n");
		return sb.toString();
	}
	public Quote(String quote, String author) {
		super();
		this.quote = quote;
		this.author = author;
	}
}

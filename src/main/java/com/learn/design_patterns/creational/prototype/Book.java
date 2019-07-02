package com.learn.design_patterns.creational.prototype;

public class Book extends Item {
	private int pages;
	private String author;
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}

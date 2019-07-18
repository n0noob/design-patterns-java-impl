package com.learn.design_patterns.behavioural.visitor;

public class IndiaTaxCalculateVisitor implements Visitor {

	private final static int PHONE_GST = 10;
	private final static int BOOK_GST = 20;
	
	
	@Override
	public void visit(Book book) {
		book.setPrice(book.getPrice() + BOOK_GST);
	}

	@Override
	public void visit(Phone phone) {
		phone.setPrice(phone.getPrice() + PHONE_GST);
	}
	
}

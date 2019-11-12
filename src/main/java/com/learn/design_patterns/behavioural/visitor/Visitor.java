package com.learn.design_patterns.behavioural.visitor;

public interface Visitor {
	public void visit(Book book);
	public void visit(Phone phone);
}

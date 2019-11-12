package com.learn.design_patterns.behavioural.visitor;

public class Phone implements CartItem {

	private int price;
	
	public Phone(int price) {
		this.price = price;
	}
	
	@Override
	public void addTax(Visitor visitor) {
		visitor.visit(this);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

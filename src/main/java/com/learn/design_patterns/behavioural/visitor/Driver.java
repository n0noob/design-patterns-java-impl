package com.learn.design_patterns.behavioural.visitor;

public class Driver {
	public static void main(String[] args) {
		Phone iphone = new Phone(10000);
		IndiaTaxCalculateVisitor defaultVisitor = new IndiaTaxCalculateVisitor();
		
		iphone.addTax(defaultVisitor);
		
		System.out.println(iphone.getPrice());
	}
}

package com.learn.design_patterns.structural.bridge;

public class Square extends Shape{
	public Square(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Square drawn, applying color now!");
		getColor().applyColor();
	}
}

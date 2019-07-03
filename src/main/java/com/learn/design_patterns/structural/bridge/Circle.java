package com.learn.design_patterns.structural.bridge;

public class Circle extends Shape{

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Cicle drawn, applying color now!");
		getColor().applyColor();
	}

}

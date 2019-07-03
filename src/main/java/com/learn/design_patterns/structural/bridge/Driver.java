package com.learn.design_patterns.structural.bridge;

public class Driver {

	public static void main(String[] args) {
		Color blueColor = new BlueColor();
		Shape circle = new Circle(blueColor);
		circle.draw();
		
		Color redColor = new RedColor();
		Shape square = new Square(redColor);
		square.draw();
	}

}

package com.learn.design_patterns.structural.flyweight;

public class Brush {
	private Color color;
	
	public Brush(Color color) {
		this.color = color;
	}
	
	public Coordinate drawLine(Coordinate currPos, Coordinate newPos) {
		System.out.println("Using color :" + color + " drawn line from " + currPos + " to " + newPos);
		return newPos;
	}
	
}

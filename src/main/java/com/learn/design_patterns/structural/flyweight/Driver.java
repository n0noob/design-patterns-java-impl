package com.learn.design_patterns.structural.flyweight;

public class Driver {
	public static void main(String[] args) {
		Brush b = BrushFactory.getBrush(new Color(ColorPallete.RED));
		Coordinate pos = new Coordinate(0, 0);
		pos = b.drawLine(pos, new Coordinate(10, 15));
	}
}

package com.learn.design_patterns.structural.decorator;

public class Driver {
	public static void main(String[] args) {
		ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
		System.out.println(tree1.decorate());
	}
}

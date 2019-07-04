package com.learn.design_patterns.structural.decorator;

public class Garland extends ChristmasTreeDecorator {

	public Garland(ChristmasTree tree) {
		super(tree);
	}

	@Override
	public String decorate() {
		return super.decorate() + decorateWithGarland();
	}

	private String decorateWithGarland() {
		return " with Garland";
	}
	
}

package com.learn.design_patterns.structural.decorator;

public class BubbleLights extends ChristmasTreeDecorator {

	public BubbleLights(ChristmasTree tree) {
		super(tree);
	}
	
	//Modified existing method as per our needs so as to add new functionality
	@Override
	public String decorate() {
		return super.decorate() + this.decorateWithBubbleLights();
	}
	
	private String decorateWithBubbleLights() {
		return " with Bubble Lights";
	}
}

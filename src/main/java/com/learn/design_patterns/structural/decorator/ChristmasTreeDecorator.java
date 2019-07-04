package com.learn.design_patterns.structural.decorator;

public abstract class ChristmasTreeDecorator implements ChristmasTree {

	private ChristmasTree christmasTree;
	
	public ChristmasTreeDecorator(ChristmasTree tree) {
		christmasTree = tree;
	}
	
	@Override
	public String decorate() {
		return christmasTree.decorate();
	}

}

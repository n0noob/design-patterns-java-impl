package com.learn.design_patterns.behavioural.template;

public abstract class OmletteCooking {
	public final void cook() {
		breakEgg();
		addAdditives();
		heat();
		serveWithCondiments();
	}

	protected void breakEgg() {
		System.out.println("Step 1 : Breaking the egg");
	}

	protected abstract void addAdditives();

	protected void heat() {
		System.out.println("Step 2 : Heating on stove");
	}
	
	protected abstract void serveWithCondiments();
}

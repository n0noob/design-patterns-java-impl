package com.learn.design_patterns.behavioural.template;

public class PlainOmletteCooking extends OmletteCooking {

	@Override
	protected void addAdditives() {
		System.out.println("Step 2 : Added no additives");
	}

	@Override
	protected void serveWithCondiments() {
		System.out.println("Step 4 : Added no condiments");
	}

}

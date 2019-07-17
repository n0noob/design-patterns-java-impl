package com.learn.design_patterns.behavioural.template;

public class FrenchOmeletteCooking extends OmletteCooking {

	@Override
	protected void addAdditives() {
		System.out.println("Step 2 : Adding onion, green chillies and tometos");
	}

	@Override
	protected void serveWithCondiments() {
		System.out.println("Step 4 : Putting cheeze and other green veggies over it");
	}

}

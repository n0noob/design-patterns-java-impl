package com.learn.design_patterns.behavioural.template;

public class Driver {

	public static void main(String[] args) {
		OmletteCooking omlette = new FrenchOmeletteCooking();
		
		omlette.cook();
		
	}

}

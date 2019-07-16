package com.learn.design_patterns.behavioural.nullobject;

public class JmsRouter implements Router {

	@Override
	public void route(String message) {
		System.out.println("Routing using Jms mechanism");
	}

}

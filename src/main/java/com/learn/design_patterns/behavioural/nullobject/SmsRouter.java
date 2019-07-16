package com.learn.design_patterns.behavioural.nullobject;

public class SmsRouter implements Router {

	@Override
	public void route(String message) {
		System.out.println("Routing using Sms mechanism");
	}

}

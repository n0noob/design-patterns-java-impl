package com.learn.design_patterns.behavioural.nullobject;

public class NullRouter implements Router{

	@Override
	public void route(String message) {
		System.out.println("Null router");
	}

}

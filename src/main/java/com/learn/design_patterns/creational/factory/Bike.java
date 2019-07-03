package com.learn.design_patterns.creational.factory;

public class Bike extends Vehicle{

	public Bike(int cap) {
		this.setCapacity(cap);
	}
	
	@Override
	public void drive() {
		System.out.println("Driving Bike!");
	}
	
}

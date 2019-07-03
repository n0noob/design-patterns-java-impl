package com.learn.design_patterns.creational.factory;

public class Car extends Vehicle {
	
	public Car(int cap) {
		this.setCapacity(cap);
	}
	
	@Override
	public void drive() {
		System.out.println("Driving car!");
	}
}

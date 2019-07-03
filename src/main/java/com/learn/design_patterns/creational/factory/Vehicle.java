package com.learn.design_patterns.creational.factory;

public abstract class Vehicle {
	private int capacity;
	
	public abstract void drive();

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}

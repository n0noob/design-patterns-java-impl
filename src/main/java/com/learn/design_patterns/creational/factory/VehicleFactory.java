package com.learn.design_patterns.creational.factory;

public class VehicleFactory {
	public static Vehicle getVehicle(int capacity) {
		switch(capacity) {
		case 2:
			return new Bike(capacity);
		case 4:
		case 5:
			return new Car(capacity);
		}
		throw new RuntimeException("Invalid value passed");
	}
}

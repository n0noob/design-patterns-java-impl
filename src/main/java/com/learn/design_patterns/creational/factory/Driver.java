package com.learn.design_patterns.creational.factory;

public class Driver {
	public static void main(String[] args) {
		Vehicle vehicle = VehicleFactory.getVehicle(2);
		vehicle.drive();
	}
}

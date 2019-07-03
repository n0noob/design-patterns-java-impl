package com.learn.design_patterns.creational.absfactory;

import com.learn.design_patterns.creational.absfactory.bikefactory.Bike;

public class Driver {
	public static void main(String[] args) {
		AbstractFactory<Bike> bikeFactory = FactoryProvider.getFactory("bike");
		Bike newBike = bikeFactory.createItem("ducati");
		System.out.println("Let us start building");
		newBike.startBuilding();
	}
}

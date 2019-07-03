package com.learn.design_patterns.creational.absfactory;

import com.learn.design_patterns.creational.absfactory.bikefactory.BikeFactory;
import com.learn.design_patterns.creational.absfactory.carfactory.CarFactory;

public class FactoryProvider {
	public static AbstractFactory getFactory(String type) {
		if("Bike".equalsIgnoreCase(type))
			return new BikeFactory();
		else if("Car".equalsIgnoreCase(type))
			return new CarFactory();
		return null;
	}
}

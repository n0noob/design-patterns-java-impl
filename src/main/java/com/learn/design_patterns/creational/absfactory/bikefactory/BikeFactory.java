package com.learn.design_patterns.creational.absfactory.bikefactory;

import com.learn.design_patterns.creational.absfactory.AbstractFactory;

public class BikeFactory implements AbstractFactory<Bike> {

	@Override
	public Bike createItem(String type) {
		switch(type) {
		case "ducati" : return new Ducati();
		case "triumph" : return new Triumph();
		}
		return null;
	}

}

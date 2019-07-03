package com.learn.design_patterns.creational.absfactory.carfactory;

import com.learn.design_patterns.creational.absfactory.AbstractFactory;

public class CarFactory implements AbstractFactory<Car> {

	@Override
	public Car createItem(String type) {
		switch(type) {
		case "porche" :
			return new Porche();
		case "jaguar" :
			return new Jaguar();
		}
		return null;
	}

}

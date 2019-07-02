package com.learn.design_patterns.creational.builder;

public class Driver {
	LunchMeal.Builder builder = new LunchMeal.Builder();
	
	LunchMeal meal = builder.bread("Wheat Bread")
							.condiments("Salt")
							.dressing("Mustard Sauce")
							.meat("Chicken breast")
							.build();
	
}

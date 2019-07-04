package com.learn.design_patterns.structural.composite;

public abstract class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public abstract String responsibilities();

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}

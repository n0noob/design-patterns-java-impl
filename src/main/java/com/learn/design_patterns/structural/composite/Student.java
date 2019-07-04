package com.learn.design_patterns.structural.composite;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}
	
	@Override
	public String responsibilities() {
		return "Do homework | Study";
	}

	@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

}

package com.learn.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	
	List<Person> supervise;
	
	public Teacher(String name) {
		super(name);
		supervise = new ArrayList<Person>();
	}
	
	public void supervise(Teacher p) {
		supervise.add(p);
	}
	
	@Override
	public String responsibilities() {
		return "Teaching | Punctuality";
	}

	@Override
	public String toString() {
		return "Teacher [" + "getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
}

package com.learn.design_patterns.structural.adapter;

public class Driver {
	public static void main(String[] args) {
		EmployeeLegacy el = new EmployeeLegacy();
		el.setId(1);
		el.setFirstName("Amit");
		el.setLastName("Singh");
		el.setDept("TECH");
		
		Employee e = new EmployeeAdapter(el);
		System.out.println("Name of the employee : " + e.getFullName());
	}
}

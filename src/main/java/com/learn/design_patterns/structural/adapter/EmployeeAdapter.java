package com.learn.design_patterns.structural.adapter;

public class EmployeeAdapter extends Employee {
	private EmployeeLegacy emp;
	
	public EmployeeAdapter(EmployeeLegacy emp) {
		this.emp = emp;
	}
	
	@Override
	public int getEmployeeId() {
		return emp.getId();
	}
	
	@Override
	public String getFullName() {
		return emp.getFirstName() + " " + emp.getLastName();
	}
	
	@Override
	public Department getDept() {
		switch(emp.getDept()) {
		case "HR":
			return Department.HR;
		case "TA":
			return Department.TA;
		case "TECH":
			return Department.TECH;
		}
		throw new RuntimeException("Invalid data found");
	}
}

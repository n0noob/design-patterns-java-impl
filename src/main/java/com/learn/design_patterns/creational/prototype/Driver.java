package com.learn.design_patterns.creational.prototype;

public class Driver {
	public static void main(String[] args) {
		Registry registry = new Registry();
		Phone phone = (Phone) registry.getItem("phone");
		
		phone.setColor("Blue");
		phone.setUrl("/phones/iphonexrblue");
		
		System.out.println(phone);
	}
}

package com.learn.design_patterns.creational.singleton;

public enum EnumSingleton {
	INSTANCE;
	
	private final Resource resource;
	
	EnumSingleton() {
		resource = new Resource();
	}
	
	public Resource getConnection() {
		return resource;
	}
}

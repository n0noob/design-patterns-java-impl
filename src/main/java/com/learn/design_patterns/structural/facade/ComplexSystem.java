package com.learn.design_patterns.structural.facade;

public class ComplexSystem {
	public void init() {
		//Complexity of the system lies here which is hidden from the client
		System.out.println("Initiated");
	}
	
	public void process() {
		//Complexity of the system lies here which is hidden from the client
		System.out.println("Processed");
	}
	
	public void shutdown() {
		//Complexity of the system lies here which is hidden from the client
		System.out.println("Shutdown");
	}
}

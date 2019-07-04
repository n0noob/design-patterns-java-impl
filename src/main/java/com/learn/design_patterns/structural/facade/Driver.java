package com.learn.design_patterns.structural.facade;

public class Driver {

	public static void main(String[] args) {
		ComplexSystem sys = new ComplexSystem();
		sys.init();
		sys.process();
		sys.shutdown();
	}

}

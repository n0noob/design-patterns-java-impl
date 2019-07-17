package com.learn.design_patterns.behavioural.state;

public class DefaultState implements PlayerState {

	@Override
	public void printCurrentState(String file) {
		System.out.println("IDLE STATE");
	}

}

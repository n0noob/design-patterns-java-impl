package com.learn.design_patterns.behavioural.state;

public class PausedState implements PlayerState {

	@Override
	public void printCurrentState(String file) {
		System.out.println("PAUSED : " + file);
	}

}

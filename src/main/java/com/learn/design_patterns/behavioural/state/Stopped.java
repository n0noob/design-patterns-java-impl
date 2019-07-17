package com.learn.design_patterns.behavioural.state;

public class Stopped implements PlayerState {

	@Override
	public void printCurrentState(String file) {
		System.out.println("STOPPED PLAYING : " + file);
	}

}

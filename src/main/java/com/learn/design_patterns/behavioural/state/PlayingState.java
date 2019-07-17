package com.learn.design_patterns.behavioural.state;

public class PlayingState implements PlayerState {

	@Override
	public void printCurrentState(String file) {
		System.out.println("PLAYING : " + file);
	}

}

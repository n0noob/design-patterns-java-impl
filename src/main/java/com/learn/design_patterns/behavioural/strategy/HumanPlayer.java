package com.learn.design_patterns.behavioural.strategy;

public class HumanPlayer implements ChessPlayer {

	@Override
	public void startPlaying() {
		System.out.println("Human playing!");
	}

}

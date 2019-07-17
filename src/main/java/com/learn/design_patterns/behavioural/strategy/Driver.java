package com.learn.design_patterns.behavioural.strategy;

public class Driver {

	public static void main(String[] args) {
		ChessContext context = new ChessContext();
		ChessPlayer cp = new HumanPlayer();
		
		context.setSecondPlayer(cp);
		context.play();
		
	}

}

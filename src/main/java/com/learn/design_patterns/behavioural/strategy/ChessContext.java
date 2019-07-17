package com.learn.design_patterns.behavioural.strategy;

public class ChessContext {
	private ChessPlayer player1;
	private ChessPlayer player2;
	
	public ChessContext() {
		player1 = new ComputerPlayer1();
	}
	
	public void setSecondPlayer(ChessPlayer p) {
		this.player2 = p;
	}
	
	public void play() {
		this.player1.startPlaying();
		this.player2.startPlaying();
	}
	
}

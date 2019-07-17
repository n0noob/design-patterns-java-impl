package com.learn.design_patterns.behavioural.state;

public class Driver {
	public static void main(String[] args) {
		String file = "/home/aneem/a.mpv";
		PlayerState playingState = new PlayingState();
		PlayerState defaultState = new DefaultState();
		PlayerState stoppedState = new StoppedState();
		
		VlcPlayer player = new VlcPlayer(defaultState, file);
		player.setState(playingState);
		player.setState(stoppedState);
		
	}
}

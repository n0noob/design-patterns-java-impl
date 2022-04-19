package com.learn.design_patterns.behavioural.state;

public class StoppedState implements PlayerState {

	private final VlcPlayer vlcPlayer;

	public StoppedState(VlcPlayer vlcPlayer) {
		this.vlcPlayer = vlcPlayer;
	}

	@Override
	public void playMedia() {
		System.out.println("Playing media now!");
		this.vlcPlayer.setState(vlcPlayer.getPlayingState());
	}

	@Override
	public void stopMedia() {

	}

	@Override
	public void pauseMedia() {

	}

}

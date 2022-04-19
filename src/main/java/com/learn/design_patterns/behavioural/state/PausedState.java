package com.learn.design_patterns.behavioural.state;

public class PausedState implements PlayerState {

	private final VlcPlayer vlcPlayer;

	public PausedState(VlcPlayer vlcPlayer) {
		this.vlcPlayer = vlcPlayer;
	}

	@Override
	public void playMedia() {
		System.out.println("Playing media now!");
		this.vlcPlayer.setState(vlcPlayer.getPlayingState());
	}

	@Override
	public void stopMedia() {
		System.out.println("Stopping media playback!");
		this.vlcPlayer.setState(this.vlcPlayer.getStoppedState());
	}

	@Override
	public void pauseMedia() {

	}

}

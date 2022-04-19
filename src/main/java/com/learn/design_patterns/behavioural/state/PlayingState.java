package com.learn.design_patterns.behavioural.state;

public class PlayingState implements PlayerState {

	private final VlcPlayer vlcPlayer;

	public PlayingState(VlcPlayer vlcPlayer) {
		this.vlcPlayer = vlcPlayer;
	}

	@Override
	public void playMedia() {

	}

	@Override
	public void stopMedia() {
		System.out.println("Stopping media playback!");
		this.vlcPlayer.setState(this.vlcPlayer.getStoppedState());
	}

	@Override
	public void pauseMedia() {
		System.out.println("Pausing media playback!");
		this.vlcPlayer.setState(this.vlcPlayer.getPausedState());
	}

}

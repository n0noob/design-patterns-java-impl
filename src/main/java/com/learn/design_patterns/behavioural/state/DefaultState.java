package com.learn.design_patterns.behavioural.state;

public class DefaultState implements PlayerState {

	private final VlcPlayer vlcPlayer;

	public DefaultState(VlcPlayer vlcPlayer) {
		this.vlcPlayer = vlcPlayer;
	}

	@Override
	public void playMedia() {
		System.out.println("Playing media now!");
		if(!this.vlcPlayer.getFile().isEmpty())
			this.vlcPlayer.setState(vlcPlayer.getPlayingState());
	}

	@Override
	public void stopMedia() {

	}

	@Override
	public void pauseMedia() {

	}

}

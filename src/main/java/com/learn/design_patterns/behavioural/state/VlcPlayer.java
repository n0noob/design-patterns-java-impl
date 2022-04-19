package com.learn.design_patterns.behavioural.state;

public class VlcPlayer {
	private String file;
	private PlayerState state;

	private PlayerState defaultState;

	private PlayerState stoppedState;
	private PlayerState playingState;
	private PlayerState pausedState;
	
	//Default constructor
	public VlcPlayer() {
		init();

		this.state = defaultState;
		this.file = "";
	}
	
	public VlcPlayer(String file) {
		init();

		this.state = defaultState;
		this.file = file;
	}

	void init() {
		defaultState = new DefaultState(this);
		stoppedState = new StoppedState(this);
		playingState = new PlayingState(this);
		pausedState = new PausedState(this);
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		System.out.println("Setting new file to play : " + file);
		this.file = file;
		this.setState(this.getDefaultState());
	}

	public PlayerState getState() {
		return state;
	}

	public void setState(PlayerState state) {
		this.state = state;
	}

	//Actual controls
	public void playMedia() {
		this.state.playMedia();
	}

	public void pauseMedia() {
		this.state.pauseMedia();
	}

	public void stopMedia() {
		this.state.stopMedia();
	}

	//Simple getters for various states
	PlayerState getDefaultState() {
		return defaultState;
	}

	PlayerState getStoppedState() {
		return stoppedState;
	}

	PlayerState getPlayingState() {
		return playingState;
	}

	PlayerState getPausedState() {
		return pausedState;
	}
}

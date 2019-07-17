package com.learn.design_patterns.behavioural.state;

public class VlcPlayer {
	private String file;
	private PlayerState state;
	
	//Default constructor
	public VlcPlayer() {
		state = new DefaultState();
		file = "";
	}
	
	public VlcPlayer(PlayerState state, String file) {
		this.state = state;
		this.file = file;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		if(this.state.getClass().equals(PlayingState.class)) {
			throw new RuntimeException("Cannot load new file while another file already being played");
		}
		this.file = file;
	}

	public PlayerState getState() {
		return state;
	}

	public void setState(PlayerState state) {
		this.state = state;
		this.printState();
	}
	
	public void printState() {
		this.state.printCurrentState(file);
	}
}

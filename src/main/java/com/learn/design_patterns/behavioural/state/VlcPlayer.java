package com.learn.design_patterns.behavioural.state;

public class VlcPlayer {
	private PlayerState state;
	
	//Default constructor
	
	public VlcPlayer(PlayerState state) {
		this.state = state;
	}
}

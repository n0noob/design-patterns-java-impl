package com.learn.design_patterns.behavioural.state;

public class PlayingState implements PlayerState {

	@Override
	public void printCurrentState(String file) {
		System.out.println("PLAYING : " + file);
	}

	/*@Override
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		
		if(obj == null || !obj.getClass().equals(getClass()))
			return false;
		return true;
	}*/
	
}

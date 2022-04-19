package com.learn.design_patterns.behavioural.state;

public class Driver {
	public static void main(String[] args) {

		VlcPlayer player = new VlcPlayer("/home/aneem/a.mpv");
		player.playMedia();
		player.pauseMedia();
		player.stopMedia();

		player.setFile("/home/aneem/b.mp4");
		player.playMedia();
		player.stopMedia();
	}
}

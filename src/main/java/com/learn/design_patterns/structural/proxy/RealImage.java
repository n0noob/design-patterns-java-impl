package com.learn.design_patterns.structural.proxy;

public class RealImage implements Image {
	public RealImage(String url) {
		loadImage(url);
	}

	private void loadImage(String url) {
		try {
			Thread.sleep(1000);
			System.out.println("Loaded image");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void displayImage() {
		System.out.println("Displaying image");
	}
}

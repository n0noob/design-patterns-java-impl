package com.learn.design_patterns.structural.proxy;

public class ProxyImage implements Image {

	private String url;
	
	public ProxyImage(String url) {
		this.url = url;
	}
	
	@Override
	public void displayImage() {
		RealImage realImage = new RealImage(url);
		realImage.displayImage();
	}

}

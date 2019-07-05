package com.learn.design_patterns.structural.proxy;

public class Driver {
	public static void main(String[] args) {
		Image image = new ProxyImage("http://abc.com/a.img");
		image.displayImage();
	}
}

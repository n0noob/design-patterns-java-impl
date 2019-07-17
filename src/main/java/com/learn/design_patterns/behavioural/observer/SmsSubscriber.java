package com.learn.design_patterns.behavioural.observer;

public class SmsSubscriber implements Subscriber {

	@Override
	public void update(String news) {
		System.out.println("SMS NEWS : " + news);
	}

}

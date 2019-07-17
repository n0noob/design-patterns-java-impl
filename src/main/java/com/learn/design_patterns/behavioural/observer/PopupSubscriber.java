package com.learn.design_patterns.behavioural.observer;

public class PopupSubscriber implements Subscriber {

	@Override
	public void update(String news) {
		System.out.println("NEWS FLASH : " + news);
	}


}

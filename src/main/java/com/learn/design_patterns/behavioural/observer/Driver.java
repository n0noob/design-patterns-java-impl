package com.learn.design_patterns.behavioural.observer;

public class Driver {

	public static void main(String[] args) {
		Subscriber smsSubscriber = new SmsSubscriber();
		Subscriber audioSubscriber = (news ) -> System.out.println("SHOUTING : " + news);
		Subscriber popupSubscriber = new PopupSubscriber();
		
		NewsPublisher publisher = new NewsPublisher();
		publisher.subscribe(smsSubscriber);
		publisher.subscribe(audioSubscriber);
		publisher.subscribe(popupSubscriber);
		
		publisher.setNews("Batman is back");
		publisher.publishNews();
		
	}
	
}

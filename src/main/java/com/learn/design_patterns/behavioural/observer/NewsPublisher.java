package com.learn.design_patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
	private String news;
	private List<Subscriber> subscribers = new ArrayList<>();
	
	public void setNews(String news) {
		this.news = news;
	}
	
	public void subscribe(Subscriber subscriber) {
		this.subscribers.add(subscriber);
	}
	
	public void remove(Subscriber subscriber) {
		this.subscribers.remove(subscriber);
	}
	
 	public void publishNews() {
 		for(Subscriber s : subscribers) {
 			s.update(news);
 		}
 	}
}

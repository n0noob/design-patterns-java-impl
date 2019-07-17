package com.learn.design_patterns.behavioural.observer;

@FunctionalInterface
public interface Subscriber {
	public void update(String news);
}

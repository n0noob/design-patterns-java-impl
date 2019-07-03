package com.learn.design_patterns.creational.absfactory;

public interface AbstractFactory<T> {
	public T createItem(String type);
}

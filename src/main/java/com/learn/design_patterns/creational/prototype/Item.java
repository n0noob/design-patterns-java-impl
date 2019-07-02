package com.learn.design_patterns.creational.prototype;

public abstract class Item implements Cloneable {
	private String title;
	private int price;
	private String url;

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}

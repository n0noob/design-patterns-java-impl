package com.learn.design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	Map<String, Item> map = new HashMap<>();
	
	public Registry() {
		loadItems();
	}
	
	//Main method here
	public Item getItem(String type) {
		Item item = null;
		
		try {
			item = (Item)(map.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return item;
	}

	private void loadItems() {
		Book book = new Book();
		book.setTitle("Spring Batch: Complete Guide");
		book.setPrice(200);
		book.setAuthor("Anoop");
		book.setPages(300);
		book.setUrl("/books/sbatchcg");
		map.put("book", book);
		
		Phone phone = new Phone();
		phone.setTitle("Iphone XR");
		phone.setBrand("Apple");
		phone.setColor("Red");
		phone.setPrice(45000);
		phone.setUrl("/phones/iphonexrred");
		map.put("phone", phone);
	}
}

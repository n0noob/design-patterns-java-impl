package com.learn.design_patterns.behavioural.memento;

public class Driver {
	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor("");
		textEditor.setContent("Hello world");
		
		System.out.println("Current state of TEXT EDITOR : " + textEditor);
		
		CareTaker careTaker = new CareTaker();
		careTaker.saveSnapshots(textEditor.createSnapshot());
		
		textEditor.append(" XX");
		
		System.out.println("Current state of TEXT EDITOR : " + textEditor);
		
		textEditor.restoreSnapshot(careTaker.getSnapshot());
		
		System.out.println("State after restoring state of TEXT EDITOR : " + textEditor);

	}
}

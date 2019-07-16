package com.learn.design_patterns.behavioural.memento;

import java.util.Stack;

public class CareTaker {
	private Stack<Memento> snapshots = new Stack<>();
	
	public void saveSnapshots(Memento snapshot) {
		this.snapshots.add(snapshot);
	}
	
	public Memento getSnapshot() {
		if(!snapshots.isEmpty()) {
			return this.snapshots.pop();
		}
		return null;
	}
}

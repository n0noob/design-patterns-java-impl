package com.learn.design_patterns.behavioural.chainofresponsibility;

public abstract class Handler {
	private Handler handler;

	public abstract void handle();

	public void setNext(Handler handler) {
		this.handler = handler;
	}

	public Handler getNextHandler() {
		return handler;
	}

	public void callNext() {
		if (handler != null) {
			System.out.println("Calling next handler ");
			handler.handle();
		}
		else {
			System.out.println("No next handler");
		}
	}

}

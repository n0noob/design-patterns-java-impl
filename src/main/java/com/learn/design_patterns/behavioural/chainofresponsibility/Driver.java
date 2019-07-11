package com.learn.design_patterns.behavioural.chainofresponsibility;

public class Driver {
	public static void main(String[] args) {
		UserPassword obj = new UserPassword("Anoop", "Password1");
		CredentialsAuthorizationHandler handler2 = new CredentialsAuthorizationHandler(obj, null);
		UserAuthenticationHandler handler1 = new UserAuthenticationHandler(obj, handler2);
		
		handler1.handle();
	}
}

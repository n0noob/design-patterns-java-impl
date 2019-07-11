package com.learn.design_patterns.behavioural.chainofresponsibility;

public class UserAuthenticationHandler extends Handler{

	private UserPassword obj;
	
	public UserAuthenticationHandler(UserPassword obj, Handler nextHandler) {
		this.obj = obj;
		if(nextHandler != null)
			super.setNext(nextHandler);
	}
	
	private void init() throws Exception {
		if(obj == null || obj.getUser() == null || obj.getUser().trim().equals(""))
			throw new Exception("Username is not valid");
	}
	
	private void validate() throws Exception {
		if(!obj.getUser().trim().equals("Anoop") && !obj.getUser().trim().equals("Prateek")) {
			throw new Exception("User not present in database");
		}
		System.out.println("UserAuthenticationHandler : User authenticated");
	}
	
	@Override
	public void handle() {
		try {
			init();
			validate();
			super.callNext();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

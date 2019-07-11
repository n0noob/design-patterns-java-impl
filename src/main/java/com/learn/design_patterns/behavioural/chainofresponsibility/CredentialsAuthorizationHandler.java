package com.learn.design_patterns.behavioural.chainofresponsibility;

public class CredentialsAuthorizationHandler extends Handler {
	private UserPassword obj;
	
	public CredentialsAuthorizationHandler(UserPassword obj, Handler nextHandler) {
		this.obj = obj;
		if(nextHandler != null)
			super.setNext(nextHandler);
	}
	
	private void init() throws Exception {
		if(obj == null || obj.getUser() == null || obj.getUser().trim().equals(""))
			throw new Exception("Username is not valid");
	}
	
	private void validate() throws Exception {
		if(obj.getUser().trim().equals("Anoop")) {
			System.out.println("CredentialsAuthorizationHandler : Superuser privileges granted");
		}
		else {
			throw new Exception("Super user not found");
		}
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

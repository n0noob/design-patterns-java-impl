package com.learn.design_patterns.behavioural.chainofresponsibility;

public class UserPassword {
	private String user;
	private String password;
	
	public UserPassword(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserPassword [user=" + user + ", password=" + password + "]";
	}
	
}

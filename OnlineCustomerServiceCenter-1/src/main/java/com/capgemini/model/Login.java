package com.capgemini.model;

public class Login {
	// userid - customer, operatorid - operator
	private int username;
	private String password;
	private UserType type;
	private boolean isActive;
	public Login() {
		super();
	}
	public Login(int username, String password, UserType type, boolean isActive) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
		this.isActive = isActive;
	}
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", type=" + type + ", isActive=" + isActive
				+ "]";
	}
	
}

package com.greatlearning.day3.practical;

public class User {
	User(int userId,String userName)
	{
		this.userId=userId;
		this.userName=userName;
	}
	int userId;
	String userName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}

package com.greatlearning.day3.practical;

public class Visitor extends User {
	String visitorPass;
	Visitor(int userId,String userName ,String visitorPass)
	{
		super(userId,userName);
		this.visitorPass=visitorPass;
	}

	/*
	 * public String getVisitorPass() { return visitorPass; }
	 * 
	 * public void setVisitorPass(String visitorPass) { this.visitorPass =
	 * visitorPass; }
	 */
	
    
}

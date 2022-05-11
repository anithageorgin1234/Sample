package com.greatlearning.day3.practical;

public class Client extends User {
String clientId;

Client(int userId,String userName ,String clientId)
{
	super(userId,userName);
	this.clientId=clientId;
}
/*
 * public String getClientId() { return clientId; }
 * 
 * public void setClientId(String clientId) { this.clientId = clientId; }
 */
}

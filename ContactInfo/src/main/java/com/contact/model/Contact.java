package com.contact.model;

import lombok.Data;

@Data
public class Contact {
	
	private String name;
	private int  phoneNumber;
	private String email;
	public Contact(String name, int phoneNumber, String email) {
	 
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	

}

package com.contact.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ContactServiceImpl implements ContactService {


	@Override
	public  ArrayList<Contact>  getContact() {
		
		log.info("inside getcontact");	 
		 ArrayList<Contact> contactDetails=new ArrayList<Contact>();
		 contactDetails.add(new Contact("anitha", 96733344, "anitha2greatlearning.com"));
		 contactDetails.add(new Contact("Gladd", 96733344, "anitha2greatlearning.com"));
		 contactDetails.add(new Contact("geefer", 96733344, "anitha2greatlearning.com"));
		 contactDetails.add(new Contact("aniwerwertha", 96733344, "anitha2greatlearning.com")); 
		 contactDetails.add(new Contact("sdf", 96733344, "anitha2greatlearning.com"));
		 
		return contactDetails;
	}

}

package com.contact.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.ContactEntity;
import com.contact.repository.ContactRepository;
import com.contact.service.ContactService;
 




@RestController
public class ContactController {
	
 
    @Autowired
    ContactRepository contactRepository;
	
    @GetMapping("/viewContact")
	public List<ContactEntity> viewContact( )
	{
    	System.out.println("insidee");
    	
    	
    	List<ContactEntity> contacts=contactRepository.findAll();
    	
     	System.out.println(contacts.size());
		return contacts;
	}
    
    
    @PostMapping("contacts")
   public ContactEntity createContact(@RequestBody ContactEntity contact)
   {
    	return contactRepository.save(contact);
   }
    
}
package com.contact.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.service.ContactService;
 

@Controller
public class ContactController {
	
    @Autowired
	ContactService customerSerive;	
	
    @RequestMapping("/viewContact")
	public String viewContact(Map<String, Object> model)
	{
		model.put("contacts",customerSerive.getContact());
		System.out.println("=============");
		return "view-contact";
	}

}

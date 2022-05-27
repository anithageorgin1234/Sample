package com.greatlearning.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.security.entity.InventoryDetails;
import com.greatlearning.security.entity.YearlyFinancialReport;
import com.greatlearning.security.service.RetailStoreService;

@RestController
public class RetailStoreController {
	
	@Autowired
	RetailStoreService retailStoreService;
	
	@GetMapping("/checkInventory")
	public boolean checkInventoryExist(Long id)
	{
		return retailStoreService.checkInventoryExist(id);
		
	}
	
	@GetMapping("/viewInventory")
	public List<InventoryDetails> viewInventory()
	{
		return retailStoreService.viewInventory();
		
	}
	@PostMapping("/makeAnnouncement")
	public String makeAnnouncement(int discount)
	{
		return retailStoreService.makeAnnouncement(discount);
		
	}
	@GetMapping("/viewFinancials")
	public List<YearlyFinancialReport> viewFinancials()
	{
		return retailStoreService.viewFinancials();
		
	}
	@PostMapping("/doCheckout")
	public String doCheckout()
	{
		return retailStoreService.doCheckout();
		
	}
}

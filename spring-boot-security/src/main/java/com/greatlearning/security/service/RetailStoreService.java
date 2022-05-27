package com.greatlearning.security.service;

import java.util.List;

 
import com.greatlearning.security.entity.InventoryDetails;
import com.greatlearning.security.entity.YearlyFinancialReport;

public interface RetailStoreService {
	boolean  checkInventoryExist(Long id);
	List<InventoryDetails> viewInventory();
	String makeAnnouncement(int discount);
	List<YearlyFinancialReport> viewFinancials();
	String doCheckout();
}

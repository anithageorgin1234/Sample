package com.greatlearning.security.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.security.Repository.EmployeeRepository;
import com.greatlearning.security.Repository.InventoryDetailsRepository;
import com.greatlearning.security.Repository.YearlyFinancialReportRepository;
import com.greatlearning.security.entity.Employee;
import com.greatlearning.security.entity.InventoryDetails;
import com.greatlearning.security.entity.YearlyFinancialReport;
import com.greatlearning.security.service.RetailStoreService;
@Service
public class RetailStoreServiceImpl implements RetailStoreService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	InventoryDetailsRepository inventoryDetailsRepository;
	
	@Autowired
	YearlyFinancialReportRepository yearlyFinancialReportRepository;

	@Override
	public boolean checkInventoryExist(Long id) {
		
		return inventoryDetailsRepository.existsById(id);
	}

	@Override
	public List<InventoryDetails> viewInventory() {
		// TODO Auto-generated method stub
		return inventoryDetailsRepository.findAll();
	}

	@Override
	public String makeAnnouncement(int discount) {
		// TODO Auto-generated method stub
		return discount + "% off";
	}

	@Override
	public List<YearlyFinancialReport> viewFinancials() {
		// TODO Auto-generated method stub
		return yearlyFinancialReportRepository.findAll();
	}

	@Override
	public String doCheckout() {
		// TODO Auto-generated method stub
		return "fake checkut";
	}
	

}

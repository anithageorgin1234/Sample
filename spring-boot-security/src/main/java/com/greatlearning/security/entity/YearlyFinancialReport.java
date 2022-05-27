package com.greatlearning.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class YearlyFinancialReport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@Column(name="ITEM_NAME")
	private String itemName;
	
	@Column(name="FINANCIAL_YEAR")
	private String fiancialYear;
	
	@Column(name="NET_REVENUE")
	private int netRevenue;
	
	@Column(name="MATERIAL_COST")
	private int materialCost;
	
	@Column(name="NET_PROFIT")
	private int netProfit;
	
	
}

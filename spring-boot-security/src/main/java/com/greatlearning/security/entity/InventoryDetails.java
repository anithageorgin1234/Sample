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
public class InventoryDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(name="ITEM_NAME")
	private String itemName;
	
	@Column(name="NUMBER_OF_ITEMS_AVILABLE")
	private int numberOfItemsAvilable;
	
	@Column(name="PRICE")
	private int price;
	
	
}

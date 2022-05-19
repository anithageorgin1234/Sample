package com.greatlearning.linkedlist;

public class ProductList {
private int id;
private String name;
private int price;
public ProductList(int id, String name, int price) {
 
	this.id = id;
	this.name = name;
	this.price = price;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public int getPrice() {
	return price;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}


	
}

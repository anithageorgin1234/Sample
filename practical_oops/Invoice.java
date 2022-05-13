package com.grearlearning.practical;

public class Invoice {

	int id;
	Customer customer;
	double amount;
	
	Invoice(int id,Customer customer,double amount)
	{
		this.id=id;
		this.customer=customer;
		this.amount=amount;
	}
	
	public int getCustomerDiscount()
	{
		return  this.customer.discount;
	}
	public double getAmountAfterDiscount()
	{
		double amountAfterDiscount=this.amount- getCustomerDiscount();
		 
		return amountAfterDiscount;
	}
	public int getId() {
		return id;
	}



	public Customer getCustomer() {
		return customer;
	}



	public double getAmount() {
		return amount;
	}



	public static void main(String[] args) {
	      // Test Customer class
	      Customer c1 = new Customer(88, "Tan Ah Teck", 10);
	      

	      // Test Invoice class
	      Invoice inv1 = new Invoice(101, c1, 888.8);
	      System.out.println("customer's Amount is: " + inv1.getAmount());
	      System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
	      System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());

	}

}

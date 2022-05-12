package com.greatlearning.interfacedemo;

public class BankDemo {

	public static void main(String[] args) {
		 Bank b=new SBI();
		 System.out.println(b.rateOfInterest());
		 Bank b1=new Canara();
		 System.out.println(b1.rateOfInterest());

	}

}

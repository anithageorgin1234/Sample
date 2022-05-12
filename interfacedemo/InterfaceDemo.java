package com.greatlearning.interfacedemo;

public class InterfaceDemo implements Printable {

	public static void main(String[] args) {
		InterfaceDemo obj=new InterfaceDemo();
		obj.print();
	}

	@Override
	public void print() {
		System.out.println("Hello");
		
	}

}

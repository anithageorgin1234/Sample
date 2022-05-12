package com.greatlearning.interfacedemo;

interface print
{
	void print();
}
interface show
{
	void show();
	void print();
}

public class MultipleInheritanceDemo implements print,show {


	public static void main(String[] args) {
		MultipleInheritanceDemo multipleInheritanceDemo=new MultipleInheritanceDemo();
		multipleInheritanceDemo.show();
		multipleInheritanceDemo.print();
     
	}

	@Override
	public void show() {
	System.out.println("show");
		
	}

	@Override
	public void print() {
		System.out.println("Print");
		// TODO Auto-generated method stub
		
	}

}

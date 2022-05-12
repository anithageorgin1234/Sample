package com.greatlearning.interfacedemo;


interface printdemo
{
	void print();
}
interface showdemo  extends printdemo
{
	void show();
 
}
public class InterfaceInheritance  implements showdemo{

	public static void main(String[] args) {
		InterfaceInheritance interfaceInheritance=new InterfaceInheritance();
		interfaceInheritance.show();
		interfaceInheritance.print();

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

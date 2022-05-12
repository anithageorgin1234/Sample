package com.greatlearning.interfacedemo;
interface Defaultdemo
{
	void drwademo();
	default void msg() {///java 8 feature default methods
		System.out.println("Default Method");//Static metthod refernce also java 8 ferature
	}
	
	static int cube(int x) {return x*x*x;}
	
}

public class InterfaceDefaultMethodDemo  implements Defaultdemo{
	

	public static void main(String[] args) {
		Defaultdemo d=new InterfaceDefaultMethodDemo();
		d.drwademo();
		d.msg();
		System.out.println(Defaultdemo.cube(10));

	}

	@Override
	public void drwademo() {
		System.out.println("Draw Demo");
		
	}

}

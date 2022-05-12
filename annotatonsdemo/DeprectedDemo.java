package com.greatlearning.annotatonsdemo;

class Deper
{
	void m()
	{
		System.out.println("Hello M");
	}
	
	@Deprecated
	void n()
	{
		System.out.println("Hello N");
	}
}
public class DeprectedDemo {

	public static void main(String[] args) {
		Deper s=new Deper();
		s.n();

	}

}

package com.greatlearning.generics;

import java.util.ArrayList;

public class UpperBoundDemo {
	
	private static Double add(ArrayList<? extends Number>num)
	{
		double sum=0.0;
		for(Number n:num)
		{
			sum=sum+n.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println("Sujm of integers"+add(l1));
		ArrayList<Double> l2=new ArrayList<Double>();
		l2.add(10.78);
		l2.add(20.90);
		l2.add(30.34);
		System.out.println("Sujm of integers"+add(l2));

	}

}

package com.greatlearning.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCardDemo {
	
	public static void display(List<?> list)
	{
		for(Object o:list)
		{
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		 List<Integer> l1=Arrays.asList(1,2,3);
		 System.out.println("Display integer values");
		 display(l1);
		 List<String> l2=Arrays.asList("one","Two","three");
		 System.out.println("Displaying String Arrya");
		 
		 display(l2); 

	}

}

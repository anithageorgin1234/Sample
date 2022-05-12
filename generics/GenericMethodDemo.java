package com.greatlearning.generics;

public class GenericMethodDemo {
	
	public static <E> void printArray(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		 Integer[] intArray= {10,20,30,40,50,60};
		 Character[] charArray= {'A','N','I','T','H','A'};
		 printArray(intArray);
		 printArray(charArray);

	}

}

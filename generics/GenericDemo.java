package com.greatlearning.generics;

public class GenericDemo {

	public static void main(String[] args) {
	MyGen<Integer> myInteger=new MyGen<Integer>();
	
    myInteger.add(10);
    System.out.println(myInteger.get());
    MyGen<String> myString =new MyGen<String>();
    myString.add("Anitha");
    System.out.println(myString.get());
	}
	
 /*Type parameters
  * 1.  T-Type
  * 2.  E-Element
  * 3.  K-Key
  * 4.  N-Number
  * 5.  V-Value
  */

}

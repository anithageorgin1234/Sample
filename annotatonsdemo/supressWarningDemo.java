package com.greatlearning.annotatonsdemo;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class supressWarningDemo {

	public static void main(String[] args) {
 ArrayList list=new ArrayList();
 list.add("Anitha");
 list.add("Anitha");
 list.add("Anitha");
 
 for(Object obj:list)
 {
	 System.out.println(obj);
 }
	}

}

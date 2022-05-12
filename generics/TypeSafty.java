package com.greatlearning.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeSafty {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(10);
		list.add("Anitha");
		String name=(String)list.get(1);
		//1. Typer Safety
		List<Integer> listGeneric =new ArrayList<Integer>();
		listGeneric.add(10);
		 //listGeneric.add("10");//3.Comple time chcking this line ill throw error at complie time
		
		//2.Type casting not required
		
		List<String> listGenericString =new ArrayList<String>();
		listGenericString.add("Anitha");
		String nameg=listGenericString.get(0);
		
		

	}

}

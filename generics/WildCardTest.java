package com.greatlearning.generics;

import java.util.ArrayList;
import java.util.List;

abstract class Shape
{
	abstract void draw();
}


class Rectangle extends Shape
{

	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
		
	}
	
}


class Circle extends Shape
{

	@Override
	void draw() {
		System.out.println("Drawing Circle");
		
	}
	 
	
}


public class WildCardTest {
	
	public static void drawShape(List<? extends Shape> lists)
	{
		for(Shape s:lists)
		{
			s.draw();
		}
	}

	public static void main(String[] args) {
		List <Rectangle> list1=new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		
		List <Circle> list2=new ArrayList<Circle>();
		list2.add(new Circle());
		drawShape(list1);
		drawShape(list2);
		 
	}

}

package com.greatlearning.composition;

public class Car {
private String colour;
private int max_speed;
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getMax_speed() {
	return max_speed;
}
public void setMax_speed(int max_speed) {
	this.max_speed = max_speed;
}


public void carDetail()
{
	System.out.println("Car Colour="+colour+":: Maximum Speed="+max_speed);
}


}

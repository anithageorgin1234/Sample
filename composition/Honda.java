package com.greatlearning.composition;

public class Honda  extends Car{

	public void HondaStart()
	{
		CarEngine hondaEngine=new CarEngine();//composition
		hondaEngine.StartEngine();
		
	}
	
	public static void main(String[] args) {
		Honda hondaCity=new Honda();
		hondaCity.setColour("Black");
		hondaCity.setMax_speed(170);
		
		hondaCity.carDetail();
		hondaCity.HondaStart();
	}

}

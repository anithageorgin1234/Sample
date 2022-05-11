package com.greatlearning.day3.studentpractical;

public class Student {
	private static int  Id=1;
	private int studId;
	private String studName;
	private boolean isPresent;	
	
	public int getStudId() {
		return studId;	}
 	public void setStudId(int studId) {
		this.studId = studId;
	}
  
 	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public boolean isPresent() {
		return isPresent;
	}
 	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}




	public static int getId()
	{
		return  Id++;
	}
	 
}

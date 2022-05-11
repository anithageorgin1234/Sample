package com.greatlearning.day3.studentpractical;

import java.util.Scanner;

import com.greatlearning.day3.practical.Task;

public class AttendanceDAO {
	
	Student[] students=new Student[5];
	Scanner in = new Scanner(System.in);
	public void setStudent()
	{
		for(int i=0;i<5;i++)
		{
		
		students[i]=new Student();
		students[i].setStudId(Student.getId());
		System.out.print("Enter Student Name ");
		students[i].setStudName(in.nextLine());
		students[i].setPresent(false);
		 
		}		

	}
	
	public void getStudent()
	{
		for(Student student:students)
		{
		
			System.out.println(" Student id "+student.getStudId());
			System.out.println("Student Name "+student.getStudName());
			System.out.println("Present "+(student.isPresent()?"Present":"Absent"));
		 
		}		

	}
	
	public void markAttendance(int studId,String status)
	{
		for(Student student:students)
		{
			if(student.getStudId()==studId)
			{
				student.setPresent(status.equals("P")?true:false);
			}
		}
	}

}

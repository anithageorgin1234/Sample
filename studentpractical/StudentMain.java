package com.greatlearning.day3.studentpractical;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		AttendanceDAO attendanceDAO=new AttendanceDAO();
		attendanceDAO.setStudent();
		Scanner in = new Scanner(System.in);
		Scanner inString = new Scanner(System.in);
		attendanceDAO.getStudent();
		
		 
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter id ");
			int id=in.nextInt();
			System.out.print("Mark Attendence");
			String status=inString.nextLine();			 
			attendanceDAO.markAttendance(id,status);
		}
		attendanceDAO.getStudent();
		
		
	}
	
}

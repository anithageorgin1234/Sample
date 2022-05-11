package com.greatlearning.day3.practical;

import java.util.Scanner;

public class TaskDemo {
		
	public static void main(String[] args) {
		String[] options = { "1-Add", "2-Update", "3-Delete", "4-Search", "5-Exit" };
		Scanner in = new Scanner(System.in);
		TaskDAO taskDao=new TaskDAO();
		UserDAO  userDao=new UserDAO();
		//taskDao.setTask();
		//taskDao.getTask();
		userDao.setUser();
		userDao.getUser();

		int option = 1;
		while (option != 5) {
			for (String optiondet : options) {
				System.out.println(optiondet);

			}

			System.out.println("Enter Option: ");

			option = in.nextInt();

			switch (option) {
			case 1: {

				taskDao.addTask();
				break;
			}
			case 2: {

				taskDao.updateTask();
				break;
			}
			case 5:
				break;
			}

		}
		
		
		
		
		
		
	}

}

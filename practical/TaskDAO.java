package com.greatlearning.day3.practical;

import java.util.Scanner;

public class TaskDAO {
	
	Task[] tasks=new Task[5];
	Scanner in = new Scanner(System.in);
	public void setTask()
	{
		for(int i=0;i<5;i++)
		{
		
		tasks[i]=new Task();
		tasks[i].setTaskId(Task.getId());
		System.out.print("Enter Task title ");
		tasks[i].setTaskTitle(in.nextLine());
		System.out.print("Enter Task Text ");
		tasks[i].setTaskText(in.nextLine());
		System.out.print("Enter Task Assigned To");
		tasks[i].setAssignedTo(in.nextLine());
		}		

	}
	
	public void getTask()
	{
		for(Task task:tasks)
		{
 
		System.out.println(" Task id "+task.getTaskId());
		System.out.println(" Task title "+task.getTaskTitle());
		System.out.println(" Task text "+task.getTaskText());
		System.out.println(" Task Assigned To "+task.getAssignedTo());
		}		

	}
	public void addTask()
	{
		Task newTask=new Task();
		newTask.setTaskId(Task.getId());
		System.out.print("Enter Task title ");
		newTask.setTaskTitle(in.nextLine());
		System.out.print("Enter Task Text ");
		newTask.setTaskText(in.nextLine());
		System.out.print("Enter Task Assigned To");
		newTask.setAssignedTo(in.nextLine());
		int n=tasks.length;
		Task[] newArray=new Task[n+1];
		for (int i = 0; i < n; i++) {

			newArray[i]=new Task();
			newArray[i] = tasks[i];
		}
		newArray[n] = newTask;
		System.out.println("==========After Addition========");
		for (Task task : newArray) {
			System.out.println(" Task id "+task.getTaskId());
			System.out.println(" Task title "+task.getTaskTitle());
			System.out.println(" Task text "+task.getTaskText());
			System.out.println(" Task Assigned To "+task.getAssignedTo());

		}
	}
	public void updateTask()
	
	{
		Task newTask=new Task();
		newTask.setTaskId(101);
		System.out.print("Enter new title ");
		newTask.setTaskTitle(in.nextLine());
		System.out.print("Enter new Text ");
		newTask.setTaskText(in.nextLine());
		System.out.print("Enter new Assigned To");
		newTask.setAssignedTo(in.nextLine());
		System.out.print("Enter position in which new rask needs to update");
		int position=in.nextInt();
		tasks[position]=newTask;
		 getTask();
	}

}

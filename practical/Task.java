package com.greatlearning.day3.practical;

public class Task {
	
	private static int  Id=1;
	private  int  taskId=0;
	private String taskTitle;
	private String taskText;
	private String assignedTo;
	
	public static int getId()
	{
		return  Id++;
	}
	 
	
	public int getTaskId() {
		return taskId;
	}


	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}


	public String getTaskTitle() {
		return taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public String getTaskText() {
		return taskText;
	}
	public void setTaskText(String taskText) {
		this.taskText = taskText;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
 

}

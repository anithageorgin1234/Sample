package com.greatlearning.day3.practical;

import java.util.Scanner;

public class UserDAO {

	Scanner in = new Scanner(System.in);
	Scanner inString = new Scanner(System.in);
	Client[] clients=new Client[2];
	Visitor[] visitors=new Visitor[2];
	
	void setUser()
	{
		for(int i=0;i<2;i++)
		{
			System.out.print("Enter Client ID ");
			 int id=in.nextInt();
			System.out.print("Enter Client  ");
			String name=inString.nextLine();
			System.out.print("Enter Varification ID");
			String clientID=inString.nextLine();
			clients[i]=new Client(id, name, clientID);
		}
		for(int j=0;j<2;j++)
		{

			System.out.print("Enter Visitor id");
			 int id=in.nextInt();
			System.out.print("Enter Visitor name ");
			String name=inString.nextLine();
			System.out.print("Enter Visitor Pass Info");
			String visistor=inString.nextLine();
			visitors[j]=new Visitor(id, name, visistor);
		
		}
	}
	
	public void getUser()
	{
		System.out.println("=======Client Information======");
		for(Client client:clients)
		{
 
		System.out.println(" Client id "+client.userId);
		System.out.println(" Client Name "+client.userName);
		System.out.println(" Client Varification ID "+client.clientId);
		 
		}		
		System.out.println("=======Visiotr Information======");
		for(Visitor visitor:visitors)
		{
 
		System.out.println(" Visitor id "+visitor.userId);
		System.out.println(" Visitor Name "+visitor.userName);
		System.out.println(" Visitor Pass Info "+visitor.visitorPass);
		 
		}		
	}
}
 
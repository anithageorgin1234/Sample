package com.greatlearning.linkedlist;

import java.util.Scanner;

import com.greatlearning.linkedlist.LinkedList.Node;
import com.greatlearning.week5.practical.Product;

public class ProductListDAO {
	Node head;//null
	
	class Node
	{
		ProductList data;
		Node next;
		
		Node(ProductList d)
		{
			data=d;
			next=null;
		}
	}

	Scanner in=new Scanner(System.in);
	Scanner inString=new Scanner(System.in);
	
	
	public void addProduct()
	{
		System.out.println("Enter Product ID");
		int id=in.nextInt();
		
		System.out.println("Enter Product Name");
		String name=inString.nextLine();
		
		
		System.out.println("Enter Product price");
		int price=in.nextInt();
		
		ProductList P=new ProductList(id, name, price);
		Node new_node=new Node(P);///node will create with value 10
		new_node.next=head;
		head=new_node;//head will cointain addtress of new_node
	 
	}
	public void delete()
	{
		Node temp=head,prev=null;
		System.out.println("Enter Product ID to be deleted");
		int value=in.nextInt();
		if(temp!=null && temp.data.getId()==value)
		{
			head=temp.next;//6700
			return;
		}
		while(temp!=null && temp.data.getId()!=value)
		{
			prev=temp;//6700  679 300
			temp=temp.next;//679  300 10
		}
		if(temp==null)
			return;
		prev.next=temp.next;//in 300 address 9000 adress will allocate
		
	}
	public void update( )
	{
		System.out.println("Enter Product ID");
		int id=in.nextInt();
		
		System.out.println("Enter Product Name");
		String name=inString.nextLine();
		
		
		System.out.println("Enter Product price");
		int price=in.nextInt();
		
		ProductList P=new ProductList(id, name, price);
		System.out.println("Enter Product ID to be update");
		int value=in.nextInt();
		Node tnode=head;
		while (tnode!=null)
		{
			if(tnode.data.getId()==value)
			{
				tnode.data=P;
				break;
			}
			else
				tnode=tnode.next;
			
		}
	}
	public void printList()
	{
		Node tnode=head;//8900
		while(tnode!=null)
		{
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
	
}

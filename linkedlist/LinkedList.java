package com.greatlearning.linkedlist;

public class LinkedList {
	Node head;//null
	
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);///node will create with value 10
		new_node.next=head;
		head=new_node;//head will cointain addtress of new_node
	}
	
	public void append(int new_data)
	{
		Node new_node=new Node(new_data);
		if(head==null)
		{
			head=new Node(new_data);
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=new_node;
	}
	public void inserAfter(int prev_data,int new_data)
	{
		Node prev_node=head;
		
		while(prev_node!=null)
		{
			if(prev_node.data==prev_data)
				break;
			else
				prev_node=prev_node.next;
		}
		
		if(prev_node==null)
		{
			System.out.println("Previuos node is null");
			return;
		}
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	public void delete(int value)
	{
		Node temp=head,prev=null;
		if(temp!=null && temp.data==value)
		{
			head=temp.next;//6700
			return;
		}
		while(temp!=null && temp.data!=value)
		{
			prev=temp;//6700  679 300
			temp=temp.next;//679  300 10
		}
		if(temp==null)
			return;
		prev.next=temp.next;//in 300 address 9000 adress will allocate
		
	}
	public void update(int prev_data,int new_data)
	{
		Node tnode=head;
		while (tnode!=null)
		{
			if(tnode.data==prev_data)
			{
				tnode.data=new_data;
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList list=new LinkedList();
     list.push(10);
     list.push(300);
     list.push(6700);
     list.append(9000);
     list.inserAfter(6700 , 679);
     list.printList();
     System.out.println("=====After Deletion======");
     list.delete(10);
     list.printList();
     System.out.println("=====After upodation======");
     list.update(6700, 10000);
     list.printList();
	}

}

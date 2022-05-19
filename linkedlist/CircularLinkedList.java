package com.greatlearning.linkedlist;

import com.greatlearning.linkedlist.DoublyLinkedList.Node;

public class CircularLinkedList {

	Node head=null;
	Node tail=null;
    class Node
    {
    	int data;
    	Node next;
    	public Node(int data)
    	{
    		this.data=data;
    	}
    	
    }
    public void add(int data)
    {
    	Node newNode=new Node(data);
    	
    	if(head==null)
    	{
    		head=newNode;
    		newNode.next=head;
    		tail=newNode;
    	}
    	else
    	{
    		tail.next=newNode;
    		tail=newNode;
    		tail.next=head;
    		
    	}
    }
    public void printList()
	{
		Node tnode=head; 
		do
		{

			System.out.println(tnode.data);
			tnode=tnode.next;
		
		}
		while(head!=tnode);
	 
	}
	public static void main(String[] args) {
		CircularLinkedList circularLinkedList=new CircularLinkedList();
		circularLinkedList.add(90);
		circularLinkedList.add(33330);
		circularLinkedList.add(67);
		circularLinkedList.printList();

	}

}

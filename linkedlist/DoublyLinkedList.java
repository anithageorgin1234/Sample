package com.greatlearning.linkedlist;

import com.greatlearning.linkedlist.LinkedList.Node;

public class DoublyLinkedList {
	Node head=null;
	Node tail=null;
	class Node
	{
		String data;
		Node prev;
		Node next;
		
		public Node(String data)
		{
			this.data=data;
		}
		
	}
	public void addInStart(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;//anitha
			tail=newNode;//anitha
			head.prev=null;
			 
		}
		else
		{
			head.prev=newNode;
			newNode.next=head;
			newNode.prev=null;
			head=newNode;
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
		DoublyLinkedList list=new DoublyLinkedList();
		list.addInStart("anitha");
	     list.addInStart("gladwin");
       list.printList();
	}

}

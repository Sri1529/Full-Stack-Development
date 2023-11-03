package Assesment_4;
import java.util.*;

import DataStructure.sibglellpractise2.Node;
public class Singly_linked_list {
	
	public class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
public  void addnode(int num)
{
	Node newnode=new Node(num);
	if(head==null)
	{
		head=newnode;
		tail=newnode;
	}
	else
	{
		tail.next=newnode;
		tail=newnode;
	}
}
public void insertatend(int num)
{
	Node newnode=new Node(num);
	if(head==null)
	{
		head=newnode;
		tail=newnode;
	}
	else
	{
		tail.next=newnode;
		tail=newnode;
	}
}
public void insertatbegning(int num)
{
	Node newnode=new Node(num);
	  newnode.next=head;
	  head=newnode;
	
}

	
public void display()

{
	Node current=head;
	if(head==null)
	{
		System.out.println("The list is empty:");
	}
	else
	{
		System.out.println("The elements in the list are:");
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singly_linked_list sc=new Singly_linked_list();
		sc.addnode(10);
		sc.addnode(20);
		sc.insertatend(100);
		sc.addnode(30);
		sc.insertatbegning(1000);
		sc.insertatbegning(2000);
		
		sc.display();

	}

}

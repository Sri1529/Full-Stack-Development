package DataStructure;
import java.util.*;
public class Singly_Linked_list {
	
	public class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data= data;
			this.next=null;
		}
		
	}
	public Node head=null;
	public Node tail=null;
	
	public void addnode(int data)
	{
		Node newNode =  new Node(data);
		
		if(head ==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	
	public void display()
	{
		Node current=head;
		if(head==null)
		{
			System.out.println("List is empty...");
			return;
		}
		else
		{
			System.out.println("Nodes of simply linkedlist are:");
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println("nodes are completed");
		}
	}
	public void insertatbegning(int data)
	{
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
		
	}
	public void insertatend(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
			return;
		}
         tail.next=newnode;
         tail=newnode;
	}

	public static void main(String[] args) {
		Singly_Linked_list sl=new Singly_Linked_list();
		sl.display();
		sl.addnode(1);
		sl.insertatend(600);
		sl.addnode(2);
		sl.addnode(3);
		sl.addnode(4);
		sl.insertatbegning(100);
		sl.insertatend(0);
		sl.display();
		
		
		

	}

}

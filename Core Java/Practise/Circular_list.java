package Practise;
import java.util.*;
public class Circular_list {
	public class Node
	{
		int data;
		Node next,prev;
		public Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void addnode(int data)
	{
		Node newnode = new Node(data);
		if(tail!=null)
		{
			tail.next=newnode;
			newnode.next=head;
		}
		tail=newnode;
		if(head==null)
		{
			head=newnode;
		}
		
	}
	public void deletenode(int data)
	{
		Node delnode = new Node(data);
		Node current=head;
		if(head==null)
		{
			System.out.println("the list is empty..");
		
		}
		do
		{
			if(head.data==data&&current==head)
			{
				delnode=head.next;
				tail.next=delnode;
				head=delnode;
				
			}
			else if(current.next.data==data)
			{
				current.next=current.next.next;
				//delnode=current.next.next;
			}
			else if(current.next==head)
			{
				System.out.println("Invalid syntax...");
			}
			current=current.next;
		}while(current!=head);
	}
	public void display()
	{
		Node current=head;
		do
		{
			System.out.println(current.data);
			current=current.next;
		}while(current!=head);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circular_list sc = new Circular_list();
		sc.addnode(1);
		sc.addnode(2);
		sc.addnode(3);
		sc.addnode(4);
		sc.deletenode(0);
		sc.display();
		

	}

}

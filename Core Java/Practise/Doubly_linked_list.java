package Practise;
import java.util.*;
public class Doubly_linked_list {
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
		Node newnode=new Node(data);
		Node temp=head;
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		
		if(tail!=null)
		{
			tail.next=newnode;
			newnode.prev=tail;
			
		}
		tail=newnode;
		
	}
	
	public void iteratefrwrd()
	{
		Node current=head;
		System.out.println("The elements in the list are...");
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public void backward()
	{
		Node current=tail;
		System.out.println("Backward:");
		while(current!=null)
		{
			System.out.print(current.data);
			current=current.prev;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly_linked_list sc=new Doubly_linked_list();
		sc.addnode(2);
		sc.addnode(3);
		sc.addnode(4);
		sc.addnode(5);
		sc.iteratefrwrd();
		sc.backward();

	}

}

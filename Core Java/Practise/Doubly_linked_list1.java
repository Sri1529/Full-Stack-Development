package Practise;
import java.util.*;
public class Doubly_linked_list1 {
	int falg=0;
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
		Node newnode =new Node(data);
		
		if(tail!=null)
		{
			tail.next=newnode;
			newnode.prev=tail;
		}
		tail=newnode;
		if(head==null)
		{
			head=newnode;
		}
		
	}
	public void deletefrnt()
	{
		
			head=head.next;
			head.prev=null;
		
		
	}
	public void delback()
	{
		tail=tail.prev;
		tail.next=null;
	}
	public void delelement(int data)
	{
		Node temp=head;
		if(head.data==data)
		{
			head=head.next;
			head.prev=null;
			return;
		}
	    while(temp!=null)
	    {
	    	if(temp.data==data&&temp.next!=null)
	    	{
	    		temp.prev.next=temp.next;
	    		temp.next.prev=temp.prev;
	    		falg=1;
	    	}
	    	else if(temp.data==data)
	    	{
	    		temp.prev.next=null;
	    		tail=temp.prev;
	    	}
	    	temp=temp.next;
	    }
		
	}
	public void iterate()
	{
		Node current=head;
		System.out.println("Forward:");
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
		
	}
	public void iteratebck()
	{
		Node current=tail;
		System.out.println("Backward:");
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.prev;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly_linked_list1 sc = new Doubly_linked_list1();
		sc.addnode(1);
		sc.addnode(2);
		sc.addnode(3);
		sc.addnode(4);
		sc.addnode(5);
		sc.deletefrnt();
		sc.delback();
		sc.delelement(3);
		sc.iterate();
		sc.iteratebck();
		

	}

}

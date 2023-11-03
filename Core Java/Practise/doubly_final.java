package Practise;
import java.util.*;
public class doubly_final {
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
	public  void addnode(int data)
	{
		Node newnode=new Node(data);
		if(tail!=null)
		{
			tail.next=newnode;
			newnode.prev=tail;
			//newnode.next=null;
			
		}
		tail=newnode;
		if(head==null)
		{
			head=newnode;
		}
	}
	public void removeelement(int data)
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
				temp.next.prev=temp.prev;
				temp.prev.next=temp.next;
			}
			if(temp.next==null)
			{
				temp.prev.next=null;
				tail=temp.prev;
			}
			temp=temp.next;
		}
		
	}
	public void removefrnt()
	{
		head=head.next;
		head.prev=null;
	}
	public void removeback()
	{
		tail=tail.prev;
		tail.next=null;
	}
	public  void iteratefrwrd()
	{
		Node current=head;
		System.out.println("Forward:");
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println("");
	}
	public  void iteratebckward()
	{
		Node current=tail;
		System.out.println("Backward:");
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.prev;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubly_final sc= new doubly_final();
		sc.addnode(1);
		sc.addnode(2);
		sc.addnode(3);
		sc.addnode(4);
		sc.addnode(5);
		sc.removeelement(5);
		sc.removefrnt();
		sc.removeback();
		sc.iteratefrwrd();
		sc.iteratebckward();
		
		

	}

}

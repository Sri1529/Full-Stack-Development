package Practise;
import java.util.*;
public class singlylinkedlist_final {
	public class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
			
		}
	}
	public Node head=null;
	public Node tail=null;
	public void addnode(int data)
	{
		Node newnode = new Node(data);
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
	public void removelement(int pos)
	{
		
		if(head==null)
		{
			return;
		}
		if(pos==0)
		{
			head=head.next;
		}
		Node temp=head;
		while(temp!=null)
		{
			for(int i=0;temp!=null&&i<pos-1;i++)
			{
				temp=temp.next;
				
			}
			if(temp==null||temp.next==null)
			{
				System.out.println("Invalid statament..");
				return;
			}
			//deletes the node..
			Node n1=temp.next.next;
			temp.next=n1;
		}
	}
	public void display()
	{
		Node current =head;
		System.out.println("Elements are:");
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singlylinkedlist_final sc= new singlylinkedlist_final();
		sc.addnode(1);
		sc.addnode(2);
		sc.addnode(3);
		sc.addnode(4);
		sc.addnode(5);
		sc.addnode(6);
		sc.removelement(5);
		sc.display();
		

	}

}

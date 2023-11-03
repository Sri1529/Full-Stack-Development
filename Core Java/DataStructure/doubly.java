package DataStructure;
import java.util.*;
public class doubly {
	int flag=0;
	public class Node
	{
		int data;
		Node Next,prev;
		
		public /*void */ Node(int data)
		{
			this.data=data;
			Next=null;
			prev=null;
		}
	}
		public Node head=null;
		public Node tail=null;
		public void addnode(int data)
		{
			Node newnode= new Node(data);
			if(tail!=null)
			{
				tail.Next=newnode;
				newnode.prev=tail;
				
			}
			tail=newnode;
			if(head==null)
			{
				head=newnode;
			}
		}
		public void addfrnt(int data)
		{
			Node newnode=new Node(data);
			if(head!=null)
			{
				head.prev=newnode;
				newnode.Next=head;
				
			}
			head=newnode;
			if(tail==null)
			{
				tail=newnode;
			}
		}
		
		public void removeelement(int data)
		{
			Node temp=head;
			if(head.data==data)
			{
				head=head.Next;
				head.prev=null;
			}
			
			while(temp!=null)
			{
				if(temp.data==data&&temp.Next!=null)
				{
					temp.Next.prev=temp.prev;
					temp.prev.Next=temp.Next;
					flag=1;
				}
				else	if(temp.data==data)
				{
					temp.prev.Next=null;
					tail=temp.prev;
					flag=1;
				}
				temp=temp.Next;
			}
			if(flag==0)
			{
				System.out.println("element is not present...");
			}
			
		}
		public void iterate_frnt()
		{
			Node temp=head;
			System.out.println("Ierate bckwrd:");
			while(temp!=null)
			{
				
				System.out.print(temp.data+" ");
				temp=temp.Next;
			}
			System.out.println("");
		}
		public void iteratebackward()
		{
			Node temp=tail;
			System.out.println("Ierate frwrd:");
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.prev;
			}
			System.out.println("");
		}
		public void display()
		{
			Node current=head;
			System.out.println("The nodes in tha list are:");
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.Next;
			}
		}
		
		
		
	
	public static void main(String args[])
	
	{
		doubly sc= new doubly();
		sc.addnode(3);
		sc.addnode(4);
		sc.addnode(5);
		sc.addnode(6);
		sc.addnode(7);
		sc.addfrnt(0);
		sc.iterate_frnt();
		sc.iteratebackward();
		sc.display();
	}

}

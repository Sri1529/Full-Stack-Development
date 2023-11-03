package DSA_Practise;
import java.util.*;

public class Singlee {
	
	public class Node
	{
		int data;
 		Node next;
		public Node(int data)
		{
			this.data=data;
			Node next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void addnode(int data)
	{
		Node newnode= new Node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			
		}
		tail=newnode;
		
	}
	public void delete(int data)
	{
		Node delnode= new Node(data);
		Node curr=head;
		while(curr.next!=null)
		{
			if(curr.next.data==delnode.data)
			{
				curr.next=curr.next.next;
			} 
			curr=curr.next;
		} 
		
	}
	public void display()
	{
		Node curr= head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singlee s= new Singlee();
		s.addnode(1);
		s.addnode(2);
		s.addnode(3);
		s.addnode(4);
		s.addnode(5);
		s.delete(2);
		s.display();

	}

}

package DSA_Practise;
import java.util.*;
public class single_link {
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
		Node dami = new Node(data);
		if(head==null)
		{
		    head=dami;
		    tail=dami;
		}
		else
		{
			tail.next=dami;
			tail=dami;
		}
	}
	public void between(int data)
	{
		Node ins= new Node(data);
		
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
		single_link s = new single_link();
		s.addnode(0);
		s.addnode(1); 
		s.addnode(2);
		s.addnode(3);
		s.addnode(4);
		s.display();
		

	}

}

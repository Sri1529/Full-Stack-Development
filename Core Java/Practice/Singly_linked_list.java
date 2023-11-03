package Practice;
import java.util.*;


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
	
	public  void addnode(int data)
	{
		
		Node newnode=new Node(data);
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
	
	public void display()
	{
		Node current=head;
		if(head==null)
		{
			System.out.println("the list is empty");
			return;
			
		}
		else
		{
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
		sc.addnode(3);
		sc.addnode(4);
		sc.addnode(5);
		sc.addnode(9);
		sc.display();

	}

}

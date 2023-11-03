package Practise;
import java.util.*;


public class singly_linked {
	
	public class Node
	{
		int data;
		Node next;
		
		public  Node(int data)
		{
			this.data=data;
			next=null;
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
		
		public void addbegning(int data)
		{
		  Node newnode=new Node(data);
		  
		  
		   newnode.next=head;
		   head=newnode;
		}
		
		public void delnode(int pos)
		{
			Node temp=head;
			if(head==null)
			{
				return;
			}
			else if(pos==0)
			{
				
				head=temp.next;
				return;
			}
			
			for(int i=0;temp!=null&i<pos-1;i++)
			{
				temp=temp.next;
				
				// If the key is not present
				 if (temp == null || temp.next == null)
				 return;
				 
				 
				//deletes the node...i.
				Node del = temp.next.next;
				 temp.next = del;
			}
			
		}
		public void display()
		{
			System.out.println("The nodes in the list are:");
			Node current=head;
			if(head==null)
			{
				System.out.println("The list is empty...");
			}
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singly_linked sc= new singly_linked();
		sc.addnode(3);
		sc.addnode(4);
		sc.addnode(5);
		sc.addnode(6);
		sc.addnode(7);
		sc.addbegning(0);
		sc.delnode(0);
		sc.display();
		
		
			
		

	}

}

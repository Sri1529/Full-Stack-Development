package DataStructure;
import java.util.*;
public class sibglellpractise2 {
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
  public void addnode(int data)
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
  public void insertatbeg(int data)
  {
	  Node newnode=new Node(data);
	  newnode.next=head;
	  head=newnode;
  }
  public void display()
  {
	  Node current =head;
	  if(head==null)
	  {
		  System.out.println("the list is empty");
	  }
	  
	  else
	  {
		  System.out.println("Nodes of simply linkedlist are:");
		  while(current!=null)
		  {
			  
			  System.out.print(current.data+" ");
			  current=current.next;
		  }
		  System.out.println();
	  }
	  
  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sibglellpractise2 sc=new sibglellpractise2();
		sc.addnode(3);
		sc.addnode(4);
		sc.addnode(5);
		sc.display();
		sc.insertatbeg(0);
		sc.display();
		

	}

}

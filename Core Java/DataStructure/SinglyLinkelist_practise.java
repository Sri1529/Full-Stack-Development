package DataStructure;
import java.util.*;
public class SinglyLinkelist_practise {
	
   class Node
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
	   
	   public void addnewNode(int data)
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
			   System.out.println("the lis is empty");
			   return;
		   }
		   else
		   {
			   System.out.println("the nodes are:");
			   while(current!=null)
			   {
				   System.out.println(current.data);
				   current=current.next;
			   }
			   System.out.println("completed...");
		   }
	   }
	   public void addatbegning(int data)
	   {
		   Node newnode=new Node(data);
		   newnode.next=head;
		   head = newnode;
	   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkelist_practise sc=new SinglyLinkelist_practise();
		sc.display();
		sc.addnewNode(1);
		sc.addnewNode(2);
		sc.addnewNode(3);
		sc.addnewNode(4);
		sc.display();

	}

}

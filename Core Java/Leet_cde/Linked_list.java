package Leet_cde;
import java.util.*;
public class Linked_list {
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
	Node head=null;
	Node tail=null;
	
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
			tail=newnode;
		}
		
	}
	public void display()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.data+" ");
			current=current.next;
		}
	}
	
	public Node add(Node l1,Node l2)
	{
		Node dummy= new Node(0);
		Node current=dummy;
		int carry=0;
		while(l1!=null||l2!=null||carry==1)
		{
			int sum=0;
			if(l1!=null)
			{
				sum=sum+l1.data;
				l1=l1.next;
			}
			if(l2!=null)
			{
				sum=sum+l2.data;
				l2=l2.next;
			}
			sum=sum+carry;
			carry=sum/10;
			Node no= new Node(sum%10);
			current.next=no;
			current=current.next;
		}return dummy.next;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Linked_list l1 = new Linked_list();
		Linked_list l2 = new Linked_list();
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		System.out.println("Enter the Numbers for L1:");
		int s=3;
		int arr[]=new int[s];
		int arr1[]=new int[s];
		
		for(int i=0;i<n;i++)
		{
		   arr[i]=sc.nextInt();	
		}
		System.out.println("Enter the Numbers for L2:");
		
		for(int i=0;i<n;i++)
		{
		   arr1[i]=sc.nextInt();	
		}
		for(int i=0;i<n;i++)
		{
			l1.addnode(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			l2.addnode(arr1[i]);
		}
		
		System.out.println(l1.add(l1, l2));
		l1.display();
		l2.display();
		
				

	}

}

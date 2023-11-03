package Leet_cde;
import java.util.*;
public class Linked_list_leet_code 
{
	public class Node
	{
		Node next;
		int data;
		public  Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public Node head;
	public Node tail;
	public void addnode(int data)
	{
		Node newnode =new Node(data);
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
		}
		else
		{
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
		}
	}
	public void solution(int data,int size)
	{
		Node current=head;
		Node current1=head;
		int i=1;
		while(current!=null)
		{
			if(i%size==0)
			{
				current
			}
			i++;
			current=current.next;
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Linked_list_leet_code s= new Linked_list_leet_code();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			s.addnode(arr[i]);
		}
		s.display();
		
		

	}

}

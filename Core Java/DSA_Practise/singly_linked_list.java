package DSA_Practise;

public class singly_linked_list {
	
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
	public void addNode(int data)
	{
		Node add= new Node(data);
		if(head==null)
		{
			head=add;
			tail=add;
		}
		
		else
		{
			tail.next=add;
			tail=add;
		}
	}
	public void delete(int data)
	{
		Node del=new Node(data);
		if(head.data==del.data)
		{
			head=head.next;
		}
		
		else
		{
			Node curr=head;
			while(curr!=null)
			{
				if(curr.next.data==del.data)
				{
					curr.next=curr.next.next;
				}
				curr=curr.next;
				
			}
		}
	}
	public void deletepos(int data)
	{
		Node deln= new Node(data);
		int d=2;
		if(data==1)
		{
			head=head.next;
		}
		
		else
		{
			Node curr=head;
			while(curr!=null)
			{
				if(d==data)
				{
					curr.next=curr.next.next;
					
				}
				d++;
				curr=curr.next;
			}
		}
		
	}
	int flag=0;
	public void search(int data)
	{
		Node curr=head;
		while(curr!=null)
		{
			if(curr.data==data)
			{
				//System.out.println("Data"+data+"is present");
				flag=1;
				break; 
			}
			
			else
			{
				flag=0;
			}
			curr=curr.next;
		}
		if(flag==1)
		{
			System.out.println("Data "+data+" is present");
		}
		else
		{

			System.out.println("Data "+data+" is not present");
		}
	}
	int count=0;
	int a=0;
	public void duplicate()
	{
		Node dp= head;
		Node dp1=head.next;
		while(dp.next!=null)
		{
		  while(dp1!=null)
		{
			if(dp.data==dp1.data)
			{
				// System.out.println(dp1.data+" is a duplicate element");
				count=1;
				 a=dp1.data;
			}
			else
			{
				//System.out.println("there is no duplicate element");
				count=0;
			}
			dp1=dp1.next;
		}
		  dp=dp.next;
		  dp1=dp.next;
		}
		if(count==1)
		{
			System.out.println(a+" is a duplicate element");
		}
		else
		{
			System.out.println("there is no duplicate element");
		}
	}
	public void display()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}               

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singly_linked_list s= new singly_linked_list();
				s.addNode(1);
				s.addNode(2);
				s.addNode(3);
				s.addNode(4);
				s.addNode(4);
				s.display();
				//s.delete(4);
				//s.display();
				s.deletepos(2);
				s.search(4);
				s.display();
				s.duplicate();

	}

}

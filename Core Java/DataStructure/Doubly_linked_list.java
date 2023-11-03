package DataStructure;

public class Doubly_linked_list {
	int flag=0;
	class Node
	{
		int data;
		public Node prev;
		public Node next;
		public Node(int data)
		{
			this.data=data;
			prev=null;
			next=null;
		}
	}
	Node head=null;
	Node tail=null;
	public void addNodefront(int data)
	{
		Node temp=new Node(data);
		if (head!=null)
		{
			head.prev=temp;
			temp.next=head;
		}
		head=temp;
		
		if(tail==null)
		{
			tail=temp;
		}
		System.out.println("New node addded: "+data);
	}
	public void addNode(int data)
	{
		Node temp=new Node(data);
		if (tail!=null)
		{
			tail.next=temp;
			temp.prev=tail;
		}
		tail=temp;
		if(head==null)
		{
			head=temp;
		}
		System.out.println("New node addded: "+data);
	}
	public int removeNodefront() 
	{
		
	Node temp=head;
	head=head.next;
	head.prev=null;
	System.out.println("deleted frnt: "+temp.data);
	return temp.data;       
	}
	public int removeNodeback() 
	{	
	Node temp=tail;
	tail=tail.prev;
	tail.next=null;
	System.out.println("deleted bck: "+temp.data);
	return temp.data;
	}
	public void removeElement(int data)
	{
		Node temp=head;
		if(head.data==data)
		{ 
			head=head.next;
			head/*.next*/.prev=null;
			return;
		}
		while(temp!=null)
		{
			if(temp.data==data&&temp.next!=null)
			{
				temp.next.prev=temp.prev;
				temp.prev.next=temp.next;
				flag=1;
			}
			else if(temp.data==data)
			{
				temp.prev.next=null;
				tail=temp.prev;
				flag=1;
			}
			temp=temp.next;
		}
		if(flag==0)
		{
			System.out.println("Element is not present");
		}
	}

	public void iterateForward()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void iteratebackward()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}


	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		Doubly_linked_list dl=new Doubly_linked_list();
		
		
		dl.addNode(2);
		dl.addNode(4);
		dl.addNode(6);
		dl.addNode(8);
		dl.addNode(10);
//		dl.iterateForward();
//		dl.iteratebackward();
	dl.removeNodefront();
		dl.removeElement(12);
		dl.removeElement(2);
		dl.addNodefront(1);
//		dl.removeNodeback();
		dl.iterateForward();
	}

}
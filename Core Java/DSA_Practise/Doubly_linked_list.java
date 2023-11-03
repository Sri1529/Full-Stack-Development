package DSA_Practise;

public class Doubly_linked_list {
	public class Node
	{
		int data;
		Node next,prev;
		public  Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
		
	}
	Node head=null;
	Node tail=null;
	public void addnode(int data)
	{
		Node addnode= new Node(data);
		if(tail!=null)
		{
			tail.next=addnode;
			addnode.prev=tail;
		}
		tail=addnode;
		if(head==null)
		{
			head=addnode;
		}
		
	}
	public void delete(int data)
	{
		Node delnode = new Node(data);
		if(delnode.data==head.data)
		{
			head=head.next;
			head.prev=null;
					
		}
		else
		{
			Node curr=head; 
			while(curr.next!=null)
			{
				if(curr.data==data)
				{
					curr.next.prev=curr.prev;
				    curr.prev.next=curr.next;
				}
				curr=curr.next;
			}
		}
	}
	public void display()
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.data+" ");
			ptr=ptr.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doubly_linked_list s= new Doubly_linked_list();
		s.addnode(1);
		s.addnode(2);
		s.addnode(3);
		s.addnode(4);
		s.addnode(5);
		s.delete(1);
		s.display();

	}

}

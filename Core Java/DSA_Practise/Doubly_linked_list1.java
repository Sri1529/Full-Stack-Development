package DSA_Practise;

public class Doubly_linked_list1 {
	public class Node
	{
		int data;
		Node prev,next;
		public Node(int data)
		{
			this.data=data;
			Node next=prev=null; 
		}
	}
	Node head=null;
	Node tail=null;
public void addnode(int data)
{
	 Node add= new Node(data);
	 if(tail!=null)
	 {
		 tail.next=add;
		 add.prev=tail;
		 
		 
	 }
	 tail=add;
	 if(head==null)
	 {
		 head=add;
	 }
	 
}
public void delete(int data)
{
	Node curr=head;
	while(curr!=null)
	{
		if(curr.data==data&&curr.next!=null)
		{
			curr.next.prev=curr.prev;
			curr.prev.next=curr.next;
		}
		else if(curr.data==data)
		{
			curr.prev.next=null;
			tail=curr.prev;
			
		}
		curr=curr.next;
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
		Doubly_linked_list1 s = new Doubly_linked_list1();
		s.addnode(1);
		s.addnode(2);
		s.addnode(3);
		s.addnode(4);
		s.addnode(5);
		s.delete(4);
		s.display();

	}

}

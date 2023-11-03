package DataStructure;

public class Sort_Doubly {
	class Node
	{
		int data;
		Node prev,next;
		public Node(int data)
		{
			this.data=data;
			prev=null;
			next=null;
		}
	}
	Node head=null;
	Node tail=null;
	
	public void addnodefrnt (int data)
	{
		Node temp=new Node(data);
		if(head!=null)
		{
			head.prev=temp;
			temp.next=head;
		}
		head=temp;
		if(tail==null)
		{
			tail=temp;
		}
	}
	public void addnode(int data)
	{
		Node temp= new Node(data);
		
		if(head==null)
		{
			head=temp;
		}
	  if(data>0)
	  {
		if(head.data<temp.data)
		{
		if(tail!=null)
		{ 
			
			
				tail.next=temp;
				temp.prev=tail;
				
			}
			
			
		
		}
		tail=temp;
		
	  }
		
		
	
		if(tail!=null)
		{
			if(head.data>temp.data)
			{
				head.prev=temp;
				temp.next=head;
			}
			
		}
	head=temp;
			
		
		
		
	
	}
    
	
	public void iteratefrwd()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort_Doubly sc = new Sort_Doubly();
		
		sc.addnode(3);
		
		sc.addnode(4);
		sc.addnode(5);
		sc.addnode(1);
		
		sc.addnode(2);
		sc.iteratefrwd();
		

	}

}

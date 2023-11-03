package DSA_Practise;

public class Singlel {
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			Node next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
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
	}// 5 7 8 -1 9 3 1 0
	public void insertbt(int data,int pos)
	{
		int i=1;
		Node ins= new Node(data);
		if(head==null)
		{
			head=ins;
			tail=ins;
		}
		Node curr=head;
		
		while(curr!=null)
		{
			if(i==pos-1)
			{
				ins.next=curr.next;
				curr.next=ins;
				
			}
			curr=curr.next;
			i++;
		}
		
	}
	public void deldup()
	{
		int i=1;
		if(head==null)
		{
			System.out.println("No data is available");
		}
		else
		{
			Node curr=head;
			while(curr!=null)
			{
				Node dup=curr.next;
				while(dup!=null)
				{
					if(curr.data==dup.data)
					{
						System.out.println("Duplicate data "+dup.data);
						
						
					}
					dup=dup.next;
				}
				curr=curr.next;
				i++;
			}
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
		Singlel s= new Singlel();
		s.addNode(1);
		s.addNode(2);
		s.addNode(3);
		s.addNode(4);
		s.addNode(5);
		s.addNode(6);
		s.addNode(7);
		s.addNode(8);
		s.insertbt(1, 4);
		
		s.display();
		s.deldup();
		

	}

}

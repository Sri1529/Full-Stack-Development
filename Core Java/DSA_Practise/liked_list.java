package DSA_Practise;

public class liked_list {
	public class Node
	{
		int data;
		Node next,prev;
		public Node(int data)
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
		public void delete(int data)
		{
			Node dlnode= new Node(data);
			if(dlnode.data==head.data)
			{
				head=head.next;
				
			}
			else
			{
				Node ptr1= head;
				while(ptr1.next!=null)
				{
					if(ptr1.next.data==data)
					{ 
						ptr1.next=ptr1.next.next;
						
					}
					ptr1=ptr1.next;
				}
				
			}
		}
		
		
		public void delpos(int pos)
		{
			Node posi = head; 
		    int i=2;
			if(pos==1)
			{
				head=head.next;
				
			} 
			else
			{
				
				while(posi!=null)
				{
					
					if(pos==i)
					{
						 posi.next=posi.next.next;
					}
					posi=posi.next;
					i++;
				  
				}
				
			}
		}
		public void display()
		{
			Node ptr= head;
			while(ptr!=null)
			{
				System.out.println(ptr.data+" ");
				ptr=ptr.next;
				
			}
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		liked_list s= new liked_list();
		s.addnode(1);
		s.addnode(2);
		s.addnode(4);
		s.addnode(6);
		s.addnode(16);
		s.display();
		//s.delete(4);
		s.delpos(3);
		s.display();
		

	}

}

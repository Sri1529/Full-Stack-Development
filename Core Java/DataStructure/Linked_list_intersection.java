package DataStructure;
class Linked_list_intersection {
	static class Node
	{
		int data;
		Node next;
	}
	
	public static Node push(Node head,int data)//add front
	{
		Node node = new Node();
		node.data=data;
		node.next=head;
		
		return node;
	}
	
	private static Node intersectionpoint(Node list1,Node list2)
	{
		Node firstTemp=list1;
		while(firstTemp!=null)
		{
			Node temp=list2;
			
			while(temp!=null)
			{
				if(firstTemp == temp)
				{
					return firstTemp;
				}
				temp=temp.next;
			}
			firstTemp=firstTemp.next;
		}
		return null;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first=null;
		for(int i=7;i>0;i--)
		{
			first=push(first,i);//first=head when it returns.....
		}
		
		Node second=null;
		for(int i=3;i>0;i--)
		{
			second=push(second,i);
		}
		
		second.next.next.next=first.next.next.next;
		
		Node addr=intersectionpoint(first,second);
				if(addr!=null)
				{
					System.out.println("The intersection point is:"+addr.data);
				}
				else
				{System.out.println("There is no intersection point ");
				
				}
		

	}
	}



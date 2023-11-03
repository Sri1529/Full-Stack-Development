package Practise;
import java.util.*;
public class Binar_search_tree {
	class Node
	{
		int data;
		Node left,right;
		public  Node(int key)
		{
			data=key;
			left=right=null;
		}
	}
	public Node root;
	Binar_search_tree()
	{
		root=null;
	}
	
	public void insert(int key)
	{
		root=insertkey(root,key);
	}
	
	Node insertkey(Node root,int key)
	{
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		if(key<root.data)
		{
			root.left=insertkey(root.left,key);
			
		}
		else if(key>root.data)
		{
			root.right=insertkey(root.right,key);
		}
		return root;
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Binar_search_tree t= new Binar_search_tree();
		System.out.println("Enter the number to insert");
		int n=sc.nextInt();
		t.insert(n);
		String Y,N;
		System.out.println("Do you want to continue Y/N");
		String in=sc.next();
		if(in =="Y")
		{
			
		}
		else if(in =="N")
		{
            
		}
		
	}

}

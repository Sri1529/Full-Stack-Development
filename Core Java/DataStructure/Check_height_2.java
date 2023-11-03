package DataStructure;

import DataStructure.Maximum_height_binary_tree.Node;

public class Check_height_2 {
	
	public static class Node
	{
		int data;
		Node left,right;
		
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public Node root;
	
	public Check_height_2()
	{
		root=null;
	}
	
	public int findheight(Node temp)
	{
		//check whether tree is empty
		if(root==null)
		{
			System.out.println("Tree is empty");
			return 0;
		}
		else
		{
			int leftheight=0,rightheight=0;
			
			//calculate the height of the left subtree
			if(temp.left!=null)
			{
				leftheight= findheight(temp.left);
			}
			
			//calculate the height of the right subtree
			
			if(temp.right!=null)
			{
				rightheight=findheight(temp.right);
			}
			
			//compare height of left and right subtree
			//and store maximum of two in variable max
			
			int max=(leftheight>rightheight)? leftheight : rightheight;
			
			return(max+1);
					
			
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Check_height_2 bt = new Check_height_2();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.right.right = new Node(6);
		bt.root.left.left.left= new Node(7);
		bt.root.left.left.right = new Node(8);
		bt.root.left.left.left.left = new Node(9);
		bt.root.right.right.left = new Node(10);
		bt.root.right.right.left.left = new Node(12);
		bt.root.right.right.left.right = new Node(13);
		
		//display the maximum height of the given binary tree
		
		System.out.println("Maximum height of given binary tree:"+bt.findheight(bt.root));

	}

}

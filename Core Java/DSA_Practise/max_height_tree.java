package DSA_Practise;



public class max_height_tree 
{
	public static class Node{
		Node left,right;
		int data;
		public Node(int data)
		{
			this.data=data;
			//this.left=null;
			//this.right=null;
		}
	}
	public Node root=null;
	public int findmaxheight(Node temp)
	{
		if(temp==null)
		{
		   System.out.println("The tree is empty");
		   return 0;
		}
		else
		{
			int leftheight=0;
			int rightheight=0;
			if(temp.left!=null)
			{
				leftheight=findmaxheight(temp.left);
			}
			 if(temp.right!=null)
			{
				rightheight=findmaxheight(temp.right);
			}
			 int max=(leftheight>rightheight)?leftheight:rightheight;
			 return(max+1);
			
		}
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max_height_tree bt= new max_height_tree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.right.left = new Node(5);
		bt.root.right.right = new Node(6);
		bt.root.right.right.right = new Node(7);
		bt.root.right.right.right.right = new Node(8);
		System.out.println("Maximim Height of the tree is "+bt.findmaxheight(bt.root));

	}

}

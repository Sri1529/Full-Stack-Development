package DSA_Practise;

public class BST {
	public class Node
	{
		int data;
		Node left,right;
		public Node(int data)
		{
			this.data=data;
			Node left=right=null;
		}
	}
	Node root=null;
	public void insert(int data)
	{
		root=insert(root,data);
	}
	public Node insert(Node root,int data)
	{
		if(root==null)
		{
			root= new Node(data);
			return root;
		}
		if(data<root.data)
		{
			root.left=insert(root.left,data);
		}
		else if(data>root.data)
		{
			root.right=insert(root.right,data);
		}
		return root; 
		
	}
	void inorder()
	{
		inorderdir(root);
	}
	void inorderdir(Node root)
	{
		if(root!=null)
		{
			inorderdir(root.left);
			System.out.println(root.data);
			inorderdir(root.right);
		}
		
		
	}
	void preorder()
	{
		preorderdis(root);
	}
 void preorderdis(Node root)
 {
	 if(root!=null)
	 {
		 System.out.print(root.data+" ");
		 preorderdis(root.left);
		 preorderdis(root.right);
	 }
	
 }
 public void delete(int data)
 {
	 root=deletekey(root,data);
 }
 
 Node deletekey(Node root,int data)
 {
	 if(root==null)
	 {
		 return root;
	 }
	 if(data<root.data)
	 {
		 root.left=deletekey(root.left,data);
	 }
	 else if(data>root.data)
	 {
		 root.right=deletekey(root.right,data);
		 
	 }
	 else
	 {
		 if(root.left==null)
		 {
			 return root.right;
		 }
		 else if(root.right==null)
		 {
			 return root.left;
		 }
		 root.data=minval(root.right);
		 root.right=deletekey(root.right,root.data);
	 }
	return root;
			 
 }
 int minval(Node root)
 {
	 int minv=root.data;
	 while(root.left!=null)
	 {
		 minv=root.left.data;
		 root=root.left;
	 }
	 
	 return minv;
 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST s = new BST();
		s.insert(8);
		s.insert(3);
		s.insert(1);
		s.insert(6);
		s.insert(7);
		s.insert(10);
		s.inorder();
		//s.preorder();

	}

}

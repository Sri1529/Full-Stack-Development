package DataStructure;

public class Binary_search_tree 
{
	class Node
	{
		int key;
		Node left,right;
		public Node(int item)
		{
			key=item;
			left=right=null;
			
		}
	}
	Node root;
	Binary_search_tree()
	{
		root=null;
	}
	void insert(int key)
	{
		root=insertKey(root,key); 
	}   
	
	//insert key in the tree
	
	Node insertKey(Node root,int key)
	{
		//return a new node if the tree is empty
		if(root ==null)
		{
			root=new Node(key);
			return root;
		}
		//traverse to the right place and insert the node
		if(key<root.key)  
		{
			root.left = insertKey(root.left,key); 
		}
		else if(key>root.key)
		{
			root.right =  insertKey(root.right,key);
		}
		return root;
			
		
	}
	void inorder()
	{
		inorderRec(root);
	}
	
	//inorder Traversal
	void inorderRec(Node root)
	{
		if(root!=null)
		{
			inorderRec(root.left);
			System.out.println(root.key +"->");
			inorderRec(root.right);
		}
			
			
	}
	
	void deleteKey(int key)
	{
		root= deleteRec(root,key);
	} 
	
	Node deleteRec(Node root,int key)
	{
		// Return if the tree is empty
		if(root ==  null)
		{
			return root;
		}
		//Find the node to be deleted
		if(key<root.key)
		{ 
			root.left = deleteRec(root.left,key);
		}
		else if(key > root.key)
		{
			root.right = deleteRec(root.right,key);
		} 
		else
		{
			//If the node is with only one child or no child
			if(root.left == null)
			{
				return root.right;
			}
			else if(root.right ==null)
			{
				  return root.left;
			}
			//If the node has two children
			//Place the inorder successor in position of the node to be deleted
			root.key= minValue(root.right);
				
			//delete the inorder Successor
			root.right = deleteRec(root.right,root.key);
		}
		return root;
	}
	//Find the inorder successor 
	int minValue(Node root)
	{ 
		int minv=root.key; 
		while(root.left!=null)
		{
			minv=root.left.key;
			root=root.left;
		}
		return minv;
	}
	
	
//	boolean searchNode(Node root,int search)
//	{
//		if(root==null)
//		{
//			return false;
//		}
//		else 
//		{
//		if(root.key == search)
//		{
//			return true;
//		}
//		
//		else if(search<root.key)
//		{
//			return searchNode(root.left,search);
//		}
//		else if(search>root.key)
//		{
//			return searchNode(root.right,search);
//		}
//		}
//		
//	}
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_search_tree tree =new Binary_search_tree();
		
		tree.insert(8);
		tree.insert(3);
		tree.insert(1);
		tree.insert(6);
		tree.insert(7);
		tree.insert(10);
		tree.insert(14);
		System.out.println("Inorder tracersal");
		tree.inorder();
		
		System.out.println("After deleting ");
		tree.deleteKey(10);
		
		System.out.println("Inorder tracersal");
		tree.inorder();
		
//		if(searchNode(root,10))
//		{
//			
//		}

	}

}

package DataStructure;


	class Node11{
		int data;
		Node11 leftChild;
		Node11 rightChild;
		
		Node11 (int item){
			data = item;
			leftChild=rightChild=null;
			
		}
	}
	

	public class full_binary_tree
	{ 
		Node11 root;
		boolean isFullBinaryTree(Node11 node) 
		{
			if (node == null)
				return true;
			if (node.leftChild == null && node.rightChild==null)
				return true;
			if (node.leftChild != null && node.rightChild !=null)
				return (isFullBinaryTree(node.leftChild)&&isFullBinaryTree(node.rightChild));
				return false; 

		}
	
	public static void main(String[] args) {
		full_binary_tree tree = new full_binary_tree();
		tree.root= new Node11 (1);
		tree.root.leftChild=new Node11(2);
		tree.root.rightChild=new Node11(3);
		tree.root.leftChild.leftChild=new Node11(4);
		tree.root.leftChild.rightChild=new Node11(5);
		tree.root.leftChild.rightChild.leftChild=new Node11(6);
		tree.root.leftChild.rightChild.rightChild=new Node11(7);
		//tree.root.leftChild.rightChild.rightChild.leftChild=new Node11(0);

		if (tree.isFullBinaryTree(tree.root))
		System.out.println("This is a full binary tree");
		else 
			System.out.println("This is not a full binary tree");
	}
	}
package DataStructure;
import java.util.*;

class Node12{
	int item;
	Node12 left,right;
	public Node12(int key) {
		item=key;
		left=right=null;
	}
}


public class tree_struc {
	Node12 root;
	tree_struc(){
		root=null;
	}
	void postorder(Node12 Node12) {
		if(Node12==null)
			return;
		
	 	//traverse left
		postorder(Node12.left);
		//traverse right
		postorder(Node12.right);
		//traverse root
		System.out.print(Node12.item+"->");
	}
	void inorder(Node12 Node12) {
		if(Node12==null)
			return;
		
		//traverse left
		inorder(Node12.left);
		//traverse root
		System.out.print(Node12.item+"->");
		//traverse right
		inorder(Node12.right);
		
	}
	void preorder(Node12 Node12) {
		if(Node12==null)
			return;
		
		//traverse root
	    System.out.print(Node12.item+"->");
		//traverse left
	    preorder(Node12.left);
		//traverse right
		preorder(Node12.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_struc tree=new tree_struc();
		tree.root=new Node12(1);
		tree.root.left=new Node12(2);
		tree.root.right=new Node12(3);
		tree.root.left.left=new Node12(4);
		tree.root.left.right=new Node12(5);
		tree.root.right.left=new Node12(6);
		
		System.out.println("Inorder traversal");
		tree.inorder(tree.root);
		System.out.println("\npreorder traversal");
		tree.preorder(tree.root);
		System.out.println("\npostorder traversal");
		tree.postorder(tree.root);

	}

}

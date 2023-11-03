package DSA_Practise;

public class bsa2 {
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
	  root=insertkey(root,data);
  }
  public Node insertkey(Node root,int data)
  {
	  if(root==null) 
	  {
		  root= new Node(data);
		  return root;
	  }
	  if(data<root.data)
	  {
		  root.left=insertkey(root.left,data);
	  }
	  else if(data>root.data)
	  {
		  root.right=insertkey(root.right,data);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bsa2 s = new bsa2();
		s.insert(10);
		s.insert(54);
		s.insert(15);
		s.insert(13);
		s.insert(17);
		s.insert(1);
		s.insert(18);
		s.inorder();

	}

}

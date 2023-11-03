package DataStructure;


	 public  class Node{
			int data;
		  Node left, right;
		  public Node (int d) {
			   data=d;
			  this.left=null;
			  this.right=null;
		  }
		}
	//Calculate height
	class Height {
		int height =0;
	}
	
	class Check_Height_Balance {
		Node root;
		public Check_Height_Balance() {
			root = null;
		}
		boolean checkHeightBalance(Node root,Height height) {
			if (root==null) {
				height.height=0;
				return true;
			}
			Height leftHeight = new Height(),rightHeight=new Height();
			boolean l = checkHeightBalance(root.left,leftHeight);
			boolean r = checkHeightBalance(root.right,rightHeight);
			int leftHeight1 = leftHeight.height,rightHeight1=rightHeight.height;
			height.height=(leftHeight1>rightHeight1 ? leftHeight1 : rightHeight1)+1;
			if ((leftHeight1 - rightHeight1>=2) || (rightHeight1 - leftHeight1>=2))
				return false;
			else 
				return l&&r;

		}
	

	public static void main(String[] args) {
		Height height = new Height();
		Check_Height_Balance tree = new Check_Height_Balance();
		tree.root = new Node(1);
		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left= new Node(4);
		tree.root.left.right= new Node(5);
		if (tree.checkHeightBalance(tree.root,height))
			System.out.println("The tree is balanced");
		else {
			System.out.println("The tree is not balanced");
		}

	}
	}
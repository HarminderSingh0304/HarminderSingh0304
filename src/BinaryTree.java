
public class BinaryTree {

	Node root;
	public void insert(int i) {
		// TODO Auto-generated method stub
		root = insertRec(root,i);
	}

	public Node insertRec(Node root, int data) {
		if (root==null)
			root = new Node(data);
		else if(data < root.data)
			root.left = insertRec(root.left,data);
		else if(data > root.data)
			root.right = insertRec(root.right,data);
		return root;
	}
	
	public void inOrder() {
		inOrderRec(root);
		System.out.println();
		}
	
	public void inOrderRec(Node root) {
		if(root!=null) {
			inOrderRec(root.left);
			System.out.print(root.data+" ");
			inOrderRec(root.right);
		}
	}

	public void preOrder() {
		inOrderRec(root);
		System.out.println();	}
	
	public void preOrderRec(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preOrderRec(root.left);
			preOrderRec(root.right);

		}
	}
}

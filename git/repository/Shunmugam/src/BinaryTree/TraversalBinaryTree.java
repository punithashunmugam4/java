package BinaryTree;

public class TraversalBinaryTree {
	public static void inOrderTraversal(Node root) {
		if(root==null) return;
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
	}
	public static void postOrderTraversal(Node root) {
		if(root==null) return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+" ");
	}
	public static void preOrderTraversal(Node root) {
//		if(root==null) return;
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		return;
	}
public static void main(String [] args) {
	Node root=new Node(4);
	root.left=new Node(2);
	root.left.left=new Node(1);
	root.left.right=new Node(3);
	root.right=new Node(6);
	root.right.left=new Node(5);
	root.right.right=new Node(7);
	inOrderTraversal(root);
	System.out.println();
	postOrderTraversal(root);
	System.out.println();
	preOrderTraversal(root);
	
}
}

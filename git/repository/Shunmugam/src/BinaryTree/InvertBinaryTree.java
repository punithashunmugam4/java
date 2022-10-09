package BinaryTree;

public class InvertBinaryTree {
	public static void swap(Node root) {
		Node temp=root.right;
        root.right=root.left;
        root.left=temp;
	}
	public static Node invert(Node root) {
		if(root==null) return null;
		swap(root);
		invert(root.left);
		invert(root.right);
		return root;
	}
public static void main(String []args) {
	Node root=new Node(4);
	root.left=new Node(2);
	root.left.left=new Node(1);
	root.left.right=new Node(3);
	root.right=new Node(6);
	root.right.left=new Node(5);
	root.right.right=new Node(7);
	TraversalBinaryTree.inOrderTraversal(root);
	System.out.println();
	Node root1=invert(root);
	TraversalBinaryTree.inOrderTraversal(root1);
}
}

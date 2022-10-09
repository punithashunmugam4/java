package BinaryTree;

public class SmallestElementInBST {
	public static int smallest(Node root) {
		if(root==null) return -1;
		if(root.left==null) return root.data;
		return smallest(root.left);
	}
	public static int largest(Node root) {
		if(root==null) return -1;
		if(root.right==null) return root.data;
		return largest(root.right);
	}
	public static void main(String [] args) {
		Node root=new Node(4);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(6);
		root.right.left=new Node(5);
		root.right.right=new Node(7);
		System.out.println(smallest(root));
		System.out.println(largest(root));
	}
}

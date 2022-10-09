package Dsa4Practices;

public class CheckBalancedBinaryTree {
	static int height(Node root) {
		if(root==null) return 0;
		return Math.max(height(root.left),height(root.right))+1;
	}
	public static boolean checkForBalanced(Node root) {
		if(root==null) return true;
		int left=height(root.left);
		int right=height(root.right);
		if(Math.abs(left-right)>1) return false;
		return checkForBalanced(root.left) && checkForBalanced(root.right);
	}
public static void main(String []args) {
	Node root=new Node(2);
	root.left=new Node(3);
	root.right=new Node(6);
	root.left.left=new Node(4);
	root.left.right=new Node(5);
	root.right.left=new Node(9);
	root.right.right=new Node(8);
//	root.right.right.left=new Node(43);
	if(checkForBalanced(root))
		System.out.println("Tree is Balanced Binary Tree");
	else
		System.out.println("Tree is unbalanced binary tree");
}
}

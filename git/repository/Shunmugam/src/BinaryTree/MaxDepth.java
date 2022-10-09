package BinaryTree;

public class MaxDepth {
	static int maxdepth(Node root) {
		if(root==null) return 0;
		int l=maxdepth(root.left);
		int r=maxdepth(root.right);
		return 1+Math.max(l, r);
		}
public static void main(String []args) {
	Node root=new Node(1);
	root.left=new Node(2);
	root.left.right=new Node(3);
	root.right=new Node(2);
	root.right.left=new Node(2);
	root.left.left=new Node(2);
	maxdepth(root);
}
}

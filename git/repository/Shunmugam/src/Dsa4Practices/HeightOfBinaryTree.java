package Dsa4Practices;

public class HeightOfBinaryTree {
	public static int height(Node root) {
		if(root==null) return 0;
		int left=height(root.left);
		int right=height(root.right);
		return Math.max(left,right)+1;
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
	
	System.out.println(height(root));
}
}

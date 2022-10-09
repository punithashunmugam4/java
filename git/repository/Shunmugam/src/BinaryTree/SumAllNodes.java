package BinaryTree;

public class SumAllNodes {
	public static int sum(Node root) {
		if(root==null) return 0;
		return root.data+sum(root.left)+sum(root.right);
	}
	// T.C: O(N)
	// S.C: O(N)
	public static void main(String [] args) {
		Node root=new Node(4);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(6);
		root.right.left=new Node(5);
		root.right.right=new Node(7);
		System.out.println(sum(root));
	}
}

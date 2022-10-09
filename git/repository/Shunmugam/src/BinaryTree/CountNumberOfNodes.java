package BinaryTree;

public class CountNumberOfNodes {
	static int c=0;
	public static int count(Node root) {
		if(root==null) return 0;
		c++;
		count(root.left);
		count(root.right);
		return c;
	}
	public static void main(String [] args) {
		Node root=new Node(4);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(6);
		root.right.left=new Node(5);
		root.right.right=new Node(7);
		System.out.println(count(root));
	}
}

package BinaryTree;

public class SumOfLeftNodes {
	public static int sumOfLeftNodes(Node root) {
		if(root==null) return 0;
		return root.data+sumOfLeftNodes(root.left);
	}
	public static int sumOfRightNodes(Node root) {
		if(root==null) return 0;
		return root.data+sumOfRightNodes(root.right);
	}
	public static void main(String [] args) {
		Node root=new Node(4);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(6);
		root.right.left=new Node(5);
		root.right.right=new Node(7);
		System.out.println(sumOfLeftNodes(root));
		System.out.println(sumOfRightNodes(root));
	}
}

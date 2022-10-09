package BinaryTree;

public class SumOfAllLeafNodes {
	public static int sumOfAllLeafNodes(Node root,int sum) {
		if(root==null) return sum;
		if(root.left==null && root.right==null) return root.data;
		int a=sumOfAllLeafNodes(root.left,sum);
		int b=sumOfAllLeafNodes(root.right,sum);
		return a+b;
	}
	public static void main(String [] args) {
		Node root=new Node(4);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(6);
		root.right.left=new Node(5);
		root.right.left.left=new Node(8);
		root.right.left.right=new Node(9);
		root.right.right=new Node(7);
		System.out.println(sumOfAllLeafNodes(root,0));
	}
}

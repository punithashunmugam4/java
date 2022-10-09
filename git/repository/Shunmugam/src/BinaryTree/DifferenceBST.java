package BinaryTree;

public class DifferenceBST {
	static int min_diff=Integer.MAX_VALUE;
	static int curr=-1;
	public static int minimumDifference(Node root) {
		if(root.left!=null)
		minimumDifference(root.left);
		if(curr>=0) 
			min_diff=Math.min(min_diff, root.data-curr);
		curr=root.data;
		if(root.right!=null)
		minimumDifference(root.right);
		return min_diff;
	}
	static int max=0;
	public static int maximumDifference(Node root) {
		if(root==null) return max;
		Node temp=root;
		while(temp.left!=null)
		temp=temp.left;
		int a=temp.data;
		temp=root;
		while(temp.right!=null)
		temp=temp.right;
		int b=temp.data;
		max=b-a;
		return max;
	}
public static void main(String []args) {
	Node root=new Node(4);
	root.left=new Node(2);
	root.left.left=new Node(1);
	root.left.right=new Node(3);
	root.right=new Node(6);
	root.right.left=new Node(5);
	root.right.right=new Node(7);
	System.out.println(minimumDifference(root));
   System.out.println(maximumDifference(root));
}
}

package BinaryTree;

public class SumTree {
	public static boolean isSumTree(Node root) {
		if(root==null || (root.left==null && root.right==null)) return true;
		int left=sum(root.left);
		int right=sum(root.right);
		if(root.data==left+right && isSumTree(root.left) && isSumTree(root.right)) {
			return true;
		}
		return false;
	}
	public static int sum(Node root) {
		if(root==null) return 0;
		return (sum(root.left)+root.data+sum(root.right));
	}
	// T.C: O(N^2)
	// S,C: O(N)

	//Another approach
	public static boolean leaf(Node root) {
		if(root==null) return false;
		return (root.left==null && root.right==null);
	}
	public static boolean isSumTreeOptimized(Node root) {
		if(root==null || leaf(root)) return true;
		int left,right;
		if(isSumTreeOptimized(root.left) && isSumTreeOptimized(root.right)) {
			if(root.left==null) {
				left=0;
			}
			else if(leaf(root.left)){
				left=root.left.data;
			}
			else {
				left=2*root.left.data;
			}
			if(root.right==null ) {
				right=0;
			}
			else if(leaf(root.right)){
				right=root.right.data;
			}
			else {
				right=2*root.right.data;
			}
			if(root.data==left+right) return true;
			return false;
		}
		return false;
	}
	public static void main(String []args) {
		Node root=new Node(36);
		root.left=new Node(10);
		root.right=new Node(8);
		root.left.left=new Node(3);
		root.left.right=new Node(7);
		root.right.left=new Node(3);
		root.right.right=new Node(5);
		System.out.println(isSumTree(root));
		System.out.println(isSumTreeOptimized(root));
	}
}

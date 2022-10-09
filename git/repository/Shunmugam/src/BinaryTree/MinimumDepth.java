package BinaryTree;

/*Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path
 from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.
*/
public class MinimumDepth {
	public static int minDepth(Node root) {
		if(root==null) return 0;
		int left=minDepth(root.left);
		int right=minDepth(root.right);
		//for skewed tree
		if(Math.min(left, right)==0) return Math.max(left, right)+1;
		// for normal tree
		else return Math.min(left, right)+1;
		
	}
public static void main(String []args) {
	Node root=new Node(4);
	root.left=new Node(2);
//	root.left.left=new Node(1);
//	root.left.right=new Node(3);
	root.right=new Node(6);
	root.right.left=new Node(5);
	root.right.right=new Node(7);
	System.out.println(minDepth(root));
}
}

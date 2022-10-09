package BinaryTree;

public class CheckTreesIdentical {
	public static boolean checkIfIdentical(Node a,Node b) {
		if(a==null && b== null) return true;
		if(a==null || b==null) return false;
		return a.data==b.data && checkIfIdentical(a.left,b.left) && checkIfIdentical(a.right,b.right);
	}
	// T.C:O(M+N)
	// S.C:O(M+N)
	public static void main(String []args) {
	Node root=new Node(4);
	root.left=new Node(2);
	root.left.left=new Node(1);
	root.left.right=new Node(3);
	root.right=new Node(6);
	root.right.left=new Node(5);
	root.right.right=new Node(7);
	Node node=new Node(4);
	node.left=new Node(2);
	node.left.left=new Node(1);
	node.left.right=new Node(3);
	node.right=new Node(6);
	node.right.left=new Node(5);
	node.right.right=new Node(7);
	System.out.println(checkIfIdentical(root,node));
	}
}

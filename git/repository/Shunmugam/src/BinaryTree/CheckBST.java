package BinaryTree;

public class CheckBST {
	public static boolean ifBST(Node root,int min,int max) {
		if(root==null) return true;
		if(root.data<=min || root.data>=max) return false;
		if(ifBST(root.left,min,root.data) && ifBST(root.right,root.data,max)) return true;
		return false;
	}
	public static void main(String [] args) {
		Node root=new Node(4);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(6);
		root.right.left=new Node(5);
		root.right.right=new Node(7);
		System.out.println(ifBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	}
}

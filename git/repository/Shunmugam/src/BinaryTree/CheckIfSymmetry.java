package BinaryTree;

public class CheckIfSymmetry {
	public static boolean chcekIfSymmetry(Node a,Node b) {
		if(a==null && b==null) return true;
		if(a==null || b==null) return false;
		if(a.data==b.data) return chcekIfSymmetry(a.left,b.right) && chcekIfSymmetry(a.right,b.left);
		return false;
	}
	//T.C : O(N)
	//S.C : O(N) Auxillary space
	public static void main(String []args) {
		Node root=new Node(4);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(2);
		root.right.left=new Node(3);
		root.right.right=new Node(1);
		System.out.println(chcekIfSymmetry(root.left,root.right));
	}
}

package BinaryTree;

public class LargestlessthanK {
	// only works for BST
	public static int largestLessThanK(Node root,int k) {
		if(root.left==null && root.right==null)
			 return root.data;
		if(root==null) return -1;
		if(root.data>k) return largestLessThanK(root.left,k);
		if(root.data<k) return largestLessThanK(root.right,k);
		return root.data;
	}

//T.C: O(logN)
//S.C: O(logN)
	static int prev=0;
	public static int largestLessThanK1(Node root,int k) {
		if(root==null) return -1;
		largestLessThanK1(root.left,k);
		if(root.data<=k) prev=root.data;
		largestLessThanK1(root.right,k);
		return prev;
	}
	//T.C: O(N)
	//S.C: O(N)
public static void main(String []args) {
	Node root=new Node(5);
	root.left=new Node(2);
	root.left.left=new Node(1);
	root.left.right=new Node(3);
	root.right=new Node(7);
	root.right.left=new Node(6);
	root.right.right=new Node(8);
	int k=4;
	System.out.println(largestLessThanK(root,k));
	System.out.println(largestLessThanK1(root,k));
}
}

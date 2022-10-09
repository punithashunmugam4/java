package BinaryTree;

public class BalancedBT {
	static boolean res=true;
	public static int checkIfBalanced(Node root) {
		if(root==null) return 0;
		int left=checkIfBalanced(root.left);
		int right=checkIfBalanced(root.right);
		if(Math.abs(left-right)>1) res=false;
		return 1+Math.max(left, right);
	}
	
	// for leetcode above code will not work
	  public static boolean isBalanced(Node root) {
	        if(root==null) return true;
	    int res=balance(root);
	        return res==-1 ? false:true;
	    }
	    public static int balance(Node root){
	         if(root==null){
	             return 0;
	         }
	        int left = balance(root.left);
	        int right = balance(root.right);
	        if( left==-1 || right==-1 || Math.abs(left-right)>1){
	            return -1;
	        }
	        return 1+Math.max(left,right);
	    }
public static void main(String []args) {
	Node root=new Node(1);
	root.left=new Node(2);
	root.left.right=new Node(3);
	root.right=new Node(2);
	root.right.left=new Node(2);
	root.left.left=new Node(2);
	checkIfBalanced(root);
	if(res==true)
		System.out.println("Binary Tree is Balanced");
	else
		System.out.println("Binary Tree is not balanced");
	System.out.println(isBalanced(root));
}
}

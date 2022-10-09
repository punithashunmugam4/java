package BinaryTree;

public class LevelOrderTraversal {
	public static int findHeight(Node root) {
		if(root==null) return -1;
		return Math.max(findHeight(root.left),findHeight(root.right))+1	;
	}
	public static void levelOrderTraversal(Node root) {
		if(root==null) return;
		int level=findHeight(root)+1;
		for(int i=1;i<=level;i++) {
			printLevelOrderTraversal(root,i);
		}
	}
	public static void printLevelOrderTraversal(Node root,int level) {
		if(root==null) return;
		if(level==1) {
			System.out.print(root.data+" ");
			return;
		}
		printLevelOrderTraversal(root.left,level-1);
		printLevelOrderTraversal(root.right,level-1);
	}
	public static void main(String [] args) {
		Node root=new Node(4);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(6);
		root.right.left=new Node(5);
		root.right.right=new Node(7);
		levelOrderTraversal(root);
	}
}

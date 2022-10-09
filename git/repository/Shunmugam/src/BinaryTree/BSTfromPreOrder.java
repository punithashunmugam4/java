package BinaryTree;

public class BSTfromPreOrder {
	public static Node constructBST(int pre[],int bound,int i[]) {
		if(i[0]==pre.length || pre[i[0]]>bound) return null;
		Node root=new Node(pre[i[0]++]);
		root.left=constructBST(pre,root.data,i);
		root.right=constructBST(pre,bound,i);
		return root;
	}
public static void main(String[] args) {
	int pre[]= {4,2,1,3,6,5,7};
	Node root=constructBST(pre,Integer.MAX_VALUE,new int[] {0});
	TraversalBinaryTree.inOrderTraversal(root);
	System.out.println();
	TraversalBinaryTree.postOrderTraversal(root);
}
}

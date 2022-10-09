package BinaryTree;

import java.util.HashMap;

public class CreateBinaryTreePreOrder {
	public static Node createBTPreOrder(int inorder[],int is,int ie,int postorder[],int ps,int pe,HashMap<Integer,Integer> hash) {
		if(is>ie || ps>pe) return null;
		Node root=new Node(postorder[pe]);
		int rootIndex=hash.get(postorder[pe]);
		root.left=createBTPreOrder(inorder,is,rootIndex-1,postorder,ps,ps+rootIndex-is-1,hash);
		root.right=createBTPreOrder(inorder,rootIndex+1,ie,postorder,ps+rootIndex-is,pe-1,hash);
		return root;
	}
public static void main(String []args) {
	// for Binary Search tree inorder is not needed to be given 
	// Inorder is the sorted form of any other
	int inorder[]= {1,2,3,4,5,6,7};
	int postorder[]={1,3,2,5,7,6,4};
	HashMap<Integer,Integer> hash=new HashMap<>();
	for(int i=0;i<inorder.length;i++)
		hash.put(inorder[i],i);
	Node root=createBTPreOrder(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hash);
	TraversalBinaryTree.preOrderTraversal(root);
}
}

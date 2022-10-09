package BinaryTree;

import java.util.HashMap;

public class CreateBinaryTreePostOrder {
	public static Node createBTPostOrder(int inorder[],int is,int ie,int preorder[],int ps,int pe,HashMap<Integer,Integer> hash) {
		if(is>ie || ps>pe) return null;
		Node root=new Node(preorder[ps]);
		int rootIndex=hash.get(preorder[ps]);
		root.left=createBTPostOrder(inorder,is,rootIndex-1,preorder,ps+1,ps+rootIndex-is,hash);
		root.right=createBTPostOrder(inorder,rootIndex+1,ie,preorder,ps+rootIndex-is+1,pe,hash);
		return root;
	}
public static void main(String []args) {
	// for Binary Search tree inorder is not needed to be given 
	// Inorder is the sorted form of any other
	int inorder[]= {1,2,3,4,5,6,7};
	int preorder[]= {4,2,1,3,6,5,7};
	HashMap<Integer,Integer> hash=new HashMap<>();
	for(int i=0;i<inorder.length;i++)
		hash.put(inorder[i],i);
	Node root=createBTPostOrder(inorder,0,inorder.length-1,preorder,0,preorder.length-1,hash);
	TraversalBinaryTree.postOrderTraversal(root);
}
}

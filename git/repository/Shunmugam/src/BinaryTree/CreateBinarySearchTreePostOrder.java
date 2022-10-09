package BinaryTree;

import java.util.Arrays;
import java.util.HashMap;

public class CreateBinarySearchTreePostOrder {
	public static Node binaryTree(int pre[],int ps,int pe,int in[],int is,int ie,HashMap<Integer,Integer> hash) {
		if(ps>pe || is>ie) return null;
		Node root=new Node(pre[ps]);
		int rootIndex=hash.get(pre[ps]);
		root.left=binaryTree(pre,ps+1,ps+rootIndex-is,in,is,rootIndex-1,hash);
		root.right=binaryTree(pre,ps+rootIndex-is+1,pe,in,rootIndex+1,ie,hash);
//		root.left=leftchild;
//		root.right=rightchild;
		return root;
	}
	public static Node createBinaryTree(int pre[],int in[]) {
		if(pre==null || in==null || pre.length!=in.length)
			return null;
		HashMap<Integer,Integer> hash=new HashMap<>();
		for(int i=0;i<in.length;i++) {
			hash.put(in[i], i);
		}
		return binaryTree(pre,0,pre.length-1,in,0,in.length-1,hash);
	}
public static void main(String []args) {
	int pre[]= {8,5,1,7,10,12};
	int temp[]=new int[pre.length];
	for(int i=0;i<pre.length;i++) {
		temp[i]=pre[i];
	}
	// for Binary search tree inOrder is the sorted array.
	Arrays.sort(temp);
	int inOrder[]=temp;
	Node root=createBinaryTree(pre,inOrder);
	printPostOrder(root);
}
public static void printPostOrder(Node root) {
	if(root==null) return;
	printPostOrder(root.left);
	printPostOrder(root.right);
	System.out.print(root.data+" ");
}
}

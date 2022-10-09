package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class AllPairsWithGivenSum {
	public static void inOrderTraversal(Node root,List<Integer> list) {
		if(root==null) return;
		inOrderTraversal(root.left,list);
		list.add(root.data);
		inOrderTraversal(root.right,list);
	}
	public static int countNumberOfNodes(Node root) {
		if(root==null) return 0;
		return 1+countNumberOfNodes(root.left)+countNumberOfNodes(root.right);
	}
	public static void allPairsWithSum(List<Integer> list,int k,List<Integer> pair) {
		int l=0,r=list.size()-1;
		int sum=0;
		while(l<r) {
			sum=list.get(l)+list.get(r);
			if(sum==k) {
				System.out.println(list.get(l)+" "+list.get(r));
				l++;
				r--;
			}
			else if(sum<k) {
				l++;
			}
			else {
				r--;
			}
		}
	}
	public static void main(String [] args) {
		Node root=new Node(4);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(6);
		root.right.left=new Node(5);
//		root.right.left.left=new Node(8);
//		root.right.left.right=new Node(9);
		root.right.right=new Node(7);
		int n=countNumberOfNodes(root);
//		System.out.println(n);
		List<Integer> list=new ArrayList<>();
		inOrderTraversal(root,list);
//		for(int i:list) 
//		System.out.print(i+" ");
		List<Integer> pair=new ArrayList<>();
		allPairsWithSum(list,5,pair);
	}
}

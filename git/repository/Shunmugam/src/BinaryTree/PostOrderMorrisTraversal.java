package BinaryTree;

import java.util.*;

public class PostOrderMorrisTraversal {
	public static List<Integer> morrisTraversal(Node curr){
		List<Integer> list=new ArrayList<>();
		if(curr==null) return list;
		while(curr!=null) {
			if(curr.right==null) {
				list.add(0,curr.data);
				curr=curr.left;
			}
			else {
				Node prev=curr.right;
				while(prev.left!=null && prev.left!=curr) {
					prev=prev.left;
				}
				if(prev.left==null) {
					prev.left=curr;
					list.add(0,curr.data);
					curr=curr.right;
				}
				else {
					prev.left=null;
					curr=curr.left;
				}
			}
		}
		return list;
	}
	public static void main(String []args) {
	Node root=new Node(4);
	root.left=new Node(2);
	root.left.left=new Node(1);
	root.left.right=new Node(3);
	root.right=new Node(6);
	root.right.left=new Node(5);
	root.right.right=new Node(7);
	List<Integer> list=morrisTraversal(root);
	for(Integer i:list)
		System.out.print(i+" ");
}
}

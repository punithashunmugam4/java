package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderMorrisTraversal {
	public static List<Integer> morrisTraversal(Node curr){
		List<Integer> list=new ArrayList<>();
		if(curr==null) return list;
		while(curr!=null) {
			if(curr.left==null) {
				list.add(curr.data);
				curr=curr.right;
			}
			else {
				Node prev=curr.left;
				while(prev.right!=null && prev.right!=curr) {
					prev=prev.right;
				}
				if(prev.right==null) {
					list.add(curr.data);
					prev.right=curr;
					curr=curr.left;
				}
				else {
					prev.right=null;
					curr=curr.right;
				}
			}
		}
		return list;
	}
	public static void main(String [] args) {
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

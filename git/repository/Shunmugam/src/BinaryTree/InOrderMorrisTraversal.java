package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class InOrderMorrisTraversal {
	public static List<Integer> morrisTraversal(Node root) {
		List<Integer> list=new ArrayList<>();
		if(root==null) return list;
		while(root!=null) {
			//if left is null then add root value and go right
			if(root.left==null) {
				list.add(root.data);
				root=root.right;
			}
			else {
				Node prev=root.left;
				//moving to right most node of left subtree
				while(prev.right!=null && prev.right!=root) {
					prev=prev.right;
				}
				if(prev.right==null) {
					//assigning thread from right most node to root
					prev.right=root;
					root=root.left;
				}
				else {
					//it reaches the root so make it null and add root value then go for right subtree
					prev.right=null;
					list.add(root.data);
					root=root.right;
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

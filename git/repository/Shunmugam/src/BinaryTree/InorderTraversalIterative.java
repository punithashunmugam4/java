package BinaryTree;

import java.util.*;

public class InorderTraversalIterative {
	public static void inorderTraversal(Node root) {
		if(root==null) return;
		Stack<Node> st=new Stack<>();
		Node curr=root;
		while(curr!=null || !st.isEmpty()) {
			while(curr!=null) {
				st.push(curr);
				curr=curr.left;
			}
			curr=st.pop();
			System.out.print(curr.data+" ");
			curr=curr.right;
		}
	}
	public static void preorderTraversal(Node root) {
		if(root==null) return;
		Stack<Node> st=new Stack<>();
		Node curr=root;
		while(curr!=null || !st.isEmpty()) {
			while(curr!=null) {
				System.out.print(curr.data+" ");
				st.push(curr);
				curr=curr.left;
			}
			curr=st.pop();
			
			curr=curr.right;
		}
	}
	public static List<Integer> postorderTraversal(Node root) {
		List<Integer> list=new LinkedList<>();
		if(root==null) return list;
		Stack<Node> st=new Stack<>();
		Node curr=root;
		while(curr!=null || !st.isEmpty()) {
			while(curr!=null) {
				System.out.print(curr.data+" ");
				list.add(0,curr.data);
				st.push(curr);
				curr=curr.right;
			}
			curr=st.pop();
			
			curr=curr.left;
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
		inorderTraversal(root);
		System.out.println();
		preorderTraversal(root);
		System.out.println();
		List<Integer> list=postorderTraversal(root);
		System.out.println();
		System.out.println(list);
	}
}

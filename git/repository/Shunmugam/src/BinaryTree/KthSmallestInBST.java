package BinaryTree;
import java.util.*;

public class KthSmallestInBST {
	static int count=0;
	public static void kthSmallest(Node root,PriorityQueue<Integer> pq) {
		 	if(root==null) return;
		 	kthSmallest(root.left,pq);
		 	pq.add(root.data);
		 	kthSmallest(root.right,pq);
	}
	// T.C:O(N+K)
	// S.C:O(N)
	public static int kthSmall(Node root,int k) {
	 	if(root==null) return -1;
	 	  Stack<Node> s = new Stack<Node>();
	 	  Node curr=root;
	 	  int count=0;
	 	while(curr!=null || s.size()>0) {
	 		 while (curr !=  null)
	            {
	 			    s.push(curr);
	                curr = curr.left;
	            }
	            curr = s.pop();
	        	count++;
	        	if(count==k) return curr.data;
//	            System.out.print(curr.data + " ");
	            curr = curr.right;
	 	}
	 	return root.data;
}
	// T.C:O(K)
	// S.C:O(1)
	public static void main(String [] args) {
		Node root=new Node(5);
		root.left=new Node(3);
		root.left.left=new Node(2);
		root.left.right=new Node(4);
		root.right=new Node(7);
		root.right.left=new Node(6);
		root.right.right=new Node(8);
		int k=5;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		kthSmallest(root,pq);
		for(int i=1;i<k;i++) {
			pq.poll();
		}
		System.out.println(pq.peek());
		System.out.println(kthSmall(root,k));
	}
}

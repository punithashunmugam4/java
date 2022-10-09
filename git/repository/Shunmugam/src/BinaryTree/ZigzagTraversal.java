package BinaryTree;
import java.util.*;

public class ZigzagTraversal {
	public static ArrayList<ArrayList<Integer>> zigzagTraversal(Node root) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		if(root==null) return list;
		Queue<Node> q=new LinkedList<>();
		q.offer(root);
		Boolean flag=true;
		while(!q.isEmpty()) {
			int level=q.size();
			ArrayList<Integer> sublist=new ArrayList<>();
			for(int i=0;i<level;i++) {
				if(q.peek().left!=null) q.offer(q.peek().left);
				if(q.peek().right!=null) q.offer(q.peek().right);
				if(flag) sublist.add(q.poll().data);
				else sublist.add(0,q.poll().data);
			}
			flag=!flag;
			list.add(sublist);
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
		ArrayList<ArrayList<Integer>> ans=zigzagTraversal(root);
		for(ArrayList<Integer> sub:ans) {
			for(Integer i:sub) {
				System.out.print(i+" ");
			}
		}
	}
}

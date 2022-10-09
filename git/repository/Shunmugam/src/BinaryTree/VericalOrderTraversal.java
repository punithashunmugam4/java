package BinaryTree;
import java.util.*;
public class VericalOrderTraversal {
	public static List<List<Integer>> vericalordertraversal(Node root) {
		TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
		Queue<Tuple> q=new LinkedList<>();
		q.offer(new Tuple(root,0,0));
		while(!q.isEmpty()) {
			Tuple tuple=q.poll();
			Node curr=tuple.node;
			int x=tuple.row;
			int y=tuple.col;
			if(!map.containsKey(x)) {
				map.put(x,new TreeMap<>());
			}
			if(!map.get(x).containsKey(y)) {
				map.get(x).put(y,new PriorityQueue<>());
			}
			map.get(x).get(y).offer(curr.data);
			if(curr.left!=null)
				q.offer(new Tuple(curr.left,x-1,y+1));
			if(curr.right!=null)
				q.offer(new Tuple(curr.right,x+1,y+1));
		}
		List<List<Integer>> list=new ArrayList<>();
		for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()) {
			list.add(new ArrayList<>());
			for(PriorityQueue<Integer> pq:ys.values()) {
				while(!pq.isEmpty()) {
					list.get(list.size()-1).add(pq.poll());
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
		List<List<Integer>> list=vericalordertraversal(root);
		for(List<Integer> it:list) {
			for(Integer i:it) {
				System.out.print(i+" ");
			}
		}
	}
}

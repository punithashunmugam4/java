package BinaryTree;
import java.util.*;

public class AllPossibleBinaryTree {
	public static List<Node> possibleBinaryTree(int n,HashMap<Integer,List<Node>> res) {
		if(!res.containsKey(n)) {
			List<Node> ans=new LinkedList<>();
			if(n==1) {
				ans.add(new Node(0));
			}
			else if(n%2==1) {
				for(int x=0;x<n;x++) {
					int y=n-x-1;
					for(Node left:possibleBinaryTree(x,res)) {
						for(Node right:possibleBinaryTree(y,res)) {
							Node node=new Node(0);
							node.left=left;
							node.right=right;
							ans.add(node);
						}
					}
				}
			}
			res.put(n,ans);
		}
		return res.get(n);
	}
public static void main(String []ags) {
	int n=5;
	HashMap<Integer,List<Node>> res=new HashMap<>();
	possibleBinaryTree(n,res);
	for(Node i:res.get(n)) {
		//in leetcode it prints null too https://leetcode.com/problems/all-possible-full-binary-trees/
		TraversalBinaryTree.inOrderTraversal(i);
		System.out.println();
	}
}
}

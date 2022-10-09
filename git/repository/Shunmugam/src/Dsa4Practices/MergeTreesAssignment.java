package Dsa4Practices;
import java.util.*;
import java.io.*;

/*You are given N nodes and M undirected edges. These nodes and edges represent 
 * some trees (graphs with no loops). Now, your task is to merge the trees into
 *  a single tree. In one operation of merging, two disconnected trees are merged 
 *  using an edge from one tree to the other tree. The cost of this merging operation 
 *  is total number of nodes in the final merged tree. Once merged the trees lose their original existence.
So, if there are T trees in the original state, you'll have to perform the merge operation 
T-1 times to merge all the trees in a single tree.

All you need to do is find the minimum cost of merging the trees (sum of costs of all T-1 merge operations).
 See sample for better understanding.
 Sample Input
7 3
1 2
3 4
4 5

Sample Output
13
 */
// same as mincost ropes
public class MergeTreesAssignment {
	static int count=0;
	public static void dfs(int node,List<List<Integer>> adj,boolean visited[]) {
		if(visited[node]) return;
		visited[node]=true;
		count++;
		for(int it:adj.get(node)) {
			if(visited[it]==false)
				dfs(it,adj,visited);
		}
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int v=sc.nextInt();
	int e=sc.nextInt();
	List<List<Integer>> adj=new ArrayList<>();
	for(int i=0;i<=v;i++) {
		adj.add(new ArrayList<>());
	}
	for(int i=0;i<e;i++) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		adj.get(a).add(b);
		adj.get(b).add(a);
	}
	boolean visited[]=new boolean[v+1];
//	int count=0;
	 PriorityQueue<Integer> que=new PriorityQueue<>();
	for(int i=1;i<=v;i++) {
		if(visited[i]==false) {
			count=0;
			dfs(i,adj,visited);
//			System.out.println(count);
			que.add(count);
		}
	}
	int min=0;
	while(que.size()>1) {
		int curr=que.poll()+que.poll();
		min+=curr;
		que.add(curr);
		}
	System.out.println(min);
	
}
}

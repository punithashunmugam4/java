package Graph;

import java.util.*;

public class TopologicalSorting {
	public static void topologicalSorting(List<List<Integer>> adj,int v) {
		int indegree[]=new int[v+1];
		int top[]=new int[v+1];
		int index=0,count=0;
		for(int i=1;i<=v;i++) {
			for(Integer it:adj.get(i))
			indegree[it]++;
		}
		Queue<Integer> q=new LinkedList<>();
		for(int i=1;i<=v;i++) {
			if(indegree[i]==0) q.add(i);
		}
		while(!q.isEmpty()) {
			int node=q.peek();
			top[index]=node;
			index++;
			count++;
			q.poll();
			for(Integer it:adj.get(node)) {
				indegree[it]--;
				if(indegree[it]==0) q.add(it);
			}
			
		}
		if(count==v) {
		for(int i=0;i<v;i++) {
			System.out.print(top[i]+" ");
		}
		}
		else 
			System.out.println("Topological sorting is not possible");
	}
public static void main(String []args) {
//	Scanner sc=new Scanner(System.in);
//	int v=sc.nextInt();
//	int e=sc.nextInt();
//	List<List<Integer>> adj=new ArrayList<>();
//	for(int i=0;i<=v;i++) {
//		adj.add(new ArrayList<>());
//	}
//	// topological sorting is done only in direct and Acyclic graph DAG
//	for(int i=0;i<e;i++) {
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		adj.get(a).add(b);
//	}
	int v=5;
	List<List<Integer>> adjList=new ArrayList<>();
	for(int i=0;i<=v;i++)
	adjList.add(new ArrayList<>());
	//diected graph
	adjList.get(1).add(2);
	adjList.get(2).add(3);
	adjList.get(3).add(4);
	adjList.get(4).add(5);
//	adjList.get(4).add(1);
	topologicalSorting(adjList,v);
}
}

package Dsa4Practices;

import java.util.ArrayList;
import java.util.List;

// for both directed and undirected graph
public class CycleDetectGraphDfs {
	public static boolean dfsUtil(int node,int parent,List<List<Integer>> adjList,boolean visited[]) {
		visited[node]=true;
		for(int it:adjList.get(node)) {
			if(!visited[it]) {
				if(dfsUtil(it,node,adjList,visited)) {
					// it works on undirected graph and not to return here for some edge cases
//					visited[it]=true;
					return true;
				}
			}
			else if(it!=parent) return true;
		}
		return false;
	}
	public static boolean dfsDetectsCycle(int v,List<List<Integer>> adjList) {
		boolean visited[]=new boolean[v+1];
		for(int i=1;i<=v;i++) {
			if(!visited[i]) {
				if(dfsUtil(i,-1,adjList,visited)) return true;
			}
		}
		return false;
	}
public static void main(String []args) {
	int v=5;
	List<List<Integer>> adjList=new ArrayList<>();
	for(int i=0;i<=v;i++)
	adjList.add(new ArrayList<>());
	//diected graph
//	adjList.get(1).add(2);
//	adjList.get(2).add(3);
//	adjList.get(3).add(4);
//	adjList.get(4).add(5);
//	adjList.get(4).add(1);
	// undirected graph
	
	 adjList.get(1).add(2);
     adjList.get(1).add(3);
     adjList.get(1).add(4);
     adjList.get(1).add(5);
     adjList.get(2).add(4);
     adjList.get(2).add(1);
     adjList.get(3).add(1);
     adjList.get(4).add(1);
     adjList.get(4).add(2);
     adjList.get(5).add(1);
     System.out.println(dfsDetectsCycle(v,adjList));
}
}

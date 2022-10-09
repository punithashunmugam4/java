package Dsa4Practices;

import java.util.*;

public class CycleDetectionBfs {
	public static boolean bfsDetectsCycle(int v,List<List<Integer>> adjList) {
		boolean visited[]=new boolean[v+1];
		Queue<CycleNode> que=new LinkedList<>();
		que.add(new CycleNode(1,-1));
		visited[1]=true;
		while(!que.isEmpty()) {
			CycleNode curr=que.poll();
			int node=curr.node;
			int parent=curr.parent;
			for(int it:adjList.get(node)) {
				if(!visited[it]) {
					visited[it]=true;
					que.add(new CycleNode(it,node));
				}
				else if(it!=parent) return true;
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
		adjList.get(1).add(2);
		adjList.get(2).add(3);
		adjList.get(3).add(4);
		adjList.get(4).add(5);
		adjList.get(4).add(1);
		// undirected graph
		
//		 adjList.get(1).add(2);
//	     adjList.get(1).add(3);
//	     adjList.get(1).add(4);
//	     adjList.get(1).add(5);
//	     adjList.get(2).add(4);
//	     adjList.get(2).add(1);
//	     adjList.get(3).add(1);
//	     adjList.get(4).add(1);
//	     adjList.get(4).add(2);
//	     adjList.get(5).add(1);
	     System.out.println(bfsDetectsCycle(v,adjList));
	}
}

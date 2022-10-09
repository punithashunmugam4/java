package Dsa4Practices;

import java.util.*;

public class BfsGraph {
	public static List<Integer> bfs(int v,List<List<Integer>> adjList) {
		Queue<Integer> que=new LinkedList<>();
		List<Integer> list=new ArrayList<>();
		boolean visited[]=new boolean[v+1];
		que.add(1);
		visited[1]=true;
		while(!que.isEmpty()) {
			int node=que.poll();
			list.add(node);
			for(int it:adjList.get(node)) {
				if(!visited[it]) {
					list.add(it);
					visited[it]=true;
				}
			}
		}
		return list;
	}
	public static void main(String []args) {
		int v=5;
	List<List<Integer>> adjList=new ArrayList<>();
	for(int i=0;i<=v;i++)
	adjList.add(new ArrayList<>());
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
     List<Integer> list = bfs(v, adjList);
     for(int i:list)
    	 System.out.print(i+" ");
	}
}

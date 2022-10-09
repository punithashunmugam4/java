package Dsa4Practices;

import java.util.ArrayList;
import java.util.List;

public class DfsGraph {
	public static void dfsUtil(int node,List<List<Integer>> adjList,boolean visited[],List<Integer> list) {
		list.add(node);
		visited[node]=true;
		for(int it:adjList.get(node)) {
			if(!visited[it])
			dfsUtil(it,adjList,visited,list);
		}
	}
	public static List<Integer> dfs(int v,List<List<Integer>> adjList) {
		List<Integer> list=new ArrayList<>();
		boolean visited[]=new boolean[v+1];
		for(int i=1;i<=v;i++) {
			if(visited[i]==false) {
				dfsUtil(i,adjList,visited,list);
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
     List<Integer> list = dfs(v, adjList);
     for(int i:list)
    	 System.out.print(i+" ");
	}
}

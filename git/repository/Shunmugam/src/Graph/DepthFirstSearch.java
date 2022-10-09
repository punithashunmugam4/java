package Graph;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
	public static void dfs(int node,boolean visited[],List<List<Integer>> adjList,List<Integer> result) {
		result.add(node);
		visited[node]=true;
		for(Integer it:adjList.get(node)) {
			if(!visited[it]) dfs(it,visited,adjList,result);
		}
	}
	public static List<Integer> dfsUtil(int v,List<List<Integer>> adjList){
		List<Integer> result=new ArrayList<>();
		boolean visited[]=new boolean[v+1];
		//for graph with multiple components otherwise this loop is unnecessary	
		for(int i=1;i<=v;i++) {
			if(!visited[i]) dfs(i,visited,adjList,result);
		}
		return result;
	}
public static void main(String []args) {
	List<List<Integer>> adjList=new ArrayList<>();
	for(int i=0;i<6;i++)
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
     List<Integer> dfs = dfsUtil(5, adjList);
     for(int i=0;i<dfs.size();i++)
     System.out.print(dfs.get(i)+" ");
}
}

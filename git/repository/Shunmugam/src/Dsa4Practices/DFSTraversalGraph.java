package Dsa4Practices;
import java.util.*;

public class DFSTraversalGraph {
	public static void DFSUtil(int v,List<List<Integer>> adj,boolean visited[]) {
		visited[v]=true;
		System.out.print(v+" ");
		for(int i:adj.get(v)) {
			if(visited[i]==false) {
				DFSUtil(i,adj,visited);
			}
		}
	}
	public static void DFS(int v,List<List<Integer>> adj) {
		boolean visited[]=new boolean[v+1];
		for(int i=0;i<v;i++)
			if(visited[i]==false)
		DFSUtil(i,adj,visited);
	}
public static void main(String []args) {
	int v=5;
	List<List<Integer>> adj=new ArrayList<>();
	for(int i=0;i<v;i++) {
		adj.add(new ArrayList<>());
	}
	adj.get(0).add(1);
	adj.get(0).add(2);
	adj.get(1).add(2);
	adj.get(2).add(3);
	adj.get(3).add(0);
	adj.get(4).add(0);
	DFS(v,adj);
}
}

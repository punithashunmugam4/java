package Graph;
import java.util.*;

public class PrimsMinimumSpanningTree {
	public static int findMinIndex(int dist[],boolean visited[],int v) {
		int min=Integer.MAX_VALUE,minIndex=-1;
		for(int i=0;i<v;i++){
			if(!visited[i] && dist[i]<min) {
				min=dist[i];
				minIndex=i;
			}
		}
		return minIndex;
	}
	public static void primsMinSpanTree(int graph[][],int v) {
		int dist[]=new int[v+1];
		int parent[]=new int[v+1];
		boolean visited[]=new boolean[v+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		parent[0]=-1;
		dist[0]=0;
		for(int i=0;i<v-1;i++) {
			int u=findMinIndex(dist,visited,v);
			visited[u]=true;
			for(int j=0;j<v;j++) {	
				if(graph[u][j]!=0 && visited[j]==false && graph[u][j]<dist[j]) {
					parent[j]=u;
					dist[j]=graph[u][j];
				}
			}
		}
		printMST(parent,graph,v);
		for(int k:dist)
		System.out.println(k);
	}
	public static void printMST(int parent[],int graph[][],int v) {
		for(int i=1;i<v;i++) {
			System.out.println(parent[i]+" parent-"+i+" weight-"+graph[i][parent[i]]);
		}
	}
public static void main(String []args) {
	int v=5;
	int graph[][] = new int[][] {	{ 0, 2, 0, 6, 0 },
									{ 2, 0, 3, 8, 5 },
									{ 0, 3, 0, 0, 7 },
									{ 6, 8, 0, 0, 9 },
									{ 0, 5, 7, 9, 0 } };
	primsMinSpanTree(graph,v);
}
}

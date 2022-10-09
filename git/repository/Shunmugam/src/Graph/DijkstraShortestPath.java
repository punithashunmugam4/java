package Graph;
import java.util.*;

public class DijkstraShortestPath {
	public static int mindistance(int dist[],boolean visited[],int v) {
		int min=Integer.MAX_VALUE;
		int index=-1;
		for(int i=1;i<=v;i++) {
			if( visited[i]==false && dist[i]<min) {
				min=dist[i];
				index=i;
			}
		}
		return index;
	}
	public static void dijkstra(List<HashMap<Integer,Integer>> adj,int v) {
		int dist[]=new int[v+1];
		boolean visited[]=new boolean[v+1];
		Arrays.fill(dist,Integer.MAX_VALUE);
		dist[1]=0;
		for(int i=1;i<v;i++) {
			int u=mindistance(dist,visited,v);
			visited[u]=true;
			for(int j=1;j<=v;j++) {
				if(visited[j]==false && adj.get(u).containsKey(j) && dist[u]!=Integer.MAX_VALUE
					&& dist[u]+adj.get(u).get(j)<dist[j]){
					dist[j]=dist[u]+adj.get(u).get(j);
				}
			}
		}
		for(int i=1;i<=v;i++) {
			System.out.print(dist[i]+" ");
		}
	}
public static void main(String []args) {
	int v=5;
	// this will not work if we have multiple edges from one vertice
	// HashMap<Integer,List<List<Integer>>> this will work 
	List<HashMap<Integer,Integer>> adj=new ArrayList<>();
	for(int i=0;i<=v;i++) {
		adj.add(new HashMap<>());
	}
	
	//undirected graph
//	adj.get(1).put(2,6);
//	adj.get(2).put(1,6);
//	adj.get(2).put(3,2);
//	adj.get(3).put(2,2);
//	adj.get(3).put(4,1);
//	adj.get(4).put(3,1);
//	adj.get(4).put(5,20);
//	adj.get(5).put(4,20);
//	adj.get(4).put(1,10);
//	adj.get(1).put(4,10);
	
	//directed graph
	adj.get(1).put(2,4);
	adj.get(2).put(3,8);
	adj.get(1).put(3,6);
	adj.get(3).put(4,10);
	adj.get(4).put(5,14);
	adj.get(4).put(1,12);
	dijkstra(adj,v);
}
}

package Graph;

import java.util.*;

public class DijkstraPQ {
	public static void shortestPath(int v,List<List<int[]>> adj,int src) {
		int dist[]=new int[v+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		boolean visited[]=new boolean[v+1];
		PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->(x[1]-y[1]));
		pq.add(new int[] {src,0});
		while(!pq.isEmpty()) {
			int curr[]=pq.poll();
			dist[curr[0]]=Math.min(curr[1],dist[curr[0]]);
			if(visited[curr[0]]) continue;
			visited[curr[0]]=true;
			for(int pair[]:adj.get(curr[0])) {
				if(!visited[pair[0]]) {
					if(pair[1]+dist[curr[0]]<dist[pair[0]]) {
						pq.add(new int[]{pair[0],pair[1]+dist[curr[0]]});
					}
				}
			}
		}
		for(int i=2;i<=v;i++) {
			if(visited[i]) System.out.println(dist[i]);
			else System.out.println(-1);
		}
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int v=sc.nextInt();
	int e=sc.nextInt();
	List<List<int[]>> adj=new ArrayList<>();
	for(int i=0;i<=v;i++) {
		adj.add(new ArrayList<>());
	}
	for(int i=0;i<e;i++) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int w=(a+b)%1000;
		adj.get(a).add(new int[] {b,w});
	}
	shortestPath(v,adj,1);
}
}

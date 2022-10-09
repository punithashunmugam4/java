package Graph;
import java.util.*;
// undirected graph
public class CycleDetectionDFS {
	public static boolean cycleDetection(int curr_node,int parent_node,boolean visited[],List<List<Integer>> adj) {
		visited[curr_node]=true;
		for(int it:adj.get(curr_node)) {
			if(!visited[it]) {
				if(cycleDetection(it,curr_node,visited,adj))
					return true;
			}
			else if(it!=parent_node) {
				return true;
			}
		}
		return false;
	}
	public static boolean hasCycle(int v,List<List<Integer>> adj ) {
		boolean visited[]=new boolean[v+1];
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				if(cycleDetection(i,-1,visited,adj)) return true;
			}
		}
		return false;
	}
	  public static void main(String[] args) {
	        int V = 5;
	        List<List<Integer>> adj = new ArrayList<>();
	        //Adjacency List formation//
	        for(int i = 0; i < V; i++){
	            adj.add(new ArrayList<>());
	        }
	        //edge 0 -- 1
	        adj.get(0).add(1);
	        adj.get(1).add(0);

	        //edge 1--2
	        adj.get(1).add(2);
	        adj.get(2).add(1);

	        //edge 2--3
	        adj.get(2).add(3);
	        adj.get(3).add(2);

	        //edge 3--4
	        adj.get(3).add(4);
	        adj.get(4).add(3);

	        //edge 1--4
	        adj.get(1).add(4);
	        adj.get(4).add(1);

	        boolean checkCycle = hasCycle(V, adj);
	        if(checkCycle){
	            System.out.println("Cycle detected");
	        }else{
	            System.out.println("No cycle detected");
	        }
	    }
}

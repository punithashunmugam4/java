package Graph;

import java.util.*;
// Undirected graph
public class CylceDetectionBFS {
	public static boolean cycleDetection(int value,boolean visited[],List<List<Integer>> adj ) {
		Queue<CycleNode> queue=new LinkedList<>();
		queue.add(new CycleNode(value,-1));
		visited[value]=true;
		while(!queue.isEmpty()) {
			int curr=queue.peek().curr_node;
			int parent=queue.peek().parent_node;
			queue.remove();
			for(int it:adj.get(curr)) {
				if(!visited[it]) {
					queue.add(new CycleNode(it,curr));
					visited[it]=true;
				}
				else if(it!=parent)
					return true;
			}
		}
		return false;
	}
	public static boolean hasCycle(int v,List<List<Integer>> adj) {
		boolean visited[]=new boolean[1+v];
		for(int i=1;i<v;i++) {
			if(visited[i]==false) {
				if(cycleDetection(i,visited,adj)) {
					return true;
				}
			}
		}
		return false;
	}
public static void main(String []args) {
	 int V = 11;

     List<List<Integer>> adj = new ArrayList<>();
     //Adjacency List formation//
     for(int i = 0; i < V; i++){
         adj.add(new ArrayList<>());
     }

     //edge 1 -- 2
     adj.get(1).add(2);
     adj.get(2).add(1);

     //edge 2--4
     adj.get(2).add(4);
     adj.get(4).add(2);

     //edge 3--5
     adj.get(3).add(5);
     adj.get(5).add(3);

     //edge 5--6
     adj.get(5).add(6);
     adj.get(6).add(5);

     //edge 5--10
     adj.get(5).add(10);
     adj.get(10).add(5);

     //edge 6--7
     adj.get(6).add(7);
     adj.get(7).add(6);

     //edge 7--8
     adj.get(7).add(8);
     adj.get(8).add(7);

     //edge 8--9
     adj.get(8).add(9);
     adj.get(9).add(8);

     //edge 10--9
//     adj.get(10).add(9);
//     adj.get(9).add(10);

     boolean checkCycle = hasCycle(V, adj);
     if(checkCycle){
         System.out.println("Cycle detected");
     }else{
         System.out.println("No cycle detected");
     }

}
}

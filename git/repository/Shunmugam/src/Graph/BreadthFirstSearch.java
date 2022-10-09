package Graph;

import java.util.*;

public class BreadthFirstSearch {
	public static List<Integer> bfs(int v,List<List<Integer>> adjList){
		List<Integer> res= new ArrayList<>();
		boolean visited[]=new boolean[v+1];
		Queue<Integer> queue=new LinkedList<>();
		queue.add(0);
		visited[0]=true;
		while(!queue.isEmpty()) {
			int node=queue.poll();
			res.add(node);
			for(Integer it:adjList.get(node)) {
				if(!visited[it]) {
					queue.add(it);
					visited[it]=true;
				}
				}
			}
		return res;
	}
public static void main(String []args) {
	  List<List<Integer>> adjList = new ArrayList<>();

      for(int i = 0; i < 5; i++){
          adjList.add(new ArrayList<>());
      }

      adjList.get(0).add(1);
      adjList.get(1).add(0);
      adjList.get(0).add(2);
      adjList.get(2).add(0);
      adjList.get(0).add(3);
      adjList.get(3).add(0);
      adjList.get(2).add(4);
      adjList.get(4).add(2);

      List<Integer> bfs = bfs(5, adjList);

      for(int i = 0; i < bfs.size(); i++){
          System.out.print(bfs.get(i) + " ");
      }
}
}

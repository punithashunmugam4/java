package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionFindCycle {
	static class Edge{
		int src,des;
	}
	static class Graph{
		 int V,E;
		Edge edge[];
		Graph(int v,int e){
			this.V=v;
			this.E=e;
			edge=new Edge[E];
			for(int i=0;i<E;i++) {
				edge[i]=new Edge();
			}	
		}
	}
	static int  findparent(int parent[],int i) {
		if(parent[i]==-1) return i;
		return findparent(parent,parent[i]);
	}
	static boolean hasCycle(int v,int e,Graph graph) {
		int parent[]=new int[v+1];
		Arrays.fill(parent, -1);
		for(int i=0;i<e;i++) {
				int x=findparent(parent,graph.edge[i].src);
				int y=findparent(parent,graph.edge[i].des);
				if(x==y) return true;
				parent[x]=y;
		}
		return false;
	}
	public static void main(String []args) {
		int v=3,e=3;
		Graph graph=new Graph(v,e);
	        // add edge 0-1
	        graph.edge[0].src = 0;
	        graph.edge[0].des = 1;
	 
	        // add edge 1-2
	        graph.edge[1].src = 1;
	        graph.edge[1].des = 2;
	 
	        // add edge 0-2
	        graph.edge[2].src = 0;
	        graph.edge[2].des = 2;
	   

	     boolean checkCycle = hasCycle(v,e,graph);
	     if(checkCycle){
	         System.out.println("Cycle detected");
	     }else{
	         System.out.println("No cycle detected");
	     }

	}

}

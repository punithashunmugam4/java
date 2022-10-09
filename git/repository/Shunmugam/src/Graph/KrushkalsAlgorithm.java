package Graph;

import java.util.Arrays;

public class KrushkalsAlgorithm {
 static class Edge implements Comparable<Edge>{
	int src,des,wt;
	public int compareTo(Edge e) {
		return this.wt-e.wt;
	}
}
static class Graph{
	int V,E;
	Edge edge[];
	Graph(int v,int e){
		this.E=e;
		this.V=v;
		edge=new Edge[E];
		for(int i=0;i<E;i++) {
			edge[i]=new Edge();
		}
	}
}
static class Subset{
	int parent,rank;
}
static int find(Subset subset[],int i) {
	if (subset[i].parent != i)
        subset[i].parent= find(subset, subset[i].parent);

    return subset[i].parent;
}
static void Union(Subset subset[],int x,int y) {
	int xroot=find(subset,x);
	int yroot=find(subset,y);
	if(subset[xroot].rank<subset[yroot].rank) {
		subset[xroot].parent=yroot;
	}
	else if(subset[xroot].rank>subset[yroot].rank) {
		subset[yroot].parent=xroot;
	}
	else {
		subset[yroot].parent=xroot;
		subset[xroot].rank++;
	}
}
static void KruskalMST(int v,int e, Edge[] edge) {
	Edge result[]=new Edge[v];
	int u=0;
	int i=0;
	  for (i = 0; i < v; ++i)
          result[i] = new Edge();
	  Arrays.sort(edge);
	  Subset subset[]=new Subset[v];
	  for(i=0;i<v;i++) {
		  subset[i]=new Subset();
	  }
	  for(int j=0;j<v;j++) {
		  subset[j].parent=j;
		  subset[j].rank=0;
	  }
	  i=0;
	  while(u<v-1) {
		  Edge next_edge = edge[i++];
          int x = find(subset, next_edge.src);
          int y = find(subset, next_edge.des);
          // parent of x and y should be differnt otherwise it will form cycle
          // MST does not contain cycle
          if (x != y) {
              result[u++] = next_edge;
              Union(subset, x, y);
          } 
	  }
	  System.out.println("Following are the edges in "
              + "the constructed MST");
	  int minimumCost = 0;
	  for (i = 0; i < u; ++i) {
          System.out.println(result[i].src + " -- "
                             + result[i].des
                             + " == " + result[i].wt);
          minimumCost += result[i].wt;
      }
      System.out.println("Minimum Cost Spanning Tree "
                         + minimumCost);
}
public static void main(String []args) {
	int v=4,e=5;
	Graph graph=new Graph(v,e);
	 graph.edge[0].src = 0;
     graph.edge[0].des = 1;
     graph.edge[0].wt = 10;

     // add edge 0-2
     graph.edge[1].src = 0;
     graph.edge[1].des = 2;
     graph.edge[1].wt = 6;

     // add edge 0-3
     graph.edge[2].src = 0;
     graph.edge[2].des = 3;
     graph.edge[2].wt = 5;

     // add edge 1-3
     graph.edge[3].src = 1;
     graph.edge[3].des = 3;
     graph.edge[3].wt = 15;

     // add edge 2-3
     graph.edge[4].src = 2;
     graph.edge[4].des = 3;
     graph.edge[4].wt = 4;
     // Function call
     KruskalMST(v,e,graph.edge);
}
}

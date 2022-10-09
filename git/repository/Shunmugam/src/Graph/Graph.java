package Graph;

import java.util.ArrayList;
import java.util.HashMap;

class Graph {
	int v;
	ArrayList<ArrayList<HashMap<Integer,Integer>>> adj;
	int src;
	int des;
	int wt;
	Graph(int v){
		this.v=v;
		this.adj=new ArrayList<>();
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<>() );
		}
	}
	void addEdge(int src,int des,int wt) {
		this.adj.get(src).add(new HashMap<>());
		this.adj.get(src).get(this.adj.get(src).size()-1).put(des,wt);
	}
	void printGraph() {
		for(int i=0;i<this.v;i++) {
			System.out.print("vertex-"+i);
			for(HashMap<Integer,Integer> mp:adj.get(i)) {
				mp.entrySet().forEach(e->System.out.println(" connected with "+e.getKey()+" weighted as "+e.getValue()));
			}
		}
	}
}

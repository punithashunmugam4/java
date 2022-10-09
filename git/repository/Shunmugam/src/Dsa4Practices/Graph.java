package Dsa4Practices;

public class Graph {
	int v;
	int e; 
	Edge edge[];
	Graph(int v,int e){
		this.v=v;
		this.e=e;
		this.edge=new Edge[e];
		
	}
}

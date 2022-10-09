package Dsa4Practices;

public class Edge implements Comparable<Edge>{
	int src;
	int des;
	int wt;
	Edge(int src,int des,int wt){
		this.src=src;
		this.des=des;
		this.wt=wt;
	}
	public int compareTo(Edge e) {
		return this.wt-e.wt;
	}
}

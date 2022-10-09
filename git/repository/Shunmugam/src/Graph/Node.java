package Graph;

import java.util.Comparator;

class Node implements Comparable<Node>{
    int val;
    int dist;
    Node(int val,int dist){
        this.val=val;
        this.dist=dist;
    }
    public int compareTo(Node node1, Node node2)
    {
 
        if (node1.dist < node2.dist)
            return -1;
 
        if (node1.dist > node2.dist)
            return 1;
 
        return 0;
    }
	
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
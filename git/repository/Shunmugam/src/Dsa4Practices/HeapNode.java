package Dsa4Practices;

public class HeapNode implements Comparable<HeapNode>{
int x;
int y;
int data;
HeapNode(int x,int y,int data){
	this.x=x;
	this.y=y;
	this.data=data;
}
public int compareTo(HeapNode o) {
	if(this.data<=o.data) return -1;
	else return 1;
}
}

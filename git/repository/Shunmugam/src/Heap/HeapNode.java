package Heap;

public class HeapNode implements Comparable<HeapNode> {
int x;
int y;
int value;
HeapNode(int x,int y,int val){
	this.x=x;
	this.y=y;
	this.value=val;
}
public int compareTo(HeapNode o) {
	if(this.value<=o.value) return -1;
	else return 1;
}

}

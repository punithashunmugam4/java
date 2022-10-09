package Dsa4Practices;
import java.util.*;

public class MergeSortedArrayHeap {
	public static void mergeArray(int arr[][], List<Integer> list) {
		PriorityQueue<HeapNode> pq=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
		pq.add(new HeapNode(i,0,arr[i][0]));
		}
		HeapNode curr=null;
		while(!pq.isEmpty()) {
			curr=pq.poll();
			list.add(curr.data);
			if(curr.y<arr[curr.x].length-1) {
				pq.add(new HeapNode(curr.x,curr.y+1,arr[curr.x][curr.y+1]));
			}
		}
	}
public static void main(String []args) {
	int arr[][]= {{1,4,6},
				  {2,5},
				  {3,7,8,9}};
	List<Integer> list=new ArrayList<>();
	mergeArray(arr,list);
	System.out.println(list);
}
}

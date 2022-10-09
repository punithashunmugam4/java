package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeSortedArray {
	public static List<Integer> mergeKSortedArrays(int arr[][],int k){
		 List<Integer> result = new ArrayList<>();
	     PriorityQueue<HeapNode> minHeap = new PriorityQueue<>();
	     for(int i=0;i<arr.length;i++) {
	    	 minHeap.add(new HeapNode(i,0,arr[i][0]));
	     }
	     HeapNode curr=null;
	     //poll the min element and add the next element from row where min is polled
	     while(!minHeap.isEmpty()) {
	    	 curr=minHeap.poll();
	    	 result.add(curr.value);
	    	 if(curr.y<arr[curr.x].length-1) {
	    		 minHeap.add(new HeapNode(curr.x,curr.y+1,arr[curr.x][curr.y+1]));
	    	 }
	     }
	     return result;
	}
public static void main(String []args) {
	 int[][] arr = {
             {2,6,12},
             {1,9},
             {23, 34, 90, 100}
     };
     int k = arr.length;
     List<Integer> result = mergeKSortedArrays(arr, k);

     for(int i: result){
         System.out.print(i + " ");
     }
}
}

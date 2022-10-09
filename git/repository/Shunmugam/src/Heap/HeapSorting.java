package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapSorting {
	public static void heapSortDescending(int arr[]) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
			minHeap.add(arr[i]);
		for(int i=0;i<arr.length;i++)
			arr[i]=minHeap.poll();
	}
	public static void heapSort(int arr[]) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++)
			minHeap.add(arr[i]);
		for(int i=0;i<arr.length;i++)
			arr[i]=minHeap.poll();
	}
public static void main(String []args) {
	  int[] arr = {10,7,11,30,8,38,2,45};

      heapSort(arr);

      for(int i = 0; i < arr.length; i++)
          System.out.print(arr[i] + " ");
      System.out.println();
      heapSortDescending(arr);

      for(int i = 0; i < arr.length; i++)
          System.out.print(arr[i] + " ");
}
}

package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TopKLargestElements {
	public static List<Integer> kthLargestUsingMaxHeap(int arr[],int k) {
		PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b) -> b-a);
		List<Integer> topKElements=new ArrayList<>();
		//both are same which makes maxHeap
//		PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			maxHeap.add(arr[i]);
		}
		for(int i=0;i<k;i++) {
			//this add the elements in 0th index so we can get same order
			topKElements.add(0,maxHeap.poll());
		}
		return topKElements;
		
	}
	public static List<Integer> kthLargestUsingMinHeap(int arr[],int k) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		List<Integer> topKElements=new ArrayList<>();
		for(int i=0;i<k;i++) {
			minHeap.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>minHeap.peek()) {
			minHeap.poll();
			minHeap.add(arr[i]);
			}
		}
		while(!minHeap.isEmpty()) {
			topKElements.add(minHeap.poll());
		}
		return topKElements;
	}
public static void main(String []args) {
//	int arr[]= {10,7,11,30,20,28,2,40};
//	int k=3;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	System.out.println(kthLargestUsingMinHeap(arr,k));
	System.out.println(kthLargestUsingMaxHeap(arr,k));
}
}

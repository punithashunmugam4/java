package Heap;
import java.util.*;
import java.io.*;

public class MinCostOfRopes {
	public static int mincost(int arr[],int n) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		for(int i=0;i<n;i++) {
			minHeap.add(arr[i]);
		}
		int min=0;
		while(minHeap.size()>1) {
			int curr=minHeap.poll()+minHeap.poll();
			min+=curr;
//			if(minHeap.size()>=1) {
				minHeap.add(curr);
//			}
		}
		return min;
	}
	 public static void main (String[] args) throws IOException {
		    BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		        int n=Integer.parseInt(rd.readLine());
		        String input[]=new String[n];
		        input=rd.readLine().split(" ");
		        int arr[]=new int[n];
		        for(int i=0;i<n;i++)
		        arr[i]=Integer.parseInt(input[i]);
		      System.out.println(mincost(arr,n));
		    }
}

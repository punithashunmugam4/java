package Basics;

import java.util.Arrays;

public class MissingElement {
	public static int missing(int arr[]) {
		int n=arr.length;
		int N=1000001;
		boolean present[]=new boolean[N];
		 int maxle=Integer.MIN_VALUE;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>0 && arr[i]<=N) {
				 present[arr[i]]=true;
				 maxle=Math.max(maxle, arr[i]);
			 }
			 }

			 for (int i = 1; i < N; i++)
		            if (!present[i])
		                return i;
			 
			 return maxle+1;
	}
 public static void main(String[] args) {
	 int arr[]= {2, 3, -7, 6, 8, 1, -10, 15};
	 for(int j=0;j<arr.length-1;j++) {
	 for(int i=0;i<arr.length-j-1;i++) {
		 if(arr[i]>arr[i+1]) {
		 int temp=arr[i];
		 arr[i]=arr[i+1];
		 arr[i+1]=temp;
	 }
	 }
	 }
	 System.out.println(missing(arr));
		 }
 }

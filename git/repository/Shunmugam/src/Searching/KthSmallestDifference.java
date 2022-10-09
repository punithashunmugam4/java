package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestDifference {
	public static int smallestDiff(int arr[],int n,int k) {
		Arrays.sort(arr);
		int l=0;int r=arr[n-1]-arr[0];
		while(l<r) {
			int m=(l+r)/2;
			if(count(arr,m)<k)
					l=m+1;
			else
				r=m;
		}
		return l;
	}
	static int count(int arr[],int m) {
		int j=0;int ans=0;
		for(int i=1;i<arr.length;i++) {
			while(j<i && arr[i]-arr[j]>m) {
				j++;
			}
			ans+=i-j;
		}
		return ans;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	System.out.println(Math.abs(smallestDiff(arr,n,k)));
}
}

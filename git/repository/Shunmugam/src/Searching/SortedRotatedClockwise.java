package Searching;

import java.util.Scanner;

public class SortedRotatedClockwise {
	public static int checkIfSortedRotated(int arr[],int n) {
		int x=arr[0];
		int i;
		for(i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]=x;
		if(checkIfSorted(arr,n))
			return 1;
		else if(n==0)
			return -1;
		return checkIfSortedRotated(arr,n-1);
	}
	public static boolean checkIfSorted(int arr[],int n) {
		boolean ascending= true;
		boolean descending=true;
			for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>=arr[i+1])
				ascending=false;
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<=arr[i+1])
				descending=false;
		}
		return ascending ^ descending;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	if(checkIfSorted(arr,n))
		System.out.println("No");
	else {
		if(checkIfSortedRotated(arr,n)==1)
			System.out.println("Yes");
		else if(checkIfSortedRotated(arr,n)==-1)
			System.out.println("No");
	}
}
}

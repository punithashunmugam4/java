package Array;

import java.util.Scanner;

public class SortedRotatedCw {
	public static boolean isSorted(int arr[],int n) {
		boolean ascending=true;
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
	public static int isRotated(int arr[],int n) {
		int x=arr[0];
		int i=0;
		for(i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]=x;
		if(isSorted(arr,n)) {
			return 1;
		}
		else {
			if(n==0) {
				return -1;
			}
			return isRotated(arr,n-1);
		}
		
	}

public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int j=0;j<t;j++) {
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int k=0;k<n;k++) {
		arr[k]=sc.nextInt();
	}
	if(isSorted(arr,n))
		System.out.println("No");
	else if(isRotated(arr,n)==1)
		System.out.println("Yes");
	else if(isRotated(arr,n)==-1)
		System.out.println("No");
}
}
}

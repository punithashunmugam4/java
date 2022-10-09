package Sorting;

import java.util.Scanner;

//T.C:O(N2)
//S.C:O(N)

public class BubbleSort {
	public static void sorting(int arr[],int n) {
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				}
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++)
//			arr[i]=sc.nextInt();
		int arr[]= {1,4,2,5,3,8};
		sorting(arr,arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}

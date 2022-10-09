package Sorting;

import java.util.Scanner;

//T.C:O(N2) (worst case)
//T.C:O(NlogN) (average case)
//S.C:O(N)

public class QuickSort {
	public static int[] sorting(int arr[],int l,int r) {
		if(l<r) {
			int pi=partition(arr,l,r);
			sorting(arr,l,pi-1);
			sorting(arr,pi+1,r);
		}
		return arr;
	}
	public static int partition(int arr[],int l,int r) {
		int pivot=arr[r];
		int i=l-1;
		for(int j=l;j<=r-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,r);
		return i+1;
	}
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int l=0,r=n-1;
		sorting(arr,l,r);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}

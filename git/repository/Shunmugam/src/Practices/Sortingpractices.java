package Practices;

import java.util.Scanner;

public class Sortingpractices {
//	public static void bubble(int arr[],int n) {
//		for(int i=0;i<n-1;i++) {
//			for(int j=0;j<n-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//	}
//	public static void insert(int arr[],int n) {
//		for(int i=0;i<n;i++) {
//			int key=arr[i];
//			int j=i-1;
//			while(j>=0 && arr[j]>key) {
//				arr[j+1]=arr[j];
//				j=j-1;
//			}
//			arr[j+1]=key;
//		}
//	}
	public static int[] merge(int arr[],int l,int r) {
		if(l<r) {
			int m=l+(r-l)/2;
			merge(arr,l,m);
			merge(arr,m+1,r);
			merging(arr,l,m,r);
		}
		return arr;
	}
	public static int[] merging(int arr[],int l,int m,int r) {
		int n1=m+1-l;
		int n2=r-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++) {
			L[i]=arr[l+i];
		}
		for(int i=0;i<n2;i++) {
			R[i]=arr[m+1+i];
		}
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
		return arr;
	}
	public static void quickSort(int arr[],int l,int r) {
		if(l<r) {
			int pi=partition(arr,l,r);
			quickSort(arr,l,pi-1);
			quickSort(arr,pi+1,r);
		}
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
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
//	bubble(arr,n);
//	for(int i=0;i<n;i++)
//	System.out.print(arr[i]+" ");
//	insert(arr,n);
//	System.out.println();
//	for(int i=0;i<n;i++)
//		System.out.print(arr[i]+" ");
//	merge(arr,0,n-1);
//	System.out.println();
//	for(int i=0;i<n;i++)
//		System.out.print(arr[i]+" ");
	quickSort(arr,0,n-1);
	System.out.println();
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
}
}

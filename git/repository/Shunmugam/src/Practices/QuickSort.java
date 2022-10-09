package Practices;

import java.util.Scanner;

public class QuickSort {
	public static int[] quicksorting(int arr[],int l,int r) {
		if(l<r) {
			int pi=partition(arr,l,r);
			quicksorting(arr,l,pi-1);
			quicksorting(arr,pi+1,r);
		}
		return arr;
	}
	public static int partition(int arr[],int l,int r) {
		int pivot=arr[r];
		int j=l-1;
		for(int i=l;i<r;i++) {
			if(arr[i]<pivot) {
				j++;
				swap(arr,i,j);
			}
		}
		swap(arr,j+1,r);
		return j+1;
	}
	static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	int l=0,r=n-1;
	quicksorting(arr,l,r);
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
}
}

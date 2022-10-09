package Sorting;

import java.util.Scanner;

public class MergeSort {
	public static int[] sorting(int arr[],int l,int r) {
		if(l<r) {
			int m=l+(r-l)/2;
			sorting(arr,l,m);
			sorting(arr,m+1,r);
			merging(arr,l,m,r);
		}
		return arr;
	}
		public static int[] merging(int arr[],int l,int m,int r) {
			int n1=m-l+1;
			int n2=r-m;
			int L[]=new int[n1];
			int R[]=new int[n2];
			for(int i=0;i<n1;i++) {
				L[i]=arr[l+i];
			}
			for(int i=0;i<n2;i++) {
				R[i]=arr[m+i+1];
			}
			int i=0,j=0,k=l;
			while(i<n1 && j<n2) {
				if(L[i]<= R[j]) {
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

//T.C:O(NlogN)
//S.C:O(N)
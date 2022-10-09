package Practices;
import java.util.Scanner;

public class Practices {
	static void reverse(int arr[],int n){
		int i=n-1;
			for(int j=0;j<n/2;j++) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i--;
			}
		}
	public static void bubbleSort(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j+1]<arr[j]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		}
	}
	public static void insertionSort(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	public static int[] mergesort(int arr[],int l,int r) {
		if(l<r) {
			int m=l+(r-l)/2;
			mergesort(arr,l,m);
			mergesort(arr,m+1,r);
			merge(arr,l,m,r);
		}
		return arr;
	}
	public static int[] merge(int arr[],int l,int m,int r) {
		int n1=m+1-l;
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
			if(L[i]<R[j]) {
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
	public static int[] quickSort(int arr[],int l,int r) {
		if(l<r) {
			int pi=partition(arr,l,r);
			quickSort(arr,l,pi-1);
			quickSort(arr,pi+1,r);
		}
		return arr;
	}
	static int partition(int arr[],int l,int r) {
		int pi=arr[r];
		int i=l-1;
		for(int j=l;j<r;j++) {
		if(arr[j]>pi) {
			i++;
			swap(arr,i,j);
		}
		}
		swap(arr,i+1,r);
		return i+1;
	}
	static void swap(int arr[],int i,int j){
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
//	reverse(arr,n);
//	bubbleSort(arr,n);
//	insertionSort(arr,n);
	int end=n-1,start=0;
//	mergesort(arr,start,end);
	quickSort(arr,start,end);
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
}
}

package Searching;

import java.util.Arrays;

public class SearchInsortedrotated {
	public static int pivotedBinarySearch(int arr[], int n, int key) {
		 	int pivot=findPivot(arr,0,n-1);
		 	if(pivot==-1)
		 		return binarySearch(arr,0,n-1,key);
		 	if(arr[pivot]==key)
		 		return pivot;
		 	if(arr[0]<=key) 
		 		return binarySearch(arr,0,pivot-1,key);
		 	return binarySearch(arr,pivot+1,n-1,key);
	}
	public static int binarySearch(int arr[],int low,int high,int key) {
		if(high<low)
			return -1;
		int mid=(low+high)/2;
		if(key==arr[mid])
			return mid;
		if(key>arr[mid])
			return binarySearch(arr,mid+1,high,key);
		return binarySearch(arr,low,mid-1,key);
	}
	public static int findPivot(int arr[],int low,int high) {
		if(high<low)
			return -1;
		if(high==low)
			return low;
		int mid=(low+high)/2;
		if(mid<high && arr[mid]>arr[mid+1])
			return mid;
		if(mid>low && arr[mid]<arr[mid-1])
			return (mid-1);
		if(arr[low]>=arr[mid])
			return findPivot(arr,low,mid-1);
		return findPivot(arr,mid+1,high);
	}
public static void main(String[] args) {
	 int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2,3};
     int n = arr.length;
     int key = 7;
     int l=0,r=arr.length-1;
     System.out.println("Index of the element is : " + pivotedBinarySearch(arr, n, key));
     System.out.println("Index of the element is : " + improvedPivotedBinarySearch(arr, l,r, key));
}
public static int improvedPivotedBinarySearch(int arr[],int l,int r,int key) {
	if(l>r)
		return -1;
	int m=(l+r)/2;
	if(arr[m]==key)
		return m;
	if(arr[l]<=arr[m]) {
		if(key<=arr[m] && key>=arr[l])
			return improvedPivotedBinarySearch(arr,l,m-1,key);
		return improvedPivotedBinarySearch(arr,m+1,r,key);
	}
	else {
	if(key>=arr[m] && key<=arr[r]) 
		return improvedPivotedBinarySearch(arr,m+1,r,key);
	return improvedPivotedBinarySearch(arr,l,m-1,key);
	} 
}
}

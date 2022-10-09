package Recursion;

import java.util.Arrays;

public class BinarySearch {
	public static int binarySearch(int []arr,int k,int l,int r) {
		int mid=l+(r-l)/2;
		if(arr[mid]==k)
			return mid;
		if(arr[mid]>k)
		return binarySearch(arr,k,l,mid-1);
		else
		return binarySearch(arr,k,mid+1,r);
	}
public static void main(String []args) {
	int arr[]= {1,4,21,24,56,67};
	int index=binarySearch(arr,21,0,arr.length-1);
	System.out.println(index);
	int ind=Arrays.binarySearch(arr,56 );
	System.out.println(ind);
}
}

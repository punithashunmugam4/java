package Strings;

import java.util.Arrays;

public class SortInAlphabeticalOrder {
	public static void sorting(String arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
public static void main(String []args) {
	String arr[]= {"cat","coat","apple","zebra","monkey"};
	sorting(arr,arr.length);
	System.out.println(Arrays.toString(arr));
}
}

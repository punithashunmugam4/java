package Array;

import java.util.Arrays;
import java.util.HashMap;

public class NumberOfPairswithMean {
	public static void twoForLoopGreaterThanMean(int arr[],int k,int n) {
		int count=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]>=2*k)
					count++;
			}
		}
		System.out.println(count);
	}
	public static void twoPointerGreaterThanMean(int arr[],int k,int n) {
		Arrays.sort(arr);
		int count=0;
		int l=0,r=n-1;
		while(l<r) {
			if((arr[l]+arr[r])<2*k){
				l++;
			}
			else {
				count+=(r-l);
				r--;
			}
		}
		System.out.println(count);
	}
	public static void hashingEqualsMean(int arr[],int k,int n) {
		Arrays.sort(arr);
		HashMap<Integer,Integer> hash=new HashMap<>();
		int count=0;
		for(int i=0;i<n;i++) {
			if(hash.containsKey((2*k)-arr[i])) {
				count+=hash.get((2*k)-arr[i]);
			}
			if(hash.containsKey(arr[i])) {
				hash.put(arr[i],hash.get(arr[i])+1);
			}
			else {
				hash.put(arr[i],1);
			}
		}
		System.out.println(count);
	}
	public static void main(String []args) {
		int arr[]= {4,2,9,6,3,1,5,3,2};
		int n=arr.length;
		int k=5;
		twoForLoopGreaterThanMean(arr,k,n);
		twoPointerGreaterThanMean(arr,k,n);
		hashingEqualsMean(arr,k,n);
	}
}

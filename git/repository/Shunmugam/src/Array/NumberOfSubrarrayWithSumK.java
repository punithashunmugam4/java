package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
//Number of pair with sum k non-contiguous
public class NumberOfSubrarrayWithSumK {
	public static void twoForLoop(int arr[],int k,int n) {
		int count=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==k)
					count++;
			}
		}
		System.out.println(count);
	}
	public static int numberOfSubarrayWithSumK(int arr[],int k,int n) {
		Arrays.sort(arr);
		HashMap<Integer,Integer> hash=new HashMap<>();
		int count=0;
		for(int i=0;i<n;i++) {
			if(hash.containsKey(k-arr[i]))
				count+=hash.get(k-arr[i]);
			if(hash.containsKey(arr[i])) {
				hash.put(arr[i],hash.get(arr[i])+1);
			}
			else
				hash.put(arr[i], 1);
		}
		return count;
	}
public static void main(String []args) {
	int arr[]= {4,2,9,6,3,1,5,3,2};
	int n=arr.length;
	int k=5;
	twoForLoop(arr,k,n);
	System.out.println(numberOfSubarrayWithSumK(arr,k,n));
}
}

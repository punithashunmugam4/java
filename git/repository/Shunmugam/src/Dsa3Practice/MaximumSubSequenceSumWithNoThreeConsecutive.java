package Dsa3Practice;

import java.util.Arrays;

public class MaximumSubSequenceSumWithNoThreeConsecutive {
	static int sum[];
	public static int maxSum(int arr[],int n) {
		if(sum[n]!=-1) return sum[n];
		if(n==0) return sum[n]=arr[0];
		if(n==1) return sum[n]=arr[0]+arr[1];
		if(n==2) return sum[n]=Math.max(sum[1], Math.max(arr[1] + arr[2], arr[0] + arr[2]));
		return sum[n]=Math.max(Math.max(maxSum(arr,n-1),maxSum(arr,n-2)+arr[n]), maxSum(arr,n-3)+arr[n]+arr[n-1]);
	}
public static void main(String []args) {
	int arr[]={23,34,2,24,9,13};
	sum=new int[arr.length];
	Arrays.fill(sum,-1);
	System.out.println(maxSum(arr,arr.length-1));
}
}

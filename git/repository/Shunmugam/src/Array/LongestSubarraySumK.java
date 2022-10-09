package Array;

import java.util.Scanner;

public class LongestSubarraySumK {
	public static int longestSubarraysumK(int arr[],int n,int k) {
		int i=0,j=0;
		int sum=0;
		int maxLength=0;
		while(j<n) {
			sum+=arr[j];
			if(sum<k)
				j++;
			else if(sum==k)
				maxLength=Math.max(maxLength,j-i+1);
			else {
				while(sum>k) {
					sum-=arr[i];
					i++;
				}
				if(sum==k)
					maxLength=Math.max(maxLength,j-i+1);
				j++;
			}
		}
		return maxLength;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	System.out.println(longestSubarraysumK(arr,n,k));
}
}

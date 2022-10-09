package Array;

import java.util.Scanner;

public class NumberOfPairWithRangeSum {
	public static int numberLessThanK(int arr[],int n,int k) {
		int l=0,r=n-1;
		int sum=0,count=0;
		while(l<r) {
			sum=arr[l]+arr[r];
			if(sum>k)
				r--;
			else {
				count+=(r-l);
				l++;
			}
			
		}
		return count;
	}
	public static void numberOfPair(int arr[],int n,int L,int R) {
		int LCount=numberLessThanK(arr,n,L-1);
		int RCount=numberLessThanK(arr,n,R);
		int result=Math.abs(LCount-RCount);
		System.out.println(result);
	}
	
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int L=sc.nextInt();
	int R=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	numberOfPair(arr,n,L,R);
}
}

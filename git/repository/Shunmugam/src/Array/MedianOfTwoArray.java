package Array;

import java.util.Scanner;

public class MedianOfTwoArray {
	public static double medianOfTwoArray(int arr[],int arr1[]) {
		int m=arr.length;
		int n=arr1.length;
		if(m>n)
			return medianOfTwoArray(arr1,arr);
		int start=0,end=m;
		int realMid=(n+m+1)/2;
		while(start<=end) {
			int mid=(start+end)/2;
			int leftSizeArr=mid;
			int leftSizeArr1=realMid-mid;
			int leftA=Integer.MIN_VALUE;
			if(leftSizeArr>0)
				leftA=arr[leftSizeArr-1];
			int leftB=Integer.MIN_VALUE;
			if(leftSizeArr1>0)
				leftB=arr1[leftSizeArr1-1];
			int rightA=Integer.MAX_VALUE;
			if(leftSizeArr<m)
				rightA=arr[leftSizeArr];
			int rightB=Integer.MAX_VALUE;
			if(leftSizeArr1<n)
				rightA=arr1[leftSizeArr1];
			if(leftA<=rightB && leftB<=rightA) {
				if((m+n)%2==0)
				return (Math.max(leftA,leftB)+Math.min(rightA, rightB))/2.0;
				else return Math.max(leftA,leftB);
			}
			else if(leftA>rightB) {
				end=mid-1;
			}
			else
				start=mid+1;
		}
		return 0.0;
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int arr[]=new int[m];
	int arr1[]=new int[n];
	for(int i=0;i<m;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
		arr1[i]=sc.nextInt();
	System.out.println(medianOfTwoArray(arr,arr1));
}
}

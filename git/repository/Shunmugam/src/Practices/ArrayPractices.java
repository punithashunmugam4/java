package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractices {
	public static int removeDuplicate(int arr[],int n) {
		int temp[]=new int[n];
		if(n==0 || n==1)
			return n;
		int j=0,count=0;
		for(int i=0;i<n-1;i++) {
					if(arr[i]!=arr[i+1]) {
						temp[j++]=arr[i];
					}
				}
		temp[j++]=arr[n-1];
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int m=removeDuplicate(arr,n);
		for(int i=0;i<m;i++) {
			System.out.print(arr[i]+" ");
		}
}
}

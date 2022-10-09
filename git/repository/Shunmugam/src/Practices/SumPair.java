package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class SumPair {
	public static void result(int arr[],int n,int target) {
		int i=0,j=n-1;
		while(i<j) {
			if(arr[i]+arr[j]==target) {
				System.out.println(i+" "+j);
			}
			if(arr[i]+arr[j]<target) {
				i++;
			}
			else
				j--;
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		result(arr,n,target);
}
}

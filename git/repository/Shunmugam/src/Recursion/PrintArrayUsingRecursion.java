package Recursion;

import java.util.Scanner;

public class PrintArrayUsingRecursion {
	public static void printArray(int arr[],int index,int n) {
		if(index==n)
			return;
		else
			System.out.print(arr[index]+" ");
		printArray(arr,index+1,n);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	printArray(arr,0,n);
}
}

package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class Practices1 {
	public static void arrange(int arr[],int n) {
		int i=0;
		int temp[]=new int[n];
			for(int j=0;j<n;j++) {
			if(arr[j]>=0) {
				temp[i++]=arr[j];
			}
			}
			if(i==n || i==0)
				return;
			for(int j=0;j<n;j++) {
			if(arr[j]<0) {
				temp[i++]=arr[j];
			}
		}
			for(int j=0;j<n;j++) {
				arr[j]=temp[j];
			}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		arrange(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
}
}

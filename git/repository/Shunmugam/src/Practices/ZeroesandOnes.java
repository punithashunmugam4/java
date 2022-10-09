package Practices;

import java.util.Scanner;

public class ZeroesandOnes {
	public static void arrange(int arr[],int n) {
		int left=0,right=n-1;
		while(left<right) {
		while(arr[left]==0 && left<right) {
			left++;
			while(arr[right]==1 && left<right)
				right--;
		}
		if(left<right) {
			arr[left]=0;
			arr[right]=1;
			left++;
			right--;
		}
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

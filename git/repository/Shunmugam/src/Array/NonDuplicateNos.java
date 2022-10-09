package Array;

import java.util.Scanner;

public class NonDuplicateNos {
	public static void nonDuplicate(int arr[],int n) {	
		int count=0;
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<i;j++) 
				if(arr[i]==arr[j]) 
					break;
				if(i==j) {
					System.out.print(arr[i]+" ");
					count++;
		}
		}
		System.out.println();
		System.out.println(count);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
				}
	nonDuplicate(arr,n);
}
}

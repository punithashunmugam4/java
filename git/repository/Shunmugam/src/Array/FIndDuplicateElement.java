package Array;

import java.util.Scanner;

public class FIndDuplicateElement {
	public static void finddup(int arr[],int n) {
		for(int j=0;j<n-1;j++) {
			for(int k=j+1;k<n;k++) {
				//if(j!=k)
			if(arr[j]==arr[k]) {
				System.out.print(arr[j]+" ");
				break;
			}
		}
		}
	}
public static void main(String []args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	finddup(arr,n);
}
}

package Practices;

import java.util.Scanner;

public class Matrix {
	public static int borderSum(int arr[][],int n,int m) {
		int sum=0;
		for(int j=0;j<m;j++) {
			sum+=arr[0][j];
		}
		for(int j=1;j<n;j++) {
			sum+=arr[j][n-1];
		}
		for(int j=m-1-1;j>	0;j--) {
			sum+=arr[n-1][j];
		}
		for(int j=n-1;j>0;j--) {
			sum+=arr[j][0];
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int arr[][]=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println(borderSum(arr,n,m));
}
}

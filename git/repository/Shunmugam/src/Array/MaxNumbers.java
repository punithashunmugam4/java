package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumbers {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++) {
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++) {
			arr[j]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("\n"+arr[n-1]+" "+arr[n-2]+" "+arr[n-3]);
	}
}
}

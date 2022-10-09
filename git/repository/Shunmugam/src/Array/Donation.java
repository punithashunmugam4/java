package Array;

import java.util.Scanner;

public class Donation {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int pre=0,sum=0;
	for(int i=0;i<n;i++) {
		if(arr[i]>=pre) {
			pre=arr[i];
			sum+=arr[i];
			System.out.print(0+" ");
		}
		else {
			sum=sum+arr[i]+(pre-arr[i]);
		System.out.print(pre-arr[i]+" ");
	}
	}
	System.out.println();
	System.out.println(sum);
}
}

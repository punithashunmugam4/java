package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySerach {
	public static boolean checkIfNumberAvailable(int arr[],int n,int k) {
		int l=0,r=n-1;
		int mid;
		while(l<=r) {
			mid=l+(r-l)/2;
			if(arr[mid]==k)
				return true;
			else if(arr[mid]<k)
				l=mid+1;
			else
				r=mid-1;	
			}
		return false;
		}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	if(checkIfNumberAvailable(arr,n,k))
		System.out.println(true);
	else 
		System.out.println(false);
}
}

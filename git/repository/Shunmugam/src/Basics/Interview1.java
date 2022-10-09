package Basics;
import java.util.Scanner;

public class Interview1 {
	public static void sorting(int arr[],int n) {
		for(int j=0;j<n-1;j++) {
			for(int i=0;i<n-j-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
	}
		}
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	sorting(arr,n);
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
}
}
	
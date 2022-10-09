package Practices;
import java.util.*;
public class InterviewHard2 {
	public static void uniqueTriplets(int arr[],int n,int k) {
		int currsum=0;
		for(int i=0;i<n-2;i++) {
			int j=i+1,r=n-1;
			while(j<r) {	
			currsum=arr[i]+arr[j]+arr[r];
			if(currsum==k) {
				System.out.println("["+arr[i]+","+arr[j]+","+arr[r]+"]");
		}
			if(currsum<k)
				j++;
			else
				r--;
			}
		}
	}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
	uniqueTriplets(arr,n,k);
}
}

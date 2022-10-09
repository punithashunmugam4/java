package Practices;
import java.io.*;
import java.util.*;

public class InterviewHard1 {
	public static int maxCount(int arr[], int n,int k) {
		int a=0;
		HashSet<Integer> set=new HashSet<>();
		int currSum=0;
		for(int i=0;i<n;i++) {
			currSum+=arr[i];
			if(currSum<k) {
				continue;
			}
				while(currSum>k) {
					currSum-=arr[a++];
				}
			if(currSum==k) {
				set.add(i-a+1);
				int a1=a;
				while(arr[a1]==0) {
					set.add(i-a1);
					a1++;
				}
			}
		}
		System.out.println(set);
		return set.size();
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	int k=sc.nextInt();
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	System.out.println(maxCount(arr,n,k));
}
}
